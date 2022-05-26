/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasirsepatu1;

/**
 *
 * @author fadda
 */
public class Manusia {
    String beli;
    String tombol;
    String total;
    String kembalian;
    
    public Manusia(){
        this.beli="TENTUKAN JUMLAH BELI!";
        this.tombol="AGAR TAHU BERAPA TOTAL HARGA!";
        this.total="INPUT UANG YANG DIBAYARKAN CALON PEMBELI!";
        this.kembalian="MAKA KEMBALIAN AKAN KELUAR!";
        
    }
    
    public String getBeli(){
        return this.beli;
        
    }
    public String getTombol(){
        return this.tombol;
    }
    public String getTotal(){
        return this.total;
    }
    public String getKembalian(){
        return this.kembalian;
    }
}
