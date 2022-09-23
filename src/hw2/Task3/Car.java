package hw2.Task3;

public class Car {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private final String color;
    private final double engineVolume;

    public Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.engineVolume = engineVolume;

    }

    @Override
    public String toString() {
        return "Автомобиль: " +
                "марка " + brand +
                ", модель " + model +
                ", год выпуска " + productionYear +
                ", сборка " + productionCountry +
                ", цвет " + color +
                ", объем двигателя " + engineVolume + " литра.";
    }
}
