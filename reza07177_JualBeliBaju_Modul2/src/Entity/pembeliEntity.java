package Entity;
public class pembeliEntity extends MahasiswaAbstractEntity {
    public pembeliEntity(String nama, String password) {
        super(nama, password);
    }
   @Override
   public String getNama(){
       return nama;
   }
}
