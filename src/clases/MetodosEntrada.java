package clases;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ecpau
 */
public class MetodosEntrada {
    /**
    * Valida si la tecla presionada en un evento de teclado es un carácter numérico o un punto decimal.
    * Si la tecla no es un carácter numérico ni un punto decimal, consume el evento para evitar que se ingrese.
    *
    * @param evt El evento de teclado que desencadenó la llamada a este método.
    */
    public void validarEntero(KeyEvent evt) {
        char tecla = evt.getKeyChar();    
            
        if (!Character.isDigit(tecla) && tecla != '.') {
            evt.consume();
        }
    }
    
    /**
     * Convierte el carácter ingresado a mayúscula y lo agrega al JTextField.
     * 
     * @param evt El evento KeyEvent generado por la pulsación de tecla.
     * @param jTextField El JTextField al cual se desea agregar el carácter en mayúscula.
     */
    public void convertirMayuscula(KeyEvent evt, JTextField jTextField) {
        char tecla = evt.getKeyChar();
        char teclaMayuscula = Character.toUpperCase(tecla);
        
        if (Character.isLetter(tecla)) {
            jTextField.setText(jTextField.getText() + teclaMayuscula);
            evt.consume();
        }
    }
    
    /**
     * Cambia el color del texto de los componentes en un JPanel a negro.
     * 
     * @param panel El JPanel que contiene los componentes a los cuales se les cambiará el color del texto.
     */
    public void cambiarColorTexto(JPanel panel) {
        Component[] componentes = panel.getComponents();
        
        for (Component componente : componentes) {
            if (componente instanceof Component && !(componente instanceof JLabel)) {
                componente.setForeground(Color.BLACK);
            }
        }
    }
}
