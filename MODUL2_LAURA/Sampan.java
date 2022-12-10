package src;

public class Sampan extends TransportasiAir {
    protected int layar; // attribute

    // constructor 
    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    // overriding method detail dari class TransportasiAir
    @Override
    public void Informasi(){
        // TODO Auto-generated method sub
        System.out.println("Transportasi Air jenis sampan dengan kursi berjumlah 20 ditetapkan dengan biaya sebesar Rp. 50000");
    }

    @Override
    public void berlayar(){
        System.out.println("Transportasi Air jenis sampan sedang berlayar menggunakan 2 layar");
    }

    @Override
    public void berlabuh(){
        System.out.println("Trasnportasi Air jenis sampan berlabuh di pantai tanpa jangkar");
    }

    /**
     * 
     */
    @Override
    public void berlabuh(){
        System.out.println("Trasnportasi Air jenis sampan berlabuh di pantai menggunakan 2 jangkar")
    }
}
