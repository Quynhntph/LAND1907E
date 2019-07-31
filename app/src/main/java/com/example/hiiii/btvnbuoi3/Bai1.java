package com.example.hiiii.btvnbuoi3;

public class Bai1 {
    int iSo, iSoD, kqDx9 = 1, iMuD;
    int kqDx1 = 0, kqDx2 = 0, kqDx12 = 0, kqDx13 = 0, kqDx14 = 0;
    float kqDx3 =0, kqDx4 = 0, kqDx5 = 0, kqDx6 = 0,kqDx7 = 0, kqDx8 = 0;

    void nhapSo(int nhapSo){
        iSo = nhapSo;
    }
    void xuatBai1(){
        if(iSo > 3 && iSo < 50) {
            for (int i = 1; i <= iSo; i++) {
                System.out.print(i + " ");
                kqDx1 +=i;
            }
            System.out.println("");
            System.out.print(kqDx1);
        } else {
            System.out.println("nhập số lơn hơn 3 và nhở hơn 50");
        }
    }
    void xuatBai2(){
        if (iSo >= 5 && iSo <= 20){
            for (int x = 1; x <= iSo; x++) {
                System.out.print(x + "^2" + " ");
                int tong = (int) Math.pow(x, 2);
                kqDx2 += tong;
            }
            System.out.println("");
            System.out.print(kqDx2  + " ");
        } else {
            System.out.println("nhập số >= 5 và <= 20");
        }
    }

    void nhapSoD(int nhapSo){
        iSoD = nhapSo;
    }
    void xuatBai3(){
        if(iSoD >=7){

            for (int i = 1; i <= iSoD; i++) {
                System.out.print("1/" +i + " ");
                kqDx3 += (1/(float)i);
            }
            System.out.println("");
            System.out.println(kqDx3);
        }else {
            System.out.println("Nhập Số >= 7");
        }
    }
    void xuatBai4(){
        if(iSoD >9){
            for (int i = 1; i <= iSoD; i++) {
                System.out.print("1/" + (i*2) + " ");
                kqDx4 += (1/(float)i*2);
            }
            System.out.println("");
            System.out.println(kqDx4);
        }else {
            System.out.println("Nhập Số > 9");
        }
    }
    void xuatBai5(){
        if(iSoD >=2){
            for (int i = 1; i <= iSoD; i++) {
                System.out.print("1/" + ((i*2)+1) + " ");
                kqDx5 += (1/(float)(i*2)+1);
            }
            System.out.println("");
            System.out.println(kqDx5);
        }else {
            System.out.println("Nhập Số >= 2");
        }
    }
    void xuatBai6(){
        if(iSoD > 6){
            for (int i = 1; i <= iSoD; i++) {
                System.out.print("1/" + (i*(i+1)) + " ");
                kqDx6 += (1/(float)(i*(i+1)) );
            }
            System.out.println("");
            System.out.println(kqDx6);
        }else {
            System.out.println("Nhập Số > 6");
        }
    }
    void xuatBai7(){
        if(iSoD >= 1){
            for (int i = 0; i <= iSoD; i++) {
                System.out.print(i + "/" + (i+1) + " ");
                kqDx7 += (i/(float)(i+1) );
            }
            System.out.println("");
            System.out.println(kqDx7);
        }else {
            System.out.println("Nhập Số >= 1");
        }
    }
    void xuatBai8(){
        if(iSoD > 5){
            for (int i = 0; i <= iSoD; i++) {
                System.out.print( ((2*i)+1) + "/" + ((2*i)+2) + " " );
                kqDx8 +=  ( ((2*i)+1) /(float) ((2*i)+2) ) ;
            }
            System.out.println("");
            System.out.println(kqDx8);
        }else {
            System.out.println("Nhập Số > 5");
        }
    }
    void xuatBai9(){
        if(iSoD > 6){
            for (int i = 1; i <= iSoD; i++) {
                System.out.print(i + " " );
                kqDx9 *= i ;
            }
            System.out.println("");
            System.out.println(kqDx9);
        }else {
            System.out.println("Nhập Số > 6");
        }
    }

    void nhapSoDBai10(int nhapSo, int nhapMu){
        iSoD = nhapSo;
        iMuD = nhapMu;
    }
    void xuatBai10(){
        int tongBai10 = (int) Math.pow(iSoD, iMuD);
        System.out.println(tongBai10 + "");
    }

