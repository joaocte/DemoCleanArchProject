package br.com.jror.DemoCleanArchProject.infrastructure.framework.notification;

import br.com.jror.DemoCleanArchProject.infrastructure.framework.model.Notification;
import br.com.jror.DemoCleanArchProject.infrastructure.framework.model.NotificationAbstract;
import br.com.jror.DemoCleanArchProject.infrastructure.framework.notification.interfaces.NotificationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class NotificationContextImpl implements NotificationContext {

    private final ArrayList<NotificationAbstract> notificationAbstracts;

    public NotificationContextImpl(ArrayList<NotificationAbstract> notificationAbstracts) {
        this.notificationAbstracts = notificationAbstracts;
    }

    @Override
    public void addNotification(String key, String message) {
        this.addNotification(new Notification(key, message));
    }

    @Override
    public void addNotification(NotificationAbstract notification) {
        notificationAbstracts.add(notification);
    }

    @Override
    public void addNotifications(ArrayList<NotificationAbstract> notifications) {
        notifications.addAll(notifications);

    }

    @Override
    public boolean hasNotifications() {
        return !notificationAbstracts.isEmpty();
    }

    @Override
    public ArrayList<NotificationAbstract> getNotifications() {
        return notificationAbstracts;
    }
}
