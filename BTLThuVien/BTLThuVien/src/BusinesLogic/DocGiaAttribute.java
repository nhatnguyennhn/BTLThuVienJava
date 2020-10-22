/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinesLogic;

import java.sql.Date;

/**
 *
 * @author Nhat Nguyen
 */
public class DocGiaAttribute {

     private String MaDocGia;
     private String HoTen;
     private Date NgaySinh;
     private String DiaChi;
     private String Email;
     private Date NgayLapThe;
     private Date NgayHetHan;
     private int TienNo;
     private int DaMuon;
      public DocGiaAttribute() {
        
    }
       public DocGiaAttribute(String MaDocGia,String HoTen,Date NgaySinh,String DiaChi,String Email,Date NgayLapThe,Date NgayHetHan,int TienNo,int DaMuon) {
        this.MaDocGia=MaDocGia;
        this.HoTen=HoTen;
        this.NgaySinh=NgaySinh;
        this.DiaChi=DiaChi;
        this.Email=Email;
        this.NgayLapThe=NgayLapThe;
        this.NgayHetHan=NgayHetHan;
        this.TienNo=TienNo;
        this.DaMuon=DaMuon;
    }
         public String getMaDocGia() {
        return MaDocGia;
    }
    
    public void setMaDocGia(String set) {
        this.MaDocGia = set;
    }
      public String getHoTen() {
        return HoTen;
    }
    
    public void setHoTen (String set) {
        this.HoTen = set;
    }
      public Date getNgaySinh() {
        return NgaySinh;
    }
    
    public void setNgaySinh(Date set) {
        this.NgaySinh = set;
    }
      public String getDiaChi() {
        return DiaChi;
    }
    
    public void setDiaChi(String set) {
        this.DiaChi = set;
    }
       public String getEmail() {
        return Email;
    }
    
    public void setEmail(String set) {
        this.Email = set;
    }
      public Date getNgayLapThe() {
        return NgayLapThe;
    }
    
    public void setNgayLapThe (Date set) {
        this.NgayLapThe = set;
    }
      public Date getNgayHetHan() {
        return NgayHetHan;
    }
    
    public void setNgayHetHan(Date set) {
        this.NgayHetHan = set;
    }
      public int getTienNo() {
        return TienNo;
    }
    
    public void setTienNo(int set) {
        this.TienNo = set;
    }
      public int getDaMuon() {
        return DaMuon;
    }
    
    public void setDaMuon(int set) {
        this.DaMuon = set;
    }
}
