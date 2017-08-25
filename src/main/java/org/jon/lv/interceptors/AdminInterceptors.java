package org.jon.lv.interceptors;

import org.jon.lv.annotation.UnLoginLimit;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @Package org.jon.lv.interceptors.AdminInterceptors
 * @Description: AdminInterceptors
 * Author lv bin
 * @date 2017/5/16 13:12
 * version V1.0.0
 */
@Configuration
public class AdminInterceptors extends WebMvcConfigurerAdapter {
    public static String REQUEST_TIME = "http_request_time";

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AdminRequestInterceptor()
        ).addPathPatterns("/admin/**");
    }

    /**
     * 权限拦截器
     * @author czh
     */
    class AdminRequestInterceptor extends HandlerInterceptorAdapter {
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            request.setAttribute(REQUEST_TIME, new Date());

            if(handler instanceof HandlerMethod) {
                HandlerMethod method = (HandlerMethod) handler;
                UnLoginLimit unlimited = method.getMethodAnnotation(UnLoginLimit.class);
                if(unlimited != null){
                    // 免登陆接口
                    return true;
                }else{
                    // 需要登录接口 -- 判断session中是否已经存在
                    Object object = request.getSession().getAttribute("admin");
                    if(object == null){
                        response.sendRedirect("/admin/login");
                    }

                    return true;
                }
            }

            return super.preHandle(request, response, handler);
        }
    }
}

