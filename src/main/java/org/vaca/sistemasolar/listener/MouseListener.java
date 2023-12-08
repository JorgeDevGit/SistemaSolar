package org.vaca.sistemasolar.listener;

import lombok.AllArgsConstructor;
import org.vaca.sistemasolar.manage.ManageUI;
import org.vaca.sistemasolar.ui.PanelInformacion;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@AllArgsConstructor
public class MouseListener extends MouseAdapter {

    ManageUI manageUI;
    PanelInformacion panelInformacion;

    @Override
    public void mouseClicked(MouseEvent e) {
        // Aquí manejar la lógica para determinar si se hizo clic en un planeta
        // y actualizar el panel de información en consecuencia
        manageUI.actualizarInformacion("Planeta Seleccionado", "Información del Planeta...", panelInformacion);
    }
}
