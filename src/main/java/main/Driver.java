/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import kendaraan.SepedaMotor;
import pabrikan.*;
/**
 *
 * @author mzaky
 */
public class Driver {

    public static void main(String[] args) {
        System.out.println("Tes SepedaMotor");
        System.out.println("");
        
        SepedaMotor Motor = new SepedaMotor("biru");
        Motor.jalan();
        Motor.isiTangkiFull();
        System.out.println("Setelah diisi");
        Motor.jalan();
       
        System.out.println("");
        System.out.println("Tes YahamaMoi");
        System.out.println("");
        
        YahamaMoi Aerox = new YahamaMoi("Merah");
        Aerox.jalan();
        Aerox.isiTangkiFull();
        System.out.println("Setelah diisi");
        Aerox.jalan();
        
        System.out.println("");
        System.out.println("Tes HondaBaet");
        System.out.println("");
        
        HondaBaet Beat = new HondaBaet("Kuning");
        Beat.jalan();
        Beat.isiTangkiFull();
        System.out.println("Setelah diisi");
        Beat.jalan();
        
    }
}
