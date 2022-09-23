package hw2.Task3;

/*3 задание
        Создайте новый проект в IDEA. Создайте класс автомобиль, у которого есть:

        марка
        модель
        объем двигателя в литрах
        цвет кузова
        год производства
        страна сборки
        Создайте объекты для следующих автомобилей:

        Lada Grande, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя - 1,7
        Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя 3.0 литра
        BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем – 3.0
        Kia Sportage 4 поколение, 2018 год выпуска, сборка в Южной Корее, цвет кузова красный, объем двигателя – 2,4 литра.
        Hyundai Avante, сборка в Южной Корее, цвет кузова оранжевый, объем двигателя - 1,6 литра, год выпуска - 2016 год.
        Напишите программу, которая будет выводить в консоль информацию об каждом автомобиле и все указанные выше характеристики.*/

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Grande", 2015, "Russia", "Yellow", 1.7);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Germany", "Black", 3.0);
        Car car3 = new Car("BMW", "Z8", 2021, "Germany", "Black", 3.0);
        Car car4 = new Car("Kia", "Sportage 4 поколение", 2018, "South Korea", "Red", 2.4);
        Car car5 = new Car("Hyundai", "Avante", 2016, "South Korea", "Orange", 1.6);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }
}
