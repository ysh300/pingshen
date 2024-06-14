package zhongzhi_pingshen.config;

import zhongzhi_pingshen.interseptor.LoginInterseptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//配置类
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private LoginInterseptor loginInterseptor;

    @Override
//    固定方法
    public void addInterceptors(InterceptorRegistry registry) {
//        除了登录操作都拦截
        registry.addInterceptor(loginInterseptor).addPathPatterns("/**").excludePathPatterns("/login");
    }
}
