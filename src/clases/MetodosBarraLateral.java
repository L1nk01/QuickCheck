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
    
    public void cambiarPanel(Container panelesAntiguos, javax.swing.JLayeredPane panelNuevo) {
        ocultarPaneles(panelesAntiguos);
        panelNuevo.setVisible(true);
    }
}
