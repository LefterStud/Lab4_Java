package com.company;

/**
 * Определить самый дорогой товар на складе и напечатать все сведения о нем.
 * (Количество, цена, год изготовления, производитель)
 */
public class Stock {
    private int amount;
    private float price;
    private int year;
    private String manufacturer;
    public static float Max = 0;

    public void setAmount() {
        this.amount = (int) ((float) Math.random() * 1000);
    }

    public void setPrice() {
        this.price = (float) ((int) ((float) Math.random() * 100000)) / 100;
        if (this.price > Max) {
            Max = this.price;
        }
    }

    public void setYear() {
        this.year = (int) (((float) Math.random() * 22) + 2000);
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return this.price;
    }

    public String Info() {
        return "Amount - " + amount + " pieces;\nPrice - " + price + " UAH;\nProduction year - " + year + ";\nManufacturer - " + manufacturer + ".";
    }

}

