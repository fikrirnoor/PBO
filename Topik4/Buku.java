package Topik4;

public class Buku {

    private String judul;
    private String pengarang;
    private Double harga;

    //membuat konstruktor 3 parameter
    public Buku(String judul, String pengarang, Double harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    //membuat method
    public void setJudul(String judul){
        this.judul = judul;
    }
    public String getJudul(){
        return judul;
    }

    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
    public String getPengarang(){
        return pengarang;
    }

    public void setHarga(Double harga){
        this.harga = harga;
    }
    public Double getHarga(){
        return harga;
    }
}
