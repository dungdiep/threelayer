package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String branch;
    private String color;
    private double price;

    public Car(String branch, String color, double price) {
        this.branch = branch;
        this.color = color;
        this.price = price;
    }

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
