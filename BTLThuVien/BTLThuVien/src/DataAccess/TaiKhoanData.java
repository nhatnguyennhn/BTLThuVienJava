/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;
import BusinesLogic.TaiKhoanAttribute;
import DataAccess.Connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author Nhat Nguyen
 */
public class TaiKhoanData {
   public static PreparedStatement ps;
    public static ResultSet rs;
    
    public TaiKhoanAttribute dangNhap   (String TenDangNhap, String MatKhau) {
        TaiKhoanAttribute ad = null;
        try{
            ps = Connect.getConnect().prepareStatement("SELECT TenDangNhap,MatKhau FROM TAIKHOAN where TenDangNhap =? and MatKhau=?");
            ps.setString(1, TenDangNhap);
            ps.setString(2, MatKhau);
            rs = ps.executeQuery();
            while(rs.next()) {
                ad = new TaiKhoanAttribute();
            }
        }
        catch(Exception e) {
            return ad = null;
        }
       
        
        return ad;
    }
    
    public static ResultSet showTextfield(String sql) {
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
 public boolean UpdateTaiKhoan(String TenDangNhap, String MatKhau) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE TAIKHOAN SET MatKhau = ? where TenDangNhap = ?");
            ps.setString(2, TenDangNhap);
            ps.setString(1, MatKhau);
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeleteTaiKhoan(String TenDangNhap) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM TAIKHOAN WHERE TenDangNhap = ?");
            ps.setString(1, TenDangNhap);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
     public static boolean InsertTaiKhoan(String TenDangNhap, String MatKhau, String Email) {
        String sql = "insert into TAIKHOAN values(?,?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, TenDangNhap);
            ps.setString(2, MatKhau);
            ps.setString(3, Email);
            ps.execute();
           return true;
        } catch(Exception e) {
            return false;
        }
      
      
}
}
