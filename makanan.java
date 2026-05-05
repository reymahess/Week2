public class makanan extends Produk {
    private int expired; // Menambahkan atribut expired untuk kelas makanan
    public makanan(String nama, double harga, int stok, String kategori, int expired) { // Konstruktor untuk kelas makanan
        super(nama, harga, stok, kategori);
        this.expired = expired;
    }
    public void tampilData() { // Override method
        super.tampilInfo(); // Memanggil method tampilInfo() dari kelas induk
        System.out.println("Expired : " + expired + " hari");
        System.out.println("------------------");
    }
    public void setExpired(int expired) { // Setter untuk atribut expired
        if (expired < 0) {
            System.out.println("Masa expired tidak boleh negatif.");
        } else {
            this.expired = expired;
        }
    
    }
}
