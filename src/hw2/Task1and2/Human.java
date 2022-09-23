package hw2.Task1and2;

public class Human {
    private final String name;
    private final String town;
    private final int birthday;
    private final String jobPosition;

    public Human(String name, String town, int birthday, String jobPosition) {
        this.name = name;
        this.town = town;
        this.birthday = 2022 - birthday;
        this.jobPosition = jobPosition;
    }

    @Override
    public String toString() {
        return  "Привет! Меня зовут " + name +
                ", я из города " + town +
                ", я родил[ся/ась] в " + birthday +
                " году. Я работаю на должности " + jobPosition + ". Будем знакомы!";
    }
}
