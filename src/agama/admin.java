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
public class admin extends panggil{
    
    private String idadmin;
    private String username;
    private String password;

    public admin() {
    }
    
       
    public admin (String idadmin){
     this.idadmin=idadmin;   
    }
    
    public admin (String idadmin, String username) {
     this.idadmin=idadmin;   
     this.username=username;
    }
    
    public admin (String idadmin, String username, String password) {
     this.idadmin=idadmin;   
     this.username=username;
     this.password=password;
    }
    
    public void setIdAdmin (String idadmin){
        try {
            if (idadmin.equals(null) || idadmin.equals("")){
              JOptionPane.showMessageDialog(null, "ID Admin belum diisi");
              this.idadmin="-";
            }else{
              this.idadmin=idadmin;    
            } 
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    
    }
    
    public String getIdAdmin (){
        return this.idadmin;
    }
    
    public void setUsername (String username){
        this.username=username;
    }
    
    public String getUsername (){
        return this.username;
    }
    
    public void setPassword (String passowrd){
        this.password=passowrd;
    }
    
    public String getPassword (){
        return this.password;
    }
    
    public String infoAdmin(){
        String login = super.infoPanggil()+
                       " ID Admin :"+getIdAdmin()+
                       "\n Username :"+getUsername()+
                       "\n Password :"+getPassword();   
        JOptionPane.showMessageDialog(null, login);
        return login;
    } 
}
