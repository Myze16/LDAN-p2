package com.example.mercadolivreauad;

public class Product {
    private String name;
    private String description;
    private int thumbId;
    private int fullImageId;
    private int rating;
    private double price;

    public Product(String name, String description, int thumbId, int fullImageId, int rating, double price) {
        this.name = name;
        this.description = description;
        this.thumbId = thumbId;
        this.fullImageId = fullImageId;
        this.rating = rating;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getThumbId() {
        return thumbId;
    }

    public void setThumbId(int thumbId) {
        this.thumbId = thumbId;
    }

    public int getFullImageId() {
        return fullImageId;
    }

    public void setFullImageId(int fullImageId) {
        this.fullImageId = fullImageId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
