package kpd2033;
import java.util.Scanner;
public class AMALIKPD2023_AMEER {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String nama, hari;
        int bekerja;
        int gaji=0;
        
        System.out.print("Masukkan nama: ");
        nama = scanner.nextLine();
        
        do {
            System.out.print("Masukkan bilangan hari bekerja: ");
            bekerja = scanner.nextInt();
            
            if (bekerja <= 31) {
                gaji = bekerja * 160;
                System.out.println("Rumusan gaji bulanan bagi " + nama);
                System.out.println("Jumlah hari bekerja " + bekerja + " hari");
                System.out.println("GAJI SEBULAN ADALAH " + gaji);
            } 
            
            else {
                System.out.println("Bilangan hari tidak boleh melebihi 31 hari, Masukkan semula bilangan hari bekerja:");
            }
            
        } while (bekerja > 31);
        
    }
    
}