package com.example.hiiii.btvnbuoi3;

public class MainActivity {

    public static void main(String[] args) {
        bai1_bai22();
        bai23_bai25();
        bai34_bai36();

    }

    static void bai34_bai36() {
        System.out.println("");
        System.out.println("bai34");
        Bai34 bai34 = new Bai34();
        bai34.xuatBai34();

        System.out.println("");
        System.out.println("bai35");
        bai34.xuatBai35();

        System.out.println("");
        System.out.println("bai36");
        bai34.xuatBai36();
    }

    static void bai23_bai25() {
        System.out.println("");
        System.out.println("bai23");
        Bai23 pt = new Bai23();
        pt.nhap(2, -6);
        pt.xuat();
        ;

        System.out.println("");
        System.out.println("bai24");
        pt.nhapBac2(3, 2, -6);
        pt.xuatBac2();

        System.out.println("");
        System.out.println("bai25");
        pt.nhapNam(2000);
        pt.tinhNamNhuan();

        System.out.println("");
        System.out.println("bai26");
        pt.xuatBai26(20);

        System.out.println("");
        System.out.println("bai27");
        pt.xuatBai27(60);
    }

    static void bai1_bai22() {
        Bai1 bai1 = new Bai1();

        bai1.nhapSo(6);
        System.out.println("bai1");
        bai1.xuatBai1();

        System.out.println("");
        System.out.println("bai2");
        bai1.xuatBai2();

        System.out.println("");
        System.out.println("bai3");
        bai1.nhapSoD(10);
        bai1.xuatBai3();

        System.out.println("");
        System.out.println("bai4");
        bai1.xuatBai4();

        System.out.println("");
        System.out.println("bai5");
        bai1.xuatBai5();

        System.out.println("");
        System.out.println("bai6");
        bai1.xuatBai6();

        System.out.println("");
        System.out.println("bai7");
        bai1.xuatBai7();

        System.out.println("");
        System.out.println("bai8");
        bai1.xuatBai8();

        System.out.println("");
        System.out.println("bai9");
        bai1.xuatBai9();

        System.out.println("");
        System.out.println("bai10");
        bai1.nhapSoDBai10(5, 2);
        bai1.xuatBai10();

        System.out.println("");
        System.out.println("bai11");
        bai1.nhapSoD(4);
        bai1.xuatBai11();

        System.out.println("");
        System.out.println("bai12");
        bai1.nhapSoDBai10(5, 2);
        bai1.xuatBai12();

        System.out.println("");
        System.out.println("bai13");
        bai1.nhapSoDBai10(5, 2);
        bai1.xuatBai13();

        System.out.println("");
        System.out.println("bai14");
        bai1.nhapSoDBai10(5, 2);
        bai1.xuatBai14();

        System.out.println("");
        System.out.println("bai16");
        bai1.nhapSoD(12);
        bai1.xuatBai16();

        System.out.println("");
        System.out.println("bai17");
        bai1.xuatBai17();

        System.out.println("");
        System.out.println("bai18");
        bai1.xuatBai18();

        System.out.println("");
        System.out.println("bai19");
        bai1.nhapSoD(16);
        bai1.xuatBai19();
        System.out.println("");
        bai1.nhapSoD(29);
        bai1.xuatBai19();

        System.out.println("");
        System.out.println("bai20");
        bai1.xuatBai20(15);
        bai1.xuatBai20(36);

        System.out.println("");
        System.out.println("bai21");
        bai1.xuatBai21(15, 40);

        System.out.println("");
        System.out.println("bai22");
        bai1.xuatBai22(15, 40);

    }
}

