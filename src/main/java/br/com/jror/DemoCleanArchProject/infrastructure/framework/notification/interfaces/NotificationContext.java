package br.com.jror.DemoCleanArchProject.infrastructure.framework.notification.interfaces;

import br.com.jror.DemoCleanArchProject.infrastructure.framework.model.NotificationAbstract;

import java.util.ArrayList;

public interface NotificationContext {
    void addNotification(String key, String message);

    void addNotification(NotificationAbstract notification);

    void addNotifications(ArrayList<NotificationAbstract> notifications);

    boolean hasNotifications();

    ArrayList<NotificationAbstract> getNotifications();
}
