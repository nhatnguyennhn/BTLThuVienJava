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
public class PhieuMuonTraAttribute {

  private String MaPM;
  private String MaDocGia;
  private String MaSach;
  private String NgayMuon;
  private String NgayTra;
  private int TienPhat;
  private boolean DaMuon;
   public PhieuMuonTraAttribute() {
    
   }
   public PhieuMuonTraAttribute(String MaPM,String MaDocGia,String MaSach,String NgayMuon,String NgayTra,int TienPhat,boolean DaMuon) {
    this.MaPM=MaPM;
    this.MaDocGia=MaDocGia;
    this.MaSach=MaSach;
    this.NgayMuon=NgayMuon;
    this.NgayTra=NgayTra;
    this.TienPhat=TienPhat;
    this.DaMuon=DaMuon;
   }
       public String getMaPM() {
        return MaPM;
    }
    
    public void setMaPM(String set) {
        this.MaPM = set;
    }
        public String getMaDocGia() {
        return MaDocGia;
    }
    
    public void setMaDocGia(String set) {
        this.MaDocGia = set;
    }
        public String getMaSach() {
        return MaSach;
    }
    
    public void setMaSach(String set) {
        this.MaSach = set;
    }
        public String getNgayMuon() {
        return NgayMuon;
    }
    
    public void setNgayMuon(String set) {
        this.NgayMuon = set;
    }
        public String getNgayTra() {
        return NgayTra;
    }
    
    public void setNgayTra(String set) {
        this.NgayTra = set;
    }
       public int getTienPhat() {
        return TienPhat;
    }
    
    public void setTienPhat(int set) {
        this.TienPhat = set;
    }
    public boolean getDaMuon() {
        return DaMuon;
    }
    
    public void setDaMuon(boolean set) {
        this.DaMuon = set;
    }
}
