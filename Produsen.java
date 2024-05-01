
package tiketpesawat;

public class Produsen {
    private String alamat, nama;
    private int kode;

    public Produsen(String alamat, String nama, int kode) {
        this.alamat = alamat;
        this.nama = nama;
        this.kode = kode;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }
}
