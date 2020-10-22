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
public class NhaXuatBanAttribute {

    private String MaNXB;
    private String TenNXB;
    private String DiaChi;
    private String SDT;
  
    public NhaXuatBanAttribute() {
        
    }
     public NhaXuatBanAttribute(String MaNXB,String TenNXB,String DiaChi,String SDT) {
        this.MaNXB=MaNXB;
        this.TenNXB=TenNXB;
        this.DiaChi=DiaChi;
        this.SDT=SDT;
    }
         public String getMaNXB() {
        return MaNXB;
    }
    
    public void setMaNXB(String set) {
        this.MaNXB = set;
    }
      public String getTenNXB() {
        return TenNXB;
    }
    
    public void setTenNXB(String set) {
        this.TenNXB = set;
    }
      public String getDiaChi() {
        return DiaChi;
    }
    
    public void setDiaChi(String set) {
        this.DiaChi = set;
    }
      public String getSDT() {
        return SDT;
    }
    
    public void setSDT(String set) {
        this.SDT = set;
    }

}
