//package berbeda, bukan subclass class main

public class Main {

    public static void main(String[] args) {
        Produk p = new Produk("Indomie Goreng", 3500, 100, "Makanan");
        

        System.out.println(p.getNama());
        System.out.println(p.getHarga());
        //System.out.println(p.harga);
        //System.out.println(p.kategori);
        //System.out.println(p.nama);
        p.setHarga(20000.0);
        System.out.println(p.getHarga());
        p.setStok(50);
        System.out.println(p.getStok());

        p.tampilInfo();
    }
    
}
