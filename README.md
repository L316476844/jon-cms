# jon-cms
基于 springboot  Bootstrap3  thymeleaf 结合mybatis xml配置，搭建的一套CMS管理后台.jon-cms是一套通用易改造的系统。

1、**使用@UnLoginLimit注解来管控免登陆接口，在Controller方法上添加。**
2、**使用AdminInterceptors拦截器进行权限校验。**
3、**使用GlobalExceptionHandler统一异常处理。**
登录:
<img src="https://github.com/L316476844/jon-cms/blob/master/files/login.png" alt="login">
注册：
<img src="https://github.com/L316476844/jon-cms/blob/master/files/register.png" alt="register">
管理中心：
<img src="https://github.com/L316476844/jon-cms/blob/master/files/dashboard.png" alt="register">
