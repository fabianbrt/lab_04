import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Audi", Color.BLACK, 50, 3, 300, 6);
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        TestDrive.test_drive(car1);
    }
}