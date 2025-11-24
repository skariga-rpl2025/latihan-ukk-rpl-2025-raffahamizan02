import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==== KALKULATOR SEDERHANA ====");
        System.out.println("Pilih Operasi : ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        
        System.out.print("Masukkan pilihan (1-4) : ");
        int pilih = input.nextInt();

        System.out.print("Masukkan angka pertama : ");
        double a = input.nextDouble();
        System.out.print("Masukkan angka kedua : ");
        double b = input.nextDouble();

        if(pilih == 1){
            System.out.println("Hasil penjumlahan : " + (a + b));
        } else if(pilih == 2){
            System.out.println("Hasil pengurangan : " + (a - b));
        } else if(pilih == 3){
            System.out.println("Hasil perkalian : " + (a * b));
        } else if(pilih == 4){
            System.out.println("Hasil pembagian : " + (a / b));
        } else {
            System.out.println("Pilihan tidak ada");
        }
    }
}