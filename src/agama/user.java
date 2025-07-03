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
public class user {
    
    private String iduser;
    private String username;
    private String password;
    private String nama;
    private String tmptlahir;
    private String tgllahir;
    private int nik;
    private String agama;
    private String jk;
    private String alamat;
    private int nohp;
    private int umur;
    private String penghargaan;
    private String idjuz;
    
    public user (){
    }
    
    public user (String iduser){
        if (iduser.equals(null)){
            JOptionPane.showMessageDialog(null, "ID User Belum Diisi");
        }else{
         this.iduser=iduser;   
        }
    }
    
    public user (String iduser, String username){
      this.iduser=iduser;
      this.username=username;
    }
    
    public user (String iduser, String username, String password){
      this.iduser=iduser;
      this.username=username;
      this.password=password;
    }
    
    public user (String iduser, String username, String password, String nama){
      this.iduser=iduser;
      this.username=username;
      this.password=password;
      this.nama=nama;
    }
    
    public user (String iduser, String username, String password, String nama,
            String tmptlahir){
      this.iduser=iduser;
      this.username=username;
      this.password=password;
      this.nama=nama;
      this.tmptlahir=tmptlahir;
    }
    
    public user (String iduser, String username, String password, String nama,
            String tmptlahir, String tgllahir){
      this.iduser=iduser;
      this.username=username;
      this.password=password;
      this.nama=nama;
      this.tmptlahir=tmptlahir;
      this.tgllahir=tgllahir;
    }
    
    public user (String iduser, String username, String password, String nama,
            String tmptlahir, String tgllahir, int nik){
      this.iduser=iduser;
      this.username=username;
      this.password=password;
      this.nama=nama;
      this.tmptlahir=tmptlahir;
      this.tgllahir=tgllahir;
      this.nik=nik;
    }
    
    public user (String iduser, String username, String password, String nama,
            String tmptlahir, String tgllahir, int nik, String agama){
      this.iduser=iduser;
      this.username=username;
      this.password=password;
      this.nama=nama;
      this.tmptlahir=tmptlahir;
      this.tgllahir=tgllahir;
      this.nik=nik;
      this.agama=agama;
    }
    
    public user (String iduser, String username, String password, String nama,
            String tmptlahir, String tgllahir, int nik, String agama, String jk){
      this.iduser=iduser;
      this.username=username;
      this.password=password;
      this.nama=nama;
      this.tmptlahir=tmptlahir;
      this.tgllahir=tgllahir;
      this.nik=nik;
      this.agama=agama;
      this.jk=jk;
    }
    
    public user (String iduser, String username, String password, String nama,
            String tmptlahir, String tgllahir, int nik, String agama, String jk,
            String alamat){
      this.iduser=iduser;
      this.username=username;
      this.password=password;
      this.nama=nama;
      this.tmptlahir=tmptlahir;
      this.tgllahir=tgllahir;
      this.nik=nik;
      this.agama=agama;
      this.jk=jk;
      this.alamat=alamat;
    }
    
    public user (String iduser, String username, String password, String nama,
            String tmptlahir, String tgllahir, int nik, String agama, String jk,
            String alamat, int nohp){
      this.iduser=iduser;
      this.username=username;
      this.password=password;
      this.nama=nama;
      this.tmptlahir=tmptlahir;
      this.tgllahir=tgllahir;
      this.nik=nik;
      this.agama=agama;
      this.jk=jk;
      this.alamat=alamat;
      this.nohp=nohp;
    }
    
    public user (String iduser, String username, String password, String nama,
            String tmptlahir, String tgllahir, int nik, String agama, String jk,
            String alamat, int nohp, int umur){
      this.iduser=iduser;
      this.username=username;
      this.password=password;
      this.nama=nama;
      this.tmptlahir=tmptlahir;
      this.tgllahir=tgllahir;
      this.nik=nik;
      this.agama=agama;
      this.jk=jk;
      this.alamat=alamat;
      this.nohp=nohp;
      this.umur=umur;
    }
    
