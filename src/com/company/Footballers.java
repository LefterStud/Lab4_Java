package com.company;

public class Footballers {
    private Footballer[] footballers;
    private int currentFootballersNumber;

    public Footballers(final int footballerNumber) {
        this.footballers = new Footballer[footballerNumber];
        currentFootballersNumber = -1;
    }

    public void addFootballer(final Footballer footballer) {
        if (++currentFootballersNumber < footballers.length) {
            footballers[currentFootballersNumber] = footballer;
        }
    }

    public void deleteFootballer(final int number) {
        final Footballers tempFootballers = new Footballers(currentFootballersNumber);
        tempFootballers.currentFootballersNumber = currentFootballersNumber;
        int newIndex = 0;
        for (int i = 0; i <= currentFootballersNumber; i++) {
            if (i == number) continue;
            tempFootballers.footballers[newIndex++] = footballers[i];
        }
        footballers = tempFootballers.footballers;
        currentFootballersNumber--;
    }

    public void findProfessionalFootballers(){
        for (final Footballer footballer:footballers) {
            if ((footballer.getAge() > 20) && ((float)footballer.getGoalsNumber() / footballer.getGamesNumber() > 0.4)) {
                System.out.println(footballer+"\n");
            }
        }
    }

    @Override
    public String toString() {
        String result = "Footballer: " + System.lineSeparator();
        for (final Footballer footballer : footballers) {
            result += footballer + System.lineSeparator();
        }
        return result;
    }
}
