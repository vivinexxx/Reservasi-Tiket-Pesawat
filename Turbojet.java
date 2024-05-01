
package tiketpesawat;

public class Turbojet extends Pesawat{
    private double bagasi;
    public Turbojet(String kode, String nama, Produsen pembuat) {
        super(kode, nama, pembuat);
        this.bagasi = bagasi;
    }

    public double getBagasi() {
        return bagasi;
    }
}