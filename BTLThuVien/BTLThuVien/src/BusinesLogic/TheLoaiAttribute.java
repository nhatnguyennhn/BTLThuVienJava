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
public class TheLoaiAttribute {

    private String MaTL;
    private String TheLoai;
    public TheLoaiAttribute() {
        
    }
     public TheLoaiAttribute(String MaTL,String TheLoai) {
        this.MaTL=MaTL;
        this.TheLoai=TheLoai;
    }
         public String getMaTL() {
        return MaTL;
    }
    
    public void setMaTL(String set) {
        this.MaTL = set;
    }
        public String getTheLoai() {
        return TheLoai;
    }
    
    public void setTheLoai(String set) {
        this.TheLoai = set;
    }
}
