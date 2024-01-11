package src.src.ru.itmo.java.basics.lesson3;

public class Main {
    public static void main(String[] args) {
        Study study = new Study("Изучение Java- это просто! ");
        System.out.println(study.printCourse());
        Car bmw = new Car("Black", "1500", "BMW");
        Car cadillac = new Car("Gold", "3500", "Cadillac");
        bmw.printCar();
        cadillac.printCar();
        Home homeCottage = new Home();
        homeCottage.setter(3, "Haffners cottage", 1950);
        Home homeVilla = new Home();
        homeVilla.setter(2, "Scarfaces mansion", 2000);
        homeCottage.printData();
        homeVilla.printData();
        homeCottage.returnAge();
        homeVilla.returnAge();
        Tree bereza = new Tree("Bereza", 1960, true);
        Tree osina = new Tree("Osina", 1980);
        Tree lipa = new Tree();
    }
}

