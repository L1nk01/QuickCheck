package clases;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ecpau
 */
public class MetodosBotones {
    /**
     * Habilita un botón representado por un panel y un label, cambiando su estado y apariencia.
     *
     * @param panel El panel que representa visualmente el botón.
     * @param label La etiqueta que muestra el texto o el ícono del botón.
     * @param colorPanel El color de fondo del panel cuando el botón está habilitado.
     * @param colorLabel El color del texto o ícono del label cuando el botón está habilitado.
     */
    public void habilitarBoton(JPanel panel, JLabel label, Color colorPanel, Color colorLabel) {
        panel.setEnabled(true);
        label.setEnabled(true);
        panel.setBackground(colorPanel);
        label.setForeground(colorLabel);
    }
    
    /**
     * Deshabilita un botón representado por un panel y un label, cambiando su estado y apariencia.
     *
     * @param panel El panel que representa visualmente el botón.
     * @param label La etiqueta que muestra el texto o el ícono del botón.
     * @param colorPanel El color de fondo del panel cuando el botón está deshabilitado.
     * @param colorLabel El color del texto o ícono del label cuando el botón está deshabilitado.
     */
    public void deshabilitarBoton(JPanel panel, JLabel label, Color colorPanel, Color colorLabel) {
        panel.setEnabled(false);
        label.setEnabled(false);
        panel.setBackground(colorPanel);
        label.setForeground(colorLabel);
    }
    
    /**
     * Hace lo mismo que el metodo habilitarBoton, pero lo hace especificamente para los botones predeterminados de la aplicacion.
     *
     * @param panel El panel que representa visualmente el botón.
     * @param label La etiqueta que muestra el texto o el ícono del botón.
     */
    public void habilitarBotonDefault(JPanel panel, JLabel label) {
        panel.setEnabled(true);
        label.setEnabled(true);
        panel.setBackground(new Color(92,164,169));
        label.setForeground(new Color(255,255,255));
    }
    
    /**
     * Hace lo mismo que el metodo deshabilitarBoton, pero lo hace especificamente para los botones predeterminados de la aplicacion.
     *
     * @param panel El panel que representa visualmente el botón.
     * @param label La etiqueta que muestra el texto o el ícono del botón.
     */
    public void deshabilitarBotonDefault(JPanel panel, JLabel label) {
        panel.setEnabled(false);
        label.setEnabled(false);
        panel.setBackground(new Color(57,102,105));
        label.setForeground(new Color(153,153,153));
    }
}
