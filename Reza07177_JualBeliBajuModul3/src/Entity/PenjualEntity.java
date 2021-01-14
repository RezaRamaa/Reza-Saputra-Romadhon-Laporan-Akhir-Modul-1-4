package Entity;
public class PenjualEntity  extends AbstractEntity{

    public PenjualEntity(String nama, String password) {
        super(nama, password);
    }

    public PenjualEntity() {
    }
@Override
    public String getNama() {
        return nama;
    } 
}
