/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_en_raya;

import java.io.IOException;

/**
 *
 * @author xavi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int i = 1;
        String jugador1 = "X";
        String jugador2 = "O";
        String nombrejugador1 = "xavi";
        String nombrejugador2 = "ruben";
        tablero t = new tablero(jugador1,jugador2,nombrejugador1,nombrejugador2);
        System.out.println();
        t.imprimirtablero();
        while(i != 9) 
        {
        t.moverjugador1();
        System.out.println(t.wincheck());
        t.moverjugador2();
        t.wincheck();
        }
    }
    
}
