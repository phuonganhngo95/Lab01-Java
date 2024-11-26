import java.util.Scanner;

public class Lab01_bt5 {
    public static void main(String[] args) {
        int n, m;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n:");
        n = input.nextInt();
        System.out.println("Nhap m:");
        m = input.nextInt();

        int sum = n+m;
        System.out.println("Tong: " + sum);
    }
}
