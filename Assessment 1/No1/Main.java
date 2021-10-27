package Assessment1.No1;

public class Main {
    public static void main(String[] args) {
        //untuk data Asuransi dan Dropship
        Marketplace barangPertama = new Marketplace ( 1, "N0001", "JNE", 21000, "Dropship1", "Surabaya", "Bejo", "DayeuhKolot", true, true, 40000);

        //untuk data Asuransi
        Marketplace barangKedua = new Marketplace (2, "N0003", "J&T", 21000, "Eiger", "Bandung Kopo", "Tini", "DayeuhKolot", true, 40000);

        //untuk data Normal
        Marketplace barangKetiga = new Marketplace (3, "N0004", "Pos Indonesia", 23000, "Eiger", "Bandung Kopo", "Bambang","DayeuhKolot");

        //untuk data Dropship
        Marketplace barangKeempat = new Marketplace (4, "N0002", "siCepat", 24000, "Dropship2", "Pontianak", "Joko","DayeuhKolot", true);
    }
}
