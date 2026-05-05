public class makanan extends Produk {
    private int expired; // Menambahkan atribut expired untuk kelas makanan
    public makanan(String nama, double harga, int stok, String kategori, int expired) { // Konstruktor untuk kelas makanan
        super(nama, harga, stok, kategori);
        this.expired = expired;
    }

    @Override
    public void tampilInfo() { // Override method
        System.out.println("Makanan");
        super.tampilInfo();
        System.out.println("Expired : " + expired + " hari");
    }

    public void setExpired(int expired) { // Setter untuk atribut expired
        if (expired <= 0) {
            System.out.println("Masa expired tidak boleh nol atau negatif.");
        } else {
            this.expired = expired;
        }
    }
    
    public void setExpired(int expired, String type) { // Setter untuk atribut expired
        if (type.equals("Nasi")) {
            if (expired > 4){
                System.out.println("Masa Expired Tidak Boleh Negatif ");
            } else {
                this.expired = expired;
            }
        } else {
            if (expired < 2) {
                System.out.println("Masa expired tidak boleh nol atau negatif.");
            } else {
                this.expired = expired;
            }
        }
    
    }
}
