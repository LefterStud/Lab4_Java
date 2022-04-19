package com.company;

import java.time.LocalDate;

/**
 * Определить самый дорогой товар на складе и напечатать все сведения о нем.
 * (Количество, цена, год изготовления, производитель)
 */
public class Stock {
    private int amount;
    private float price;
    private int year;
    private String manufacturer;

    public Stock(final int amount, final float price, final int year, final String manufacturer) {
        this.setAmount(amount);
        this.setPrice(price);
        this.setYear(year);
        this.setManufacturer(manufacturer);
    }

    public void setAmount(int amount) {
        if ((amount==Math.round(amount))&&(amount>=0)){
            this.amount = amount;
        }else{
            this.amount = -1;
            System.out.println("Incorrect data!");
        }
    }

    public void setPrice(float price) {
        if (price>=0){
            this.price = price;
        }else{
            this.price = -1;
            System.out.println("Incorrect data!");
        }
    }

    public void setYear(int year) {
        if ((year<= LocalDate.now().getYear())) {
            this.year = year;
        } else {
            this.year = -1;
            System.out.println("Incorrect data!");
        }
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer.strip();
    }

    public float getPrice() {
        return this.price;
    }

    public String toString() {
        return "Amount - " + amount + " pieces;" +
                "\nPrice - " + price + " UAH;" +
                "\nProduction year - " + year + ";" +
                "\nManufacturer - " + manufacturer + ".\n";

    }

}

