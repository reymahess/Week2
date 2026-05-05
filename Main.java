//package berbeda, bukan subclass class main

public class Main {

    public static void main(String[] args) {
        elektronik MesinCuci = new elektronik("Samsung", 2000000.0, 20, "Alat Rumah", 5);
        MesinCuci.setGaransi(0);
        MesinCuci.tampilData();
    }
}
