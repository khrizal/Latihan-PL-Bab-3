package latihan.pl.bab.pkg3;

import java.util.Scanner;

/**
 *
 * @author Khairul Rizal
 */
public class MainPemesan {
    public static void main(String[] args) {
        int pil;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan ID Pemesan : ");
        int ID = in.nextInt();
        System.out.print("Nama : ");
        String Nama = in.next();
        System.out.print("Tanggal Pemesanan : ");
        String tanggal = in.next();
        Pemesan p = new Pemesan(ID, Nama, tanggal);
        p.DisplayMessage();
        System.out.println("Pilih Ukuran (panjang * lebar) : ");
        System.out.print("Panjang : ");
        int panjang = in.nextInt();
        p.setPanjang(panjang);
        System.out.print("Lebar : ");
        int lebar = in.nextInt();
        p.setLebar(lebar);
        System.out.println(p.UkuranBingkai());
        
        System.out.println("Jenis Bingkai / Harga per meter :");
        System.out.println("1.  Hitam Metalik / 3000");
        System.out.println("2.  Coklat Metalik / 2700");
        System.out.println("3.  Coklat Bercorak / 2500");
        System.out.println("4.  Emas / 5000");
        System.out.println("5.  Perak / 4000");
        
        System.out.print("Pilih : ");
        pil = in.nextInt();
            System.out.println("Harga : ");
            System.out.println(p.setJenisbingkai(pil));
            System.out.println("Diskon : ");
            System.out.println(p.setDiskon(pil));
            System.out.println("Total Harga :"+(p.setJenisbingkai(pil)-p.setDiskon(pil)));
    }
}
