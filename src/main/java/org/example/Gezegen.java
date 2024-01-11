package org.example;

public class Gezegen {
    private String ad;
    private int sira;
    private double uzaklik;
    private double yaricap;
    private double donmeSuresi;

    public Gezegen(String ad, int sira, double uzaklik, double yaricap, double donmeSuresi) {
        this.ad = ad;
        this.sira = sira;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    @Override
    public String toString() {
        return "Gezegen Adı: " + ad +
                ", Sıralama: " + sira +
                ", Uzaklık: " + uzaklik + " milyon km" +
                ", Yarıçap: " + yaricap + " km" +
                ", Dönme Süresi: " + donmeSuresi + " Dünya günü";
    }

    public static void main(String[] args) {
        Gezegen[] gezegenler = {
                new Gezegen("Merkür", 1, 57.9, 2439.7, 58.6),
                new Gezegen("Venüs", 2, 108.2, 6051.8, 243),
                new Gezegen("Dünya", 3, 149.6, 6371, 1),
                new Gezegen("Mars", 4, 227.9, 3389.5, 1.03),
                new Gezegen("Jüpiter", 5, 778.6, 69911, 0.41),
                new Gezegen("Satürn", 6, 1433.5, 58232, 0.45),
                new Gezegen("Uranüs", 7, 2872.5, 25362, 0.72),
                new Gezegen("Neptün", 8, 4495.1, 24622, 0.67)
        };

        for (Gezegen gezegen : gezegenler) {
            System.out.println(gezegen);
        }
    }
}