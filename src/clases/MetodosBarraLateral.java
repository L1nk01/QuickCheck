package clases;

import java.awt.Container;
import java.awt.Dimension;

/**
 *
 * @author ecpau
 */
public class MetodosBarraLateral extends MetodosPaneles {
    
    // true si la barra lateral está abierta, false si no
    private boolean barraLateralAbierta = false;
    
    /**
     * Alterna la visibilidad de la barra lateral y actualiza la imagen del ícono según el estado actual.
     * Si la barra lateral está cerrada, la abre ajustando su ancho y actualizando la imagen del ícono.
     * Si la barra lateral está abierta, la cierra ajustando su ancho y actualizando la imagen del ícono.
     *
     * @param barraLateral El objeto JLayeredPane que representa la barra lateral.
     * @param labelImagen El objeto JLabel que muestra el ícono de la barra lateral.
     */
    public void alternarBarraLateral(javax.swing.JLayeredPane barraLateral, javax.swing.JLabel labelImagen) {
        if (!barraLateralAbierta) {
            barraLateral.setPreferredSize(new Dimension(210, barraLateral.getHeight()));
            barraLateral.revalidate();
            barraLateral.repaint();
            
            labelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quickcheck/assets/iconos_barra_lateral/icons8-back-30-white.png")));
            barraLateralAbierta = true;
        } else {
            barraLateral.setPreferredSize(new Dimension(0, barraLateral.getHeight()));
            barraLateral.revalidate();
            barraLateral.repaint();
            
            labelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quickcheck/assets/iconos_barra_lateral/icons8-menu-30-white.png")));
            barraLateralAbierta = false;
        }
    }
    
    /**
     * Cambia el panel actualmente visible en un contenedor dado al nuevo panel especificado.
     * Oculta los paneles antiguos contenidos en el contenedor y hace visible el nuevo panel.
     *
     * @param panelesAntiguos El contenedor que contiene los paneles antiguos.
     * @param panelNuevo El nuevo panel a hacer visible.
     */
    public void cambiarPanel(Container panelesAntiguos, javax.swing.JLayeredPane panelNuevo) {
        ocultarPaneles(panelesAntiguos);
        panelNuevo.setVisible(true);
    }
}
