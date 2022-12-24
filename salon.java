package programjava;
import java.util.Scanner;

public class salon {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        
        int total;
        char ulang;
        
        System.out.println("== Selamat Datang Di Salon Cantika ==");
        System.out.println("=====================================");
        System.out.print("Masukan Nama Pelanggan    : ");
        String nama = input.nextLine();
        System.out.print("Masukan No.telp Pelanggan : ");
        String no_telp = input.nextLine();
        System.out.print("Lakukan Transaksi? [y/t]  : ");
        String transaksi = input.nextLine();
        System.out.println();
        
        if (transaksi.equals("y")) {
            do {
                System.out.println("=====================================");
                System.out.println("Pilih menu yang tersedia :");
                System.out.println("1. Perawatan");
                System.out.println("2. Penyewaan");
                System.out.print("Pilih menu [1,2] : ");
                int menu = input.nextInt();
                System.out.println();

                if (menu == 1) {
                    System.out.println("Jenis Perawatan");
                    System.out.println("1. Facial Wajah");
                    System.out.println("2. Masker");
                    System.out.println("3. Potong Rambut");
                    System.out.print("Pilihan Anda [1,2,3] : ");
                    int pilihan = input.nextInt();
                    System.out.println();

                    if (pilihan == 1) {
                        System.out.println("Menu Facial Wajah");
                        System.out.println("1. Facial Biasa Rp. 50.000");
                        System.out.println("2. Facial Emas Rp. 100.000");
                        System.out.print("Pilihan Anda [1,2] : ");
                        int pilihanFacial = input.nextInt();

                        if (pilihanFacial == 1) {
                            int facialBiasa = 50000;

                            System.out.print("Berapa Orang : ");
                            int jmlOrang = input.nextInt();
                            System.out.println();

                            total = facialBiasa * jmlOrang;

                            System.out.println("=====================================");
                            System.out.println("Nama pemesan  "+ nama);
                            System.out.println("No telp       "+ no_telp);
                            System.out.println("Facial biasa  "+ jmlOrang +" orang");
                            System.out.println("Harga sebesar Rp. "+ total);
                        } 
                        else if (pilihanFacial == 2) {
                            int facialEmas = 100000;

                            System.out.print("Berapa Orang : ");
                            int jmlOrang = input.nextInt();
                            System.out.println();

                            total = facialEmas * jmlOrang;

                            System.out.println("=====================================");
                            System.out.println("Nama pemesan  "+ nama);
                            System.out.println("No telp       "+ no_telp);
                            System.out.println("Facial biasa  "+ jmlOrang +" orang");
                            System.out.println("Harga sebesar Rp. "+ total);
                        }
                        else {
                            System.out.println("Pilihan tidak tersedia");
                        }
                    } 
                    else if (pilihan == 2) {
                        System.out.println("Menu Masker");
                        System.out.println("1. Masker Buah Rp. 40.000");
                        System.out.println("2. Masker Lumpur Rp. 75.000");
                        System.out.print("Pilihan Anda [1,2] : ");
                        int pilihanMasker = input.nextInt();

                        if (pilihanMasker == 1) {
                            int maskerBuah = 40000;

                            System.out.print("Berapa Orang : ");
                            int jmlOrang = input.nextInt();
                            System.out.println();

                            total = maskerBuah * jmlOrang;

                            System.out.println("=====================================");
                            System.out.println("Nama pemesan  "+ nama);
                            System.out.println("No telp       "+ no_telp);
                            System.out.println("Facial biasa  "+ jmlOrang +" orang");
                            System.out.println("Harga sebesar Rp. "+ total);
                        } 
                        else if (pilihanMasker == 2) {
                            int maskerLumpur = 75000;

                            System.out.print("Berapa Orang : ");
                            int jmlOrang = input.nextInt();
                            System.out.println();

                            total = maskerLumpur * jmlOrang;

                            System.out.println("=====================================");
                            System.out.println("Nama pemesan  "+ nama);
                            System.out.println("No telp       "+ no_telp);
                            System.out.println("Facial biasa  "+ jmlOrang +" orang");
                            System.out.println("Harga sebesar Rp. "+ total);
                        }
                        else {
                            System.out.println("Pilihan tidak tersedia");
                        }
                    } 
                    else if (pilihan == 3) {
                        System.out.println("Menu Potong Rambut");
                        System.out.println("1. Tidak Keramas Rp. 20.000");
                        System.out.println("2. Keramas Rp. 35.000");
                        System.out.print("Pilihan Anda [1,2] : ");
                        int pilihanPotong = input.nextInt();

                        if (pilihanPotong == 1) {
                            int tidakKeramas = 20000;

                            System.out.print("Berapa Orang : ");
                            int jmlOrang = input.nextInt();
                            System.out.println();

                            total = tidakKeramas * jmlOrang;

                            System.out.println("=====================================");
                            System.out.println("Nama pemesan  "+ nama);
                            System.out.println("No telp       "+ no_telp);
                            System.out.println("Facial biasa  "+ jmlOrang +" orang");
                            System.out.println("Harga sebesar Rp. "+ total);
                        } 
                        else if (pilihanPotong == 2) {
                            int keramas = 35000;

                            System.out.print("Berapa Orang : ");
                            int jmlOrang = input.nextInt();
                            System.out.println();

                            total = keramas * jmlOrang;

                            System.out.println("=====================================");
                            System.out.println("Nama pemesan  "+ nama);
                            System.out.println("No telp       "+ no_telp);
                            System.out.println("Facial biasa  "+ jmlOrang +" orang");
                            System.out.println("Harga sebesar Rp. "+ total);
                        }
                        else {
                            System.out.println("Pilihan tidak tersedia");
                        }
                    }
                    else {
                        System.out.println("Pilihan tidak tersedia");
                    }
                } 
                else if (menu == 2) {
                    System.out.println("Jenis Penyewaan");
                    System.out.println("1. Rias Wajah");
                    System.out.println("2. Baju Pengantin");
                    System.out.println("3. Aksesoris");
                    System.out.print("Pilihan Anda [1,2,3] : ");
                    int pilihan = input.nextInt();
                    System.out.println();

                    if (pilihan == 1) {
                        System.out.println("Menu Rias Wajah");
                        System.out.println("1. Rias Wajah Biasa Rp. 100.000");
                        System.out.println("2. Rias Wajah (Make Up Artis) Rp. 250.000");
                        System.out.print("Pilihan Anda [1,2] : ");
                        int pilihanRias = input.nextInt();

                        if (pilihanRias == 1) {
                            int riasBiasa = 100000;

                            System.out.print("Berapa Orang : ");
                            int jmlOrang = input.nextInt();
                            System.out.println();

                            total = riasBiasa * jmlOrang;

                            System.out.println("=====================================");
                            System.out.println("Nama pemesan  "+ nama);
                            System.out.println("No telp       "+ no_telp);
                            System.out.println("Facial biasa  "+ jmlOrang +" orang");
                            System.out.println("Harga sebesar Rp. "+ total);
                        } 
                        else if (pilihanRias == 2) {
                            int riasArtis = 250000;

                            System.out.print("Berapa Orang : ");
                            int jmlOrang = input.nextInt();
                            System.out.println();

                            total = riasArtis * jmlOrang;

                            System.out.println("=====================================");
                            System.out.println("Nama pemesan  "+ nama);
                            System.out.println("No telp       "+ no_telp);
                            System.out.println("Facial biasa  "+ jmlOrang +" orang");
                            System.out.println("Harga sebesar Rp. "+ total);
                        }
                        else {
                            System.out.println("Pilihan tidak tersedia");
                        }
                    } 
                    else if (pilihan == 2) {
                        System.out.println("Menu Baju Pengantin");
                        System.out.println("1. Baju Pengantin Adat Rp. 150.000");
                        System.out.println("2. Baju Pengantin International Rp. 350.000");
                        System.out.print("Pilihan Anda [1,2] : ");
                        int pilihanBaju = input.nextInt();

                        if (pilihanBaju == 1) {
                            int bajuAdat = 150000;

                            System.out.print("Berapa Orang : ");
                            int jmlOrang = input.nextInt();
                            System.out.println();

                            total = bajuAdat * jmlOrang;

                            System.out.println("=====================================");
                            System.out.println("Nama pemesan  "+ nama);
                            System.out.println("No telp       "+ no_telp);
                            System.out.println("Facial biasa  "+ jmlOrang +" orang");
                            System.out.println("Harga sebesar Rp. "+ total);
                        } 
                        else if (pilihanBaju == 2) {
                            int bajuIntern = 350000;

                            System.out.print("Berapa Orang : ");
                            int jmlOrang = input.nextInt();
                            System.out.println();

                            total = bajuIntern * jmlOrang;

                            System.out.println("=====================================");
                            System.out.println("Nama pemesan  "+ nama);
                            System.out.println("No telp       "+ no_telp);
                            System.out.println("Facial biasa  "+ jmlOrang +" orang");
                            System.out.println("Harga sebesar Rp. "+ total);
                        }
                        else {
                            System.out.println("Pilihan tidak tersedia");
                        }
                    } 
                    else if (pilihan == 3) {
                        System.out.println("Menu Aksesoris");
                        System.out.println("1. Aksesoris Anak Rp. 20.000");
                        System.out.println("2. Aksesoris Dewasa Rp. 50.000");
                        System.out.print("Pilihan Anda [1,2] : ");
                        int pilihanAkses = input.nextInt();

                        if (pilihanAkses == 1) {
                            int aksesAnak = 20000;

                            System.out.print("Berapa Orang : ");
                            int jmlOrang = input.nextInt();
                            System.out.println();

                            total = aksesAnak * jmlOrang;

                            System.out.println("=====================================");
                            System.out.println("Nama pemesan  "+ nama);
                            System.out.println("No telp       "+ no_telp);
                            System.out.println("Facial biasa  "+ jmlOrang +" orang");
                            System.out.println("Harga sebesar Rp. "+ total);
                        } 
                        else if (pilihanAkses == 2) {
                            int aksesDewasa = 50000;

                            System.out.print("Berapa Orang : ");
                            int jmlOrang = input.nextInt();
                            System.out.println();

                            total = aksesDewasa * jmlOrang;

                            System.out.println("=====================================");
                            System.out.println("Nama pemesan  "+ nama);
                            System.out.println("No telp       "+ no_telp);
                            System.out.println("Facial biasa  "+ jmlOrang +" orang");
                            System.out.println("Harga sebesar Rp. "+ total);
                        }
                        else {
                            System.out.println("Pilihan tidak tersedia");
                        }
                    }
                    else {
                        System.out.println("Pilihan tidak tersedia");
                    }
                }
                else {
                    System.out.println("Pilihan tidak tersedia");
                }
                
                System.out.println();
                System.out.print("Input kembali? [y/t] : ");
                
                ulang = input.next().charAt(0);
                System.out.println();
            }
            
            while (ulang != 't');
            System.out.println("Terima kasih "+ nama +" sudah datang di salon cantika");
            System.out.println("membuat anda cantik adalah keahlian kami");
        } 
        else if(transaksi.equals("t")) {
            System.out.println("Terima kasih sudah datang");
        }
    }
}