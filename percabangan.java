package percabangan;

import java.util.Scanner;

public class Percabangan {

    public void percabangan1() {
        int belanja = 0;
        if (belanja < 10000) {
            System.out.println("Anda tidak Mendapatkan Diskon");
        }
        System.out.println("\n");

    }

    public void percabangan2() {
        int nilai;
        String nama;
        Scanner x = new Scanner(System.in);

        System.out.println("============ Input Nama Anda =================");
        System.out.print("Nama :");
        nama = x.nextLine();
        System.out.println("==============================================");
        System.out.println("\n");

        System.out.println("====== Input Nilai Anda ========");
        System.out.print("Nilai :");
        nilai = x.nextInt();
        System.out.println("==================================");
        System.out.println("\n");

        if (nilai >= 80) {
            System.out.println("============ Pengumuman =============");
            System.out.println("Selamat " + nama + ", anda lulus!!");
            System.out.println("=======================================");
        } else {
            System.out.println("============ Pengumuman =============");
            System.out.println("Maaf " + nama + ", anda gagal");
            System.out.println("======================================");
        }
        System.out.println("\n");
    }

    public void percabangan3() {
        int nilai;
        String nama;
        Scanner x = new Scanner(System.in);

        System.out.println("======= Input Nama Anda ========");
        System.out.print("input Nama Anda:");
        nama = x.nextLine();
        System.out.println("==================================");
        System.out.println("\n");

        System.out.println("========= Input Nilai Anda ========");
        System.out.print("input Nilai Anda :");
        nilai = x.nextInt();
        System.out.println("\n");

        if (nilai >= 90) {
            System.out.println("Grade A");

        } else if (nilai >= 80) {
            System.out.println("Grade B");
        } else if (nilai >= 70) {
            System.out.println("Grade C");
        } else if (nilai >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade E");
        }
    }

    public void percabangan4() {
        int nilai;
        Scanner x = new Scanner(System.in);

        System.out.println("=========== Input Nilai Anda ==========");
        System.out.print("Input Nilai Anda :");
        nilai = x.nextInt();
        System.out.println("=========================================");
        System.out.println("\n");

        switch (nilai) {
            case 'A':
                System.out.println("God Joob");
                break;
            case 'B':
                System.out.println("Harus Lebih Baik Lagi");
                break;
            case 'C':
                System.out.println("Perbanyak Belajar Lagi");
                break;
            case 'D':
                System.out.println("Jangan terlalu banyak bermain !!!!");
                break;
            case 'E':
                System.out.println("Terlalu Sering Bolos!");
                break;
            default:
                System.out.println("Maaf, Nilai Anda Tidak Sesuai");
        }

    }

}
