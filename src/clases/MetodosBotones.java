package clases;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ecpau
 */
public class MetodosBotones {
   
    private final Color defaultButton = new Color(92,164,169);
    private final Color defaultButtonHover = new Color(111, 197, 203);
    private final Color defaultButtonDisabled = new Color(57,102,105);
    
    private final Color defaultText = new Color(255,255,255);
    private final Color defaultTextDisabled = new Color(153,153,153);
    
    private final Color defaultButtonWarning = new Color(192, 36, 36);
    private final Color defaultButtonWarningHover = Color.RED;
    private final Color defaultButtonWarningDisabled = new Color(107, 0, 0);
    
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
        panel.setBackground(this.defaultButton);
        label.setForeground(this.defaultText);
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
        panel.setBackground(this.defaultButtonDisabled);
        label.setForeground(this.defaultTextDisabled);
    }
    
    /**
     * @return the defaultButton
     */
    public Color getDefaultButton() {
        return defaultButton;
    }

    /**
     * @return the defaultButtonHover
     */
    public Color getDefaultButtonHover() {
        return defaultButtonHover;
    }

    /**
     * @return the defaultText
     */
    public Color getDefaultText() {
        return defaultText;
    }

    /**
     * @return the defaultButtonDisabled
     */
    public Color getDefaultButtonDisabled() {
        return defaultButtonDisabled;
    }

    /**
     * @return the defaultTextDisabled
     */
    public Color getDefaultTextDisabled() {
        return defaultTextDisabled;
    }
    
    /**
     * @return the defaultButtonWarning
     */
    public Color getDefaultButtonWarning() {
        return defaultButtonWarning;
    }
    
    /**
     * @return the defaultButtonWarningHover
     */
    public Color getDefaultButtonWarningHover() {
        return defaultButtonWarningHover;
    }
    
    /**
     * @return the defaultButtonWarningDisabled
     */
    public Color getDefaultButtonWarningDisabled() {
        return defaultButtonWarningDisabled;
    }
}
