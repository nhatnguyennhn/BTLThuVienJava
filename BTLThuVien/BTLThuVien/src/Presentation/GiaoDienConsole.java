
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;
import BusinesLogic.DocGiaAttribute;
import BusinesLogic.TaiKhoanMethod;
import BusinesLogic.DocGiaMethod;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Nhat Nguyen
 */

public class GiaoDienConsole {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
//Kiểm tra tài khoản để đăng nhập
   /*     String Ten="nhatcute";
         String Mk="nhatcute";
         
       boolean login=TaiKhoanMethod.Login(Ten,Mk);
       if (login)
       {
            System.out.print("Dang Nhap  Thanh Cong");
            
       }
       else 
       {
           System.out.print("Tai Khoan va Mat Khau sai, xin vui long nhap lai");
       }
       
     */
   
   
   //Thay đổi mật khẩu của tài khoản
/*    String TenThayDoi="nhatcute";
    String MkThayDoi="nhatcutephomaique";
    boolean changepassword=TaiKhoanMethod.ChangePassword(TenThayDoi,MkThayDoi);
      if (changepassword)
       {
            System.out.print("Thay Doi Thanh Cong");
            
       }
       else 
       {
           System.out.print("Thay Doi That Bai");
       }
  
   */ 

 
 
 //Xóa tài khoản
 /* String TenDuocXoa="khaingu";

    boolean deleteadmin=TaiKhoanMethod.DeleteAdmin(TenDuocXoa);
      if (deleteadmin)
       {
            System.out.print("Xoa Thanh Cong");
            
       }
       else 
       {
           System.out.print("Xoa That Bai");
       }
 */
 
 
 //Đăng ký tài khoản
  /* String TenDangKy="nhatcute";
    String MkDangKy="nhatcute";
    String EmailDangKy="nhatnguyennhn@gmail.com";
    boolean dangky=TaiKhoanMethod.DangKy(TenDangKy,MkDangKy,EmailDangKy);
      if (dangky)
       {
            System.out.print("Dang Ky Thanh Cong");
            
       }
       else 
       {
           System.out.print("Tai khoan da co, xin thay doi ten tai khoan");
       }
  */
  
  

  
//Thêm đọc giả

 String MaDocGia="dg420";
 String HoTen="Nguyen Hoang Nhat";
 Date NgaySinh=null;
 String DiaChi="Ha tinh";
 String Email="nhatnguyennhn@gmail.com";
 Date NgayLapThe=null;
 Date NgayHetHan=null;
 int TienNo=1000;
int DaMuon=1; 
 //Thêm đọc giả
 /*
 boolean themdocgia=DocGiaMethod.ThemDocGia(MaDocGia, HoTen, NgaySinh, DiaChi, Email, NgayLapThe, NgayHetHan);
      if (themdocgia)
       {
            System.out.print("Them Thanh Cong");
            
       }
       else 
       {
           System.out.print("Them That Bai");
       }
  
 */
 
 // Sửa đọc giả
  /*boolean suadocgia=DocGiaMethod.SuaDocGia(MaDocGia, HoTen, NgaySinh, DiaChi, Email, NgayLapThe, NgayHetHan,TienNo,DaMuon);
      if (suadocgia)
       {
            System.out.print("Sua Thanh Cong");
            
       }
       else 
       {
           System.out.print("Sua That Bai");
       }
  */
  
  
  //Xóa đọc giả 
  /*
  boolean xoadocgia=DocGiaMethod.XoaDocGia(MaDocGia);
      if (xoadocgia)
       {
            System.out.print("Xoa Thanh Cong");
            
       }
       else 
       {
           System.out.print("Xoa That Bai");
       }
*/
// tìm đọc giả

 String madocgia= "Trần Quốc Đạt";
 List<DocGiaAttribute>  list=DocGiaMethod.TimDocGia(madocgia);
 for (DocGiaAttribute dg : list) {
 if (dg != null) {
 System.out.print(dg.getMaDocGia());
 System.out.print(dg.getHoTen());
 System.out.print(dg.getNgaySinh());
 System.out.print(dg.getDiaChi());
 System.out.print(dg.getEmail());
 System.out.print(dg.getNgayLapThe());
 System.out.print(dg.getNgayHetHan());
 System.out.print(dg.getTienNo());
 System.out.print(dg.getDaMuon());
 System.out.print("\n");
 }
        }
 
 
 
 
    } 

     
    }
  

