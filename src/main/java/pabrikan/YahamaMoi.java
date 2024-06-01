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
public class YahamaMoi extends SepedaMotor {

    public YahamaMoi(String warna) {
        super(warna);
        ukuranTangki = 5;
    }
    
    

    @Override
    public boolean jalan() {
        if (super.jalan() == true){
            System.out.println("Bensin akan habis pada " + cekKapanHabis());
            return true;
        } else {
            return false;
        }
    }
}
