public class Ekspedisi {
    // TO DO: Create Protected Attributes of Ekspedisi (jumlahCabang, pusat, tarif)
    protected int jumlahCabang;
    protected String pusat;
    protected double tarif;
    // TO DO: Create Constructor of Ekspedisi
    public Ekspedisi(int jumlahCabang, String pusat, float tarif) {
        this.jumlahCabang = jumlahCabang;
        this.pusat = pusat;
        this.tarif = tarif;
    }
    // TO DO: Create 'informasi' Method to show Information
    public void informasi() {
        System.out.println("Informasi Ekspedisi Tidak Dikenal");
        System.out.println("Pusat Ekspedisi: " + pusat);
        System.out.println("Jumlah Cabang: " + jumlahCabang);
        System.out.println("Jumlah Tarif per Kilogram: " + tarif);
    }
}
