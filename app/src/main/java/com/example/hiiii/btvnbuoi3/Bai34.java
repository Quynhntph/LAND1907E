package com.example.hiiii.btvnbuoi3;

import java.util.Scanner;

public class Bai34 {
    void xuatBai34() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập họ ten: ");
        String sName = sc.nextLine();
        System.out.print("nhập MSV: ");
        String sMsv = sc.nextLine();
        System.out.print("nhập toan: ");
        double dToan = sc.nextInt();
        System.out.print("nhập ly: ");
        double dLy = sc.nextInt();
        System.out.print("nhập sinh: ");
        double dSinh = sc.nextInt();
        double diemTbB = (dToan + dLy + dSinh) / 3;

        System.out.println("Ten: " + sName + " Msv: " + sMsv);
        System.out.println("diem trung binh la: " + diemTbB);

        if (diemTbB >= 0 && diemTbB <= 5.0) {
            System.out.println("hoc luc - kem");
        } else if (diemTbB > 5 && diemTbB <= 7.0) {
            System.out.println("hoc luc - kha");
        } else if (diemTbB > 7 && diemTbB <= 9.0) {
            System.out.println("hoc luc - gioi");
        } else if (diemTbB > 9.0 && diemTbB <= 10) {
            System.out.println("hoc luc - xuat sac");
        } else {
            System.out.println("nhap diem trung binh tu 0 den 10");
        }


    }

    void xuatBai35() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập họ ten: ");
        String sName = sc.nextLine();

        System.out.print("nhập Ngay: ");
        int sNgay = sc.nextInt();
        System.out.print("nhập toan: ");
        int sThang = sc.nextInt();
        System.out.print("nhập năm: ");
        int sNam = sc.nextInt();
        if (sNgay < 0 && sNgay > 31) {
            System.out.println("sai ngay");
        }
        if (sThang < 0 && sThang > 12) {
            System.out.println();
        }
        if (sNam < 1950 && sNam > 2019) {
            System.out.println("sai nam");
        }
        System.out.println("ten: " + sName + "tuoi: " + (2019 - sNam));
    }

    void xuatBai36() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập a: ");
        int a = sc.nextInt();
        System.out.print("nhập b: ");
        int b = sc.nextInt();
        System.out.println("1. cong");
        System.out.println("2. tru");
        System.out.println("3. nhan");
        System.out.println("4. chia");
        System.out.print("Ban hay chon phep tinh ");


        byte chucnang = sc.nextByte();
        switch (chucnang) {
            case 1:
                System.out.println("tong: " + (a + b));
                break;
            case 2:
                System.out.println("tru: " + (a - b));
                break;
            case 3:
                System.out.println("nhan: " + (a * b));
                break;
            case 4:
                System.out.println("chia: " + (a / b));
                break;
            default:
                System.out.println("Thoat ra ngoai");
                break;
        }
    }
}
