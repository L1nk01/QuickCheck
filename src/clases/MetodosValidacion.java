package clases;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Clase que proporciona métodos para realizar validaciones en diferentes tipos de datos.
 * Incluye métodos para validar campos de texto, valores seleccionados en JComboBox, valores float y fechas.
 * 
 * @author Emmanuel Campos 2022-1855
 */

public class MetodosValidacion {
    /**
     * Valida si un texto está vacío y muestra un mensaje de error si es el caso.
     *
     * @param texto El texto a validar.
     * @param textoPredeterminado
     * @param nombreCampo El nombre del campo o dato que se está validando.
     * @return true si el texto está vacío, false si no está vacío.
     */
    public boolean validarDatos(String texto, String textoPredeterminado, String nombreCampo) {
        String mensaje = "El campo de " + nombreCampo + " no puede estar vacio";
        
        if (texto.trim().isEmpty() || texto.equals(textoPredeterminado)) {
            JOptionPane.showMessageDialog(null,mensaje, "Error",JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }
    
    /**
     * Valida si un numero no tiene ningun valor y muestra un mensaje de error si es el caso.
     *
     * @param numero El número a validar.
     * @param nombreCampo El nombre del campo o dato que se está validando.
     * @return true si el texto está vacío, false si no está vacío.
     */
    public boolean validarDatos(int numero, String nombreCampo) {
        String mensaje = "El campo de " + nombreCampo + " no puede estar vacio";
        
        if (numero < 1) {
            JOptionPane.showMessageDialog(null,mensaje, "Error",JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }
    
    /**
     * Valida si un campo de contraseña está vacío y muestra un mensaje de error si es el caso.
     *
     * @param jPasswordField
     * @param textoPredeterminado
     * @param nombreCampo El nombre del campo o dato que se está validando.
     * @return true si el texto está vacío, false si no está vacío.
     */
    public boolean validarDatos(JPasswordField jPasswordField, String textoPredeterminado, String nombreCampo) {
        String mensaje = "El campo de " + nombreCampo + " no puede estar vacio";
        String texto = String.valueOf(jPasswordField.getPassword());
        
        if (texto.trim().isEmpty() || texto.equals(textoPredeterminado)) {
            JOptionPane.showMessageDialog(null,mensaje, "Error",JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }
    
    /**
     * Valida si el valor seleccionado en un JComboBox es válido.Un valor se considera válido si no es igual a "Elegir".
     * 
     * @param input El valor seleccionado en el JComboBox que se desea validar.
     * @param nombreCampo
     * @return true si el valor seleccionado es válido, false si es igual a ''Elegir''.
     */
    public boolean validarComboBox(String input, String nombreCampo) {
        String mensaje = "El selector de " + nombreCampo + " no puede estar vacio";

        if (input == null || input.equals("Elegir")) {
            JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }
    
    /**
     * Valida si el valor float proporcionado es válido.
     * Un valor float se considera válido si no es igual a 0.
     *
     * @param input El valor float que se desea validar.
     * @param nombreCampo
     * @return true si el valor float es válido (distinto de 0), false si es igual a 0.
     */
    public boolean validarFloat(float input, String nombreCampo) {
        String mensaje = "El selector de " + nombreCampo + " no puede estar vacio";
        if (input == 0) {
            JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }
    
    /**
     * Valida si la fecha proporcionada es válida.
     * Una fecha se considera válida si no es nula (null).
     * 
     * @param fecha La fecha que se desea validar.
     * @return true si la fecha es válida (no es nula), false si es nula.
     */
    public boolean validarFecha(java.util.Date fecha) {
        return fecha != null;
    }
}
