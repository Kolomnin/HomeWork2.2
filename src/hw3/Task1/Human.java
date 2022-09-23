package hw3.Task1;

import java.time.LocalDate;

public class Human {
    LocalDate date = LocalDate.now();
    private String name;
    private String town;
    private int yearOfBirth;
    private String job;

    public Human(String name, String town, int yearOfBirth, String job) {
        try {
            if (!(name == null || name.equals(" "))) {
                this.name = name;
            }else {
                this.name = "информация не указана";
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println(e + ": в поле NAME информация не указана");
            System.exit(0);
        }

        try { if (!(town == null || town.equals(" "))) {
            this.town = town;
        } else {
            this.town = "информация не указана";
            throw new NullPointerException();

        }
        } catch (NullPointerException e) {
            System.out.println(e + ": в поле TOWN информация не указана");
            System.exit(0);
        }

        try { if (!(job == null || job.equals(" "))) {
            this.job = job;
        } else {
            this.town = "информация не указана";
            throw new NullPointerException();

        }
        } catch (NullPointerException e) {
            System.out.println(e + ": в поле JOB информация не указана");
            System.exit(0);
        }


        try { if (yearOfBirth >= 0) {
            this.yearOfBirth = date.getYear() - yearOfBirth;
        } else {
            this.yearOfBirth = 0;
            throw new IllegalArgumentException();
        }
        } catch (IllegalArgumentException e) {
            System.out.println(e + ". Invalid age: " + yearOfBirth);
            System.exit(0);
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