    public user (String iduser, String username, String password, String nama,
            String tmptlahir, String tgllahir, int nik, String agama, String jk,
            String alamat, int nohp, int umur, String penghargaan){
      this.iduser=iduser;
      this.username=username;
      this.password=password;
      this.nama=nama;
      this.tmptlahir=tmptlahir;
      this.tgllahir=tgllahir;
      this.nik=nik;
      this.agama=agama;
      this.jk=jk;
      this.alamat=alamat;
      this.nohp=nohp;
      this.umur=umur;
      this.penghargaan=penghargaan;
    }
    
    public user (String iduser, String username, String password, String nama,
            String tmptlahir, String tgllahir, int nik, String agama, String jk,
            String alamat, int nohp, int umur, String penghargaan, String idjuz){
      this.iduser=iduser;
      this.username=username;
      this.password=password;
      this.nama=nama;
      this.tmptlahir=tmptlahir;
      this.tgllahir=tgllahir;
      this.nik=nik;
      this.agama=agama;
      this.jk=jk;
      this.alamat=alamat;
      this.nohp=nohp;
      this.umur=umur;
      this.penghargaan=penghargaan;
      this.idjuz=idjuz;
    }
    
    public void setIdUser(String iduser){
        if(iduser.equals(iduser)){
            JOptionPane.showMessageDialog(null, "ID User Belum Diisi");
        }else{
        this.iduser=iduser;    
        }   
    }
    
    public String getIdUser(){
        return this.iduser=iduser;
    }
    
    public void setUsername(String username){
        this.username=username;
    }
    
    public String getUsername(){
        return this.username=username;
    }
    
    public void setPassword(String password){
        this.password=password;
    }
    
    public String getPassword(){
        return this.password=password;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public String getNama(){
        return this.nama=nama;
    }
    
    public void setTmptLahir(String tmptlahir){
        this.tmptlahir=tmptlahir;
    }
    
    public String getTmptLahir(){
        return this.tmptlahir=tmptlahir;
    }
    
    public void settglLahir(String tgllahir){
        this.tgllahir=tgllahir;
    }
    
    public String getTglLahir(){
        return this.tgllahir=tgllahir;
    }
    
    public void setNik(int nik){
        this.nik=nik;
    }
    
    public int getNik(){
        return this.nik=nik;
    }
    
    public void setAgama(String agama){
        this.agama=agama;
    }
    
    public String getAgama(){
        return this.agama=agama;
    }
    
    public void setJK(String jk){
        this.jk=jk;
    }
    
    public String getJK(){
        return this.jk=jk;
    }
    
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    
    public String getAlamat(){
        return this.alamat=alamat;
    }
    
    public void setNoHp(int nohp){
        this.nohp=nohp;
    }
    
    public int getNoHp(){
        return this.nohp=nohp;
    }
    
    public void setUmur(int umur){
        this.umur=umur;
    }
    
    public int getUmur(){
        return this.umur=umur;
    }
    
    public void setPenghargaan(String penghargaan){
        this.penghargaan=penghargaan;
    }
    
    public String getPenghargaan(){
        return this.penghargaan=penghargaan;
    }
    
    public void setIdJuz(String idjuz){
        this.idjuz=idjuz;
    }
    
    public String getIdJuz(){
        return this.idjuz=idjuz;
    }
    
    public void infoUser(){
        String user = "ID User :"+getIdUser()+
                      "\n Username :"+getUsername()+
                      "\n Password :"+getPassword()+
                      "\n Nama :"+getNama()+
                      "\n Tempat Lahir :"+getTmptLahir()+
                      "\n Tanggal Lahir :"+getTglLahir()+
                      "\nNIK :"+getNik()+
                      "\n Agama :"+getAgama()+
                      "\nJenis Kelamin :"+getJK()+
                      "\nAlmat :"+getAlamat()+
                      "\nNO Hp :"+getNoHp()+
                      "\n Umur :"+getUmur()+
                      "\nPenghargaan :"+getPenghargaan()+
                      "\nID Juz"+getIdJuz();
        JOptionPane.showMessageDialog(null, user);
    }
}