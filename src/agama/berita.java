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
public class berita {
    
    private String idberita;
    private String judul;
    private String penulis;
    private String tgl;
    private String isiberita;
    
    public berita (){
    }
    
    public berita (String idberita){
        if (idberita.equals(null)){
        JOptionPane.showMessageDialog(null, "ID Berita Belum Diisi");
        }else{
        this.idberita=idberita;    
        }
        
    }
    
    public berita (String idberita, String judul){
        this.idberita=idberita;
        this.judul=judul;
    }
    
    public berita (String idberita, String judul, String penulis){
        this.idberita=idberita;
        this.judul=judul;
        this.penulis=penulis;
    }
    
    public berita (String idberita, String judul, String penulis, String tgl){
        this.idberita=idberita;
        this.judul=judul;
        this.penulis=penulis;
        this.tgl=tgl;
    }
    
    public berita (String idberita, String judul, String penulis, String tgl, String isiberita){
        this.idberita=idberita;
        this.judul=judul;
        this.penulis=penulis;
        this.tgl=tgl;
        this.isiberita=isiberita;
    }
    
    public void setIdBerita (String idberita){
        this.idberita=idberita;
    }
    
    public String getIdBerita(){
        return this.idberita;
    }
    
    public void setJudul (String judul){
        this.judul=judul;
    }
    
    public String getJudul(){
        return this.judul;
    }
    
    public void setPenulis (String penulis){
        this.penulis=penulis;
    }
    
    public String getPenulis(){
        return this.penulis;
    }
    
    public void setTgl (String tgl){
        this.tgl=tgl;
    }
    
    public String getTgl(){
        return this.tgl;
    }
    
    public void setIsiBerita (String isiberita){
        this.isiberita=isiberita;
    }
    
    public String getIsiBerita(){
        return this.isiberita;
    }
    
    public void infoBerita(){
        String news = "ID Berita :"+getIdBerita()+
                      "\nJudul :"+getJudul()+
                      "\nPenulis :"+getPenulis()+
                      "\nTanggal :"+getTgl()+
                      "\nIsi Berita :"+getIsiBerita();
        JOptionPane.showMessageDialog(null, news);
    }
}
