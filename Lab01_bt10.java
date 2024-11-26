import java.util.Scanner;

public class Lab01_bt10 {
    public static void main(String[] args) {
        float a, b, c, x1, x2, delta;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = input.nextFloat();
        System.out.println("Nhap b:");
        b = input.nextFloat();
        System.out.println("Nhap c:");
        c = input.nextFloat();

        delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep: x = " + x1);
        } else {
            x1 = (-b + (float) Math.sqrt(delta)) / (2 * a);
            x2 = (-b - (float) Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem phan biet:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}