/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agama;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class panggil {
    
    private String idpanggil;
    private int nik;
    private String keperluan;
    private String tgl;
    
    public panggil () {
        
    }
    
    public panggil (String idpanggil) {
        this.idpanggil=idpanggil;
    }
    
    public panggil (String idpanggil, int nik) {
        this.idpanggil=idpanggil;
        this.nik=nik;
    }
    
    public panggil (String idpanggil, int nik, String keperluan) {
        this.idpanggil=idpanggil;
        this.nik=nik;
        this.keperluan=keperluan;
    }
    
    public panggil (String idpanggil, int nik, String keperluan, String tgl) {
        this.idpanggil=idpanggil;
        this.nik=nik;
        this.keperluan=keperluan;
        this.tgl=tgl;
    }
    
    public void setIdPanggil (String idpanggil){
        try {
            if (idpanggil.equals(null) || idpanggil.equals("")) {
                JOptionPane.showMessageDialog(null, "ID Panggil Wajib Diisi");
                this.idpanggil="-";
            } else {
                this.idpanggil=idpanggil;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
        
    }
    
    public String getIdPanggil(){
        return this.idpanggil;
    }
    
    public void setNik (int nik) {
        this.nik=nik;
    }
    
    public int getNik (){
        return this.nik;
    }
    
    public void setKeperluan (String keperluan){
        this.keperluan=keperluan;
    }
    
    public String getKeperluan(){
        return this.keperluan;
    }
    
    public void setTanggal (String tgl){
        this.tgl=tgl;
    }
    
    public String getTanggal(){
        return this.tgl;
    }
    
    public String infoPanggil(){
        String call = "ID Panggil :"+getIdPanggil()+
                      "\nNIK :"+getNik()+
                      "\nKeperluan :"+getKeperluan()+
                      "\nTanggal :"+getTanggal();
        JOptionPane.showMessageDialog(null, call);
        return call;
    }
    
    
}
