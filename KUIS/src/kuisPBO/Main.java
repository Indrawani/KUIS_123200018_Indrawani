/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisPBO;

/**
 *
 * @author IIN
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pilih,pil;
        int nilai;
        String nama, asal;
        double alurcerita, konten, kreatifitas, sinematografi, total;
        double alurCerita1 , konten1 , kreatifitas1 , sinematografi1;
        double surat1, isiSurat1, kreatif, pkb, total1;
        double surat2, isiSurat2, kreatifitas2, pkb1;
        
        Scanner input = new Scanner(System.in);
        System.out.println("1. kategori Animasi");
        System.out.println("2. Kategori Menulis Surat");
        System.out.print("Masukan Pilihan : "); pilih = input.nextInt();
        
        if(pilih==1){
            
            System.out.print("Masukan Nama : ");  nama = input.next();
            System.out.print("Masukan Asal sekolah : ");  asal = input.next();
            System.out.print("Masukan nilai alur cerita : ");  alurcerita = input.nextInt();
            System.out.print("Masukan  nilai Konten : ");  konten = input.nextInt();
            System.out.print("Masukan  nilai kreatifitas : ");  kreatifitas = input.nextInt();
            System.out.print("Masukan  nilai Sinematografi : ");  sinematografi = input.nextInt();
            
            alurcerita = ((15/100)*alurcerita);
            konten = ((35/100)*konten);
            kreatifitas = ((35/100)*kreatifitas);
            sinematografi = ((15/100)*sinematografi);
            
            total = alurcerita + konten + kreatifitas + sinematografi;
            
            System.out.println("total : " );
            
            if(total>85){
                System.out.println("Peserta dinyatakan lulus");
            }else{
                System.out.println("Peserta TidakLulus");
            }
        
            
        }else if(pilih ==2){

            System.out.print("Masukan Nama : ");  nama = input.next();
            System.out.print("Masukan Asal sekolah : ");  asal = input.next();
            System.out.print("Masukan nilai alur cerita : ");  surat1 = input.nextInt();
            System.out.print("Masukan  nilai Konten : ");  isiSurat1 = input.nextInt();
            System.out.print("Masukan  nilai kreatifitas : ");  kreatifitas1 = input.nextInt();
            System.out.print("Masukan  nilai Sinematografi : ");  pkb = input.nextInt();
            
            surat1 = ((10/100)*surat1);
            isiSurat1 = ((40/100)*isiSurat1);
            kreatifitas1 = ((30/100)*kreatifitas1);
            pkb1 = ((20/100)*pkb);
            
            total1 =  surat1 + isiSurat1 + kreatifitas1 + pkb1;
            
            if(total1 > 85){
                System.out.println("Peserta dinyatakan lulus");
            }else{
                System.out.println("Peserta TidakLulus");
            }
        
        }
    }
    
}
