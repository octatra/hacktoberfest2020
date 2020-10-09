
import java.util.Scanner;

public class CetakAngka {
 
 public static void main(String[] args) {

  // Buat instance reader untuk
  // mengambil input dari keyboard
  Scanner reader = new Scanner(System.in);
  System.out.print("Masukkan angka: ");

  // nextInt() membaca bilangan bulat berikutnya dari keyboard
  int angka = reader.nextInt();
  // println() mencetak output
  System.out.println("Input anda adalah: " + angka);
 }
}
