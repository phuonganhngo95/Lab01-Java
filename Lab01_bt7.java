import java.util.Scanner;

public class Lab01_bt7 {
    public static void main(String[] args) {
        float a, b;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = input.nextFloat();
        System.out.println("Nhap b:");
        b = input.nextFloat();

        if(a > b) {
            System.out.println("Max: " + a);
            System.out.println("Min: " + b);
        } else {
            System.out.println("Max: " + b);
            System.out.println("Min: " + a);
        }
    }
}
