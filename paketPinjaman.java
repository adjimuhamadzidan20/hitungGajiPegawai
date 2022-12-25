package programjava;
import java.util.Scanner;

public class paketPinjaman {
    public static void main(String [] args) {
        
        Scanner input = new Scanner(System.in);
        
        int pilihKarung, noKtp, lamaPinjam;
        String nama, pilihPaket;
        
        System.out.println("== Welcome To The Solution Of Money ==");
        System.out.println("======================================");
        System.out.println("Silahkan pilih paket pinjaman :");
        System.out.println("1. Paket Karung");
        System.out.println("2. Paket Paper Bag");
        System.out.print("Masukan pilihan paket [1,2] : ");
        pilihPaket = input.nextLine();
        System.out.println();
        
        switch (pilihPaket) {
            case "1" :
                System.out.println("== Silahkan Masukan Data Anda =");
                System.out.print("Masukan Nama Peminjam   : ");
                nama = input.nextLine();
                System.out.print("Masukan No.KTP Peminjam : ");
                noKtp = input.nextInt();
                System.out.println();

                System.out.println("Pilih Ukuran Karung ");
                System.out.println("1. XL");
                System.out.println("2. L");
                System.out.println("3. M");
                System.out.print("Masukan pilihan [1,2,3] : ");
                pilihKarung = input.nextInt();
                
                if (pilihKarung == 1) {
                    System.out.print("Berapa lama pinjam (Bulan) : ");
                    lamaPinjam = input.nextInt();
                    System.out.println();
                    
                    int XL = 100000000;
                    double bungaPersen = 0.025;
                    int bunga = (int) (bungaPersen * XL);
                    int bayarPerbulan = XL / lamaPinjam;
                    int totalPerbulan = bayarPerbulan + bunga;
                    int totalPinjaman = totalPerbulan * lamaPinjam;
                    
                    System.out.println("Anda Memilih Paket XL");
                    System.out.println("Dengan Pinjam : Rp. "+ XL);
                    System.out.println("Dengan Bunga  : 2,5%");
                    
                    System.out.println();
                    System.out.println("= Total Kewajiban Pinjaman =");
                    System.out.println("Nama Peminjam     : "+ nama);
                    System.out.println("Kewajiban Bulanan : Rp. "+ totalPerbulan);
                    System.out.println("Total Pinjaman    : Rp. "+ totalPinjaman);
                    System.out.println();
                    
                    System.out.println("Terimakasih sudah meminjam di The Solution Of Money");
                    System.out.println("Pusing dengan keuangan kami solusinya..");
                }
                else if (pilihKarung == 2) {
                    System.out.print("Berapa lama pinjam (Bulan) : ");
                    lamaPinjam = input.nextInt();
                    System.out.println();
                    
                    int L = 75000000;
                    double bungaPersen = 0.025;
                    int bunga = (int) (bungaPersen * L);
                    int bayarPerbulan = L / lamaPinjam;
                    int totalPerbulan = bayarPerbulan + bunga;
                    int totalPinjaman = totalPerbulan * lamaPinjam;
                    
                    System.out.println("Anda Memilih Paket XL");
                    System.out.println("Dengan Pinjam : Rp. "+ L);
                    System.out.println("Dengan Bunga  : 2,5%");
                    
                    System.out.println();
                    System.out.println("= Total Kewajiban Pinjaman =");
                    System.out.println("Nama Peminjam     : "+ nama);
                    System.out.println("Kewajiban Bulanan : Rp. "+ totalPerbulan);
                    System.out.println("Total Pinjaman    : Rp. "+ totalPinjaman);
                    System.out.println();
                    
                    System.out.println("Terimakasih sudah meminjam di The Solution Of Money");
                    System.out.println("Pusing dengan keuangan kami solusinya..");
                }
                else if (pilihKarung == 3) {
                    System.out.print("Berapa lama pinjam (Bulan) : ");
                    lamaPinjam = input.nextInt();
                    System.out.println();
                    
                    int M = 50000000;
                    double bungaPersen = 0.025;
                    int bunga = (int) (bungaPersen * M);
                    int bayarPerbulan = M / lamaPinjam;
                    int totalPerbulan = bayarPerbulan + bunga;
                    int totalPinjaman = totalPerbulan * lamaPinjam;
                    
                    System.out.println("Anda Memilih Paket XL");
                    System.out.println("Dengan Pinjam : Rp. "+ M);
                    System.out.println("Dengan Bunga  : 2,5%");
                    
                    System.out.println();
                    System.out.println("= Total Kewajiban Pinjaman =");
                    System.out.println("Nama Peminjam     : "+ nama);
                    System.out.println("Kewajiban Bulanan : Rp. "+ totalPerbulan);
                    System.out.println("Total Pinjaman    : Rp. "+ totalPinjaman);
                    System.out.println();
                    
                    System.out.println("Terimakasih sudah meminjam di The Solution Of Money");
                    System.out.println("Pusing dengan keuangan kami solusinya..");
                }
                else {
                    System.out.println("Opsi tidak tersedia");
                }
                break;
            case "2" :
                System.out.println("== Silahkan Masukan Data Anda =");
                System.out.print("Masukan Nama Peminjam   : ");
                nama = input.nextLine();
                System.out.print("Masukan No.KTP Peminjam : ");
                noKtp = input.nextInt();
                System.out.println();

                System.out.println("Pilih Ukuran Karung ");
                System.out.println("1. XL");
                System.out.println("2. L");
                System.out.println("3. M");
                System.out.print("Masukan pilihan [1,2,3] : ");
                pilihKarung = input.nextInt();
                
                if (pilihKarung == 1) {
                    System.out.print("Berapa lama pinjam (Bulan) : ");
                    lamaPinjam = input.nextInt();
                    System.out.println();
                    
                    int XL = 30000000;
                    double bungaPersen = 0.025;
                    int bunga = (int) (bungaPersen * XL);
                    int bayarPerbulan = XL / lamaPinjam;
                    int totalPerbulan = bayarPerbulan + bunga;
                    int totalPinjaman = totalPerbulan * lamaPinjam;
                    
                    System.out.println("Anda Memilih Paket XL");
                    System.out.println("Dengan Pinjam : Rp. "+ XL);
                    System.out.println("Dengan Bunga  : 2,5%");
                    
                    System.out.println();
                    System.out.println("= Total Kewajiban Pinjaman =");
                    System.out.println("Nama Peminjam     : "+ nama);
                    System.out.println("Kewajiban Bulanan : Rp. "+ totalPerbulan);
                    System.out.println("Total Pinjaman    : Rp. "+ totalPinjaman);
                    System.out.println();
                    
                    System.out.println("Terimakasih sudah meminjam di The Solution Of Money");
                    System.out.println("Pusing dengan keuangan kami solusinya..");
                }
                else if (pilihKarung == 2) {
                    System.out.print("Berapa lama pinjam (Bulan) : ");
                    lamaPinjam = input.nextInt();
                    System.out.println();
                    
                    int L = 20000000;
                    double bungaPersen = 0.025;
                    int bunga = (int) (bungaPersen * L);
                    int bayarPerbulan = L / lamaPinjam;
                    int totalPerbulan = bayarPerbulan + bunga;
                    int totalPinjaman = totalPerbulan * lamaPinjam;
                    
                    System.out.println("Anda Memilih Paket XL");
                    System.out.println("Dengan Pinjam : Rp. "+ L);
                    System.out.println("Dengan Bunga  : 2,5%");
                    
                    System.out.println();
                    System.out.println("= Total Kewajiban Pinjaman =");
                    System.out.println("Nama Peminjam     : "+ nama);
                    System.out.println("Kewajiban Bulanan : Rp. "+ totalPerbulan);
                    System.out.println("Total Pinjaman    : Rp. "+ totalPinjaman);
                    System.out.println();
                    
                    System.out.println("Terimakasih sudah meminjam di The Solution Of Money");
                    System.out.println("Pusing dengan keuangan kami solusinya..");
                }
                else if (pilihKarung == 3) {
                    System.out.print("Berapa lama pinjam (Bulan) : ");
                    lamaPinjam = input.nextInt();
                    System.out.println();
                    
                    int M = 10000000;
                    double bungaPersen = 0.025;
                    int bunga = (int) (bungaPersen * M);
                    int bayarPerbulan = M / lamaPinjam;
                    int totalPerbulan = bayarPerbulan + bunga;
                    int totalPinjaman = totalPerbulan * lamaPinjam;
                    
                    System.out.println("Anda Memilih Paket XL");
                    System.out.println("Dengan Pinjam : Rp. "+ M);
                    System.out.println("Dengan Bunga  : 2,5%");
                    
                    System.out.println();
                    System.out.println("= Total Kewajiban Pinjaman =");
                    System.out.println("Nama Peminjam     : "+ nama);
                    System.out.println("Kewajiban Bulanan : Rp. "+ totalPerbulan);
                    System.out.println("Total Pinjaman    : Rp. "+ totalPinjaman);
                    System.out.println();
                    
                    System.out.println("Terimakasih sudah meminjam di The Solution Of Money");
                    System.out.println("Pusing dengan keuangan kami solusinya..");
                }
                else {
                    System.out.println("Opsi tidak tersedia");
                }
                break;
            default :
                System.out.println("Opsi tidak tersedia");
                break;
        }
    }    
}
