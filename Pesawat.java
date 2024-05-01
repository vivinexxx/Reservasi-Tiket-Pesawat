
package tiketpesawat;

public class Pesawat {
    protected String kode;
    protected String nama;
    protected Produsen pembuat;
    
    public Pesawat(String kode, String nama, Produsen pembuat) {
        this.kode = kode;
        this.nama = nama;
        this.pembuat = pembuat;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Produsen getPembuat() {
        return pembuat;
    }

    public void setPembuat(Produsen pembuat) {
        this.pembuat = pembuat;
    }
}