package com.company;

import static com.company.Stock.Max;

/**
 * Lefter Olexii, 18
 */
public class Main {
    /**
     * Определить самый дорогой товар на складе и напечатать все сведения о нем.
     * (Количество, цена, год изготовления, производитель)
     */
    public static void task1() {
        Stock product1 = new Stock();
        Stock product2 = new Stock();
        Stock product3 = new Stock();
        Stock product4 = new Stock();
        Stock product5 = new Stock();
        Stock[] products = new Stock[]{product1, product2, product3, product4, product5};

        product1.setAmount((float) Math.random());
        product1.setPrice((float) Math.random());
        product1.setYear((float) Math.random());
        product1.setManufacturer("Ukraine");

        product2.setAmount((float) Math.random());
        product2.setPrice((float) Math.random());
        product2.setYear((float) Math.random());
        product2.setManufacturer("China");

        product3.setAmount((float) Math.random());
        product3.setPrice((float) Math.random());
        product3.setYear((float) Math.random());
        product3.setManufacturer("Germany");

        product4.setAmount((float) Math.random());
        product4.setPrice((float) Math.random());
        product4.setYear((float) Math.random());
        product4.setManufacturer("USA");

        product5.setAmount((float) Math.random());
        product5.setPrice((float) Math.random());
        product5.setYear((float) Math.random());
        product5.setManufacturer("Japan");

        for (int i = 0; i < products.length; i++) {
            if (products[i].getPrice() == Max) {
                System.out.print(products[i].Info());
            }
        }
    }


    /**
     * Вывести сведения о футболистах, старших 20-ти лет и забивающих за игру не менее 0,4 мяча.
     * (Фамилия, дата рождения, амплуа, количество игр, количество забитых мячей, место рождения)
     */
    public static void task2() {

    }

    public static void main(String[] args) {
        task1();

    }


}
