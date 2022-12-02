package programjava;
import java.util.Scanner;

public class hitungGaji {
    public static void main(String [] args) {
        
        String namaPegawai;
        int noPegawai, jabatan, jamLembur;
        
        Scanner inputData = new Scanner(System.in);
        
        System.out.println("======== Selamat Datang =========");
        System.out.println("Aplikasi Menghitung Gaji Karyawan");
        System.out.println();
        System.out.print("Nama Pegawai : ");
        namaPegawai = inputData.nextLine();
        
        System.out.print("No Pegawai : ");
        noPegawai = inputData.nextInt();
        
        System.out.println("Jabatan : ");
        System.out.println("[1] Manajer");
        System.out.println("[2] Direktur");
        System.out.println("[3] Programmer");
        System.out.println("[4] Pegawai Marketing");
        System.out.println("[5] Pegawai Administrasi");
        System.out.print("Pilih jabatan (1, 2, 3, 4, 5) : ");
        jabatan = inputData.nextInt();
        
        System.out.print("Jumlah jam lembur : ");
        jamLembur = inputData.nextInt();
        System.out.println();
        
        // manager
        if (jabatan == 1) {
            int gajiPokok = 6000000;
            double persenTunj = 0.2;
            double persenLem = 0.05;
       
            double totalLembur = jamLembur * persenLem;
            int tunjangan = (int) (persenTunj * gajiPokok);
            int lemburan = (int) (totalLembur * gajiPokok);
            
            int totalGaji = tunjangan + lemburan + gajiPokok;
            
            System.out.println("Gaji pokok  Rp. "+ gajiPokok);
            System.out.println("Tunjangan   Rp. "+ tunjangan);
            System.out.println("Uang lembur Rp. "+ lemburan);
            System.out.println("Total gaji  Rp. "+ totalGaji);
        
        // direktur
        } else if (jabatan == 2) {
            int gajiPokok = 10000000;
            double persenTunj = 0.2;
            double persenLem = 0.05;
       
            double totalLembur = jamLembur * persenLem;
            int tunjangan = (int) (persenTunj * gajiPokok);
            int lemburan = (int) (totalLembur * gajiPokok);
            
            int totalGaji = tunjangan + lemburan + gajiPokok;
            
            System.out.println("Gaji pokok  Rp. "+ gajiPokok);
            System.out.println("Tunjangan   Rp. "+ tunjangan);
            System.out.println("Uang lembur Rp. "+ lemburan);
            System.out.println("Total gaji  Rp. "+ totalGaji);
            
        // programmer
        } else if (jabatan == 3) {
            int gajiPokok = 5000000;
            double persenTunj = 0.2;
            double persenLem = 0.05;
       
            double totalLembur = jamLembur * persenLem;
            int tunjangan = (int) (persenTunj * gajiPokok);
            int lemburan = (int) (totalLembur * gajiPokok);
            
            int totalGaji = tunjangan + lemburan + gajiPokok;
            
            System.out.println("Gaji pokok  Rp. "+ gajiPokok);
            System.out.println("Tunjangan   Rp. "+ tunjangan);
            System.out.println("Uang lembur Rp. "+ lemburan);
            System.out.println("Total gaji  Rp. "+ totalGaji);
             
        // pegawai marketing
        } else if (jabatan == 4) {
            int gajiPokok = 3500000;
            double persenTunj = 0.2;
            double persenLem = 0.05;
       
            double totalLembur = jamLembur * persenLem;
            int tunjangan = (int) (persenTunj * gajiPokok);
            int lemburan = (int) (totalLembur * gajiPokok);
            
            int totalGaji = tunjangan + lemburan + gajiPokok;
            
            System.out.println("Gaji pokok  Rp. "+ gajiPokok);
            System.out.println("Tunjangan   Rp. "+ tunjangan);
            System.out.println("Uang lembur Rp. "+ lemburan);
            System.out.println("Total gaji  Rp. "+ totalGaji);
            
        // pegawai administrasi
        } else if (jabatan == 5) {
            int gajiPokok = 2500000;
            double persenTunj = 0.2;
            double persenLem = 0.05;
       
            double totalLembur = jamLembur * persenLem;
            int tunjangan = (int) (persenTunj * gajiPokok);
            int lemburan = (int) (totalLembur * gajiPokok);
            
            int totalGaji = tunjangan + lemburan + gajiPokok;
            
            System.out.println("Gaji pokok  Rp. "+ gajiPokok);
            System.out.println("Tunjangan   Rp. "+ tunjangan);
            System.out.println("Uang lembur Rp. "+ lemburan);
            System.out.println("Total gaji  Rp. "+ totalGaji);
              
        }            
    }
}
