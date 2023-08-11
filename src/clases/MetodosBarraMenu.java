package clases;

import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ecpau
 */
public class MetodosBarraMenu {
    
    int conteoClick = 0;
    long ultimoClick = 0;
    
    public void cerrarVentana() {
        String opciones[] = {"Sí", "No"};
        
        if (JOptionPane.showOptionDialog(null, "¿Está seguro de que desea salir?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[0]) == 0) {
            System.exit(0);
        }
    }
    
    public void maximizarVentana(javax.swing.JFrame form) {
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        form.setMaximizedBounds(env.getMaximumWindowBounds());
        
        if (form.getExtendedState() != JFrame.MAXIMIZED_BOTH) {
            form.setExtendedState(form.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        } else {
            form.setExtendedState(JFrame.NORMAL);
            form.setLocationRelativeTo(null);
        }
    }
    
    public void maximizarDobleClick(javax.swing.JFrame form) {
        long epoch = System.currentTimeMillis();
        
        if (epoch - ultimoClick < 300) {
            conteoClick++;
            
            if (conteoClick == 2) {
                maximizarVentana(form);
                conteoClick = 0;
            }
        } else {
            conteoClick = 1;
        } 
        
        ultimoClick = epoch;
    }
    
    public void ocultarVentana(javax.swing.JFrame form) {
        form.setState(JFrame.ICONIFIED);
    }
    
    public void arrastrarVentana(javax.swing.JFrame form) {
        if (form.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
            form.setExtendedState(JFrame.NORMAL);
        }
    }
}
