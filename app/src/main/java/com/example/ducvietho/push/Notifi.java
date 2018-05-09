package com.example.ducvietho.push;

/**
 * Created by ducvietho on 09/05/2018.
 */

public class Notifi {
    private String title;
    private String body;

    public Notifi(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
