
package tiketpesawat;

public class Tiket {
    private Customer id, pembeli;
    private Jadwalpenerbangan beli;

    public Tiket(Customer id, Customer pembeli, Jadwalpenerbangan beli) {
        this.id = id;
        this.pembeli = pembeli;
        this.beli = beli;
    }

    public Customer getId() {
        return id;
    }

    public void setId(Customer id) {
        this.id = id;
    }

    public Customer getPembeli() {
        return pembeli;
    }

    public void setPembeli(Customer pembeli) {
        this.pembeli = pembeli;
    }

    public Jadwalpenerbangan getBeli() {
        return beli;
    }

    public void setBeli(Jadwalpenerbangan beli) {
        this.beli = beli;
    }
}
