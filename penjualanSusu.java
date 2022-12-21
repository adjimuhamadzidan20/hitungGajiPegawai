package programjava;
import java.util.Scanner;

public class penjualanSusu {
    public static void main(String [] args) {
        
        String kodeSusu, ukuran;
        int jumlah;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Toko Susu ABC");
        System.out.println("Daftar Harga Produk Susu");
        System.out.println("|====================================================|");
        System.out.println("| Kode Susu | Nama Produk | Ukuran      | Harga      |");
        System.out.println("|====================================================|");
        System.out.println("| 1         | Dancow      | B = Besar   | Rp. 10.000 |");
        System.out.println("|           |             | S = Sedang  | Rp. 4.250  |");
        System.out.println("|           |             | K = Kecil   | Rp. 2.100  |");
        System.out.println("|====================================================|");
        System.out.println("| 2         | Indomilk    | B = Besar   | Rp. 8.500  |");
        System.out.println("|           |             | S = Sedang  | Rp. 4.000  |");
        System.out.println("|           |             | K = Kecil   | Rp. 2.025  |");
        System.out.println("|====================================================|");
        System.out.println("| 3         | Sustacal    | B = Besar   | Rp. 17.000 |");
        System.out.println("|           |             | S = Sedang  | Rp. 14.500 |");
        System.out.println("|           |             | K = Kecil   | Rp. 8.300  |");
        System.out.println("|====================================================|");
        System.out.println();
        System.out.print("Masukan Kode Susu (1,2,3) : ");
        kodeSusu = input.nextLine();
        System.out.print("Masukan Ukuran (B,S,K)    : ");
        ukuran = input.nextLine();
        System.out.print("Masukan Jumlah Pembelian  : ");
        jumlah = input.nextInt();
        System.out.println();
        
        switch (kodeSusu) {
            case "1":
                String produk1 = "Dancow";
                if ("B".equals(ukuran)) {
                    int harga = 10000;
                    int total = harga * jumlah;
                    
                    System.out.println("Susu "+ produk1);
                    System.out.println("Harga Susu Rp. "+ harga);
                    System.out.println("Jumlah Pembelian Rp. "+ total);
                }
                else if ("S".equals(ukuran)) {
                    int harga = 4250;
                    int total = harga * jumlah;
                    
                    System.out.println("Susu "+ produk1);
                    System.out.println("Harga Susu Rp. "+ harga);
                    System.out.println("Jumlah Pembelian Rp. "+ total);
                }
                else if ("K".equals(ukuran)) {
                    int harga = 2100;
                    int total = harga * jumlah;
                    
                    System.out.println("Susu "+ produk1);
                    System.out.println("Harga Susu Rp. "+ harga);
                    System.out.println("Jumlah Pembelian Rp. "+ total);
                }       
                break;
            case "2":
                String produk2 = "Indomilk";
                if ("B".equals(ukuran)) {
                    int harga = 8500;
                    int total = harga * jumlah;
                    
                    System.out.println("Susu "+ produk2);
                    System.out.println("Harga Susu Rp. "+ harga);
                    System.out.println("Jumlah Pembelian Rp. "+ total);
                }
                else if ("S".equals(ukuran)) {
                    int harga = 4000;
                    int total = harga * jumlah;
                    
                    System.out.println("Susu "+ produk2);
                    System.out.println("Harga Susu Rp. "+ harga);
                    System.out.println("Jumlah Pembelian Rp. "+ total);
                }
                else if ("K".equals(ukuran)) {
                    int harga = 2025;
                    int total = harga * jumlah;
                    
                    System.out.println("Susu "+ produk2);
                    System.out.println("Harga Susu Rp. "+ harga);
                    System.out.println("Jumlah Pembelian Rp. "+ total);
                }       
                break;
            case "3":
                String produk3 = "Sustacal";
                if ("B".equals(ukuran)) {
                    int harga = 17000;
                    int total = harga * jumlah;
                    
                    System.out.println("Susu "+ produk3);
                    System.out.println("Harga Susu Rp. "+ harga);
                    System.out.println("Jumlah Pembelian Rp. "+ total);
                }
                else if ("S".equals(ukuran)) {
                    int harga = 14500;
                    int total = harga * jumlah;
                    
                    System.out.println("Susu "+ produk3);
                    System.out.println("Harga Susu Rp. "+ harga);
                    System.out.println("Jumlah Pembelian Rp. "+ total);
                } 
                else if ("K".equals(ukuran)) {
                    int harga = 8300;
                    int total = harga * jumlah;
                    
                    System.out.println("Susu "+ produk3);
                    System.out.println("Harga Susu Rp. "+ harga);
                    System.out.println("Jumlah Pembelian Rp. "+ total);
                }       
                break;
            default:
                System.out.println("Kode tidak tersedia");
                break;
        }       
    }
}
