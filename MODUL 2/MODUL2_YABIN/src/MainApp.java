public class MainApp {
    public static void main(String[] args){
        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi ekspedisi = new Ekspedisi(50,"Brebes",5000000);
        ekspedisi.informasi();
        System.out.println(" ");
        // TO DO: Create teluexpress Object from TelUExpress Class
        TelUExpress teluexpress = new TelUExpress(25,"Bojongsoang",200000,true);
        teluexpress.informasi();
        teluexpress.ambil("Bandung");
        teluexpress.antar(270405);
        teluexpress.antar(555444,261000);
        System.out.println(" ");
        // TO DO: Create friexpress Object from FRIExpress Class
        FRIExpress friexpress = new FRIExpress(10,"Dayeuhkolot",100000,false);
        friexpress.informasi();
        friexpress.terima(256);
        friexpress.kirim("Sitanggal");
        friexpress.kirim("Banjaranyar","Padasugih");
    }
}
