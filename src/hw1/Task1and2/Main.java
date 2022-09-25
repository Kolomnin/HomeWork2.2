package hw1.Task1and2;

import java.util.Date;

public class Main {
    static Date date = new Date();
    public static void main(String[] args) {
        Human maxim = new Human();
        maxim.name = "Максим";
        maxim.town = "Минск";
        maxim.yearOfBirth = 1900 + date.getYear() - 35;
        maxim.job = "бренд-менеджер";
        maxim.person();

        Human anya = new Human();
        anya.name = "Аня";
        anya.town = "Москва";
        anya.yearOfBirth = 1900 + date.getYear() - 29;
        anya.job = "методист образовательных программ";
        anya.person();

        Human katya = new Human();
        katya.name = "Катя";
        katya.town = "Калининград";
        katya.yearOfBirth = 1900 + date.getYear() - 28;
        katya.job = "продакт-менеджер";
        katya.person();

        Human artjom = new Human();
        artjom.name = "Артем";
        artjom.town = "Москва";
        artjom.yearOfBirth = 1900 + date.getYear() - 27;
        artjom.job = "директор по развитию бизнеса";
        artjom.person();

    }
}
