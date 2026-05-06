public class elektronik extends Produk {
    private String merek;
    private int garansiTahun;
    private static final double PPN = 0.11;

    public elektronik(String nama, double harga, int stok, String kategori, int garansi) { // Konstruktor untuk kelas makanan
        super(nama, harga, stok, kategori);
        this.garansi = garansi;
    }
    @Override
    public void tampilInfo() { // Override method
        System.out.println("Elektronik");
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


