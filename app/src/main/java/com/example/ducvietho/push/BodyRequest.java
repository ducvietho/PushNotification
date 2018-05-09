package com.example.ducvietho.push;

/**
 * Created by ducvietho on 09/05/2018.
 */

public class BodyRequest {
    private String to;
    private Notifi notification;

    public BodyRequest(String to, Notifi notification) {
        this.to = to;
        this.notification = notification;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Notifi getNotification() {
        return notification;
    }

    public void setNotification(Notifi notification) {
        this.notification = notification;
    }
}
