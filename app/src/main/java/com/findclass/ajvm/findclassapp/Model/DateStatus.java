package com.findclass.ajvm.findclassapp.Model;


import java.io.Serializable;

public class DateStatus implements Serializable {
    private String date;
    private String status;

    public DateStatus(String date, String status) {
        this.date = date;
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
