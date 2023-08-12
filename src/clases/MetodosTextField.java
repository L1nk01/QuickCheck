package clases;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Esta clase proporciona métodos para trabajar con componentes de texto (JTextField, JPasswordField y JTextArea)
 * 
 * @author ecpau
 */
public class MetodosTextField {
    /**
     * Establece un texto predeterminado en un JTextField y cambia su color de texto cuando obtiene o pierde el foco.
     * Si el JTextField ya contiene el texto predeterminado, el método lo limpia y cambia el color del texto a negro.
     * 
     * @param jTextField El JTextField en el que se establecerá el texto predeterminado.
     * @param textoPredeterminado El texto que se establecerá como predeterminado en el JTextField.
     */
    public void establecerTextoPredeterminado(JTextField jTextField, String textoPredeterminado) {
        if (jTextField.getText().equals(textoPredeterminado)) {
            jTextField.setText("");
            jTextField.setForeground(Color.black);
        }
        
        jTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {}
            
            @Override
            public void focusLost(FocusEvent e) {
                if (jTextField.getText().isEmpty()) {
                    jTextField.setText(textoPredeterminado);
                    jTextField.setForeground(new Color(143, 143, 143));
                }
            }
        });
    }
    
    /**
     * Establece un texto predeterminado en un JPasswordField y cambia su color de texto cuando obtiene o pierde el foco.
     * Si el JPasswordField ya contiene el texto predeterminado, el método lo limpia y cambia el color del texto a negro.
     * 
     * @param jPasswordField El JPasswordField en el que se establecerá el texto predeterminado.
     * @param textoPredeterminado El texto que se establecerá como predeterminado en el JPasswordField.
     */
    public void establecerTextoPredeterminado(JPasswordField jPasswordField, String textoPredeterminado) {
        char[] inputChars = jPasswordField.getPassword();
        String input = new String(inputChars);
        
        if (input.equals(textoPredeterminado)) {
            jPasswordField.setText("");
            jPasswordField.setForeground(Color.black);
        }
        
        jPasswordField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {}
            
            @Override
            public void focusLost(FocusEvent e) {
                if (input.isEmpty()) {
                    jPasswordField.setText(textoPredeterminado);
                    jPasswordField.setForeground(new Color(143, 143, 143));
                }
            }
        });
    }
    
    /**
     * Establece un texto predeterminado en un JTextArea y cambia su color de texto cuando obtiene o pierde el foco.
     * Si el JTextArea ya contiene el texto predeterminado, el método lo limpia y cambia el color del texto a negro.
     * 
     * @param jTextArea El JTextArea en el que se establecerá el texto predeterminado
     * @param textoPredeterminado El texto que se establecerá como predeterminado en el JTextArea.
     */
    public void establecerTextoPredeterminado(JTextArea jTextArea, String textoPredeterminado) {
        if (jTextArea.getText().equals(textoPredeterminado)) {
            jTextArea.setText("");
            jTextArea.setForeground(Color.black);
        }
        
        jTextArea.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {}
            
            @Override
            public void focusLost(FocusEvent e) {
                if (jTextArea.getText().isEmpty()) {
                    jTextArea.setText(textoPredeterminado);
                    jTextArea.setForeground(new Color(143, 143, 143));
                }
            }
        });
    }
}  

