package com.company;

import java.time.LocalDate;
import java.time.Period;


/**
 * Вывести сведения о футболистах, старших 20-ти лет и забивающих за игру не менее 0,4 мяча.
 * (Фамилия, дата рождения, амплуа, количество игр, количество забитых мячей, место рождения)
 */
public class Footballer {
    private String surname;
    private final LocalDate currentDate = LocalDate.now();
    private LocalDate birthDate = LocalDate.of(2004, 1, 1);
    private String role;
    private int gamesNumber;
    private int goalsNumber;
    private String birthPlace;


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate() {
        this.birthDate = birthDate.minusYears((int) (Math.random() * 12));
        this.birthDate = birthDate.plusMonths((int) (Math.random() * 12));
        this.birthDate = birthDate.plusDays((int) (Math.random() * 31));
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setGamesNumber() {
        this.gamesNumber = (int) ((float) Math.random() * 1000);
    }

    public void setGoalsNumber() {
        this.goalsNumber = (int) ((float) Math.random() * 500);
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public int getGamesNumber() {
        return this.gamesNumber;
    }

    public int getGoalsNumber() {
        return this.goalsNumber;
    }

    public int getAge() {
        return Period.between(birthDate, currentDate).getYears();
    }

    public String Info() {
        return "Surname - " + surname + ";\nDate of Birth - " + birthDate + ";\nRole - " + role + ";\nNumber of games - " + gamesNumber + ";\nNumber of goals - " + goalsNumber + ";\nPlace of birth - " + birthPlace + ";\n";
    }
}
