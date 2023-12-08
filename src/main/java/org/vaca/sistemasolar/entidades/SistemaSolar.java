package org.vaca.sistemasolar.entidades;

import lombok.Getter;
import lombok.Setter;
import org.vaca.Constantes;

import javax.vecmath.Vector2d;

@Getter
@Setter
public class SistemaSolar {
    private CuerpoCeleste sol;
    private CuerpoCeleste mercurio;
    private CuerpoCeleste venus;
    private CuerpoCeleste tierra;
    private CuerpoCeleste marte;
    private CuerpoCeleste jupiter;
    private CuerpoCeleste saturno;
    private CuerpoCeleste urano;
    private CuerpoCeleste neptuno;

    public SistemaSolar() {
        this.sol = new CuerpoCeleste(Constantes.SOL, Constantes.MASA_SOL,
                new Vector2d(Constantes.POSICION_INICIAL_SOL_X, Constantes.POSICION_INICIAL_SOL_Y), new Vector2d(0, 0), 0, ImagenEnum.SOL.getImagen());
        this.mercurio = new CuerpoCeleste(Constantes.MERCURIO, Constantes.MASA_MERCURIO,
                new Vector2d(Constantes.POSICION_INICIAL_MERCURIO_X, Constantes.POSICION_INICIAL_MERCURIO_Y),
                new Vector2d(0, calcularVelocidadOrbital(Constantes.DISTANCIA_MERCURIO_SOL)),calcularVelocidadOrbital(Constantes.DISTANCIA_MERCURIO_SOL),ImagenEnum.MERCURIO.getImagen());
        this.venus = new CuerpoCeleste(Constantes.VENUS, Constantes.MASA_VENUS,
                new Vector2d(Constantes.POSICION_INICIAL_VENUS_X, Constantes.POSICION_INICIAL_VENUS_Y),
                new Vector2d(0, calcularVelocidadOrbital(Constantes.DISTANCIA_VENUS_SOL)), calcularVelocidadOrbital(Constantes.DISTANCIA_VENUS_SOL), ImagenEnum.VENUS.getImagen());
        this.tierra = new CuerpoCeleste(Constantes.TIERRA, Constantes.MASA_TIERRA,
                new Vector2d(Constantes.POSICION_INICIAL_TIERRA_X, Constantes.POSICION_INICIAL_TIERRA_Y),
                new Vector2d(0, calcularVelocidadOrbital(Constantes.DISTANCIA_TIERRA_SOL)), calcularVelocidadOrbital(Constantes.DISTANCIA_TIERRA_SOL), ImagenEnum.TIERRA.getImagen());
        this.marte = new CuerpoCeleste(Constantes.MARTE, Constantes.MASA_MARTE,
                new Vector2d(Constantes.POSICION_INICIAL_MARTE_X, Constantes.POSICION_INICIAL_MARTE_Y),
                new Vector2d(0, calcularVelocidadOrbital(Constantes.DISTANCIA_MARTE_SOL)), calcularVelocidadOrbital(Constantes.DISTANCIA_MARTE_SOL), ImagenEnum.MARTE.getImagen());
        this.jupiter = new CuerpoCeleste(Constantes.JUPITER, Constantes.MASA_JUPITER,
                new Vector2d(Constantes.POSICION_INICIAL_JUPITER_X, Constantes.POSICION_INICIAL_JUPITER_Y),
                new Vector2d(0, calcularVelocidadOrbital(Constantes.DISTANCIA_JUPITER_SOL)), calcularVelocidadOrbital(Constantes.DISTANCIA_JUPITER_SOL), ImagenEnum.JUPITER.getImagen());
        this.saturno = new CuerpoCeleste(Constantes.SATURNO, Constantes.MASA_SATURNO,
                new Vector2d(Constantes.POSICION_INICIAL_SATURNO_X, Constantes.POSICION_INICIAL_SATURNO_Y),
                new Vector2d(0, calcularVelocidadOrbital(Constantes.DISTANCIA_SATURNO_SOL)), calcularVelocidadOrbital(Constantes.DISTANCIA_SATURNO_SOL), ImagenEnum.SATURNO.getImagen());
        this.urano = new CuerpoCeleste(Constantes.URANO, Constantes.MASA_URANO,
                new Vector2d(Constantes.POSICION_INICIAL_URANO_X, Constantes.POSICION_INICIAL_URANO_Y),
                new Vector2d(0, calcularVelocidadOrbital(Constantes.DISTANCIA_URANO_SOL)), calcularVelocidadOrbital(Constantes.DISTANCIA_URANO_SOL), ImagenEnum.URANO.getImagen());
        this.neptuno = new CuerpoCeleste(Constantes.NEPTUNO, Constantes.MASA_NEPTUNO,
                new Vector2d(Constantes.POSICION_INICIAL_NEPTUNO_X, Constantes.POSICION_INICIAL_NEPTUNO_Y),
                new Vector2d(0, calcularVelocidadOrbital(Constantes.DISTANCIA_NEPTUNO_SOL)), calcularVelocidadOrbital(Constantes.DISTANCIA_NEPTUNO_SOL), ImagenEnum.NEPTUNO.getImagen());
    }


    private double calcularVelocidadOrbital(double distanciaAlSol) {
        // Implementa la fórmula para calcular la velocidad orbital en función de la distancia
        // Puedes utilizar la fórmula v = sqrt(G * M / r) donde G es la constante gravitatoria, M es la masa del Sol, y r es la distancia al Sol
        return Math.sqrt(Constantes.CONSTANTE_GRAVITATORIA * Constantes.MASA_SOL / distanciaAlSol);
    }
}
