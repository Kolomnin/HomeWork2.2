package hw3.Task1;

import java.time.LocalDate;

public class Human {
    LocalDate date = LocalDate.now();
    private String name;
    private String town;
    private int yearOfBirth;
    private String job;



    public Human(String name, String town, int yearOfBirth, String job) {

         this.name = name;
         if (name == null || name.equals("")) {
            this.name = "информация не указана";
         }

         this.town = town;
         if (town == null || town.equals("")) {
         this.town = "информация не указана";
         }

         this.job = job;
         if (job == null || job.equals("")) {
         this.job = "информация не указана";
         }

         this.yearOfBirth = date.getYear() - yearOfBirth;
         if (yearOfBirth <= 0) {
         this.yearOfBirth = 0;
        }
    }

    @Override
    public String toString() {
        return  "Привет! Меня зовут " + name +
                ", я из города " + town +
                ", я родил[ся/ась] в " + yearOfBirth +
                " году. Я работаю на должности " + job + ". Будем знакомы!";
    }
}