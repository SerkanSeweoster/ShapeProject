import Resources.ShapeDrawer;

import java.util.Scanner;

public class Runner {
    static Scanner readInt = new Scanner(System.in);
    static Scanner readDouble = new Scanner(System.in);

    public static void main(String[] args) {


        int secim;

        do {
            System.out.println("\nŞekil Seçin:");
            System.out.println("1. Kare");
            System.out.println("2. Dikdörtgen");
            System.out.println("3. Daire");
            System.out.println("4. Üçgen");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminizi yapın: ");

            while (!readInt.hasNextInt()) {
                System.out.println("Geçersiz giriş! Lütfen bir sayı girin.");

            }

            secim = readInt.nextInt();

            IIslem sekil;
            double sonuc;

            switch (secim) {
                case 1:
                    System.out.println("Kare seçildi. Kare, dört eşit kenara sahip bir dikdörtgendir.");
                    System.out.print("Karenin Kenar Uzunluğunu Girin: ");
                    double kenar = readDouble.nextDouble();
                    sekil = new Kare(kenar);
                    sonuc = islemSec(sekil);
                    ShapeDrawer.drawSquare(5);
                    break;
                case 2:
                    System.out.println("Dikdörtgen seçildi. Dikdörtgen, iki uzun kenara sahip bir paralelkenardır.");
                    System.out.print("Dikdörtgenin Uzun Kenarını Girin: ");
                    double uzunKenar = readDouble.nextDouble();
                    System.out.print("Dikdörtgenin Kısa Kenarını Girin: ");
                    double kisaKenar = readDouble.nextDouble();
                    sekil = new Dikdortgen(uzunKenar, kisaKenar);
                    sonuc = islemSec(sekil);
                    ShapeDrawer.drawRectangle(6, 4);
                    break;
                case 3:
                    System.out.println("Daire seçildi. Daire, bir merkez etrafında dönerek çizilen bir çemberdir.");
                    System.out.print("Dairenin Yarıçapını Girin: ");
                    double yaricap = readDouble.nextDouble();
                    sekil = new Daire(yaricap);
                    sonuc = islemSec(sekil);
                    ShapeDrawer.drawCircle(7);
                    break;
                case 4:
                    System.out.println("Üçgen seçildi. Üçgen, üç kenara ve üç açıya sahip bir çokgendir.");
                    System.out.print("Üçgenin İlk Kenarını Girin: ");
                    double a = readDouble.nextDouble();
                    System.out.print("Üçgenin İkinci Kenarını Girin: ");
                    double b = readDouble.nextDouble();
                    System.out.print("Üçgenin Üçüncü Kenarını Girin: ");
                    double c = readDouble.nextDouble();
                    sekil = new Ucgen(a, b, c);
                    sonuc = islemSec(sekil);
                    ShapeDrawer.drawTriangle(5);
                    break;
                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyin.");
            }
        } while (secim != 0);

    }

    public static double islemSec(IIslem sekil) {

        int secim;
        do {
            System.out.println("\nHesaplama Türünü Seçin:");
            System.out.println("1. Alan Hesapla");
            System.out.println("2. Çevre Hesapla");
            System.out.println("0. Geri Dön");
            System.out.print("Seçiminizi yapın: ");

            while (!readInt.hasNextInt()) {
                System.out.println("Geçersiz giriş! Lütfen bir sayı girin.");

            }

            secim = readInt.nextInt();

            double sonuc;
            switch (secim) {
                case 1:
                    sonuc = sekil.alanHesapla();
                    System.out.println("Hesaplama Türü: Alan Hesabı");
                    System.out.println("Sonuç: " + sonuc);
                    return sonuc;
                case 2:
                    sonuc = sekil.cevreHesapla();
                    System.out.println("Hesaplama Türü: Çevre Hesabı");
                    System.out.println("Sonuç: " + sonuc);
                    return sonuc;
                case 0:
                    System.out.println("Geri dönülüyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyin.");
            }
        } while (secim != 0);
        return -1;
    }
}

