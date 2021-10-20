package Topik4;

public class Main {

    public static void main(String[] args) {

        Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", 300.000);
        Buku buku2 = new Buku("UML", "Ivar Jacobson", 400.000);

        //Data buku 1
        System.out.println("Data Buku 1 ");
        System.out.println("Judul Buku : " + buku1.getJudul());
        System.out.println("Pengarang Buku : " + buku1.getPengarang());
        System.out.println("Harga Buku : " + buku1.getHarga());
        System.out.println("");

        //Data buku 2
        System.out.println("Data Buku 2 ");
        System.out.println("Judul Buku : " + buku2.getJudul());
        System.out.println("Pengarang Buku : " + buku2.getPengarang());
        System.out.println("Harga Buku : " + buku2.getHarga());
    }
}
