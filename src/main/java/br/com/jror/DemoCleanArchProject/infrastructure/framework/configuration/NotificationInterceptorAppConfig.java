package br.com.jror.DemoCleanArchProject.infrastructure.framework.configuration;

import br.com.jror.DemoCleanArchProject.infrastructure.framework.interceptor.NotificationInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class NotificationInterceptorAppConfig implements WebMvcConfigurer {


    private final NotificationInterceptor notificationInterceptor;

    public NotificationInterceptorAppConfig(NotificationInterceptor notificationInterceptor) {
        this.notificationInterceptor = notificationInterceptor;
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(notificationInterceptor);
    }

}
