package org.vaca.sistemasolar.ui;

import org.vaca.sistemasolar.manage.ManageUI;

import javax.swing.*;
import java.awt.*;

public class Lienzo extends JPanel {

    private ManageUI manageUI;

    public Lienzo(ManageUI manageUI) {
        this.manageUI = manageUI;
        this.setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Lógica para dibujar los planetas y otros objetos celestiales aquí
        manageUI.dibujarPlaneta(g, 100, 100, "Tierra");
    }
}
