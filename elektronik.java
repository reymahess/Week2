class elektronik extends Produk {
    private String merek;
    private int garansiTahun;
    private static final double PPN = 0.11;

    public elektronik(String nama, String merek, double harga, int stok, int garansiTahun) { // Konstruktor untuk kelas makanan
        super(nama, harga, stok);
        this.merek = merek;
        this.garansiTahun = garansiTahun;
    }
    @Override
    public void tampilInfo() { // Override method
        System.out.println("Elektronik");
        System.out.println("Nama : " + getNama());
        System.out.println("Merek : " + merek);
        System.out.println("Garansi : " + garansiTahun + " tahun");
        System.out.println("------------------");
    }
    public String getMerek() {
        return merek;
    }
    public int getGaransi() {
        return garansiTahun;
    }   
    
    public void setGaransi(int garansi) { // Setter untuk atribut garansi
        if (garansi <= 0) {
            System.out.println("Masa garansi tidak boleh negatif.");
        } else {
            this.garansi = garansi;
        }
    
    }
}


