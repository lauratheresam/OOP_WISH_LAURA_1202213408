package src;

public class Kapal extends TransportasiAir {
    protected String mesin;

    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }

    @Override
    public void informasi(){
        System.out.println("Transportasi Air jenis Kapal dengan kursi berjumlah 50 ditetapkan dengan biaya sebesar Rp. 100000")
    }

    @Override
    public void berlayar(){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin Diesel dengan kecepatan yang tidak stabil");
    }

    @Override
    public void berlayar(int; kecepatan){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin Diesel dengan kecepatan stabil di kisaran 20 knot");

    @Override
    public void berlabuh(){
        System.out.println("Trasnportasi Air jenis Kapal berlabuh di pantai");
    }
}
