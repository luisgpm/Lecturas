/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecturas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luisg
 */
public class Lecturas
{
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    
    
    public String leerStrings(String mensaje)
    {
        String s = "";
        boolean b = true;
        do
        {            
            s= JOptionPane.showInputDialog(mensaje);
            b = false;
        } while (b);
        return s;
    }
    
    public int leerInt(String mensaje)
    {
        int x = 0;
        boolean b = true;
        do
        {            
            try
            {
                x = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                b = false;
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "se esperaba un valir de tipo entero numerico.. \n intente de nuevo...");
                b = true;
            }
        } while (b);
        return x;
    }
    
    public double leerDouble(String mensaje)
    {
        double x = 0;
        boolean b = true;
        do
        {            
            try
            {
                x = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
                b = false;
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "se esperaba un valir de tipo numerico.. \n intente de nuevo...");
                b = true;
            }
        } while (b);
        return x;
    }

    public long leerLong(String mensaje)
    {
        long x = 0;
        boolean b = true;
        do
        {            
            try
            {
                x = Long.parseLong(JOptionPane.showInputDialog(mensaje));
                b = false;
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "se esperaba un valir de tipo numerico.. \n intente de nuevo...");
                b = true;
            }
        } while (b);
        return x;
    }
    
    public char leerChar(String mensaje)
    {
        String s = "";
        char c = ' ';
        boolean b = true;
        do
        {            
            s= JOptionPane.showInputDialog(mensaje);
            if (s.length()>=1)
            {
                JOptionPane.showMessageDialog(null, "se esperaba un caracter... \n intente de nuevo..");
                
            }
            else{
                c= s.charAt(0);
                b = false;
            }
        } while (b);
        return c;
    }
    
    
    
}

