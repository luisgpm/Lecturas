/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecturas;

/**
 *
 * @author luisg
 */
public class PrbMain
{
    public static void main(String[] args)
    {
        Lecturas l = new Lecturas();
        
        String s= l.leerStrings("dame la cadena:");
        System.out.println(s);
        
        int x= l.leerInt("dame el valor numerico");
        System.out.println(x);
    }
    
}
