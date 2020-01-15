/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganjilgenap;

import javax.swing.JOptionPane;

/**
 *
 * @author Vahdaputra
 */
public class GanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Nilai = Integer.parseInt(JOptionPane.showInputDialog("Masukan Angka"));
        
        int Hasil = Nilai / 2;
        
        String ket;
        
        if(Hasil%2 == 1)
            ket=("Ganjil");
        else
            ket=("Genap");
        
        JOptionPane.showMessageDialog(null, "Bilangan tersebut adalah bilangan \n"+ket);
    }
    
}
