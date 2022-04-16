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
        System.out.println("\nОпределить самый дорогой товар на складе и напечатать все сведения о нем.\n" +
                "(Количество, цена, год изготовления, производитель)\n");
        Stock product1 = new Stock();
        Stock product2 = new Stock();
        Stock product3 = new Stock();
        Stock product4 = new Stock();
        Stock product5 = new Stock();
        Stock[] products = new Stock[]{product1, product2, product3, product4, product5};

        product1.setAmount();
        product1.setPrice();
        product1.setYear();
        product1.setManufacturer("Ukraine");

        product2.setAmount();
        product2.setPrice();
        product2.setYear();
        product2.setManufacturer("China");

        product3.setAmount();
        product3.setPrice();
        product3.setYear();
        product3.setManufacturer("Germany");

        product4.setAmount();
        product4.setPrice();
        product4.setYear();
        product4.setManufacturer("USA");

        product5.setAmount();
        product5.setPrice();
        product5.setYear();
        product5.setManufacturer("Japan");

        for (int i = 0; i < products.length; i++) {
            if (products[i].getPrice() == Max) {
                System.out.println(products[i].Info());
            }
        }
    }


    /**
     * Вывести сведения о футболистах, старших 20-ти лет и забивающих за игру не менее 0,4 мяча.
     * (Фамилия, дата рождения, амплуа, количество игр, количество забитых мячей, место рождения)
     */
    public static void task2() {
        System.out.println("\nВывести сведения о футболистах, старших 20-ти лет и забивающих за игру не менее 0,4 мяча.\n" +
                "(Фамилия, дата рождения, амплуа, количество игр, количество забитых мячей, место рождения)\n");
        Footballer footballer1 = new Footballer();
        Footballer footballer2 = new Footballer();
        Footballer footballer3 = new Footballer();
        Footballer footballer4 = new Footballer();
        Footballer footballer5 = new Footballer();
        Footballer[] footballers = new Footballer[]{footballer1, footballer2, footballer3, footballer4, footballer5};

        footballer1.setSurname("Smith");
        footballer1.setBirthDate();
        footballer1.setRole("Goalkeeper");
        footballer1.setGamesNumber();
        footballer1.setGoalsNumber();
        footballer1.setBirthPlace("Kannada");

        footballer2.setSurname("Jones");
        footballer2.setBirthDate();
        footballer2.setRole("Defender");
        footballer2.setGamesNumber();
        footballer2.setGoalsNumber();
        footballer2.setBirthPlace("Italy");

        footballer3.setSurname("Taylor");
        footballer3.setBirthDate();
        footballer3.setRole("Midfielder");
        footballer3.setGamesNumber();
        footballer3.setGoalsNumber();
        footballer3.setBirthPlace("Romania");

        footballer4.setSurname("Brown");
        footballer4.setBirthDate();
        footballer4.setRole("Attacking");
        footballer4.setGamesNumber();
        footballer4.setGoalsNumber();
        footballer4.setBirthPlace("Turkey");

        footballer5.setSurname("Williams");
        footballer5.setBirthDate();
        footballer5.setRole("Sweeper");
        footballer5.setGamesNumber();
        footballer5.setGoalsNumber();
        footballer5.setBirthPlace("Mongolia");

        for (int i = 0; i < footballers.length; i++) {
            if ((footballers[i].getAge() > 20) && ((float)footballers[i].getGoalsNumber() / footballers[i].getGamesNumber() > 0.4)) {
                System.out.println(footballers[i].Info());
            }
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
    }


}
