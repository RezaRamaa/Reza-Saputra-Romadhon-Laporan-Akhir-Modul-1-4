package reza07177_jualbelibajuu;

public class reza07177_BajuEntity {
    int reza07177_jumlahBaju,reza07177_harga,reza07177_total;
    String  reza07177_jenisBaju,reza07177_ukuran;

    public reza07177_BajuEntity(int reza07177_jumlahBaju, int reza07177_harga, int reza07177_total, String reza07177_jenisBaju, String reza07177_ukuran) {
        this.reza07177_jumlahBaju = reza07177_jumlahBaju;
        this.reza07177_harga = reza07177_harga;
        this.reza07177_total = reza07177_total;
        this.reza07177_jenisBaju = reza07177_jenisBaju;
        this.reza07177_ukuran = reza07177_ukuran;
    }

    public int getReza07177_jumlahBaju() {
        return reza07177_jumlahBaju;
    }

    public int getReza07177_harga() {
        return reza07177_harga;
    }

    public int getReza07177_total() {
        reza07177_total=reza07177_jumlahBaju*reza07177_harga;
        return reza07177_total;
    }

    public String getReza07177_jenisBaju() {
        return reza07177_jenisBaju;
    }

    public String getReza07177_ukuran() {
        return reza07177_ukuran;
    }
   
}
