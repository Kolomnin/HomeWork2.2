package hw1.Task3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Lada";
        car1.model = "Grande";
        car1.productionYear = 2015;
        car1.productionCountry = "Russia";
        car1.color = "Yellow";
        car1.engineVolume = 1.7;
        car1.bodyCar();

        Car car2 = new Car();
        car2.brand = "Audi";
        car2.model = "A8 50 L TDI quattro";
        car2.productionYear = 2020;
        car2.productionCountry = "Germany";
        car2.color = "Black";
        car2.engineVolume = 3.0;
        car2.bodyCar();

        Car car3 = new Car();
        car3.brand = "BMW";
        car3.model = "Z8";
        car3.productionYear = 2021;
        car3.productionCountry = "Germany";
        car3.color = "Black";
        car3.engineVolume = 3.0;
        car3.bodyCar();

        Car car4 = new Car();
        car4.brand = "Kia";
        car4.model = "Sportage 4 поколение";
        car4.productionYear = 2018;
        car4.productionCountry = "South Korea";
        car4.color = "Red";
        car4.engineVolume = 2.4;
        car4.bodyCar();

        Car car5 = new Car();
        car5.brand = "Hyundai";
        car5.model = "Avante";
        car5.productionYear = 2016;
        car5.productionCountry = "South Korea";
        car5.color = "Orange";
        car5.engineVolume = 1.6;
        car5.bodyCar();

    }
}
