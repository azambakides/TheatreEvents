package com.andraea.app.model;

public class TheatreTemplates {

    public static int length;
    private String showDate;
    private String showTime;
    private String showName;
    private double price;

    // Constructors
    public TheatreTemplates(String showDate, String showTime, String showName, double price) {
        this.showDate = showDate;
        this.showTime = showTime;
        this.showName = showName;
        this.price = price;
    }

    // Getters and Setters
    public static int getLength() {
        return length;
    }

    public static void setLength(int length) {
        TheatreTemplates.length = length;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Printing out show times together
    public void printShow() {
        System.out.println(
                this.showName + " " + "on" + " " +
                this.showDate + " " + "@" + " " +
                        this.showTime + " " + "for" + " " +
                        "$" + this.price
        );

    }

}
