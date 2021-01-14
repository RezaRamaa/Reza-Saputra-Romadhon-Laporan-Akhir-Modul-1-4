package Entity;
public class PembeliEntity extends AbstractEntity {
    String alamat;
    public PembeliEntity(String alamat, String nama, String password) {
        super(nama, password);
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNama() {
        return nama;
    }
 

}
