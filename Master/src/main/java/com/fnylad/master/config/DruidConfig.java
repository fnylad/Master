package com.fnylad.master.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
public class DruidConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    //绑定到application.xml文件中 生效
    public DataSource druidDateSource(){
        return new DruidDataSource();
    }

    //因为iSpringBoot内置了servlet容器，所有没有web.xml,替代方法、：ServletRegistrationBean
    //后台监控功能
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");//访问这个就可以进入后台监控页面，写死的
        //后台需要有人登录
        //账号密码配置也是死的
        HashMap<String,String> initParameters = new HashMap<>();
        //增加配置
        initParameters.put("loginUsername","admin");
        initParameters.put("loginPassword","123456");//key是固定的

        //允许谁能访问
        initParameters.put("allow","");

        bean.setInitParameters(initParameters);//设置初始化参数
        return bean;
    }

    //filter后台过滤
    @Bean
    public FilterRegistrationBean webServletFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        //可以过滤哪些请求
        HashMap<String,String> map = new HashMap<>();
        map.put("exclusions","*.js,*.css,/druid/*");//这些东西不进行统计
        bean.setInitParameters(map);
        return bean;
    }

}
