package clases;

import java.awt.Component;
import java.awt.Container;

/**
 *
 * @author ecpau
 */
public class MetodosPaneles {
    /**
     * Oculta todos los componentes contenidos en el grupo de paneles especificado.
     *
     * @param grupoPaneles El contenedor que agrupa los paneles a ocultar.
     */
    public void ocultarPaneles(Container grupoPaneles) {
        for (Component componente : grupoPaneles.getComponents()) {
            componente.setVisible(false);
        }
    }
}
