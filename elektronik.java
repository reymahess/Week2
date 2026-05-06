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
    
    public double hitungDiskon(int jumlahBeli){
        return HitungTotalHarga(jumlahBeli) * PPN;
    }

    public double hitungDiskon(int jumlahBeli, double persenPajak) {
        return HitungTotalHarga(jumlahBeli) * (persenPajak / 100);
        }
    }

    public double hitungHargaSetelahDiskon(int jumlahBeli) {
        return HitungTotalHarga(jumlahBeli) - hitungPajak(jumlahBeli);
        

    @Override
    public double hitungpajak(double harga) {
        return harga * 0.20;

    
    }
}


