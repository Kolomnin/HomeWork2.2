package hw3.Task2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Grande", 2015, " ", "Yellow", 1.7);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Germany", "Black", 3.0);
        Car car3 = new Car("BMW", "Z8", 2021, "Germany", "Black", 3.0);
        Car car4 = new Car("Kia", "Sportage 4 поколение", 2018, "South Korea", "Red", 2.4);
        Car car5 = new Car("Hyundai", "Avante", 2016, "South Korea", "Orange", 1.6);

        car1.infoCar();
        car2.infoCar();
        car3.infoCar();
        car4.infoCar();
        car5.infoCar();

    }
}