    void xuatBai11(){
        int kqDx11Tong = 0, kqDx11Tich = 1;

            for (int i = 1; i <= iSoD ; i++) {
                kqDx11Tich *= i;
                kqDx11Tong += kqDx11Tich;
            }
            System.out.println(kqDx11Tong);
    }

    void xuatBai12(){
        for (int i = 1; i <= iMuD; i++) {
            System.out.print(iSoD + "^" + i + " ");
            int tongBai12 = (int) Math.pow(iSoD, i);
            System.out.println(tongBai12 + " ");
            kqDx12 += tongBai12;
        }

        System.out.println("");
        System.out.println(kqDx12 + " ");
    }
    void xuatBai13(){
        for (int i = 1; i <= iMuD; i++) {
            System.out.print(iSoD + "^" + i + " ");
            int tongBai12 = (int) Math.pow(iSoD, (i*2) );
            System.out.println(tongBai12 + " ");
            kqDx13 += tongBai12;
        }

        System.out.println("");
        System.out.println(kqDx13 + " ");
    }
    void xuatBai14(){
        for (int i = 1; i <= iMuD; i++) {
            System.out.print(iSoD + "^" + i + " ");
            int tongBai12 = (int) Math.pow(iSoD, ((i*2)+1) );
            System.out.println(tongBai12 + " ");
            kqDx14 += tongBai12;
        }

        System.out.println("");
        System.out.println(kqDx14 + " ");
    }
    int n, gt =1;
    void xuatBai15(int gtn) {
        n = gtn;
        if(n >= 0){
            if(n==0){
                gt = 1;
                System.out.println(n+"! = " + gt);
            }else {
                for (int i = 1; i <= n; i++) {
                    gt *= i;
                }
                System.out.println(n+"! = " + gt);
            }
        }
    }

    void xuatBai16(){
        if (iSoD > 0){
            for (int i = 1; i <=iSoD ; i++) {
                if (iSoD%i == 0){
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("i phải lớn hơn 0");
        }
    }

    int kqDx16Tong,kqDx16Tich =1;
    void xuatBai17(){
        if (iSoD > 0){
            for (int i = 1; i <=iSoD ; i++) {
                if (iSoD%i == 0){
                    kqDx16Tong += i;
                    kqDx16Tich *= i;
                }
            }
            System.out.println("");
            System.out.println("Tong: " + kqDx16Tong);
            System.out.println("Tich: " + kqDx16Tich);
        } else {
            System.out.println("i phải lớn hơn 0");
        }
    }

    int count = 0,countChan = 0,countLe = 0 ;
    void xuatBai18(){
        if (iSoD > 0){
            for (int i = 1; i <=iSoD ; i++) {
                if (iSoD%i == 0){
                    System.out.print(i + " ");
                    count ++;
                    if (i%2 == 0){
                        countChan++;
                    } else {
                        countLe++;
                    }
                }
            }
            System.out.println("");
            System.out.println("SL: " + count);
            System.out.println("SL lẻ: " + countLe);
            System.out.println("SL Chẵn: " + countChan);
        } else {
            System.out.println("i phải lơn hơn 0");
        }
    }

    void xuatBai19(){
        if (iSoD >= 2){
            boolean check = true;
            for (int j = 2; j < iSoD; j++) {
                if (iSoD % j == 0) {
                    check = false;
                    System.out.print(+iSoD + " khong phải là SNT");
                    break;
                }
            }
            if (check) {
                System.out.print(iSoD + " là SNT");
            }

        } else {
            System.out.println("nhỏ hơn 2 không phải SNT");
        }
    }

    void xuatBai20(int n){
        int iSoCP = (int) Math.sqrt(n);
        if ( (iSoCP*iSoCP) == n){
            System.out.println(n + " la so chinh phuong");
        } else {
            System.out.println(n + " khong phai la so chinh phuong");
        }
    }

    int xuatBai21(int first, int second){
        if ( (first|second)>0 ){
            System.out.println(first + "-" + second);

            while (first != second) {
                if (first > second) {
                    first -= second;
                } else {
                    second -= first;
                }
            }
            System.out.println("uoc chung lon nhat la: " + first);
        } else {
            System.out.println("phải lơn hơn 0");
        }
        return first;
    }

    void xuatBai22(int first, int second){
        int kqxD22 = (first*second)/xuatBai21(first, second);
        System.out.println("BCNN" + kqxD22);
    }

}
