
package Controller;
import Entity.BajuEntity;
public class BajuController {
    int index1 = 0;
    public BajuController(){
    }
    public void insert(String jenisBaju,String harga, String ukuran, int jumlah){
        AllObjectModel.bajumoddel.insertBaju(new BajuEntity(jenisBaju,harga,ukuran,jumlah));
    }
    public void viewBaju(){
        AllObjectModel.bajumoddel.view();
    }
    public void hapus(String jenisBaju){
        AllObjectModel.bajumoddel.hapus(jenisBaju);
    }
    public void update(String jenisBaju, String newharga, String newJumlah){
        AllObjectModel.bajumoddel.update(jenisBaju, newharga, newJumlah);
    }
}
