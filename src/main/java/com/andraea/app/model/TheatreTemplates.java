package com.andraea.app.model;

public class TheatreTemplates {

    public static int length;
    private String showDate;
    private String showTime1, showTime2, getShowTime3;
    private String showName;
    private double price;

    // Constructors
    public TheatreTemplates(String showDate, String showTime1, String showTime2, String getShowTime3, String showName, double price) {
        this.showDate = showDate;
        this.showTime1 = showTime1;
        this.showTime2 = showTime2;
        this.getShowTime3 = getShowTime3;
        this.showName = showName;
        this.price = price;
    }

    // Getters and Setters
    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public String getShowTime1() {
        return showTime1;
    }

    public void setShowTime1(String showTime1) {
        this.showTime1 = showTime1;
    }

    public String getShowTime2() {
        return showTime2;
    }

    public void setShowTime2(String showTime2) {
        this.showTime2 = showTime2;
    }

    public String getGetShowTime3() {
        return getShowTime3;
    }

    public void setGetShowTime3(String getShowTime3) {
        this.getShowTime3 = getShowTime3;
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
                        this.showTime1 + " " +
                        this.showTime2 + " " +
                        this.getShowTime3 + " " + "for" + " " +
                        "$" + this.price + " " + "AUD"
        );

    }

}
