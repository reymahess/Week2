//package berbeda, bukan subclass class main

public class Main {

    public static void main(String[] args) {
        elektronik laptop = new elektronik("Laptop Asus", "Asus", 8500000, 10, 2);
        elektronik hp = new elektronik("Handphone Samsung", "Samsung", 3000000, 25, 1);
        makanan indomie = new makanan("Indomie Goreng", 3500, 100, "Makanan Berat", "2024-12-31");
        makanan roti = new makanan("Roti Tawar", 12000, 100, "Makanan Ringan", "2024-11-30");

        System.out.println("--- Informasi Produk ---");
        laptop.tampilInfo();
        hp.tampilInfo();
        indomie.tampilInfo();
        roti.tampilInfo();

        




        MesinCuci.setGaransi(0);
        MesinCuci.tampilData();
    }
}
