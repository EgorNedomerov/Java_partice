package src.src.ru.itmo.java.basics.lesson3;

import java.time.LocalDate;

public class Home {
    public int floor;
    public int year;
    public String name;

    public void setter(int floor, String name, int year) {
        this.floor = floor;
        this.name = name;
        this.year = year;
    }

    public void printData() {
        System.out.println(this.floor);
        System.out.println(this.name);
        System.out.println(this.year);
    }

    public void returnAge() {
        System.out.println(LocalDate.now().getYear() - this.year);
    }

}


