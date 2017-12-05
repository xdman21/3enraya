/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_en_raya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author xavi
 */

public class Main 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int i = 1;
        System.out.println("Escribe nombre Jugador1");
        String nombrejugador1 = br.readLine();
        
        System.out.println("Escribe Nombre Jugador 2");
        String nombrejugador2 = br.readLine();
        
        tablero t = new tablero(nombrejugador1, nombrejugador2);

        t.crearTablero();
        t.imprimirtablero();
        
        while(i <= 4) 
        {
            t.moverjugador1();
            t.moverjugador2();
            
            i++;
        }
        
        t.moverjugador1();
    }
}
