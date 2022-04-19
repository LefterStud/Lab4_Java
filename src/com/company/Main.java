package com.company;


/**
 * Lefter Olexiy, 18
 */
public class Main {
    /**
     * Определить самый дорогой товар на складе и напечатать все сведения о нем.
     * (Количество, цена, год изготовления, производитель)
     */
    public static void task1() {
        System.out.println("""

                Определить самый дорогой товар на складе и напечатать все сведения о нем.
                (Количество, цена, год изготовления, производитель)
                """);
        final Stock product1 = new Stock((int) (Math.random() * 1000), (float) (int) (Math.random() * 100000) / 100, ((int) (Math.random() * 22) + 2000), "Ukraine");
        final Stock product2 = new Stock((int) (Math.random() * 1000), (float) (int) (Math.random() * 100000) / 100, ((int) (Math.random() * 22) + 2000), "China");
        final Stock product3 = new Stock((int) (Math.random() * 1000), (float) (int) (Math.random() * 100000) / 100, ((int) (Math.random() * 22) + 2000), "Germany");
        final Stock product4 = new Stock((int) (Math.random() * 1000), (float) (int) (Math.random() * 100000) / 100, ((int) (Math.random() * 22) + 2000), "USA");
        final Stock product5 = new Stock((int) (Math.random() * 1000), (float) (int) (Math.random() * 100000) / 100, ((int) (Math.random() * 22) + 2000), "Japan");

        final Products products = new Products(5);
        products.addProduct(product1);
        products.addProduct(product2);
        products.addProduct(product3);
        products.addProduct(product4);
        products.addProduct(product5);

        System.out.println(products + "______________________");
        System.out.println("The most expensive product:\n\n" + products.findMaxPriceProduct());
    }

    /**
     * Вывести сведения о футболистах, старших 20-ти лет и забивающих за игру не менее 0,4 мяча.
     * (Фамилия, дата рождения, амплуа, количество игр, количество забитых мячей, место рождения)
     */
    public static void task2() {
        System.out.println("""
                
                Вывести сведения о футболистах, старших 20-ти лет и забивающих за игру не менее 0,4 мяча.
                (Фамилия, дата рождения, амплуа, количество игр, количество забитых мячей, место рождения)
                """);
        final Footballer footballer1 = new Footballer("Smith", (int) (Math.random() * 15) + 1991, (int) (Math.random() * 12) + 1, (int) (Math.random() * 31) + 1, "Goalkeeper", (int) (Math.random() * 1000), (int) (Math.random() * 500), "Kannada");
        final Footballer footballer2 = new Footballer("Jones", (int) (Math.random() * 15) + 1991, (int) (Math.random() * 12) + 1, (int) (Math.random() * 31) + 1, "Defender", (int) (Math.random() * 1000), (int) (Math.random() * 500), "Italy");
        final Footballer footballer3 = new Footballer("Taylor", (int) (Math.random() * 15) + 1991, (int) (Math.random() * 12) + 1, (int) (Math.random() * 31) + 1, "Midfielder", (int) (Math.random() * 1000), (int) (Math.random() * 500), "Romania");
        final Footballer footballer4 = new Footballer("Brown", (int) (Math.random() * 15) + 1991, (int) (Math.random() * 12) + 1, (int) (Math.random() * 31) + 1, "Attacking", (int) (Math.random() * 1000), (int) (Math.random() * 500), "Turkey");
        final Footballer footballer5 = new Footballer("Williams", (int) (Math.random() * 15) + 1991, (int) (Math.random() * 12) + 1, (int) (Math.random() * 31) + 1, "Sweeper", (int) (Math.random() * 1000), (int) (Math.random() * 500), "Mongolia");

        final Footballers footballers = new Footballers(5);
        footballers.addFootballer(footballer1);
        footballers.addFootballer(footballer2);
        footballers.addFootballer(footballer3);
        footballers.addFootballer(footballer4);
        footballers.addFootballer(footballer5);
        System.out.println(footballers + "______________________");
        System.out.println("Footballers over 20 years of age and scoring at least 0.4 goals per game:\n\n");
        footballers.findProfessionalFootballers();

    }
    public static void main(String[] args) {
        task1();
        task2();

    }


}
