package br.com.jror.DemoCleanArchProject.infrastructure.framework.interceptor;

import br.com.jror.DemoCleanArchProject.infrastructure.framework.notification.interfaces.NotificationContext;
import com.google.gson.Gson;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class NotificationInterceptor implements HandlerInterceptor {

    private final NotificationContext notificationContext;

    public NotificationInterceptor(NotificationContext notificationContext) {
        this.notificationContext = notificationContext;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        if(notificationContext.hasNotifications())
        {
            response.setStatus(400);
            var notificationJson = new Gson().toJson(notificationContext.getNotifications());
            response.getWriter().write(notificationJson);
            response.setContentType("application/json");
        }
    }

}
