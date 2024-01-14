package src.src.ru.itmo.java.basics.lesson3;

public class Tree {
    public int year;
    public boolean live;
    public String name;

    public Tree(String name, int year, boolean live) {
        this.year = year;
        this.live = live;
        this.name = name;
    }

    public Tree(String name, int year) {
        this.year = year;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров свободен");
    }
}
