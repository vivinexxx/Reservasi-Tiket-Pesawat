
package tiketpesawat;

public class Customer {
    private String nama, alamat;
    private int id;
    private long telepon;

    public Customer(String nama, String alamat, int id, long telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.id = id;
        this.telepon = telepon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public long getTelepon(){
        return telepon;
    }
    public void setTelepon(long telepon){
        this.telepon = telepon;
    }
}
