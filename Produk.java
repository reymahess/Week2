

abstract public class Produk {
    private String nama; 
    private double harga; 
    private int stok; 

    public Produk(String nama, double harga, int stok, String kategori){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
    }
    

    public void tampilInfo(){
        System.out.println("Produk  : " + nama);
        System.out.println("Kategori: " + kategori);
        System.out.println("Harga   : Rp." + harga);
        System.out.println("Stok    : " + stok);
        System.out.println("------------------");
    }
    public String getNama() {
        return nama;
    }
    public double getHarga() {
        return harga;
    }
    public int getStok() {
        return stok;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public double  hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }
    public void beli (int jumlahBeli) {
        if (jumlahBeli <= 0) {
            System.out.println("Jumlah pembelian harus lebih dari 0.");
            return;
        } 
        if (jumlahBeli > stok) {
            System.out.println("Stok" + nama + "tidak cukup, Tersudia " + stok );
            return;
        }
        stok -= jumlahBeli;
        System.out.println("Beli" + nama + " x" + jumlahBeli + " = Rp" + HitungTotalHarga(jumlahBeli) + " Sisa stok: " + stok);
        
    }

    public static void main(String[] args) {
        
    }

}