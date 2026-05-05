public class elektronik extends Produk {
    private int garansi; // Menambahkan atribut garansi untuk kelas makanan
    public elektronik(String nama, double harga, int stok, String kategori, int garansi) { // Konstruktor untuk kelas makanan
        super(nama, harga, stok, kategori);
        this.garansi = garansi;
    }
    public void tampilData() { // Override method
        super.tampilInfo(); // Memanggil method tampilInfo() dari kelas induk
        System.out.println("Garansi : " + garansi + " tahun");
        System.out.println("------------------");
    }
    public void setGaransi(int garansi) { // Setter untuk atribut garansi
        if (garansi <= 0) {
            System.out.println("Masa garansi tidak boleh negatif.");
        } else {
            this.garansi = garansi;
        }
    
    }
}


