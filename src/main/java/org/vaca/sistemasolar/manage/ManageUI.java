package org.vaca.sistemasolar.manage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ManageUI {

    public void dibujarPlaneta(final Graphics g, final int x, final int y, final String nombre) {
        try {
            BufferedImage imagenOriginal = ImageIO.read(new File("./src/resources/imagenes/Tierra.png"));
            Image imagenRedimensionada = imagenOriginal.getScaledInstance(50, 50, Image.SCALE_SMOOTH);

            // Dibujar la imagen redimensionada en el lienzo
            g.drawImage(imagenRedimensionada, x, y, null);
            g.setColor(Color.WHITE);
            g.drawString(nombre, x - 20, y - 10);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void actualizarInformacion( final String titulo, final String informacion, final JPanel panelInformacion) {
        // Actualizar el contenido del panel de información
        panelInformacion.removeAll();
        JLabel etiquetaTitulo = new JLabel(titulo);
        JLabel etiquetaInformacion = new JLabel("<html>" + informacion + "</html>");
        etiquetaInformacion.setVerticalAlignment(SwingConstants.TOP);
        panelInformacion.add(etiquetaTitulo, BorderLayout.NORTH);
        panelInformacion.add(etiquetaInformacion, BorderLayout.CENTER);
        panelInformacion.revalidate();
        panelInformacion.repaint();
    }
}
