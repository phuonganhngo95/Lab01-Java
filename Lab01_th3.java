import java.util.Scanner;

public class Lab01_th3 {
    public static void main(String[] args) {
        String ten;
        int tuoi;
        float diemLiThuyet, diemThucHanh;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien:");
        ten = input.nextLine();
        System.out.println("Nhap tuoi:");
        tuoi = input.nextInt();
        System.out.println("Nhap diem li thuyet:");
        diemLiThuyet = input.nextFloat();
        System.out.println("Nhap diem thuc hanh:");
        diemThucHanh = input.nextFloat();

        float avg = (diemLiThuyet+diemThucHanh) / 2;
        System.out.println("TEN: " + ten);
        System.out.println("TUOI: " + tuoi);
        System.out.println("DIEM LI THUYET: " + diemLiThuyet);
        System.out.println("DIEM THUC HANH: " + diemThucHanh);
        System.out.println("TRUNG BINH: " + avg);
    }
}
