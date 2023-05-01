package br.com.jror.DemoCleanArchProject.infrastructure.framework.model;

public abstract class NotificationAbstract {
    private String key;
    private String message;

    public NotificationAbstract(String key, String message) {
        this.key = key;
        this.message = message;
    }
}
