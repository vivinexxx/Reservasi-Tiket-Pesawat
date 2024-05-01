
package tiketpesawat;
import java.util.Scanner;
public class Mainclass {

    private static boolean MaskapaiDitemukan;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Maskapai[] maskapai = new Maskapai[10]; // Array untuk menyimpan maskapai dengan kapasitas maksimum 100
        maskapai[0] = new Maskapai("Citilink", "CT123");
        maskapai[1] = new Maskapai("Garuda", "GA124");
        Produsen[] produsen = new Produsen[10];
        produsen[0] = new Produsen("US", "Grumman Corp", 120);
        Pesawat[] pesawat = new Pesawat[10];
        pesawat[0] = new Pesawat("123", "Boeing 737", produsen[0]);
        Jadwalpenerbangan[] jadwal = new Jadwalpenerbangan[10];
        jadwal[0] = new Jadwalpenerbangan("Jakarta", "Palangkaraya", maskapai[0], " 16 Juni 2023", "Rp 1500000", "2 Jam", pesawat[0]);
        jadwal[1] = new Jadwalpenerbangan("Jakarta", "Kediri", maskapai[1], " 25 Juni 2023", "Rp 1200000", "1 Jam", pesawat[0]);
        int jumlahMaskapai = 2; // Jumlah maskapai yang saat ini disimpan
        int jumlahjadwal = 2;
        int pilihan;
        do {
            System.out.println("Menu Program:");
            System.out.println("1. Maskapai");
            System.out.println("2. Jadwal");
            System.out.println("3. Tiket");
            System.out.println("4. Exit");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    int pilihMaskapai;
                    do {
                        showMenuMaskapai();
                        System.out.print("Pilih menu: ");
                        pilihMaskapai = input.nextInt();

                        switch (pilihMaskapai) {
                            case 1:
                                System.out.print("Anda ingin menambah berapa maskapai: ");
                                int tambah = input.nextInt();
                                while (jumlahMaskapai < tambah + 2) {
                                    System.out.print("Tambah nama Maskapai ke: ");
                                    String nama = input.next();
                                    System.out.print("Tambah kode maskapai: ");
                                    String kode = input.next();
                                    maskapai[jumlahMaskapai] = new Maskapai(nama, kode);
                                    jumlahMaskapai++; // Menambah jumlah maskapai
                                    System.out.println("Maskapai " + nama + " telah ditambahkan");
                                }
                                break;
                            case 2:
                                System.out.print("Input kode yang ingin Anda hapus: ");
                                String kodeHapus = input.next();
                                boolean maskapaiDitemukan = false;
                                for (int i = 0; i < jumlahMaskapai; i++) {
                                    if (maskapai[i].getKode().equals(kodeHapus)) {
                                        for (int j = i; j < jumlahMaskapai - 1; j++) {
                                            maskapai[j] = maskapai[j + 1];
                                        }
                                        maskapai[jumlahMaskapai - 1] = null;
                                        jumlahMaskapai--;
                                        maskapaiDitemukan = true;
                                        break;
                                    }
                                }
                                if (maskapaiDitemukan) {
                                    System.out.println("Maskapai dengan kode " + kodeHapus + " telah dihapus");
                                } else {
                                    System.out.println("Maskapai dengan kode " + kodeHapus + " tidak ditemukan");
                                }
                                break;
                            case 3:
                                System.out.println("\nMenampilkan Daftar maskapai :");
                                tampilData(maskapai, jumlahMaskapai);
                                break;
                            case 4:
                                System.out.println("1. Nama\n2. Kode\nPilih data maskapai yang ingin diedit:");
                                int edit = input.nextInt();
                                if (edit == 1) {
                                    System.out.print("Masukkan nama maskapai yang ingin diubah: ");
                                    String namaMaskapai = input.next();
                                    boolean MaskapaiDitemukan = false;

                                    for (int i = 0; i < jumlahMaskapai; i++) {
                                        if (maskapai[i].getNama().equals(namaMaskapai)) {
                                            System.out.print("Masukkan nama maskapai baru: ");
                                            String namaBaru = input.next();
                                            maskapai[i].setNama(namaBaru); // Mengubah nama maskapai dalam array
                                            MaskapaiDitemukan = true;
                                            break;
                                        }
                                    }
                                    if (MaskapaiDitemukan) {
                                        System.out.println("Nama maskapai berhasil diubah");
                                    } else {
                                        System.out.println("Maskapai tidak ditemukan");
                                    }
                                } else if (edit == 2) {
                                    System.out.print("Masukkan nama maskapai yang ingin diubah kode: ");
                                    String namaMaskapai = input.next();
                                    for (int i = 0; i < jumlahMaskapai; i++) {
                                        if (maskapai[i].getNama().equals(namaMaskapai)) {
                                            System.out.print("Masukkan kode maskapai baru: ");
                                            String kodeBaru = input.next();
                                            maskapai[i].setKode(kodeBaru); // Mengubah kode maskapai dalam array
                                            boolean MaskapaiDitemukan = true;
                                            break;
                                        }
                                    }

                                    if (MaskapaiDitemukan) {
                                        System.out.println("Kode maskapai berhasil diubah");
                                    } else {
                                        System.out.println("Maskapai tidak ditemukan");
                                    }
                                } else {
                                    System.out.println("Pilihan tidak valid");
                                }
                                break;
                            case 5:
                                System.out.println("Kembali ke Menu Utama");
                                break;
                            default:
                                System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
                                break;
                        }
                    } while (pilihMaskapai != 5);
                    break;
                case 2:
                    int pilihJadwal;
                    do {
                        System.out.println("\nMenu Jadwal Penerbangan: ");
                        System.out.println("1. Info Jadwal");
                        System.out.println("2. Tambah Jadwal");
                        System.out.println("3. Edit Jadwal");
                        System.out.println("4. Hapus Jadwal");
                        System.out.println("5. Kembali ke menu utama");

                        System.out.print("Pilih menu: ");
                        pilihJadwal = input.nextInt();

                        switch (pilihJadwal) {
                            case 1:
                                System.out.println("\nDaftar Jadwal Penerbangan:");
                                for (int i = 0; i < jadwal.length; i++) {
                                    if (jadwal[i] != null) {
                                        System.out.println("Nomor: " + i);
                                        System.out.println("Asal: " + jadwal[i].getAsal());
                                        System.out.println("Tujuan: " + jadwal[i].getTujuan());
                                        System.out.println("Maskapai: " + jadwal[i].getOperator().getNama());
                                        System.out.println("Tanggal: " + jadwal[i].getTanggal());
                                        System.out.println("Harga: " + jadwal[i].getHarga());
                                        System.out.println("Waktu tempuh: " + jadwal[i].getWaktutempuh());
                                        System.out.println("-----------------------------------");
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("\nTambah Jadwal Penerbangan");
                                System.out.print("Anda ingin menambah berapa maskapai: ");
                                int tambah = input.nextInt();
                                while (jumlahjadwal < tambah + 2) {
                                    System.out.print("Asal: ");
                                    String asal = input.next();
                                    System.out.print("Tujuan: ");
                                    String tujuan = input.next();
                                    System.out.print("Maskapai: ");
                                    String operator = input.next();
                                    System.out.print("Tanggal: ");
                                    String tanggal = input.next();
                                    System.out.print("Harga: ");
                                    String harga = input.nextLine();
                                    input.nextLine();
                                    System.out.print("Waktu tempuh: ");
                                    String waktutempuh = input.nextLine();
                                    jadwal[jumlahjadwal] = new Jadwalpenerbangan(asal, tujuan, maskapai[1], tanggal, harga, waktutempuh, pesawat[0]);
                                    jumlahjadwal++; // Menambah jumlah jadwal
                                    System.out.println("Jadwal telah ditambahkan");
                                }
                                break;
                            case 3:
                                System.out.println("\nEdit Jadwal Penerbangan");
                                System.out.print("Nomor Jadwal yang akan diedit: ");
                                int nomorJadwal = input.nextInt();
                                if (nomorJadwal >= 0 && nomorJadwal < jadwal.length && jadwal[nomorJadwal] != null) {
                                    System.out.println("Jadwal saat ini:");
                                    System.out.println("Asal: " + jadwal[nomorJadwal].getAsal());
                                    System.out.println("Tujuan: " + jadwal[nomorJadwal].getTujuan());
                                    System.out.println("Maskapai: " + jadwal[nomorJadwal].getOperator().getNama());
                                    System.out.println("Tanggal: " + jadwal[nomorJadwal].getTanggal());
                                    System.out.println("Harga: " + jadwal[nomorJadwal].getHarga());
                                    System.out.println("Durasi: " + jadwal[nomorJadwal].getWaktutempuh());

                                    // Membaca input baru untuk jadwal yang akan diedit
                                    System.out.print("Asal baru: ");
                                    String newAsal = input.next();
                                    System.out.print("Tujuan baru: ");
                                    String newTujuan = input.next();
                                    System.out.print("Maskapai baru: ");
                                    String newMaskapai = input.next();
                                    System.out.print("Tanggal baru: ");
                                    String newTanggal = input.next();
                                    System.out.print("Harga baru: ");
                                    String newHarga = input.nextLine();
                                    input.nextLine();
                                    System.out.print("Waktu tempuh baru: ");
                                    String newDurasi = input.next();

                                    // Mengupdate jadwal dengan data baru
                                    jadwal[nomorJadwal].setAsal(newAsal);
                                    jadwal[nomorJadwal].setTujuan(newTujuan);
                                    jadwal[nomorJadwal].getOperator().setNama(newMaskapai);
                                    jadwal[nomorJadwal].setTanggal(newTanggal);
                                    jadwal[nomorJadwal].setHarga(newHarga);
                                    jadwal[nomorJadwal].setWaktutempuh(newDurasi);

                                    System.out.println("Jadwal berhasil diupdate.");
                                } else {
                                    System.out.println("Maaf, menu yang anda input tidak valid.");
                                }
                                break;
                            case 4:
                                System.out.println("\nHapus Jadwal Penerbangan");
                                System.out.print("Nomor Jadwal yang akan dihapus: ");
                                int nomorJadwalHapus = input.nextInt();
                                if (nomorJadwalHapus >= 0 && nomorJadwalHapus < jadwal.length && jadwal[nomorJadwalHapus] != null) {
                                    jadwal[nomorJadwalHapus] = null;
                                    System.out.println("Jadwal berhasil dihapus.");
                                } else {
                                    System.out.println("Maaf, nomor jadwal tidak valid.");
                                }
                                break;
                            case 5:
                                System.out.println("Kembali ke menu utama");
                                break;
                            default:
                                System.out.println("Pilihan tidak valid");
                                break;
                        }
                    } while (pilihJadwal != 5);
                    break;
                case 3:
                    int pilihTiket;
                    do {
                        System.out.println("\nMenu Tiket: ");
                        System.out.println("1. Beli");
                        System.out.println("2. Info");
                        System.out.println("3. Refund");
                        System.out.println("4. Kembali ke menu utama");
                        System.out.print("Pilih menu: ");
                        pilihTiket = input.nextInt();
                        switch (pilihTiket) {
                            case 1:
                                System.out.println("");
                                break;
                            case 2:
                                System.out.println("Menu Beli Tiket");
                                System.out.println("Daftar Jadwal Penerbangan yang Tersedia:");
                                for (int i = 0; i < jadwal.length; i++) {
                                    if (jadwal[i] != null) {
                                        System.out.println("Nomor: " + i);
                                        System.out.println("Asal: " + jadwal[i].getAsal());
                                        System.out.println("Tujuan: " + jadwal[i].getTujuan());
                                        System.out.println("Maskapai: " + jadwal[i].getOperator().getNama());
                                        System.out.println("Tanggal: " + jadwal[i].getTanggal());
                                        System.out.println("Harga: " + jadwal[i].getHarga());
                                        System.out.println("Durasi: " + jadwal[i].getWaktutempuh());
                                        System.out.println("-----------------------------------");
                                    }
                                }
                                System.out.print("Masukkan nomor jadwal penerbangan yang ingin dibeli: ");
                                int nomorJadwal = input.nextInt();

                                if (nomorJadwal >= 0 && nomorJadwal < jadwal.length && jadwal[nomorJadwal] != null) {
                                    Jadwalpenerbangan jadwalPenerbangan = jadwal[nomorJadwal];
                                    for (int i = 0; i < jadwal.length; i++) {
                                        if (jadwal[i] != null) {
                                            System.out.println("Nomor: " + i);
                                            System.out.println("Asal: " + jadwal[i].getAsal());
                                            System.out.println("Tujuan: " + jadwal[i].getTujuan());
                                            System.out.println("Maskapai: " + jadwal[i].getOperator().getNama());
                                            System.out.println("Tanggal: " + jadwal[i].getTanggal());
                                            System.out.println("Harga: " + jadwal[i].getHarga());
                                            System.out.println("Durasi: " + jadwal[i].getWaktutempuh());
                                            System.out.println("-----------------------------------");
                                        }
                                    }
                                } else {
                                    System.out.println("Nomor jadwal penerbangan tidak valid.");
                                }
                                Customer cust = new Customer("Bril", "JL.Paingan", 100, 190);
                                break;
                            case 3:
                                System.out.println("");
                                break;
                            case 4:
                                System.out.println("Kembali ke menu utama");
                                break;
                            default:
                                System.out.println("Pilihan tidak valid");
                                break;
                        }
                    } while (pilihTiket != 4);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
                    break;
            }
        } while (pilihan != 4);
    }

    public static void showMenuMaskapai() {
        System.out.println("\nMenu Maskapai: ");
        System.out.println("1. Tambah maskapai");
        System.out.println("2. Hapus maskapai");
        System.out.println("3. Tampil data maskapai");
        System.out.println("4. Edit maskapai");
        System.out.println("5. Kembali ke menu utama");
    }

    public static void tampilData(Maskapai[] maskapai, int jumlahMaskapai) {
        for (int i = 0; i < jumlahMaskapai; i++) {
            System.out.println("Maskapai ke-" + (i + 1));
            System.out.println("Nama: " + maskapai[i].getNama());
            System.out.println("Kode: " + maskapai[i].getKode());
            System.out.println();
        }
    }

    public static void showMenu() {
        System.out.println("\nMenu Jadwal Penerbangan: ");
        System.out.println("1. Tambah jadwal");
        System.out.println("2. Hapus jadwal");
        System.out.println("3. Tampil data jadwal");
        System.out.println("4. Edit jadwal");
        System.out.println("5. Kembali ke menu utama");
    }
}
