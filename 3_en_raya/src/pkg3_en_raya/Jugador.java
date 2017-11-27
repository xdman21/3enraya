/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_en_raya;

/**
 *
 * @author xavi
 */
public abstract class Jugador {
    protected String Jugador1;
    protected String Jugador1name;
    protected String Jugador2name;
    protected String Jugador2;
    protected String win;
    public Jugador(String Jugador1, String Jugador2, String Jugador1name, String Jugador2name) 
    {
        this.Jugador1 = Jugador1; 
        this.Jugador2 = Jugador2;
        this.Jugador1name = Jugador1name;
        this.Jugador2name = Jugador2name;
    }
    public String Jugador1() 
    {
        return this.Jugador1;
    }
    public String Jugador2() 
    {
        return this.Jugador2;
    }
    public abstract String win(String player);
}
