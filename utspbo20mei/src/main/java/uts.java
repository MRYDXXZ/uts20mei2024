/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A-9
 */
import java.util.Scanner;

public class uts {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         // Tampilan awal
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("UTS 20 Mei 2024 oleh Mario Yudha Pratama NIM 23201117");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
        
        // Input nama
        System.out.println("Mario Yudha Pratama");
        String nama = scanner.nextLine();
        
        //Input jenis kelamin
        System.out.println("Pilih jenis kelamin: (1) Laki-laki (2) Perempuan");
        int pilihanKelamin = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer
        
        String panggilan;
        if (pilihanKelamin == 1) {
            panggilan = "Mas";
        } else if (pilihanKelamin == 2) {
            panggilan = "Mbak";
        } else {
            panggilan = "Mario";
        }
        
         // Menampilkan selamat datang
         System.out.println("Selamat Datang " + "rio" + " " + nama);
        //9
        System.out.println("++++++++++++++++Kalkulator------------------");
        //10
        boolean lanjut = true;
        
        while (lanjut) {
            System.out.println("Masukkan bilangan pertama: ");
            double bilangan1 = scanner.nextDouble();
            
            System.out.println("Masukkan bilangan kedua: ");
            double bilangan2 = scanner.nextDouble();
            
            System.out.println("Masukkan Operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            
            double hasil;
            boolean operatorValid = true;
            
            switch (operator) {
                case '+':
                    hasil = bilangan1 + bilangan2;
                    break;
                case '-':
                    hasil = bilangan1 - bilangan2;
                    break;
                case '*':
                    hasil = bilangan1 * bilangan2;
                    break;
                case '/':
                    if (bilangan2 != 0){
                       hasil = bilangan1 / bilangan2;
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak dapat dilakukan");
                        continue;
                    }
                    break;
                default:
                    System.out.println("operator tidak valid. pilih operator yang tersedia/valid.");
                    operatorValid = false;
                    hasil = 0;
                    break;
            }
            if (operatorValid) {
                System.out.println("Hasil: " + bilangan1 + " " + operator + " " + bilangan2 + " = " + hasil);
                }
            System.out.println("Apakah anda ingin melanjutkan pengghunaan Kalkulator? y/n: ");
            char lanjutPilihan = scanner.next().charAt(0);
            
            if (lanjutPilihan == 'n' || lanjutPilihan == 'N') {
                lanjut = false;
                
                System.out.println("Thank you for using the calculator. Goodbye!");
                scanner.close();
            }
        }
    }
}
  