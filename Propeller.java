
package tiketpesawat;

public class Propeller extends Pesawat{
    private String kelas;
    public Propeller(String kode, String nama, Produsen pembuat) {
        super(kode, nama, pembuat);
        this.kelas = kelas;
    }

    public String getKelas() {
        return kelas;
    }
    
}
