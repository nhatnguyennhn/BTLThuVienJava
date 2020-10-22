/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;
import BusinesLogic.DocGiaAttribute;
import DataAccess.Connect;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Nhat Nguyen
 */
public class DocGiaData {

  public static PreparedStatement ps;
    public static ResultSet rs;
    
  
    
    public static ResultSet showTextfield(String sql) {
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
 public static boolean InsertDocGia(String MaDocGia,String HoTen,Date NgaySinh,String DiaChi,String Email,Date NgayLapThe,Date NgayHetHan) {
        String sql = "insert into DOCGIA values(?,?,?,?,?,?,?,?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, MaDocGia);
            ps.setString(2, HoTen);
            ps.setDate(3, NgaySinh);
            ps.setString(4, DiaChi);
            ps.setString (5, Email);
            ps.setDate (6, NgayLapThe);
            ps.setDate (7, NgayHetHan);
            ps.setInt(8,0);
            ps.setInt(9,0);
            ps.execute();
            
        } catch(Exception e) {
            return false;
        }
        return true;
    }
  public boolean UpdateDocGia(String MaDocGia,String HoTen,Date NgaySinh,String DiaChi,String Email,Date NgayLapThe,Date NgayHetHan,int TienNo,int DaMuon) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE DOCGIA SET HoTen = ?,NgaySinh= ?,DiaChi= ?,Email= ?,NgayLapThe= ?,NgayHetHan= ?,TienNo = ?,DaMuon = ?  where MaDocGia = ?");
            ps.setString(1, HoTen);
            ps.setDate(2, NgaySinh);
            ps.setString(3,DiaChi);
            ps.setString(4,Email);
            ps.setDate(5, NgayLapThe);
            ps.setDate(6, NgayHetHan);
            ps.setInt(7, TienNo);
            ps.setInt(8, DaMuon);
            ps.setString(9,MaDocGia);
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
      public boolean DeleteDocGia(String MaDocGia) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM DOCGIA WHERE MaDocGia = ?");
            ps.setString(1, MaDocGia);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    
        
    } 
          public static List<DocGiaAttribute>  SearchDocGia(String MaDocGia) {
             List<DocGiaAttribute> ListDocGia = new ArrayList<DocGiaAttribute>();
             Connection connection = Connect.getConnect();
             MaDocGia= "%"+MaDocGia+"%";
        String sql = "SELECT * FROM DOCGIA WHERE HoTen  LIKE ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, MaDocGia);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                DocGiaAttribute DocGia = new DocGiaAttribute();
                
                DocGia.setMaDocGia(rs.getString("MaDocGia"));
                DocGia.setHoTen(rs.getString("HoTen"));
                DocGia.setNgaySinh(rs.getDate("NgaySinh"));
                DocGia.setDiaChi(rs.getString("DiaChi"));
                DocGia.setEmail(rs.getString("Email"));
                DocGia.setNgayLapThe(rs.getDate("NgayLapThe"));
                DocGia.setNgayHetHan(rs.getDate("NgayHetHan"));
                ListDocGia.add(DocGia);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
           sql = "SELECT * FROM DOCGIA WHERE MaDocGia  LIKE ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, MaDocGia);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                DocGiaAttribute DocGia = new DocGiaAttribute();
                
                DocGia.setMaDocGia(rs.getString("MaDocGia"));
                DocGia.setHoTen(rs.getString("HoTen"));
                DocGia.setNgaySinh(rs.getDate("NgaySinh"));
                DocGia.setDiaChi(rs.getString("DiaChi"));
                DocGia.setEmail(rs.getString("Email"));
                DocGia.setNgayLapThe(rs.getDate("NgayLapThe"));
                DocGia.setNgayHetHan(rs.getDate("NgayHetHan"));
                ListDocGia.add(DocGia);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListDocGia;
    } 
       
    
}
