package com.company;
import java.util.Random;
import java.util.Scanner;
public class metotlar {

    Random rastgel = new Random();
    Random rastgel2 = new Random();
    int say1 = rastgel.nextInt(6);
    int say2 = rastgel2.nextInt(6);
    int toplam = 0;

    void sayilariAyarla() {

        int[] dizi = new int[6];

        for (int i = 0; i < 6; i++) {
            Random rastgele = new Random();
            int sayi = rastgele.nextInt(100) + 1;
            dizi[i] = sayi;
        }

        for (int is = 0; is < 6; is++) {
            if (is != 6) {
                System.out.print(is + " . ");
            } else {
                System.out.print(is);
            }
        }
        System.out.println(" ");
        for (int m = 0; m < 6; m++) {
            if (m != 6) {
                System.out.print(dizi[m] + "| ");
            } else {
                System.out.print(dizi[m]);
            }
        }
        for (int ind = 0; ind < 6; ind++) {
            toplam = dizi[say1] + dizi[say2];
        }
        System.out.println();
        System.out.println("Serideki hangi ikilinin toplamı " + toplam + " eder");

    }

    boolean bildiMi(int glnsy1, int glnsy2) {

        if ((glnsy1 == say1 & glnsy2 == say2) || (glnsy1 == say2 & glnsy2 == say1)) {

            return true;

        } else {
            System.out.println("Üzgünüm bilemedin");

            return false;
        }

    }
    int puanEkle(int puanlama) {
        puanlama = puanlama + 100;
        return puanlama;
    }

    void gercekİkiliyiYazdir() {
        System.out.println(say1 + ". ve " + say2 + ". sıradaki sayıların toplamı " + toplam + " ediyor");
        System.out.println();
    }
}
