/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan;
import agama.juz;
import agama.admin;
import agama.panggil;
import agama.berita;
import agama.user;
import aframe.framejuz;
import aframe.fadmin;
import aframe.fpanggil;
import aframe.fberita;
import aframe.fuser;

/**
 *
 * @author USER
 */
public class Latihan {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        admin ap = new admin();
        ap.setIdAdmin("A001");
        ap.setUsername("Admin123");
        ap.setPassword("Admin123");
        ap.setIdPanggil("C001");
        ap.setNik(1234567890);
        ap.setKeperluan("Tahfidz");
        ap.setTanggal("25 Juni 2025");
        System.out.println(ap.infoAdmin());
        
////        JuzPackage
//        juz hPl = new juz ("","");
//        hPl.setIdjuz("QS001");
//        hPl.setKatagori("tahfidz");
//        
//        System.out.println("ID :"+hPl.getIdJuz());
//        System.out.println("Katagori :"+hPl.getKatagori());

////        AdminPackeage
//        admin lGn = new admin ();
//        lGn.setIdAdmin("A001");
//        lGn.setUsername("Admin001");
//        lGn.setPassword("Admin001");
//          
//        System.out.println("ID Admin :"+lGn.getIdAdmin());
//        System.out.println("Username :"+lGn.getUsername());
//        System.out.println("Password :"+lGn.getPassword());

////        PanggilPackeage
//        panggil call = new panggil();
//        call.setIdPanggil("C001");
//        call.setNik(001);
//        call.setKeperluan("tahfidz01");
//        call.setTanggal("5juni");
//         
//        System.out.println("ID Panggil :"+call.getIdPanggil());
//        System.out.println("NIK :"+call.getNik());
//        System.out.println("Keperluan :"+call.getKeperluan());
//        System.out.println("Tanggal :"+call.getTanggal());
          
        
////        Frame Juz
//        framejuz formsaya= new framejuz ();
//        formsaya.setVisible(true);
        
////        Frame Admin
//        fadmin formsaya = new fadmin ();
//        formsaya.setVisible(true);

////        Frame Panggil
//        fpanggil formsaya = new fpanggil();
//        formsaya.setVisible(true);

////        Frame Berita
//        fberita formsaya = new fberita();
//        formsaya.setVisible(true);

////        Frame User
//        fuser formsaya = new fuser();
//        formsaya.setVisible(true);
    }
    
}
