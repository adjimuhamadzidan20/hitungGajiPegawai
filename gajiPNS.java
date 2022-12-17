package programjava;
import java.util.Scanner;

public class gajiPNS {
    public static void main(String [] args) {
        Scanner data = new Scanner(System.in);
        
        String namaPegawai;
        int golongan, jamKerja;
        
        System.out.println("=== Perhitungan Gaji PNS ===");
        System.out.println("============================");
        System.out.print("Nama Pegawai : ");
        namaPegawai = data.nextLine();
        System.out.println("Jenis Golongan :");
        System.out.println("1. Golongan 1");
        System.out.println("2. Golongan 2");
        System.out.println("3. Golongan 3");
        System.out.println("4. Golongan 4");
        System.out.print("Pilih Golongan [1, 2, 3, 4] : ");
        golongan = data.nextInt();
        System.out.print("Jam Kerja : ");
        jamKerja = data.nextInt();
        System.out.println();
        
        if (golongan == 1) {
            int gajiPokok = 1486500;
            int tunjangan = 250000;
            int lembPerJam = 10000;
            double pajak = 0.005; // 0.5%
            
            int potonganGaji = (int) (pajak * gajiPokok);
            int totalGaji = (int) (gajiPokok - potonganGaji);
            
            int lemburan = jamKerja * lembPerJam;
            double potonganLembur = pajak * lemburan;
            int totalLembur = (int) (lemburan - potonganLembur);
            
            if (jamKerja <= 150) {
                System.out.println("Golongan 1");
                System.out.println("Nama Pegawai "+ namaPegawai);
                System.out.println("Gaji Pokok  Rp. "+ gajiPokok +" (dikenakan pajak 0.5%)");
                System.out.println("Total Gaji  Rp. "+ totalGaji);
                System.out.println();
                System.out.println("Tunjangan   Rp. "+ tunjangan);
                System.out.println();
                System.out.println("Total keseluruhan Rp. "+ (totalGaji + tunjangan));
                
            } else if (jamKerja > 150) {
                System.out.println("Golongan 1");
                System.out.println("Nama Pegawai "+ namaPegawai);
                System.out.println("Gaji Pokok  Rp. "+ gajiPokok +" (dikenakan pajak 0.5%)");
                System.out.println("Total Gaji  Rp. "+ totalGaji);
                System.out.println();
                System.out.println("Tunjangan   Rp. "+ tunjangan);
                System.out.println("Lemburan    Rp. "+ lemburan +" (dikenakan pajak 0.5%)");
                System.out.println("Total       Rp. "+ totalLembur);
                System.out.println();
                System.out.println("Total keseluruhan Rp. "+ (totalGaji + tunjangan + totalLembur));
            }
        }
        else if (golongan == 2) {
            int gajiPokok = 1926000;
            int tunjangan = 300000;
            int lembPerJam = 10000;
            double pajak = 0.005; // 0.5%
            
            int potonganGaji = (int) (pajak * gajiPokok);
            int totalGaji = (int) (gajiPokok - potonganGaji);
            
            int lemburan = jamKerja * lembPerJam;
            double potonganLembur = pajak * lemburan;
            int totalLembur = (int) (lemburan - potonganLembur);
            
            if (jamKerja <= 150) {
                System.out.println("Golongan 2");
                System.out.println("Nama Pegawai "+ namaPegawai);
                System.out.println("Gaji Pokok  Rp. "+ gajiPokok +" (dikenakan pajak 0.5%)");
                System.out.println("Total Gaji  Rp. "+ totalGaji);
                System.out.println();
                System.out.println("Tunjangan   Rp. "+ tunjangan);
                System.out.println();
                System.out.println("Total keseluruhan Rp. "+ (totalGaji + tunjangan));
                
            } else if (jamKerja > 150) {
                System.out.println("Golongan 2");
                System.out.println("Nama Pegawai "+ namaPegawai);
                System.out.println("Gaji Pokok  Rp. "+ gajiPokok +" (dikenakan pajak 0.5%)");
                System.out.println("Total Gaji  Rp. "+ totalGaji);
                System.out.println();
                System.out.println("Tunjangan   Rp. "+ tunjangan);
                System.out.println("Lemburan    Rp. "+ lemburan +" (dikenakan pajak 0.5%)");
                System.out.println("Total       Rp. "+ totalLembur);
                System.out.println();
                System.out.println("Total keseluruhan Rp. "+ (totalGaji + tunjangan + totalLembur));
            }
        }
        else if (golongan == 3) {
            int gajiPokok = 2456700;
            int tunjangan = 350000;
            int lembPerJam = 10000;
            double pajak = 0.005; // 0.5%
            
            int potonganGaji = (int) (pajak * gajiPokok);
            int totalGaji = (int) (gajiPokok - potonganGaji);
            
            int lemburan = jamKerja * lembPerJam;
            double potonganLembur = pajak * lemburan;
            int totalLembur = (int) (lemburan - potonganLembur);
            
            if (jamKerja <= 150) {
                System.out.println("Golongan 3");
                System.out.println("Nama Pegawai "+ namaPegawai);
                System.out.println("Gaji Pokok  Rp. "+ gajiPokok +" (dikenakan pajak 0.5%)");
                System.out.println("Total Gaji  Rp. "+ totalGaji);
                System.out.println();
                System.out.println("Tunjangan   Rp. "+ tunjangan);
                System.out.println();
                System.out.println("Total keseluruhan Rp. "+ (totalGaji + tunjangan));
                
            } else if (jamKerja > 150) {
                System.out.println("Golongan 3");
                System.out.println("Nama Pegawai "+ namaPegawai);
                System.out.println("Gaji Pokok  Rp. "+ gajiPokok +" (dikenakan pajak 0.5%)");
                System.out.println("Total Gaji  Rp. "+ totalGaji);
                System.out.println();
                System.out.println("Tunjangan   Rp. "+ tunjangan);
                System.out.println("Lemburan    Rp. "+ lemburan +" (dikenakan pajak 0.5%)");
                System.out.println("Total       Rp. "+ totalLembur);
                System.out.println();
                System.out.println("Total keseluruhan Rp. "+ (totalGaji + tunjangan + totalLembur));
            }
        }
        else if (golongan == 4) {
            int gajiPokok = 2899500;
            int tunjangan = 400000;
            int lembPerJam = 10000;
            double pajak = 0.005; // 0.5%
            
            int potonganGaji = (int) (pajak * gajiPokok);
            int totalGaji = (int) (gajiPokok - potonganGaji);
            
            int lemburan = jamKerja * lembPerJam;
            double potonganLembur = pajak * lemburan;
            int totalLembur = (int) (lemburan - potonganLembur);
            
            if (jamKerja <= 150) {
                System.out.println("Golongan 4");
                System.out.println("Nama Pegawai "+ namaPegawai);
                System.out.println("Gaji Pokok  Rp. "+ gajiPokok +" (dikenakan pajak 0.5%)");
                System.out.println("Total Gaji  Rp. "+ totalGaji);
                System.out.println();
                System.out.println("Tunjangan   Rp. "+ tunjangan);
                System.out.println();
                System.out.println("Total keseluruhan Rp. "+ (totalGaji + tunjangan));
                
            } else if (jamKerja > 150) {
                System.out.println("Golongan 4");
                System.out.println("Nama Pegawai "+ namaPegawai);
                System.out.println("Gaji Pokok  Rp. "+ gajiPokok +" (dikenakan pajak 0.5%)");
                System.out.println("Total Gaji  Rp. "+ totalGaji);
                System.out.println();
                System.out.println("Tunjangan   Rp. "+ tunjangan);
                System.out.println("Lemburan    Rp. "+ lemburan +" (dikenakan pajak 0.5%)");
                System.out.println("Total       Rp. "+ totalLembur);
                System.out.println();
                System.out.println("Total keseluruhan Rp. "+ (totalGaji + tunjangan + totalLembur));
            }
        }
    }
}
