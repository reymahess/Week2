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

        System.out.println("=== RINCIAN PAJAK ELEKTRONIK ===");

        double pajakLaptop = laptop.hitungpajak(1);
        double totalLaptop = hp.hitungHargaSetelahPajak(1);
        System.out.println("Laptop x1 (PPN Standard 11%): Rp" + pajakLaptop);
        System.out.println("HSubtotal : RP" + laptop.HitungTotalHarga(1));
        System.out.println("Pajak : RP" + pajakLaptop);
        System.out.println("Total : RP" + totalLaptop);

        double pajakHpCustom = hp.hitungpajak(1);;
        System.out.println("Laptop x1 (PPN Standard 11%): Rp" + pajakLaptop);
        System.out.println("Subtotal : RP" + hp.HitungTotalHarga(1));
        System.out.println("Pajak : RP" + pajakHpCustom);
        System.out.println("Total : RP" + hp.hitungTotalHarga(2) + pajakHpCustom);

        System.out.println("=== RINCIAN DISKON MAKANAN ===");

        System.out.println("Indomie x10(Diskon otomatis)");
        System.out.println("Subtotal : RP" + indomie.HitungTotalHarga(10));
        System.out.println("Diskon : RP" + indomie.hitungDiskon(10));
        System.out.println("Total : RP" + indomie.hitungHargaSetelahDiskon(10));

        System.out.println("Roti x5 (Diskon Custom 15%)");
        System.out.println("Subtotal : RP" + roti.HitungTotalHarga(5));
        System.out.println("Diskon : RP" + roti.hitungDiskon(5));
        System.out.println("Total : RP" + roti.hitungHargaSetelahDiskon(5));

        System.out.println("\n=== TRANSAKSI ===");
        laptop.beli(1);
        hp.beli(2);
        indomie.beli(10);
        roti.beli(5); 
    }
}
