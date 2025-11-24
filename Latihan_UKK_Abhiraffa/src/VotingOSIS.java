import java.util.Scanner;

public class VotingOSIS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("==== PROGRAM VOTING OSIS ====");
        System.out.println("ketik 'selesai' untuk mengakhiri\n");

        int A = 0;
        int B = 0;
        String pilih = "";

        while(!pilih.equals("selesai")){
            System.out.print("Masukkan pilihan Anda (A/B) : ");
            pilih = input.nextLine();

            if(pilih.equalsIgnoreCase("A")){
                A++;
            } else if(pilih.equalsIgnoreCase("B")){
                B++;
            }
        }
        System.out.println("\n--------------------------------------");
        System.out.println("HASIL HITUNG CEPAT");
        System.out.println("Total suara A = " + A);
        System.out.println("Total suara B = " + B);
    }
}