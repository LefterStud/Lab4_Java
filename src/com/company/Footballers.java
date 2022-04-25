package com.company;

import java.util.Arrays;

public class Footballers {
    public static final int MIN_AGE = 20;
    public static final double GOAL_COEFFICIENT = 0.4;
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

    public Footballers findProfessionalFootballers() {
        Footballers temp = new Footballers(footballers.length);
        for (final Footballer footballer : footballers) {
            if ((footballer.getAge() > MIN_AGE) && ((float) footballer.getGoalsNumber() / footballer.getGamesNumber() > GOAL_COEFFICIENT)) {
                temp.addFootballer(footballer);
            }
        }
        temp.footballers = Arrays.copyOf(temp.footballers, temp.currentFootballersNumber + 1);
        return temp;
    }

    @Override
    public String toString() {
        String result = "Footballer: " + System.lineSeparator();
        for (final Footballer footballer : footballers) {
            if (footballer != null)
            {
                result += footballer + System.lineSeparator();
            }
        }
        return result;
    }
}
