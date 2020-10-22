/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinesLogic;


import DataAccess.TaiKhoanData;
import BusinesLogic.TaiKhoanAttribute;
/**
 *
 * @author Nhat Nguyen
 */
public class TaiKhoanMethod {

      public static  boolean Login(String TenDangNhap,String MatKhau)
    {
       
         
          TaiKhoanData taikhoandata= new TaiKhoanData();
         if(!(TenDangNhap.isEmpty() || MatKhau.isEmpty())) {
            
               TaiKhoanAttribute ad= taikhoandata.dangNhap(TenDangNhap,MatKhau);
               
                  if (ad!=null)  
                  {
                      
                      return true;
                  }
                
         }
         return false;
    }
      
        public static  boolean ChangePassword(String TenDangNhap,String MatKhau)
    {
           TaiKhoanData taikhoandata= new TaiKhoanData();
         if(!(TenDangNhap.isEmpty() || MatKhau.isEmpty())) {
            
               boolean ad= taikhoandata.UpdateTaiKhoan(TenDangNhap,MatKhau);
                  if (ad)  
                  {
                     
                      return true;
                  }
                
         }
         return false;
    }
       public static  boolean DeleteAdmin(String TenDangNhap)
    {
           TaiKhoanData taikhoandata= new TaiKhoanData();
         if(!(TenDangNhap.isEmpty())) {
            
               boolean ad= taikhoandata.DeleteTaiKhoan(TenDangNhap);
                  if (ad)  
                  {
                     
                      return true;
                  }
                
         }
         return false;
    }   
        public static  boolean DangKy(String TenDangNhap,String MatKhau,String Email)
    {
        
           TaiKhoanData taikhoandata= new TaiKhoanData();
         if(!( TenDangNhap.isEmpty() || MatKhau.isEmpty() || Email.isEmpty())) {
      
           
               boolean ad= taikhoandata.InsertTaiKhoan(TenDangNhap,MatKhau,Email);
                  if (ad)  
                  {
                     
                      return true;
                  }
                  
           }
          return false;
         }
        
        
    }

