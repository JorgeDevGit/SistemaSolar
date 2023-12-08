package org.vaca.sistemasolar.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.vecmath.Vector2d;
import java.awt.*;

@Getter
@Setter
@AllArgsConstructor
public class CuerpoCeleste {

    private String nombre;
    private double masa; // en kilogramos
    private Vector2d posicionInicial; // posición inicial en el plano (x, y)
    private Vector2d velocidadInicial; // velocidad inicial en el plano (vx, vy)
    private double velocidadOrbital;
    private Image imagen;

    public void actualizarPosicion(double tiempo) {
        double radio = Math.sqrt(Math.pow(posicionInicial.x, 2) + Math.pow(posicionInicial.y, 2));
        double angulo = Math.atan2(posicionInicial.y, posicionInicial.x);

        double velocidadAngular = velocidadOrbital / radio;

        // Actualiza el ángulo en función del tiempo y la velocidad angular (que es la velocidad orbital dividida por el radio)
        angulo += velocidadAngular * tiempo;

        // Calcula las nuevas coordenadas x e y basándote en el nuevo ángulo y radio
        posicionInicial.x = radio * Math.cos(angulo);
        posicionInicial.y = radio * Math.sin(angulo);
    }

}
