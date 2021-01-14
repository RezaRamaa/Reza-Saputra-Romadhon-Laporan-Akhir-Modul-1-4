package Model;
import Entity.PenjualEntity;
import java.util.ArrayList;
public class PenjualModel implements ModelInterfaces {
    private ArrayList<PenjualEntity> penjualEntityArrayList;
    public PenjualModel()
    {
        penjualEntityArrayList = new ArrayList<PenjualEntity>();
    }
    public void insertPenjual(PenjualEntity penjual)
    {
        penjualEntityArrayList.add(penjual);
    }
    @Override
    public void view()
    {
        for (PenjualEntity penjual : penjualEntityArrayList)
        {
            System.out.print(penjual.getNama());
            System.out.print(penjual.getPassword());
        }
    }
    public int cekData(String nama, String password)
        {
            int loop = 0;
             for(PenjualEntity penjual : penjualEntityArrayList)
            if(penjual.getNama().equals(nama) && penjual.getPassword().equals(password)){
                break;
            }else{
                loop++;
            }
        
        return loop;
        }
}