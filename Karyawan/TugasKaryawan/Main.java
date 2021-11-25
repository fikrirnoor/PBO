package com.pboyhn;

public
class Main {

        public static void main(String[] args) {

            //contoh objek karyawan tetap
            Karyawan karyawan1 = new Tetap("Daniel", 40, 75);
            Karyawan karyawan2 = new Tetap("Bintang", 45, 79);
            //contoh ojek karyawan kontrak
            Karyawan karyawan3 = new Kontrak("Nita", 35, 80);
            //contoh objek departemen
            Departemen departemen = new Departemen("Joyer");

            //menghubungankan karyawan dengan kelas departemen
            departemen.addKaryawan(karyawan1);
            departemen.addKaryawan(karyawan2);
            departemen.addKaryawan(karyawan3);

            //cetak data karyawan
            System.out.println("\n Data Semua Kayawan \uD83D\uDC47\n");
            departemen.displayAll();

            System.out.println("\n Data Karyawan Tetap \uD83D\uDC47\n");
            departemen.displayTetap();

            System.out.println("\n Data Karyawan Kontrak \uD83D\uDC47\n");
            departemen.displayKontrak();
        }
    }

