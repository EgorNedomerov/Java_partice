package src.src.ru.itmo.java.basics.lesson2;

public class Main {
    public static void main(String[] args) {
        SeaVessels seaVessels = new SeaVessels("BOAT", "SEADOO");
        seaVessels.setEngineCapacity(6.0);
        seaVessels.setDisplacement(1000);
        seaVessels.setColor(Color.RED);
        System.out.println(seaVessels);

//        Scanner reader = new Scanner(System.in);
//        System.out.println("Operation + Enter two numbers : ");
//        int num1 = reader.nextInt();
//        int num2 = reader.nextInt();
//        Calculator.sum(num1, num2);
//        System.out.println("Operation + Enter two numbers double : ");
//        double d1 = reader.nextDouble();
//        double d2 = reader.nextDouble();
//        sum(d1, d2);
//        division();
//        multiplication();
//        subtraction();
    }
}
