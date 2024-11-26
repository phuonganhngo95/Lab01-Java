import java.util.Scanner;

public class Lab01_bt6 {
    public static void main(String[] args) {
        int n1, m1;
        float n2, m2;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n1:");
        n1 = input.nextInt();
        System.out.println("Nhap m1:");
        m1 = input.nextInt();
        System.out.println("Nhap n2:");
        n2 = input.nextFloat();
        System.out.println("Nhap m2:");
        m2 = input.nextFloat();

        int sum1 = n1+m1;
        float sum2 = n2+m2;
        double sum3 = n1+n2;

        System.out.println("Tong so nguyen: " + sum1);
        System.out.println("Tong so thuc: " + sum2);
        System.out.println("Tong n1+n2: " + sum3);
    }
}
