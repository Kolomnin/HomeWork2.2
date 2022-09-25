package hw1.Task3;

public class Car {
     String brand;
     String model;
     int productionYear;
     String productionCountry;
     String color;
     double engineVolume;

     void bodyCar() {
         System.out.println("Автомобиль: " +
                 "марка " + brand +
                 ", модель " + model +
                 ", год выпуска " + productionYear +
                 ", сборка " + productionCountry +
                 ", цвет " + color +
                 ", объем двигателя " + engineVolume + " литра.");
     }
}
