package src;

public class TransportasiAir {
    protected int jumlahKursi, biaya; // attribute

    //constructer
    public TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    // method void informasi
    public void Informasi(){
        System.out.println("Transportasi air jenis tidak diketahui dengan kursi berjumlah 4 ditetapkan dengan biaya sebesar Rp. 20000");
    }

    // method void berlayar
    public void Berlayar(){
        System.out.println("Transportasi air dengan jenis tidak diketahui sedang berlayar");
    }

    // method void berlabuh
    public void Berlabuh(){
        System.out.println("Transportasi air dengan jenis tidak diketahui berlabuh di pantai");
    }
}
