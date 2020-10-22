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
public class TacGiaAttribute {

     private String MaTG;
    private String TacGia;
    public TacGiaAttribute() {
        
    }
     public TacGiaAttribute(String MaTG,String TacGia) {
        this.MaTG=MaTG;
        this.TacGia=TacGia;
    }
         public String getMaTG() {
        return MaTG;
    }
    
    public void setMaTG(String set) {
        this.MaTG = set;
    }
        public String getTacGia() {
        return TacGia;
    }
    
    public void setTacGia(String set) {
        this.TacGia = set;
    }
}
