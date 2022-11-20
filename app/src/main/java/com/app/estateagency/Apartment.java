package com.app.estateagency;

public class Apartment {
    private int[] images;
    private int cost;
    private String apart_type;
    private String metro;

    public Apartment(int[] images, int cost, String apart_type, String metro) {
        this.images = images;
        this.cost = cost;
        this.apart_type = apart_type;
        this.metro = metro;
    }

    public int[] getImages() {
        return images;
    }

    public void setImages(int[] images) {
        this.images = images;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getApart_type() {
        return apart_type;
    }

    public void setApart_type(String apart_type) {
        this.apart_type = apart_type;
    }

    public String getMetro() {
        return metro;
    }

    public void setMetro(String metro) {
        this.metro = metro;
    }
}
