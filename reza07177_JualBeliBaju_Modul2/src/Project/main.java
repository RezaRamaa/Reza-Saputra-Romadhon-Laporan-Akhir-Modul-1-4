package Project;
import Entity.*;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;
public class main {
private static PenjualModel penjualmodel = new PenjualModel();
private static pembeli_model pembelimodel = new pembeli_model();
static public ArrayList <BajuEntity> databaju = new ArrayList();
static int cekPelanggan;
static int cekBaju;
static Scanner input = new Scanner(System.in);
    private static Object reza07177_jenisBaju;
    public static void main(String[] args) {
        System.out.println("Toko Baju");
        System.out.println("===============");
        int pil;
        do{
            System.out.println("1. Daftar");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("pilih = ");
            pil = input.nextInt();
            System.out.println("================");
            switch(pil){
                case 1:
                    if(pil == 1){
                        daftarpembeli();
                    }
                break;
                case 2: if(pil == 2){
                    int pilLogin = 0;
                    System.out.println("1.login penjual" + "\n 2. login pembeli" + "\n pilih :");
                    int pilogin = input.nextInt();
                    if(pilogin ==1){
                        loginpenjual();
                }else{
                        loginpembeli();
                    }
            }break;
            }
        }while (pil!=3);
    }
    static void daftarpembeli(){
        System.out.println("Input nama = ");
        String nama = input.next();
        System.out.println("input password = ");
        String password = input.next();
        pembelimodel.insertpembeli(new pembeliEntity(nama,password));
    }
    static void penjual()
    {
        String nama[] = {"reza","rama"};
        String Password[] = {"01","02"};
        for(int i=0; i<nama.length;i++)
        {
            penjualmodel.insertpenjual(new PenjualEntity(nama[i],Password[i]));
        }
    }
    static void baju(){
          System.out.println("INPUT JENIS BAJU  = "); 
       String reza07177_jenisBaju = input.next(); 
       System.out.println("INPUT HARGA = ");
       String reza07177_harga = input.next();
       System.out.println("UKURAN BAJU  = ");
       String reza07177_ukuran = input.next();
       System.out.println("JUMLAH BAJU = ");
       String reza07177_jumlahBaju = input.next();
       int reza07177_total=0;
       databaju.add(new BajuEntity (reza07177_jenisBaju,reza07177_ukuran,reza07177_harga,reza07177_jumlahBaju));
    }
     static void view(){
         for(int i=0; i<databaju.size();i++)
         {
             System.out.println("JENIS BAJU  = "+databaju.get(i).getReza07177_jenisBaju());
                System.out.println("HARGA       = "+databaju.get(i).getReza07177_harga());
                System.out.println("UKURAN      = "+databaju.get(i).getReza07177_ukuran());
                System.out.println("JUMLAH BELI = "+databaju.get(i).getReza07177_jumlahBaju());
                System.out.println("==========================================");
        }
     }
     static void hapus(String reza07177_jenisBaju){
         for(int i=0;i<databaju.size();i++)
         {
             if(reza07177_jenisBaju.equals(databaju.get(i).getReza07177_jenisBaju()))
             {
                 databaju.remove(i);
                 System.out.println("data telah dihapus");
             }
             else
             {
                 System.out.println("salah nama jenis baju");
             }
         }
     }
     static void update(String reza07177_jenisBaju, String newreza07177_jumlahBaju,String newreza07177_harga)
    {
        for(int i=0;i<databaju.size();i++)
        {
           if(reza07177_jenisBaju.equals(databaju.get(i).getReza07177_jenisBaju()))
           {            
               databaju.get(i).setReza07177_harga(newreza07177_harga);
               databaju.get(i).setReza07177_jumlahBaju(newreza07177_jumlahBaju); ;
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
      static void loginpenjual(){
        int pilih;
        System.out.println("Masukan nama penjual : ");
        String nama = input.next();
          System.out.println("Password penjual = ");
          String Password = input.next();
          cekPelanggan = penjualmodel.cekData(nama,Password);
          do{
               System.out.println("1. Input Data Barang");
            System.out.println("2. View Data Barang");
            System.out.println("3. Hapus Data Barang");
            System.out.println("4. Update Data Barang");
            System.out.println("5. Exit");
            System.out.println("Pilih = ");
            pilih = input.nextInt();
            System.out.println("======================");
            switch(pilih){
                case 1 : baju();
                    break;
                case 2 : view();
                    break;
                case 3 : System.out.println("masukan nama Baju = ");
                    String namabaju = input.next();
                    hapus(namabaju);
                    break;
                case 4 : 
                    System.out.println("masukan nama baju = ");
                    String namab = input.next();
                    for(int i=0; i<databaju.size();i++){
                        if(namab.equals(databaju.get(i).getReza07177_jenisBaju()))
                        {
                            System.out.println("input jumlah baru : ");
                            String newreza07177_harga = input.next();
                            System.out.println("inputkan harga baru : ");
                            String newreza07177_jumlahBaju = input.next();
                    update(namab,newreza07177_harga,newreza07177_jumlahBaju);
                        }
                        else
                        {
                            System.out.println("data salah");
                        }
                        }
                break;
            }
          }
          while(pilih!=5);
    }
      static void loginpembeli()
      {
          int pilih;
          System.out.println("nama pembeli :");
          String nama = input.next();
          System.out.println("password : ");
          String password = input.next();
          pembelimodel.cekData(nama, password);
          do
          {
              System.out.println("1. Data Barang Yang Tersedia");
            System.out.println("2. Exit");
            System.out.print("Pilih = ");
            pilih = input.nextInt();
            System.out.println("======================");
            switch(pilih)
            {
            case 1: view();
                ;
                break;
            }
        }
        while (pilih!=2);
          }


    
      }

