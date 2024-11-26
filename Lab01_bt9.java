import java.util.Scanner;

public class Lab01_bt9 {
    public static void main(String[] args) {
        float a, b;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = input.nextFloat();
        System.out.println("Nhap b:");
        b = input.nextFloat();

        if(a == 0) {
            if(b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Phuong trinh co nghiem duy nhat x = " + (-b)/a);
        }
    }
}
