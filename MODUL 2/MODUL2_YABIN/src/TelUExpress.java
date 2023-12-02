public class TelUExpress extends Ekspedisi{
    // TO DO: Create Protected Atribute of TelUExpress(antarInter)
    protected boolean antarInter;
    // TO DO: Create Constructor of TelUExpress
    public TelUExpress(int jumlahCabang, String pusat, float tarif, boolean antarInter) {
        super(jumlahCabang, pusat, tarif);
        this.antarInter = antarInter;
    }
    // TO DO: Create 'informasi' Method to show Information
    @Override
    public void informasi() {
        System.out.println("TelU Express berpusat di " + pusat);
        System.out.println("Memiliki " + jumlahCabang + " cabang");
        System.out.println("Tarif hanya " + tarif + " per kilogram");
        if (antarInter == true){
            System.out.println("Melayani pengiriman internasional");
        } else {
            System.out.println("Tidak melayani pengiriman internasional");
        }
    }
    // TO DO: Create 'ambil' Method to pick up a package
    public void ambil(String tempat){
        System.out.println("Mengambil paket di " + tempat);
    }
    // TO DO: Create 'antar' Method to send a package
    public void antar(int resi){
        System.out.println("Mengantar paket dengan nomor resi " + resi);
    }
    // TO DO: Create 'antar' Method to send two packages
        public void antar(int resi_1, int resi_2){
        System.out.println("Mengantar dua paket dengan nomor resi " + resi_1 + " dan " + resi_2);
    }
}

