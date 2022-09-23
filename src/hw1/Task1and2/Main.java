package hw1.Task1and2;

import java.util.Date;

public class Main {
    static Date date = new Date();
    public static void main(String[] args) {
        Human Maxim = new Human();
        Maxim.name = "Максим";
        Maxim.town = "Минск";
        Maxim.yearOfBirth = 1900 + date.getYear() - 35;
        Maxim.job = "бренд-менеджер";
        Maxim.person();

        Human Anya = new Human();
        Anya.name = "Аня";
        Anya.town = "Москва";
        Anya.yearOfBirth = 1900 + date.getYear() - 29;
        Anya.job = "методист образовательных программ";
        Anya.person();

        Human Katya = new Human();
        Katya.name = "Катя";
        Katya.town = "Калининград";
        Katya.yearOfBirth = 1900 + date.getYear() - 28;
        Katya.job = "продакт-менеджер";
        Katya.person();

        Human Artjom = new Human();
        Artjom.name = "Артем";
        Artjom.town = "Москва";
        Artjom.yearOfBirth = 1900 + date.getYear() - 27;
        Artjom.job = "директор по развитию бизнеса";
        Artjom.person();

    }
}
