package latihan.pl.bab.pkg3;

/**
 *
 * @author Khairul Rizal
 */
public class Pemesan {
    String Nama, tanggal;
    int ID;
    double panjang, lebar,luas, harga, diskon;
    public Pemesan(int ID){
        this.ID = ID;
    }
    public Pemesan(int ID, String Nama, String tanggal){
        this.ID = ID;
        this.Nama = Nama;
        this.tanggal = tanggal;
    }
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    public void setLebar(double lebar){
        this.lebar = lebar;
    }
    public double getPanjang(){
        return panjang;
    }
    public double getLebar(){
        return lebar;
    }
    public double UkuranBingkai(){
        luas= getLebar() * getPanjang();
        return luas;
    }
    public double setJenisbingkai(int pil){
        if (pil == 1) {
            harga = UkuranBingkai()*3000;
        } else if (pil == 2){
            harga = UkuranBingkai()*2700;
        } else if (pil == 3){
            harga = UkuranBingkai()*2500;
        } else if (pil == 4){
            harga = UkuranBingkai()*5000;
        } else if (pil == 5){
            harga = UkuranBingkai()*4000;
        }
        return harga;
    }
    public double setDiskon(int pil){
        if(pil == 1 || pil == 4 || pil == 5){
            if(harga > 650000){
                diskon = setJenisbingkai(pil)*0.15;
            } else if(harga > 450000){
                diskon = setJenisbingkai(pil)*0.1;
            } else if(harga > 300000){
                diskon = setJenisbingkai(pil)*0.05;
            }
        }
        return diskon;
    }
    
    public void DisplayMessage(){
        System.out.println("ID Pemesanan "+ID 
                         + " Dengan Nama "+Nama
                         + " Yang Memesan Tanggal "+tanggal); 
    }
}