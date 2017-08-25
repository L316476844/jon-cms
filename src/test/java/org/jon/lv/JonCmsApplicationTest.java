package org.jon.lv;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2017/8/15 16:51
 * version V1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JonCmsApplicationTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    public MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void contextLoads() {
        System.out.println("hello world");
    }
}
