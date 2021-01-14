package Model;
import Entity.BajuEntity;
import java.util.ArrayList;
public class BajuModel {
      public ArrayList<BajuEntity> databaju;
    public BajuModel(){
        databaju = new ArrayList<BajuEntity>();
    }
    public void insertBaju (BajuEntity Baju){
        databaju.add(Baju);
    }
    public void view()
    {
        for (BajuEntity baju : databaju)
        {
            System.out.println("Nama Baju = "+baju.getJenisBaju());
            System.out.println("Harga Baju = "+baju.getHarga());
            System.out.println("Ukuran Baju = "+baju.getUkuran());
            System.out.println("Jumlah Baju Yang Akan Dibeli = "+baju.getJumlah());
        }
    }
    public void hapus(String jenisBaju)
    {
        for (int i=0; i<databaju.size();i++)
        {
            if(jenisBaju.equals(databaju.get(i).getJenisBaju()))
            {
                databaju.remove(i);
                System.out.println("Data Telah Dihapus");
                System.out.println("============================================");
            }else{
                System.out.println("Data Tidak Valid ");
                System.out.println("============================================");
            }
        }
    }
    public void update(String jenisBaju, String newharga, String newukuran)
    {
        for(int i=0; i<databaju.size();i++)
        {
            if(jenisBaju.equals(databaju.get(i).getJenisBaju()))
            {
                databaju.get(i).harga=newharga;
                databaju.get(i).ukuran=newukuran;
                System.out.println("Data Telah Diupdate");
                System.out.println("============================================");
            }
        }
    }
    public void update1(String jenisBaju,String newharga, String newukuran)
    {
        for(int i=0; i<databaju.size();i++)
        {
            if(jenisBaju.equals(databaju.get(i).getJenisBaju()))
                    {
                        update(jenisBaju,newharga,newukuran);
                    }else{
                System.out.println("Data Tidak Tersedia");
                System.out.println("============================================");
            }
        }
    }
}
