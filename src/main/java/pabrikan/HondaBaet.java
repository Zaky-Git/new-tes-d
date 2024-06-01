/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pabrikan;
import kendaraan.SepedaMotor;
/**
 *
 * @author mzaky
 */
public class HondaBaet extends SepedaMotor {
    
    public HondaBaet(String warna){
        super(warna);
        ukuranTangki = 4;
    }

    @Override
    public boolean jalan() {
        if (super.jalan() == true){
            System.out.println("Motor Baet akan habis bensin pada " + cekKapanHabis());
            return true;
        } else {
            return false;
        }
    }
}
