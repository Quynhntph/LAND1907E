package com.example.hiiii.btvnbuoi3;

public class Bai23 {

    int a, b, c;

    void nhapNam(int gtA) {
        a = gtA;
    }

    void nhap(int gtB, int gtC) {
        b = gtB;
        c = gtC;
    }

    void nhapBac2(int gtA, int gtB, int gtC) {
        a = gtA;
        b = gtB;
        c = gtC;
    }

    void xuat() {
        if (b == 0) {
            System.out.println("vo nghiem");
        } else {
            if (c == 0) {
                System.out.println("x = 0");
            } else {
                System.out.println("x = " + (-c / b));
            }
        }
    }

    void xuatBac2() {
        if (a == 0) {
            xuat();
        } else {
            float delta = (b * b) - 4 * a * c;
            float canDelta = (float) Math.sqrt(delta);
            if (delta < 0) {
                System.out.println("phuong trinh vo nghiệm");
            }
            if (delta == 0) {
                System.out.print("phuong trinh co nghiem kep x = " + (-b / 2 * a));
            }
            if (delta > 0) {
                System.out.println("phuong trinh có 2 nghiệm");
                System.out.println("x = " + (-b + canDelta) / (2 * a));
                System.out.println("x = " + (-b - canDelta) / (2 * a));
            }
        }
    }

    void tinhNamNhuan() {
        if (a % 4 == 0 && a % 100 != 0) {
            System.out.print("nam nhuan");
        } else {
            System.out.println("nam khong nhuan");
        }
    }

    void xuatBai26(int iSNLe) {
        if (iSNLe > 0) {
            for (int i = 0; i < iSNLe; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("so phai lon hon 0");
        }
    }

    void xuatBai27(int iSNLe) {
        if (iSNLe > 0) {
            for (int i = 0; i < iSNLe; i++) {
                if (i % 2 != 0 && (i != 7 && i != 21 && i != 41)) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("so phai lon hon 0");
        }
    }
}
