package clases;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ecpau
 */
public class MetodosBotones {
   
    // Colores predeterminados del sistema
    
    private final Color buttonPrimary = new Color(89, 135, 198);
    private final Color buttonPrimaryHover = new Color(75, 150, 209);
    private final Color buttonPrimaryDisabled = new Color(42, 55, 82);
    
//    private final Color buttonSecondary = new Color();
//    private final Color buttonSecondaryHover = new Color();
//    private final Color buttonSecondaryDisabled = new Color();

    private final Color buttonSuccess = new Color(92,164,169);
    private final Color buttonSuccessHover = new Color (146, 194, 197);
    private final Color buttonSuccessDisabled = new Color(61, 109, 112);

    private final Color buttonWarning = new Color(252, 161, 32);
    private final Color buttonWarningHover = new Color(252, 174, 56);
    private final Color buttonWarningDisabled = new Color(168, 116, 37);
    
    private final Color buttonDanger = new Color(192, 36, 36);
    private final Color buttonDangerHover = Color.RED;
    private final Color buttonDangerDisabled = new Color(107, 0, 0);
    
    private final Color defaultText = new Color(255,255,255);
    private final Color defaultTextDisabled = new Color(153,153,153);
    
    private final Color buttonTitlebar = new Color(56,33,165);
    private final Color buttonTitlebarHover = new Color(73,49,190);
    
    private final Color buttonSidebar = new Color(46,27,135);
    private final Color buttonSidebarHover = new Color(63,40,170);
    
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
        panel.setBackground(this.buttonPrimary);
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
        panel.setBackground(this.buttonPrimaryDisabled);
        label.setForeground(this.defaultTextDisabled);
    }
    
    // Getters
    
    /**
     * @return the buttonPrimary
     */
    public Color getButtonPrimary() {
        return buttonPrimary;
    }

    /**
     * @return the buttonPrimaryHover
     */
    public Color getButtonPrimaryHover() {
        return buttonPrimaryHover;
    }
    
    /**
     * @return the buttonPrimaryDisabled
     */
    public Color getButtonPrimaryDisabled() {
        return buttonPrimaryDisabled;
    }
    
    /**
     * @return the buttonSuccess
     */
    public Color getButtonSuccess() {
        return buttonSuccess;
    }
    
    /**
     * @return the buttonSuccessHover
     */
    public Color getButtonSuccessHover() {
        return buttonSuccessHover;
    }
    
    /**
     * @return the buttonSuccessDisabled
     */
    public Color getButtonSuccessDisabled() {
        return buttonSuccessDisabled;
    }
    
    /**
     * @return the buttonWarning
     */
    public Color getButtonWarning() {
        return buttonWarning;
    }
    
    /**
     * @return the buttonWarningHover
     */
    public Color getButtonWarningHover() {
        return buttonWarningHover;
    }
    
    /**
     * @return the buttonWarningDisabled
     */
    public Color getButtonWarningDisabled() {
        return buttonWarningDisabled;
    }
    
    /**
     * @return the buttonDanger
     */
    public Color getButtonDanger() {
        return buttonDanger;
    }
    
    /**
     * @return the buttonDangerHover
     */
    public Color getButtonDangerHover() {
        return buttonDangerHover;
    }
    
    /**
     * @return the buttonDangerDisabled
     */
    public Color getButtonDangerDisabled() {
        return buttonDangerDisabled;
    }

    /**
     * @return the defaultText
     */
    public Color getDefaultText() {
        return defaultText;
    }

    /**
     * @return the defaultTextDisabled
     */
    public Color getDefaultTextDisabled() {
        return defaultTextDisabled;
    }   
    
    /**
     * @return the buttonTitlebar
     */
    public Color getButtonTitlebar() {
        return buttonTitlebar;
    }
    
    /**
     * @return the buttonTitlebarHover
     */
    public Color getButtonTitlebarHover() {
        return buttonTitlebarHover;
    }
    
    /**
     * @return the buttonSidebar
     */
    public Color getButtonSidebar() {
        return buttonSidebar;
    }
    
    /**
     * @return the buttonSidebarHover
     */
    public Color getButtonSidebarHover() {
        return buttonSidebarHover;
    }
}