package Model;
import Entity.PembeliEntity;
import java.util.ArrayList;
public class PembeliModel implements ModelInterfaces {
    private ArrayList<PembeliEntity> pembeliEntityArrayList;
    public PembeliModel()
    {
        pembeliEntityArrayList = new ArrayList<PembeliEntity>();
    }
    public void insertPembeli(PembeliEntity pembeli)
    {
        pembeliEntityArrayList.add(pembeli);
    }
    @Override
    public void view(){
        for(PembeliEntity pembeli : pembeliEntityArrayList)
        {
            System.out.print(pembeli.getNama());
            System.out.print(pembeli.getPassword());
            System.out.print(pembeli.getAlamat());
        }
    }
    public int cekData(String nama, String password){
        int loop = 0;
        for(PembeliEntity pembeli : pembeliEntityArrayList){
            if(pembeli.getNama().equals(nama)){
                break;
            }else{
                loop++;
            }
        }
        return loop;
    }
}
