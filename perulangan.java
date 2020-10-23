package perulangan;

import java.util.Arrays;
import java.util.Scanner;

public class Perulangan {

    //Coundted Loop: perulagan yang jumlah perulangannya terhitung atau tertentu
    public void perulangan1() { //for
        for (int i = 0; i < 10; i++) {
            System.out.println("Saya Seorang Programmer");
        }
        System.out.println("\n");
    }

    public void perulangan2() {
        String mahasiswa[][] = {{"Hawari", "1901010194", "ILMU KOMPUTER"},
        {"Doni", "1901010192", "ILMU KOMPUTER"},
        {"Rizal", "1901010193", "ILMU KOMPUTER"},
        {"diki", "1901010191", "ILMU KOMPUTER"}};

        for (String[] x : mahasiswa) {
            System.out.println(Arrays.toString(x));

        }
        System.out.println("\n");
    }

    public void perulangan3() {
        boolean running = true;
        int a = 0;
        String jawab;
        Scanner x = new Scanner(System.in);

        while (running) {
            System.out.println("Apakah Anda Ingin Keluar ?");
            System.out.print("Jawab[yes/no] :");

            jawab = x.nextLine();

            if (jawab.equalsIgnoreCase("yes")) {
                running = false;

            }
            a++;
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Anda Sudah Melakuka Perulangan Sebanyak " + a + "kali");
        System.out.println("-----------------------------------------------------");
    }

    public void perulangan4() {
        Scanner input = new Scanner(System.in);
        int menu, hb = 0, juba = 0, jube = 0, toha = 0, siba, harga_jual = 0, untung;
        String nambarang = null;

        do {
            System.out.println("===========================================");
            System.out.println("##         Menu Penjualan Barang         ##");
            System.out.println("===========================================");
            System.out.println("1. Input Data Barang");
            System.out.println("2. Penjualan");
            System.out.println("3. Laporan Penjualan");
            System.out.println("4. Keluar");
            System.out.println("=========================================" + "\n");
            System.out.print("Masukan Pilihan Anda :");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("---------------------------");
                    System.out.println("##   Input Data Barang   ##");
                    System.out.println("--------------------------");
                    System.out.print("1. Nama Barang   : ");
                    nambarang = input.next();
                    System.out.print("2. Harga Barang  :");
                    hb = input.nextInt();
                    System.out.print("4. Jumlah Barang :");
                    juba = input.nextInt();
                    System.out.println("---------------------------" + "\n");
                    break;
                case 2:
                    System.out.println("--------------------------");
                    System.out.println("##       Penjualan       ##");
                    System.out.println("--------------------------");
                    System.out.print("Nama Barang :" + nambarang + "\n");
                    System.out.print("Harga Jual  :");
                    harga_jual = input.nextInt();
                    System.out.print("Jumlah Beli :");
                    jube = input.nextInt();
                    toha = harga_jual * jube;
                    System.out.print("Total Harga :" + toha + "\n");
                    siba = juba - jube;
                    System.out.print("Sisa Barang :" + siba + "\n");
                    System.out.println("-------------------------" + "\n");
                    break;
                case 3:
                    System.out.println("----------------------------");
                    System.out.println("##    Laporan Penjualan    ## ");
                    System.out.println("----------------------------");
                    System.out.println("Nama Barang   : " + nambarang);
                    System.out.println("Harga Barang  : " + hb);
                    System.out.println("Total Harga   :" + toha);
                    untung = harga_jual - hb;
                    System.out.println("Keuntungan    :" + untung);
                    System.out.println("----------------------------" + "\n");
                    break;
                case 4:
                    System.out.print("Keluar");
                    break;
                default:
                    System.out.println("ERROR");
            }

        } while (menu != 4);

    }
}
