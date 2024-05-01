
package tiketpesawat;

public class Jadwalpenerbangan {
    private String asal, tujuan;
    private Maskapai operator;
    private String tanggal;
    private String harga, waktutempuh;
    private Pesawat kendaraan;

    public Jadwalpenerbangan(String asal, String tujuan, Maskapai operator, String tanggal, String harga, String waktutempuh, Pesawat kendaraan) {
        this.asal = asal;
        this.tujuan = tujuan;
        this.operator = operator;
        this.tanggal = tanggal;
        this.harga = harga;
        this.waktutempuh = waktutempuh;
        this.kendaraan = kendaraan;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public Maskapai getOperator() {
        return operator;
    }

    public void setOperator(Maskapai operator) {
        this.operator = operator;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getWaktutempuh() {
        return waktutempuh;
    }

    public void setWaktutempuh(String waktutempuh) {
        this.waktutempuh = waktutempuh;
    }

    public Pesawat getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Pesawat kendaraan) {
        this.kendaraan = kendaraan;
    }

    }

