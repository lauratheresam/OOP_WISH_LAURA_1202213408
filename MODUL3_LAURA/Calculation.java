public class Mahasiswatelu implements Runnable {
    private String name;
    private long delay;
    private String alamat;
    private int counter;
    private int semester;

    public MahasiswaTelu(String n, int s, String a, long d){
        name = n;
        semester = s;
        delay = d;
        alamat = a;
        counter = 0;
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Nama saya adalah "+ name);
                System.out.println("Alamat saya di "+ alamat);
                System.out.println("Saya ada di semster "+ semester);
                Thread.sleep(delay);
                System.out.println("");
                counter++;
                if (counter ==2){
                    break;
                }
            } catch (InterruptedException e) {
                System.out.println("Something wrong \n desc:"+ e");
            }
        }
    }
    public static void main(String[] args){
        MahasiswaTelu mhs1 = new MahasiswaTelu("Laura", 3, "Bandung", 2000);
        MahasiswaTelu mhs2 = new MahasiswaTelu("Elvi", 6, "Bandung", 2000);
        Thread th1 = new Thread(mhs1);
        Thread th2 = new Thread(mhs2);
        try {
            th1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        th2.start();
    }
}
