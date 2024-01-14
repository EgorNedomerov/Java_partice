package src.src.ru.itmo.java.basics.lesson3;

public class Car {
    private String name;
    private String color;
    private String weight;

    public void printCar() {
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.weight);
    }

    public Car(String color, String weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car(String color) {
        this.color = color;
    }

    public Car() {

    }

    public Car(String color, String weight, String name) {
        this.color = color;
        this.weight = weight;
        this.name = name;
    }
}


