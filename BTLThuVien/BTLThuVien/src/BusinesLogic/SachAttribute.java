/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinesLogic;

/**
 *
 * @author Nhat Nguyen
 */
public class SachAttribute {

     private String MaSach;
     private String TieuDe;
     private int SoLuong;
     private String NamXB;
     private String NhaXB;
     private String TheLoai;
     private String TacGia;
     private int GiaTri;
     private String NgayNhap;
       
    public SachAttribute() {
        
    }
    public SachAttribute(String MaSach,String TieuDe,int SoLuong,String NamXB,String NhaXB,String TheLoai,String TacGia,int GiaTri,String NgayNhap) {
        this.MaSach=MaSach;
        this.TieuDe=TieuDe;
        this.SoLuong=SoLuong;
        this.NamXB=NamXB;
        this.NhaXB=NhaXB;
        this.TheLoai=TheLoai;
        this.GiaTri=GiaTri;
        this.NgayNhap=NgayNhap;
    }
    public String getMaSach() {
        return MaSach;
    }
    
    public void setMaSach(String set) {
        this.MaSach = set;
    }
      public String getTieuDe() {
        return TieuDe;
    }
    
    public void setTieuDe(String set) {
        this.TieuDe = set;
    }
      public int getSoLuong() {
        return SoLuong;
    }
    
    public void setSoLuong(int set) {
        this.SoLuong = set;
    }
      public String getNamXB() {
        return NamXB;
    }
    
    public void setNamXB(String set) {
        this.NamXB = set;
    }
    
     public String getNhaXB() {
        return NhaXB;
    }
    
    public void setNhaXB(String set) {
        this.NhaXB = set;
    }
      public String getTheLoai() {
        return TheLoai;
    }
    
    public void setTheLoai (String set) {
        this.TheLoai = set;
    }
      public String getTacGia() {
        return TacGia;
    }
    
    public void setTacGia(String set) {
        this.TacGia = set;
    }
      public String getNgayNhap() {
        return NgayNhap;
    }
    
    public void setNgayNhap (String set) {
        this.NgayNhap = set;
    }
      public int getGiaTri() {
        return GiaTri;
    }
    
    public void setGiaTri(int set) {
        this.GiaTri = set;
    }
    
    
    
    
    
     
}
