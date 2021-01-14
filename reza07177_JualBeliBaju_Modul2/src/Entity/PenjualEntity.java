package Entity;
public class PenjualEntity extends MahasiswaAbstractEntity {
    public PenjualEntity(String nama, String password) {
        super(nama, password);
    }
@Override
public String getNama(){
    return nama;
}
}
