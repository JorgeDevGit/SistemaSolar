package org.vaca;

import org.vaca.sistemasolar.SistemaSolarSimulador;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SwingUtilities.invokeLater(SistemaSolarSimulador::new);
    }
}
