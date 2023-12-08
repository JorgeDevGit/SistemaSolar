package org.vaca.sistemasolar;

import org.vaca.Constantes;
import org.vaca.sistemasolar.entidades.SistemaSolar;
import org.vaca.sistemasolar.listener.MouseListener;
import org.vaca.sistemasolar.manage.ManageSistemaSolar;
import org.vaca.sistemasolar.ui.Lienzo;
import org.vaca.sistemasolar.manage.ManageUI;
import org.vaca.sistemasolar.ui.PanelInformacion;

import javax.swing.*;
import java.awt.*;
public class SistemaSolarSimulador extends JFrame {

    private PanelInformacion panelInformacion;
    private ManageUI manageUI;
    private Lienzo lienzo;
    private MouseListener mouseListener;
    private SistemaSolar sistemaSolar;

    private ManageSistemaSolar manageSistemaSolar;

    public SistemaSolarSimulador() {
        super("Simulador de Sistema Solar");
        iniciarSistemas();
        configurarVentana();
        manageSistemaSolar.iniciarSistemaSolar();
    }

    private void iniciarSistemas(){
        manageUI = new ManageUI();
        lienzo = new Lienzo(manageUI);
        panelInformacion = new PanelInformacion();
        mouseListener = new MouseListener(manageUI, panelInformacion);
        sistemaSolar = new SistemaSolar();
        manageSistemaSolar = new ManageSistemaSolar(manageUI, sistemaSolar);
    }

    private void configurarVentana() {
        // Configurar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(Constantes.WIDTH_SCREEN, Constantes.HEIGHT_SCREEN);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        add(lienzo, BorderLayout.CENTER);
        add(panelInformacion, BorderLayout.EAST);

        // Hacer visible la ventana
        setVisible(true);
    }
}
