package com.example.school.exception;

public class StudentErrorResponse {

    private int status;
    private String message;
    private long timeStamp;

    public StudentErrorResponse() {

    }

    public StudentErrorResponse(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public int getStatus(int value) {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage(String message) {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimeStamp(long l) {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}