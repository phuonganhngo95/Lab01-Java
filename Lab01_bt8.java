import java.util.Scanner;

public class Lab01_bt8 {
    public static void main(String[] args) {
        float a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = input.nextFloat();
        System.out.println("Nhap b:");
        b = input.nextFloat();
        System.out.println("Nhap c:");
        c = input.nextFloat();

        if(a > b) {
            if(a > c) {
                System.out.println("Max: " + a);
            } else {
                System.out.println("Max: " + c);
            }
        } else {
            if(b > c) {
                System.out.println("Max: " + b);
            } else {
                System.out.println("Max: " + c);
            }
        }

        if(a < b) {
            if(a < c) {
                System.out.println("Min: " + a);
            } else {
                System.out.println("Min: " + c);
            }
        } else {
            if(b < c) {
                System.out.println("Min: " + b);
            } else {
                System.out.println("Min: " + c);
            }
        }
    }
}
