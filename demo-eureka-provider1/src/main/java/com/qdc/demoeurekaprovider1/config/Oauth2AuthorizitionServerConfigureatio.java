//package com.qdc.demoeurekaprovider1.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
//import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
//
//@Configuration
//public class Oauth2AuthorizitionServerConfigureatio extends ResourceServerConfigurerAdapter {
//    private static final String URL="http://localhost:8081/oauth/check_token";
//
//    @Override
//    public void configure(ResourceServerSecurityConfigurer resources) throws Exception{
//        //设置验证token的方法，即使有test和123456的客户端身份去url验证token
//        RemoteTokenServices tokenServices = new RemoteTokenServices();
//
//        tokenServices.setCheckTokenEndpointUrl(URL);
//        tokenServices.setClientId("test");
//        tokenServices.setClientSecret("123456");
//
//        resources.tokenServices(tokenServices);
//        //设置当前资源服务器的resource——id为userall
//        resources.resourceId("userall").stateless(true);
//
//    }
//
//}
