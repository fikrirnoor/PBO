package com.pboyhn;

public class Kontrak extends Karyawan {
    private int waktu;

    public Kontrak ( String nama, int waktu, double gaDas ) {
        super(nama, gaDas);
        this.waktu = waktu;
    }
    public void display () {
        super.display();
        System.out.println("Waktu : " + waktu);
    }
}

