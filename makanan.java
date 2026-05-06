class makanan extends Produk {
    private String kadaluwarsa;
    private String kategori;

    public makanan(String nama, double harga, int stok, String kategori, String kadaluwarsa) { 
        super(nama, harga, stok);
        this.kadaluwarsa = kadaluwarsa;
        this.kategori = kategori;
    }

    public String getKadaluwarsa() {
        return kadaluwarsa;
    }
    public String getKategori() {
        return kategori;
    }

    @Override
    public void tampilInfo() { // Override method
        System.out.println("Makanan");
       
        System.out.println("Kadaluwarsa : " + kadaluwarsa);
        System.out.println("Kategori : " + kategori);
        System.out.println("------------------------------");
    }
    
    public double hitungDiskon(int jumlahBeli){
        if ((jumlahBeli >= 10)) {
            return HitungTotalHarga(jumlahBeli) * 0.05; 
        return 0; 
        }

    public double hitungDiskon(int jumlahBeli, double persenDiskon) {
        return HitungTotalHarga(jumlahBeli) * (persenDiskon / 100);
        }
    }

    public double hitungHargaSetelahDiskon(int jumlahBeli) {
        return HitungTotalHarga(jumlahBeli) - hitungDiskon(jumlahBeli);
        

    }

    @Override
    public double hitungpajak(double harga) {
        return harga * 0.10; 
    }

}
