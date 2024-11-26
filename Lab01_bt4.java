import java.util.Scanner;

public class Lab01_bt4 {
    public static void main(String[] args) {
        int n;
        float m;
        String kt;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n:");
        n = input.nextInt();
        System.out.println("Nhap m:");
        m = input.nextFloat();
        kt = input.nextLine();
        System.out.println("Nhap ki tu:");
        kt = input.nextLine();

        System.out.println("So nguyen n: " + n);
        System.out.println("So nguyen m: " + m);
        System.out.println("Xau ki tu: " + kt);
    }
}
