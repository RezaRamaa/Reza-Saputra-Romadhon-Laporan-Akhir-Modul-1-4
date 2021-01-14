package reza07177_jualbelibajuu;
import java.util.Scanner;
import java.util.ArrayList;

public class Reza07177_jualbelibajuu {
    static Scanner input = new Scanner(System.in);
    static ArrayList<reza07177_BajuEntity>databaju= new ArrayList();

    public static void main(String[] args) {
        System.out.println("Selamat Datang Di Toko Baju");
        System.out.println("==========================================");
        int pil;
        do{
            System.out.println("1. Input Baju");
            System.out.println("2. View ");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Exit");
            System.out.print("Pilih = ");
            pil = input.nextInt();
            System.out.println("==========================================");
            switch(pil){
                case 1 : inputbaju();
                break;
                case 2 : view();
                break;
                case 3 : System.out.println("Data yang ingin di hapus");
                         String reza07177_jenisBaju= input.next();
                         hapus(reza07177_jenisBaju);
                break;
                case 4 :System.out.print("Inputkan Jenis Baju  = ");
                    reza07177_jenisBaju = input.next();
                    System.out.print("Jumlah beli = ");
                    int newreza07177_jumlahBaju = input.nextInt();
                    System.out.print("Harga Baru  = ");
                    int newreza07177_harga = input.nextInt();
                    update(reza07177_jenisBaju,newreza07177_jumlahBaju,newreza07177_harga);
                break;
            }
            System.out.println("==========================================");
        }while(pil!=5);
    }
    static void inputbaju()
   {
       System.out.print("INPUT JENIS BAJU  = "); 
       String reza07177_jenisBaju = input.next(); 
       System.out.print("INPUT HARGA = ");
       int reza07177_harga = input.nextInt();
       System.out.print("UKURAN BAJU  = ");
       String reza07177_ukuran = input.next();
       System.out.print("JUMLAH BAJU = ");
       int reza07177_jumlahBaju = input.nextInt();
       int reza07177_total=0;
       databaju.add(new reza07177_BajuEntity (reza07177_jumlahBaju, reza07177_harga, reza07177_total, reza07177_jenisBaju, reza07177_ukuran));
   } 
    static void view()
    {
        for(int i=0;i<databaju.size();i++)
        {
                System.out.println("JENIS BAJU  = "+databaju.get(i).getReza07177_jenisBaju());
                System.out.println("HARGA       = "+databaju.get(i).getReza07177_harga());
                System.out.println("UKURAN      = "+databaju.get(i).getReza07177_ukuran());
                System.out.println("JUMLAH BELI = "+databaju.get(i).getReza07177_jumlahBaju());
                System.out.println("TOTAL HARGA BELI ="+databaju.get(i).getReza07177_total());
                System.out.println("==========================================");
        }
    }
    static int caribarang(String reza07177_jenisBaju)
   {
       int indexbarang = -1;
       for(int i=0;i<databaju.size(); i++)
       {
           if(reza07177_jenisBaju==(databaju.get(i).getReza07177_jenisBaju()))
           {
               indexbarang = i;
           }
       }
       return indexbarang;
   }
    static void hapus(String reza07177_jenisBaju)
   {
        for (int i=0; i<databaju.size();i++){
           if(reza07177_jenisBaju.equals(databaju.get(i).getReza07177_jenisBaju())){
       databaju.remove(databaju.get(i));
       System.out.println("Data Telah Di Hapus");
       System.out.println("==========================================");
           }else
           {
               System.out.println("Maaf Data yang anda inputkan tidak ada !!");
           }
        }
   }
    static void update(String reza07177_jenisBaju,int newreza07177_jumlahBaju,int newreza07177_harga)
    {
        for(int i=0;i<databaju.size();i++)
        {
            if(reza07177_jenisBaju.equals(databaju.get(i).getReza07177_jenisBaju()))
            {
                databaju.get(i).reza07177_jumlahBaju=newreza07177_jumlahBaju;
                databaju.get(i).reza07177_harga=newreza07177_harga;
                System.out.println("Data Telah DI Update");
            }
            else 
            {
                System.out.println("==========================================");
                System.out.println("SALAH MEMASUKKAN DATA");
                System.out.println("==========================================");
            }
        }
    }
    
}

