package Project;
import Entity.*;
import Controller.*;
import java.util.*;
import java.util.Scanner;


public class main07177 {
    private static PenjualController penjual = new PenjualController();
    private static Scanner input = new Scanner (System.in);
    private static pembeliController pembeli = new pembeliController();
    private static BajuController bajumodel = new BajuController();
    static int cekPenjual;
    static int cekPembeli;
   
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Sistem informasi Jual Baju Today !! ");
        System.out.println("====================================");
        int pil;
        do{
            System.out.println("1. Daftar");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Pilih = ");
            
            pil = input.nextInt();
            System.out.println("======================================");
            
            switch(pil){
                case 1 :
                    daftarpembeli();
                break;
                case 2: if(pil == 2){
                        int pilLogin = 0;
                        System.out.println("1. Login Penjual"+"\n2. Login Pembeli"+"\nPilih : ");
                        pilLogin = input.nextInt();
                        if(pilLogin == 1){
                            loginpenjual();
                        }else{
                            loginpembeli();
                        }
                }
                break;
            }System.out.println("===============================================");
        }while(pil!=3);
    }
    
    static void daftarpembeli(){
       try{
            System.out.print("Input Nama = ");
            String nama = input.next();
            System.out.print("Input Password = ");
            String password = input.next();
            System.out.print("Alamat = ");
            String alamat = input.next();
            pembeli.insertPembeli( nama, password, alamat);
            System.out.println("daftar Sukses");
       }catch (Exception ex){
           System.out.println("Format Pengisian Salah !!");
       }
    }
    static void baju(){
    try{
        System.out.printf("Input Jenis Baju: ");
        String jenisBaju = input.next();
        System.out.printf("Input Harga Baju : ");
        String harga = input.next();
        System.out.printf("Input Ukuran Baju : ");
        String ukuran = input.next();
        System.out.printf("Input jumlah Baju yang Dibeli : ");
        int jumlah = input.nextInt();
        bajumodel.insert(jenisBaju, harga, ukuran, jumlah);
        System.out.println("====================================");
        }catch(InputMismatchException e){
                System.out.println("\nFormat yang anda masukkan salah !!\n");
            }
    }
    static void view(){
       bajumodel.viewBaju();
    }
    static void hapus(String jenisBaju)
    {
        bajumodel.hapus(jenisBaju);
    }
    static void update(String jenisBaju, String harga, String Jumlah)
    {
        bajumodel.update(jenisBaju, harga, Jumlah);
    }
     static void loginpembeli()
    {
        int pil;
        System.out.print("Nama Pelanggan : ");
        String nama = input.next();
        System.out.print("Password : ");
        String password = input.next();
        cekPembeli = AllObjectModel.pembelimodel.cekData(nama, password);
        do
        {
            System.out.println("1. Data Barang Yang Tersedia");
            System.out.println("2. Exit");
            System.out.print("Pilih = ");
            pil = input.nextInt();
            System.out.println("==========================================");
            switch(pil)
            {
            case 1: System.out.println("BARANG YANG TERSEDIA");
                    System.out.println("==========================================");
                    view();
                ;
                break;
            }
        }
        while (pil!=2);
    }
     static void loginpenjual(){
         
         int loop=0;
         System.out.print("Masukan Nama Penjual : ");
         String nama = input.next();
         System.out.print("Password Penjual : ");
         String password = input.next();
         cekPenjual = AllObjectModel.penjualModel.cekData(nama, password);
         do{
             try{
             System.out.println("1. input Data Baju ");
             System.out.println("2. View Data Baju");
             System.out.println("3. Hapus Data Baju ");
             System.out.println("4. Update Data Baju");
             System.out.println("5. Exit");
             System.out.println("Pilih = ");
             int pilih = input.nextInt();
             System.out.println("================================================");
             switch(pilih){
                 case 1: baju();
                     break;
                 case 2: view();
                     break;
                 case 3: System.out.print("Inputkan Jenis Baju = ");
                     String jenisBaju = input.next();
                     hapus(jenisBaju);
                    
                     break;
                 case 4: 
                     System.out.println("Inputkan Jenis Baju = ");
                     jenisBaju = input.next();
                     System.out.println("inputkan harga Baru = ");
                     String newharga = input.next();
                     System.out.println("inputkan jumlah Baru = ");
                     String newJumlah = input.next();
                     update(jenisBaju,newharga,newJumlah);
                 break;
                 default : 
                     loop =1;
                     break;
             }
             }catch (Exception e){
                System.out.println("\nformat salah\n");
            }
             input.nextLine();
         }while(loop != 1);
         
     }
     
}