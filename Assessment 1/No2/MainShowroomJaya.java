package Assessment1.No2;

import java.util.*;
import java.io.*;

public class MainShowroomJaya {

    private static final ArrayList<Mobil> Mobil = new ArrayList<>();
    private static final Scanner greekz = new Scanner(System.in);
    private static final BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int pilihanUser;
        do {
            System.out.println("1. Tambah Mobil");
            System.out.println("2. Beli Mobil");
            System.out.println("3. Stok Mobil");

            System.out.print("Masukkan pilihan: ");
            pilihanUser = greekz.nextInt();
            switch(pilihanUser) {
                case 1:
                    tambahMobil();
                    break;
                case 2:
                    beliMobil();
                    break;
                case 3:
                    viewStok();
                    break;
            }
        }while(pilihanUser != 3);
    }
    //untuk pilihan tambah mobil
    private static void tambahMobil() throws IOException {
        System.out.println("\nMobil Baru");
        System.out.print("Merk : ");
        String merk = buff.readLine();
        System.out.print("Harga : ");
        double harga = greekz.nextDouble();
        System.out.print("Tahun keluaran : ");
        String tahunKeluaran = buff.readLine();
        System.out.print("Stok : ");
        int stok = greekz.nextInt();
        if (dataMobil(merk, tahunKeluaran) != null) {
            System.out.println("Mobil tersedia\n");
        }else {
            Mobil x = new Mobil (merk, tahunKeluaran, harga, stok);
            Mobil.add (x);
            System.out.println("Data yang anda masukan telah tersimpan\n");
        }
    }

    private static Mobil dataMobil(String merk, String tahunKeluaran) {
        Mobil xStok = null;
        for (Mobil x : Mobil) {
            if (merk.equals(x.getMerk()) && tahunKeluaran.equals(x.getTahunKeluaran())) {
                xStok = x;
            }
        }
        return xStok;
    }
    //untuk pilihan beli mobil
    private static void beliMobil() throws IOException {
        System.out.println("\nShowroom Mobil Jaya - Penjualan");
        System.out.println("INPUT");
        System.out.print("Merk : ");
        String merk = buff.readLine();
        System.out.print("Tahun keluaran : ");
        String tahunKeluaran = buff.readLine();
        System.out.print("Jumlah : " );

        int jumlah = greekz.nextInt();
        System.out.println("");
        Mobil x = dataMobil(merk, tahunKeluaran);
        if (x != null){
            //jika pembelian 1 buah
            if (jumlah == 1) {
                double diskon = 0;
                double totalHarga = x.getHarga() * jumlah;
                double totalDiskon = totalHarga * diskon;
                double totalBayar = totalHarga - totalDiskon;
                System.out.println("OUTPUT");
                System.out.println("Merk           : " + x.getMerk());
                System.out.println("Harga Satuan   : " + String.format("%.1f", x.getHarga()));
                System.out.println("Tahun Keluaran : " + x.getTahunKeluaran());
                System.out.println("Jumlah beli    : " + jumlah);
                System.out.println("Total Harga    : " + String.format("%.1f", totalHarga));
                System.out.println("Diskon         : " + diskon + " persen" );
                System.out.println("Total Diskon   : " + String.format("%.1f", totalDiskon));
                System.out.println("Total Bayar    : " + String.format("%.1f", totalBayar) + "\n");
                int sisaStok = x.getStok()-jumlah;
                x.setStok(sisaStok);

            //jika pembelian 2 buah
            } if (jumlah == 2){
                double diskon = 10;
                double totalHarga = x.getHarga()*jumlah;
                double totalDiskon = totalHarga* 0.1;
                double totalBayar = totalHarga - totalDiskon;
                System.out.println("OUTPUT");
                System.out.println("Merk           : " + x.getMerk());
                System.out.println("Harga Satuan   : " + String.format("%.1f", x.getHarga()));
                System.out.println("Tahun Keluaran : " + x.getTahunKeluaran());
                System.out.println("Jumlah beli    : " + jumlah);
                System.out.println("Total Harga    : " + String.format("%.1f", totalHarga));
                System.out.println("Diskon         : " + diskon + " persen" );
                System.out.println("Total Diskon   : " + String.format("%.1f", totalDiskon));
                System.out.println("Total Bayar    : " + String.format("%.1f", totalBayar) + "\n");
                int sisaStok = x.getStok()-jumlah;
                x.setStok(sisaStok);

            //jika pembelian lebih dari 2 buah
            } if (jumlah >= 3 && jumlah <= x.getStok()){
                double diskon = 20;
                double totalHarga = x.getHarga()*jumlah;
                double totalDiskon = totalHarga * 0.2;
                double totalBayar = totalHarga - totalDiskon;
                System.out.println("OUTPUT");
                System.out.println("Merk           : " + x.getMerk());
                System.out.println("Harga Satuan   : " + String.format("%.1f", x.getHarga()));
                System.out.println("Tahun Keluaran : " + x.getTahunKeluaran());
                System.out.println("Jumlah beli    : " + jumlah);
                System.out.println("Total Harga    : " + String.format("%.1f", totalHarga));
                System.out.println("Diskon         : " + diskon + " persen" );
                System.out.println("Total Diskon   : " + String.format("%.1f", totalDiskon));
                System.out.println("Total Bayar    : " + String.format("%.1f", totalBayar) + "\n");
                int sisaStok = x.getStok()-jumlah;
                x.setStok(sisaStok);

            //jika jumlah stok kurang
            }if (x.getStok() < jumlah){
                System.out.println("OUTPUT");
                System.out.println("Maaf, Jumlah Stok Tidak Mencukupi\n");
            }

        }else{
            System.out.println("Mobil Tidak Tersedia");
        }


    }
    //untuk melihat stok mobil yang tersisa
    private static void viewStok(){
        System.out.println("\nInformasi Mobil");
        for (Mobil x: Mobil) {
            x.displayInfo();
            System.out.println("");
        }
    }
}
