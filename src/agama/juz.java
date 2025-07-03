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
public class juz {
    
    private String idjuz;
    private String katagori;
    
    public juz () {
        
    }
    
    public juz (String idjuz) {
        this.idjuz=idjuz;
    }
    
    public juz (String idjuz, String katagori) {
        this.idjuz=idjuz;
        this.katagori=katagori;
    }
    
    public void setIdjuz (String idjuz) {
        if (idjuz.equals(null)){
            JOptionPane.showMessageDialog(null, "ID Juz belum diisi");
        }else{
        this.idjuz=idjuz;    
        }
        
    }
    
    public String getIdJuz () {
        return this.idjuz;
    }
    
    public void setKatagori (String katagori) {
        this.katagori=katagori;
    }
    
    public String getKatagori () {
        return this.katagori;
    }
    
    public void infoJuz(){
        String setor = "ID Juz :"+getIdJuz()+
                       "\n Kategori :"+getKatagori();
        JOptionPane.showMessageDialog(null, setor);
    }
    
}
