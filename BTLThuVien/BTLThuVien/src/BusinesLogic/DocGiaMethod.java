/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinesLogic;
import DataAccess.DocGiaData;
import BusinesLogic.DocGiaAttribute;
import java.sql.Date;
import java.util.List;
/**
 *
 * @author Nhat Nguyen
 */
public class DocGiaMethod {
      public static  boolean ThemDocGia(String MaDocGia,String HoTen,Date NgaySinh,String DiaChi,String Email,Date NgayLapThe,Date NgayHetHan)
    {
       
         
          DocGiaData docgiadata= new DocGiaData();
         if(!(MaDocGia.isEmpty()) ) {
            
               boolean dg = docgiadata.InsertDocGia( MaDocGia, HoTen, NgaySinh, DiaChi, Email, NgayLapThe, NgayHetHan);
                  if (dg)  
                  {
                     
                      return true;
                  }
                
         }
         return false;
    }
      public static  boolean SuaDocGia(String MaDocGia,String HoTen,Date NgaySinh,String DiaChi,String Email,Date NgayLapThe,Date NgayHetHan,int TienNo,int DaMuon)
    {
       
          DocGiaData docgiadata= new DocGiaData();
         if(!(MaDocGia.isEmpty()) ) {
            
               boolean dg = docgiadata.UpdateDocGia( MaDocGia, HoTen, NgaySinh, DiaChi, Email, NgayLapThe, NgayHetHan,TienNo,DaMuon);
                  if (dg)  
                  {
                     
                      return true;
                  }
                
         }
         return false;
    }
       public static  boolean XoaDocGia(String MaDocGia)
    {
       
          DocGiaData docgiadata= new DocGiaData();
         if(!(MaDocGia.isEmpty()) ) {
            
               boolean dg = docgiadata.DeleteDocGia( MaDocGia);
                  if (dg)  
                  {
                     
                      return true;
                  }
                
         }
         return false;
    }
        public static  List<DocGiaAttribute>  TimDocGia(String MaDocGia)
    {
       
        DocGiaData docgiadata= new DocGiaData();
        return docgiadata.SearchDocGia(MaDocGia);
         
    }
   
}
