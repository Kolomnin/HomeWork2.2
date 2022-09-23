package hw3.Task2;

public class Car {
    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    private String color;
    private double engineVolume;

    public Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume) {

        this.brand = brand;
        if (brand == null || brand.equals("")) {
            this.brand = "default";
        }
        this.model = model;
        if (model == null || model.equals("")) {
            this.model = "default";
        }
        this.productionCountry = productionCountry;
        if (productionCountry == null || productionCountry.equals("")) {
            this.productionCountry = "default";
        }
        this.engineVolume = engineVolume;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        this.color = color;
        if (color == null || color.equals("")) {
            this.color = "белый";
        }
        this.productionYear = productionYear;
        if (productionYear <= 0) {
            this.productionYear = 2000;
        }
    }
    public void infoCar() {
        System.out.println("Автомобиль: " +
                "марка " + brand +
                ", модель " + model +
                ", год выпуска " + productionYear +
                ", сборка " + productionCountry +
                ", цвет " + color +
                ", объем двигателя " + engineVolume + " литра.");
    }
}


