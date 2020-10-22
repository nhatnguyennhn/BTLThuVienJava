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
public class TaiKhoanAttribute {

   private String TenDangNhap;
   private String MatKhau;
   private String Email;
    public TaiKhoanAttribute() {
        
    }
     public TaiKhoanAttribute(String TenDangNhap,String MatKhau,String Email) {
        
        this.TenDangNhap=TenDangNhap;
        this.MatKhau=MatKhau;
        this.Email=Email;
    }
        
        public String getTenDangNhap() {
        return TenDangNhap;
    }
    
    public void setTenDangNhap(String set) {
        this.TenDangNhap = set;
    }
        public String getMatKhau() {
        return MatKhau;
    }
    
    public void setMatKhau(String set) {
        this.MatKhau = set;
    }
        public String getEmail() {
        return Email;
    }
    
    public void setEmail(String set) {
        this.Email = set;
    }
    
}
