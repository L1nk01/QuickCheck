package clases;

import java.awt.event.KeyEvent;

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
}
