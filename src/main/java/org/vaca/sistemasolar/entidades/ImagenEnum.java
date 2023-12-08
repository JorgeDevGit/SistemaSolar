package org.vaca.sistemasolar.entidades;

import lombok.Getter;
import org.vaca.Constantes;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@Getter
public enum ImagenEnum {

    SOL(crearImagenCuerpoCeleste(Constantes.SOL)),
    MERCURIO(crearImagenCuerpoCeleste(Constantes.MERCURIO)),
    VENUS(crearImagenCuerpoCeleste(Constantes.VENUS)),
    TIERRA(crearImagenCuerpoCeleste(Constantes.TIERRA)),
    MARTE(crearImagenCuerpoCeleste(Constantes.MARTE)),
    JUPITER(crearImagenCuerpoCeleste(Constantes.JUPITER)),
    SATURNO(crearImagenCuerpoCeleste(Constantes.SATURNO)),
    URANO(crearImagenCuerpoCeleste(Constantes.URANO)),
    NEPTUNO(crearImagenCuerpoCeleste(Constantes.NEPTUNO));

    private final Image imagen;

    ImagenEnum(Image imagen) {
        this.imagen = imagen;
    }

    private static Image crearImagenCuerpoCeleste(String nombre) {
        try {
            BufferedImage imagenOriginal = ImageIO.read(new File("./src/resources/imagenes/" + nombre + ".png"));
            return imagenOriginal.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
