package com.company;

import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int puanlama = 0;
        metotlar mtt = new metotlar();
        do{
            mtt.sayilariAyarla();
            System.out.println(" ");
            Scanner bir = new Scanner(System.in);
            System.out.println("ikilinin sıra değerini giriniz :");
            int indis1 = bir.nextInt();
            Scanner iki = new Scanner(System.in);
            System.out.println("ikilinin sıra değerini giriniz :");
            int indis2 = iki.nextInt();
            if (mtt.bildiMi(indis1, indis2) == true) {
                System.out.println("Tebrikler!");
                System.out.println("Puanınız: " + mtt.puanEkle(puanlama));
            } else
                mtt.gercekİkiliyiYazdir();
        }while(mtt.puanEkle(puanlama)!=0);
    }
}
