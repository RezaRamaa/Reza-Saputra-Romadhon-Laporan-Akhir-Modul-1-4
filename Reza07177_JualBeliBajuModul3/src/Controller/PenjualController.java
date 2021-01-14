package Controller;
import Entity.PenjualEntity;
public class PenjualController implements ControllerInterfaces {
    int indexLogin = 0;
    public PenjualController(){
    }
    public void dataAdmin(){
        String nama[] = {"reza","rama"};
        String password[] = {"01","02"};
        for(int i=0; i<nama.length;i++)
        {
            AllObjectModel.penjualModel.insertPenjual(new PenjualEntity(nama[i],password[i]));
        }
    }
    public void viewPenjual(){
        AllObjectModel.penjualModel.view();
    }
    @Override
    public void login (String nama, String password){
        AllObjectModel.penjualModel.cekData(nama,password);
    }
     public int cekData(String nama, String password){
        int cekData = AllObjectModel.penjualModel.cekData(nama, password);
        return cekData;
    }
}