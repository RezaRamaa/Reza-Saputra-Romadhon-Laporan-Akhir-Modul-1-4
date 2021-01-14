package Model;
import Entity.PenjualEntity;
import java.util.ArrayList;
public class PenjualModel implements ModelInterfaces {
    private ArrayList<PenjualEntity> penjualArrayList;
    public PenjualModel()
    {
        penjualArrayList = new ArrayList<PenjualEntity>();
    }
    public void insertpenjual(PenjualEntity penjual)
    {
        penjualArrayList.add(penjual);
    }
    @Override
    public void view()
    {
        for (PenjualEntity penjual : penjualArrayList)
        {
            System.out.print(penjual.getNama());
            System.out.println();
        }
    }
    public int cekData(String nama,String Jenisbaju){
        int loop = 0;
        for(PenjualEntity penjual : penjualArrayList){
            if(penjual.getNama().equals(nama)){
                break;
            }else{
                loop++;
            }
        }
        return loop;
    }
}
