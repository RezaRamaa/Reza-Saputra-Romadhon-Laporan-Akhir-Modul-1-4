package Controller;
import Entity.PembeliEntity;
public class pembeliController implements ControllerInterfaces {
    AllObjectModel allobject = new AllObjectModel();
    int indexLogin = 0;
    public pembeliController(){
        }
    @Override
    public void login(String nama, String password){
        AllObjectModel.pembelimodel.cekData(nama, password);
    }
    public void insertPembeli(String nama, String password, String alamat) {
        PembeliEntity pembeliModel = new PembeliEntity(nama, password, alamat);
        allobject.pembelimodel.insertPembeli(pembeliModel);
    }
    public int cekData(String nama, String password){
        int cekData=allobject.pembelimodel.cekData(nama, password);
        return cekData;
    }
}
