/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_en_raya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//asdasdasdasdasdasdasd
/**
 *
 * @author xavi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        String jugador1 = "X";
        String jugador2 = "O";
        System.out.println("Escribe nombre Jugador1");
        String nombrejugador1 = br.readLine();
        System.out.println("Escribe Nombre Jugador 2");
        String nombrejugador2 = br.readLine();
        tablero t = new tablero(jugador1,jugador2,nombrejugador1,nombrejugador2);
        System.out.println();
        t.imprimirtablero();
        while(i != 9) 
        {
        t.moverjugador1();
        System.out.println(t.wincheck());
        t.moverjugador2();
        System.out.println(t.wincheck());
        }
    }
    
}
