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
    private LocalDate birthDate;
    private String role;
    private int gamesNumber;
    private int goalsNumber;
    private String birthPlace;

    public Footballer(final String surname, final int YYYY, final int MM, final int DD, final String role, final int gamesNumber, final int goalsNumber, final String birthPlace) {
        this.setSurname(surname);
        this.setBirthDate(YYYY, MM, DD);
        this.setRole(role);
        this.setGamesNumber(gamesNumber);
        this.setGoalsNumber(goalsNumber);
        this.setBirthPlace(birthPlace);
    }

    public void setSurname(String surname) {
        this.surname = surname.strip();
        for (int i = 0; i < this.surname.length(); i++) {
            if (!Character.isAlphabetic(this.surname.charAt(i))) {
                this.surname = "Incorrect data";
            }
        }
        this.surname = ("" + this.surname.charAt(0)).toUpperCase() + this.surname.substring(1).toLowerCase();
    }

    public void setBirthDate(int YYYY, int MM, int DD) {
        boolean isCorrectBirthDate=true;
        if ((YYYY > LocalDate.now().getYear()) || (MM > 12) || (DD > 31)) isCorrectBirthDate = false;
        if ((MM == 2) && (DD > 28)) isCorrectBirthDate = false;
        if (((MM == 4) || (MM == 6) || (MM == 9) || (MM == 11)) && (DD > 30)) isCorrectBirthDate = false;
        if (isCorrectBirthDate){
            this.birthDate=LocalDate.of(YYYY, MM, DD);
        }else{
            this.birthDate=LocalDate.of(-1, -1, -1);
            System.out.println("Incorrect data!");
        }
    }

    public void setRole(String role) {
        this.role = role.strip();
        for (int i = 0; i < this.role.length(); i++) {
            if (!(Character.isAlphabetic(this.role.charAt(i))||(this.role.charAt(i)=='-'))) {
                this.role = "Incorrect data";
            }
        }
        this.role = ("" + this.role.charAt(0)).toUpperCase() + this.role.substring(1).toLowerCase();
    }

    public void setGamesNumber(int gamesNumber) {
        if ((gamesNumber >= 0) && (gamesNumber == Math.round(gamesNumber))) {
            this.gamesNumber = gamesNumber;
        } else {
            this.gamesNumber = -1;
            System.out.println("Incorrect data!");
        }
    }

    public void setGoalsNumber(int goalsNumber) {
        if ((goalsNumber >= 0) && (goalsNumber == Math.round(goalsNumber))) {
            this.goalsNumber = goalsNumber;
        } else {
            this.goalsNumber = -1;
            System.out.println("Incorrect data!");
        }
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace=birthPlace.strip();
        for (int i = 0; i < this.birthPlace.length(); i++) {
            if (!Character.isAlphabetic(this.birthPlace.charAt(i))) {
                this.birthPlace = "Incorrect data";
            }
        }
        this.birthPlace = ("" + this.birthPlace.charAt(0)).toUpperCase() + this.birthPlace.substring(1).toLowerCase();
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

    public String toString() {
        return "Surname - " + surname + ";" +
                "\nDate of Birth - " + birthDate + ";" +
                "\nRole - " + role + ";" +
                "\nNumber of games - " + gamesNumber + ";" +
                "\nNumber of goals - " + goalsNumber + ";" +
                "\nPlace of birth - " + birthPlace + ";\n";
    }
}
