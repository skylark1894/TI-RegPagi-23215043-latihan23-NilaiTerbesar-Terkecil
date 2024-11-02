/*
 * Nama:Moh.arif prasetyo
 * Nim : 23215043
 * Prodi : Teknik Informatika
 */
package pertemuan5;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class MenghitungNilai {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas: ");
        String namaPetugas = scanner.nextLine();

        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }

        int nilaiTerbesar = nilaiMahasiswa[0];
        int nilaiTerkecil = nilaiMahasiswa[0];

        for (int nilai : nilaiMahasiswa) {
            if (nilai > nilaiTerbesar) {
                nilaiTerbesar = nilai;
            }
            if (nilai < nilaiTerkecil) {
                nilaiTerkecil = nilai;
            }
        }

        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);
        }
        System.out.println("\nNilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
        System.out.println("Petugas: " + namaPetugas);

        scanner.close();
    }
}
