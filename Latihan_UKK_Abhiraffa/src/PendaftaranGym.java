import java.util.Scanner;

public class PendaftaranGym {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("==== PENDAFTARAN ANGGOTA GYM ====");

        int total = 0;
        String daftar = "";

        do {
            System.out.print("Masukkan nama anggota : ");
            String nama = input.nextLine();
            total++;

            System.out.print("Daftar anggota lagi? [ya/tidak]> ");
            daftar = input.nextLine();
            
        } while(daftar.equalsIgnoreCase("ya"));
        System.out.println("------------------------------------------");
        System.out.println("Total anggota yang di daftarkan : " + total);
    }
}