package Assessment1.No1;

public class Marketplace {

    private String NamaPenjual;
    private String AlamatPenjual;
    private String NamaPembeli;
    private String AlamatPembeli;
    private String NamaEkspedisi;
    private String NomorResi;
    private int NomorTransaksi;
    private boolean DataAsuransi;
    private boolean DataDropshipper;
    private double OngkosKirim;
    private double BesarAsuransi;

    //data Asuransi dan Dropship

    Marketplace (int NomorTransaksi, String NomorResi, String NamaEkspedisi, double OngkosKirim, String NamaPenjual, String AlamatPenjual, String NamaPembeli, String AlamatPembeli, boolean DataDropshipper, boolean DataAsuransi, int BesarAsuransi) {
        this.NomorTransaksi = NomorTransaksi;
        this.NomorResi = NomorResi;
        this.NamaEkspedisi = NamaEkspedisi;
        this.OngkosKirim = OngkosKirim;
        this.NamaPenjual = NamaPenjual;
        this.AlamatPenjual = AlamatPenjual;
        this.NamaPembeli = NamaPembeli;
        this.AlamatPembeli = AlamatPembeli;
        this.DataDropshipper = DataDropshipper;
        this.DataAsuransi = DataAsuransi;
        this.BesarAsuransi = BesarAsuransi;
        print (this.DataAsuransi, this.DataDropshipper);
    }

    //data Asuransi

    Marketplace(int NomorTransaksi, String NomorResi, String NamaEkspedisi, double OngkosKirim, String NamaPenjual, String AlamatPenjual, String NamaPembeli, String AlamatPembeli, boolean DataAsuransi, int BesarAsuransi) {
        this.NomorTransaksi = NomorTransaksi;
        this.NomorResi = NomorResi;
        this.NamaEkspedisi = NamaEkspedisi;

        if(OngkosKirim>20000){
            OngkosKirim = OngkosKirim - 5000;
        }
        this.OngkosKirim = OngkosKirim;
        this.NamaPenjual = NamaPenjual;
        this.AlamatPenjual = AlamatPenjual;
        this.NamaPembeli = NamaPembeli;
        this.AlamatPembeli = AlamatPembeli;
        this.DataAsuransi = DataAsuransi;
        this.BesarAsuransi = BesarAsuransi;
        print (this.DataAsuransi, this.DataDropshipper);
    }

    //data Normal

    Marketplace (int NomorTransaksi, String NomorResi, String NamaEkspedisi, double OngkosKirim, String NamaPenjual, String AlamatPenjual, String NamaPembeli, String AlamatPembeli) {
        this.NomorTransaksi = NomorTransaksi;
        this.NomorResi = NomorResi;
        this.NamaEkspedisi = NamaEkspedisi;
        this.OngkosKirim = OngkosKirim;
        this.NamaPenjual = NamaPenjual;
        this.AlamatPenjual = AlamatPenjual;
        this.NamaPembeli = NamaPembeli;
        this.AlamatPembeli = AlamatPembeli;
        print (this.DataAsuransi, this.DataDropshipper);
    }

    //data Dropship

    Marketplace (int NomorTransaksi, String NomorResi, String NamaEkspedisi, double OngkosKirim, String NamaPenjual, String AlamatPenjual, String NamaPembeli, String AlamatPembeli, boolean DataDropshipper){
        this.NomorTransaksi = NomorTransaksi;
        this.NomorResi = NomorResi;
        this.NamaEkspedisi = NamaEkspedisi;
        this.OngkosKirim = OngkosKirim;
        this.NamaPenjual = NamaPenjual;
        this.AlamatPenjual = AlamatPenjual;
        this.NamaPembeli = NamaPembeli;
        this.AlamatPembeli = AlamatPembeli;
        this.DataDropshipper = DataDropshipper;
        print(this.DataAsuransi, this.DataDropshipper);
    }

    public void print (boolean DataAsuransi, boolean DataDropshipper){
        if (DataAsuransi==true && DataDropshipper==true){
            System.out.println("\nAsuransi dan Dropship" + "\nNo Transaksi : " + this.NomorTransaksi + "\nNo Resi : " + this.NomorResi + "\nNama Ekspedisi : " + this.NamaEkspedisi + "\nOngkos Kirim : " + this.OngkosKirim + "\nNama Pengirim : " + this.NamaPenjual + "\nAlamat Pengirim : " + this.AlamatPenjual + "\nNama Penerima : " + this.NamaPembeli + "\nAlamat Penerima : " + this.AlamatPembeli + "\nNominal Asuransi : " + this.BesarAsuransi);
        }else if (DataAsuransi==true){
            System.out.println("\nAsuransi" + "\nNo Transaksi : " + this.NomorTransaksi + "\nNo Resi : " + this.NomorResi + "\nNama Ekspedisi : " + this.NamaEkspedisi + "\nOngkos Kirim : " + this.OngkosKirim + "\nNama Pengirim : " + this.NamaPenjual + "\nAlamat Pengirim : " + this.AlamatPenjual + "\nNama Penerima : " + this.NamaPembeli + "\nAlamat Penerima : " + this.AlamatPembeli + "\nNominal Asuransi : " + this.BesarAsuransi);
        }else if (DataDropshipper==true){
            System.out.println("\nDropship" + "\nNo Transaksi : " + this.NomorTransaksi + "\nNo Resi : " + this.NomorResi + "\nNama Ekspedisi : " + this.NamaEkspedisi + "\nOngkos Kirim : " + this.OngkosKirim + "\nNama Pengirim : " + this.NamaPenjual + "\nAlamat Pengirim : " + this.AlamatPenjual + "\nNama Penerima : " + this.NamaPembeli + "\nAlamat Penerima : " + this.AlamatPembeli);
        }else {
            System.out.println("\nNormal" + "\nNo Transaksi : " + this.NomorTransaksi + "\nNo Resi : " + this.NomorResi + "\nNama Ekspedisi : " + this.NamaEkspedisi + "\nOngkos Kirim : " + this.OngkosKirim+"\nNama Pengirim : " + this.NamaPenjual + "\nAlamat Pengirim : "+this.AlamatPenjual + "\nNama Penerima : " + this.NamaPembeli + "\nAlamat Penerima : " + this.AlamatPembeli);
        }
    }
}
