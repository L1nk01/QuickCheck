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
    
    /**
     * Muestra un cuadro de diálogo de confirmación y cierra la ventana si se elige "Sí".
     */
    public void cerrarVentana() {
        String opciones[] = {"Sí", "No"};
        
        if (JOptionPane.showOptionDialog(null, "¿Está seguro de que desea salir?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[0]) == 0) {
            System.exit(0);
        }
    }
    
    /**
     * Maximiza la ventana del formulario a pantalla completa o la restaura a su tamaño original.
     *
     * @param form El formulario a maximizar o restaurar.
     */
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
    
    /**
     * Maximiza la ventana del formulario al realizar un doble clic en el título de la ventana.
     * Se activa si dos clics suceden en un intervalo corto de tiempo.
     *
     * @param form El formulario a maximizar al realizar un doble clic.
     */
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
    
    /**
    * Minimiza la ventana del formulario a un ícono en la barra de tareas.
    *
    * @param form El formulario a minimizar.
    */
    public void ocultarVentana(javax.swing.JFrame form) {
        form.setState(JFrame.ICONIFIED);
    }
    
    /**
     * Restaura la ventana del formulario de su estado maximizado a su estado normal.
     *
     * @param form El formulario a restaurar.
     */
    public void arrastrarVentana(javax.swing.JFrame form) {
        if (form.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
            form.setExtendedState(JFrame.NORMAL);
        }
    }
}
