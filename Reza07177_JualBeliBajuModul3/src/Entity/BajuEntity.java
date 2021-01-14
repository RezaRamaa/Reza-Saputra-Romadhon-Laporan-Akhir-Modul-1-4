package Entity;
public class BajuEntity {
    public String jenisBaju,harga,ukuran;
    int jumlah;

    public BajuEntity(String jenisBaju, String harga, String ukuran, int jumlah) {
        this.jenisBaju = jenisBaju;
        this.harga = harga;
        this.ukuran = ukuran;
        this.jumlah = jumlah;
    }
    public String getJenisBaju() {
        return jenisBaju;
    }

    public String getHarga() {
        return harga;
    }

    public String getUkuran() {
        return ukuran;
    }

    public int getJumlah() {
        return jumlah;
    }
}
