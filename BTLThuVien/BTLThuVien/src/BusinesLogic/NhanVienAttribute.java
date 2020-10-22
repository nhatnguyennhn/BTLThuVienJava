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
public class NhanVienAttribute {

    /**
     * @param args the command line arguments
     */
    private String MaNV;
    private String TenNV;
    public NhanVienAttribute() {
        
    }
     public NhanVienAttribute(String MaNV,String TenNV) {
        this.MaNV=MaNV;
        this.TenNV=TenNV;
    }
         public String getMaNV() {
        return MaNV;
    }
    
    public void setMaNV(String set) {
        this.MaNV = set;
    }
        public String getTenNV() {
        return TenNV;
    }
    
    public void setTenNV(String set) {
        this.TenNV = set;
    }
     
}
