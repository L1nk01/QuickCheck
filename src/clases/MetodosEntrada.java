package clases;

import java.awt.event.KeyEvent;

/**
 *
 * @author ecpau
 */
public class MetodosEntrada {
    public void validarEntero(KeyEvent evt) {
        char tecla = evt.getKeyChar();    
            
        if (!Character.isDigit(tecla)) {
            evt.consume();
        }
    }
}
