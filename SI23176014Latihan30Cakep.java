/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.pkg23176014.latihan30.cakep;

/**
 *
 * @author User
 * NAMA     : Muhammad Nur Khikam
 * KELAS    : Sistem Informasi
 * NIM      : 23176014
 * Deskripsi Program : Program ini meminta pengguna untuk menjawab apakah mereka mengerjakan latihan sendiri dengan jawaban "Yoi" atau "Enggak." Jika jawabannya "Yoi," program menampilkan pesan pujian. Jika "Enggak," program tetap memberi semangat.
 */
import java.util.Scanner;

public class SI23176014Latihan30Cakep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kamu ngerjain sendiri latihan 17 sampai latihan 30 ini? (Yoi/Enggak): ");
        String jawaban = scanner.nextLine().toLowerCase(); // Ubah semua input menjadi huruf kecil

        if (jawaban.equals("yoi")) {
            System.out.println("Cakep Bener. Good Job");
        } else if (jawaban.equals("enggak")) {
            System.out.println("Tetep cakep sih.");
            System.out.println("Sing penting paham konsep nya yee.");
            System.out.println("Keep the code works dude");
        } else {
            System.out.println("Jawaban tidak valid. Silakan jawab 'Yoi' atau 'Enggak'.");
        }

        System.out.println("BUILD SUCCESSFUL (total time: ... seconds)");
    }
}
