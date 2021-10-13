package Topik3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Untuk menentukan jurusan
        Jurusan jurusan1 = new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        Jurusan jurusan2 = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");

        // Untuk menentukan data mahasiswa D3IF
        Mahasiswa mahasiswa1 = new Mahasiswa("6701", "Rendi");
        Mahasiswa mahasiswa2 = new Mahasiswa("6702", "Chaca");
        Mahasiswa mahasiswa3 = new Mahasiswa("6703", "Agus");

        // Untuk menentukan data mahasiswa D3SI
        Mahasiswa mahasiswa4 = new Mahasiswa("6301", "Ridwan");
        Mahasiswa mahasiswa5 = new Mahasiswa("6302", "Siska");
        Mahasiswa mahasiswa6 = new Mahasiswa("6303", "Zayn");
        Mahasiswa mahasiswa7 = new Mahasiswa("6304", "Rahmat");

        // Mahasiswa di jurusan D3IF
        jurusan1.addMhs(mahasiswa1);
        jurusan1.addMhs(mahasiswa2);
        jurusan1.addMhs(mahasiswa3);

        // Mahasiswa di jurusan D3SI
        jurusan2.addMhs(mahasiswa4);
        jurusan2.addMhs(mahasiswa5);
        jurusan2.addMhs(mahasiswa6);
        jurusan2.addMhs(mahasiswa7);

        System.out.println("Kode: " + jurusan1.getKode());
        System.out.println("Nama: " + jurusan1.getNama());
        System.out.println("Daftar Mahasiswa: ");
        ArrayList<Mahasiswa> daftarMahasiswa1 = jurusan1.getMhs();

        // Karena di awal mahasiswa terdapat angka maka masukan integer
        int x = 1;
        for (Mahasiswa mahasiswa: daftarMahasiswa1)
            System.out.println(x++ +". " + mahasiswa.getNim() + " - " + mahasiswa.getNama());

        System.out.println("\nKode: " + jurusan2.getKode());
        System.out.println("Nama: " + jurusan2.getNama());
        System.out.println("Daftar Mahasiswa: ");
        ArrayList<Mahasiswa> daftarMahasiswa2 = jurusan2.getMhs();

        x = 1;
        for (Mahasiswa mahasiswa: daftarMahasiswa2)
            System.out.println(x++ +". " + mahasiswa.getNim() + " - " + mahasiswa.getNama());
    }
}
