
package tiketpesawat;

public class Maskapai {
    private String nama;
    private String kode;

    public Maskapai(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
    }

    Maskapai(String maskapai) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
}
