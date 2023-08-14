package ventanas;

import clases.MetodosTextField;
import clases.MetodosValidacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ecpau
 */
public class LoginForm extends javax.swing.JFrame {

    // Instancia de la clase MetodosValidacion para validar los campos del login
    MetodosValidacion mv = new MetodosValidacion();
    
    // Instancia de la clase MetodosTextField para establecer los textos predeterminados
    MetodosTextField mtf = new MetodosTextField();
    
    // Variable para almacenar la conexion que se genero en la clase main QuickCheck
    private Connection cn;
    
    // Variable para almacenar las coordenadas del mouse, se usa para calcular la posicion al arrastrar la ventana
    int mouseX, mouseY;
    
    /**
     * Crea una nueva instancia del formulario LoginForm.
     *
     * @param cn La conexión a la base de datos que se utilizará en el formulario.
     */
    public LoginForm(Connection cn) {
         // Asigna la conexión a la base de datos al atributo de la clase
        this.cn = cn;
        
        // Inicializa los componentes del formulario
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblNombreUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        contIniciarSesion = new javax.swing.JPanel();
        lblIniciarSesion = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        separador2 = new javax.swing.JSeparator();
        barraTitulo = new javax.swing.JPanel();
        contCerrar = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Ubuntu Medium", 1, 40)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(92, 164, 169));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Inicio de Sesión");

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });

        lblNombreUsuario.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreUsuario.setText("Nombre de Usuario");

        lblPassword.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 0, 0));
        lblPassword.setText("Contraseña");

        txtClave.setBackground(new java.awt.Color(255, 255, 255));
        txtClave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtClave.setForeground(new java.awt.Color(153, 153, 153));
        txtClave.setText("**********");
        txtClave.setBorder(null);
        txtClave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtClaveFocusGained(evt);
            }
        });
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClaveKeyPressed(evt);
            }
        });

        contIniciarSesion.setBackground(new java.awt.Color(92, 164, 169));

        lblIniciarSesion.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciarSesion.setText("Iniciar Sesión");
        lblIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIniciarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIniciarSesionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout contIniciarSesionLayout = new javax.swing.GroupLayout(contIniciarSesion);
        contIniciarSesion.setLayout(contIniciarSesionLayout);
        contIniciarSesionLayout.setHorizontalGroup(
            contIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        contIniciarSesionLayout.setVerticalGroup(
            contIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        separador1.setBackground(new java.awt.Color(0, 0, 0));
        separador1.setForeground(new java.awt.Color(0, 0, 0));

        separador2.setBackground(new java.awt.Color(0, 0, 0));
        separador2.setForeground(new java.awt.Color(0, 0, 0));

        barraTitulo.setBackground(new java.awt.Color(255, 255, 255));
        barraTitulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraTituloMouseDragged(evt);
            }
        });
        barraTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraTituloMousePressed(evt);
            }
        });

        contCerrar.setBackground(new java.awt.Color(255, 255, 255));

        lblCerrar.setFont(new java.awt.Font("UD Digi Kyokasho NP-B", 0, 18)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(0, 0, 0));
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quickcheck/assets/barra_titulo/icons8-close-20-black.png"))); // NOI18N
        lblCerrar.setAlignmentY(0.0F);
        lblCerrar.setAutoscrolls(true);
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout contCerrarLayout = new javax.swing.GroupLayout(contCerrar);
        contCerrar.setLayout(contCerrarLayout);
        contCerrarLayout.setHorizontalGroup(
            contCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        contCerrarLayout.setVerticalGroup(
            contCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barraTituloLayout = new javax.swing.GroupLayout(barraTitulo);
        barraTitulo.setLayout(barraTituloLayout);
        barraTituloLayout.setHorizontalGroup(
            barraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraTituloLayout.createSequentialGroup()
                .addComponent(contCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        barraTituloLayout.setVerticalGroup(
            barraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraTituloLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
            .addComponent(barraTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtClave)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addComponent(separador2)
                    .addComponent(separador1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(80, 80, 80))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addComponent(barraTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblTitulo)
                .addGap(50, 50, 50)
                .addComponent(lblNombreUsuario)
                .addGap(18, 18, 18)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblPassword)
                .addGap(18, 18, 18)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(contIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Eventos de la barra de título">
    private void barraTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraTituloMousePressed
        mouseX =  evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_barraTituloMousePressed

    private void barraTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraTituloMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_barraTituloMouseDragged
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Animaciones y eventos del botón cerrar">
    
    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseEntered
        contCerrar.setBackground(Color.red);
        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quickcheck/assets/barra_titulo/icons8-close-20-white.png")));
    }//GEN-LAST:event_lblCerrarMouseEntered

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseExited
        contCerrar.setBackground(Color.white);
        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quickcheck/assets/barra_titulo/icons8-close-20-black.png")));
    }//GEN-LAST:event_lblCerrarMouseExited
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Animaciones del botón iniciar sesión">
    
    private void lblIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarSesionMouseEntered
        contIniciarSesion.setBackground(new Color(111, 197, 203));
    }//GEN-LAST:event_lblIniciarSesionMouseEntered

    private void lblIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarSesionMouseExited
        contIniciarSesion.setBackground(new Color(92,164,169));
    }//GEN-LAST:event_lblIniciarSesionMouseExited
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Eventos para los campos del formulario">
    
    /**
     *
     * @param evt El evento de enfoque que desencadenó la acción.
     */
    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        mtf.establecerTextoPredeterminado(txtUsuario, "Ingrese su nombre de usuario");
    }//GEN-LAST:event_txtUsuarioFocusGained

    /**
     *
     * @param evt El evento de enfoque que desencadenó la acción.
     */
    private void txtClaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClaveFocusGained
        mtf.establecerTextoPredeterminado(txtClave, "**********");
    }//GEN-LAST:event_txtClaveFocusGained
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Evento del boton iniciar sesion">
    
    /**
     * Ejecuta el método iniciar sesión cuando se hace click en el botón iniciar sesión.
     * 
     * @param evt 
     */
    private void lblIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarSesionMouseClicked
        iniciarSesion();
    }//GEN-LAST:event_lblIniciarSesionMouseClicked

    /**
     * Ejecuta el método iniciar sesión cuando se presiona enter en el campo de usuario.
     * 
     * @param evt 
     */
    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            iniciarSesion();
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    /**
     * Ejecuta el método iniciar sesión cuando se presiona enter en el campo de contraseña.
     * 
     * @param evt 
     */
    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            iniciarSesion();
        }
    }//GEN-LAST:event_txtClaveKeyPressed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Declaracion de variables de los componentes">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraTitulo;
    private javax.swing.JPanel contCerrar;
    private javax.swing.JPanel contIniciarSesion;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Metodos para el inicio de sesión">
    /**
     * Verifica las credenciales de inicio de sesión en la base de datos.
     *
     * @param usuario El nombre de usuario proporcionado para iniciar sesión.
     * @param clave La contraseña proporcionada para iniciar sesión.
     * @return true si las credenciales son válidas y coinciden con la base de datos, false en caso contrario.
     */
    public boolean verificarCredenciales(String usuario, String clave) {
        String sql = "SELECT nombre_usuario, clave FROM usuarios WHERE nombre_usuario = ? AND clave = ?";
        
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            
            ps.setString(1, usuario);
            ps.setString(2, clave);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * Verifica si una cuenta de usuario está activa en la base de datos.
     * Comprueba si existe un registro de usuario con el nombre de usuario y la clave proporcionados,
     * y si el estado de la cuenta es 'Activa'.
     *
     * @param usuario El nombre de usuario de la cuenta que se desea verificar.
     * @param clave La clave de acceso de la cuenta que se desea verificar.
     * @return true si la cuenta está activa, false si no lo está o si ocurre un error durante la verificación.
     */
    public boolean verificarCuentaActiva(String usuario, String clave) {
        String sql = "SELECT estado_cuenta FROM usuarios WHERE nombre_usuario = ? AND clave = ? AND estado_cuenta = 'Activa'";
        
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, clave);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    /**
     * Verifica el nivel de acceso de un usuario en la base de datos.
     *
     * @param usuario El nombre de usuario proporcionado.
     * @param clave La contraseña proporcionada.
     * @return El nivel de acceso del usuario si las credenciales son válidas, o null si no coincide o hay un error.
     */
    public String verificarNivelAcceso(String usuario, String clave) {
        String sql = "SELECT nivel_acceso FROM usuarios WHERE nombre_usuario = ? AND clave = ?";
        String nivelAcceso;
        
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            
            ps.setString(1, usuario);
            ps.setString(2, clave);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                nivelAcceso = rs.getString(1);
                return nivelAcceso;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    /**
     * Realiza las siguientes acciones:
     * - Obtiene el nombre de usuario y la contraseña de los campos de entrada.- Valida si los campos de usuario y contraseña están vacíos, mostrando mensajes de error si es necesario.
     * - Verifica si las credenciales ingresadas son correctas (coinciden con la base de datos) o no.
     * - Dependiendo del nivel de acceso del usuario, muestra el formulario de menú correspondiente.
     * - Si las credenciales no son correctas, muestra un mensaje de error.
     */
    public void iniciarSesion() {
        String usuario = txtUsuario.getText();
        String clave = String.valueOf(txtClave.getPassword());
        
        if (mv.validarDatos(usuario, "Ingrese su nombre de usuario", "usuario") || mv.validarDatos(clave, "**********", "contraseña")) {
            return;
        }
        
        if (!verificarCredenciales(usuario, clave)) {
            JOptionPane.showMessageDialog(loginPanel,"El usuario o la clave son incorrectos", "Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!verificarCuentaActiva(usuario, clave)) {
            JOptionPane.showMessageDialog(loginPanel,"La cuenta ingresada está inactiva", "Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        switch (verificarNivelAcceso(usuario, clave)) {
            case "Administrador":
                MenuAdminForm menuAdminForm = new MenuAdminForm(cn);
                menuAdminForm.setVisible(true);
                menuAdminForm.setLocationRelativeTo(null);
                
                this.dispose();
                
                System.out.println("Conectado al panel de Administrador");
                break;
            case "Supervisor":
                System.out.println("Aún no está preparado");
                break;
            case "Inventario":
                System.out.println("Aún no está preparado");
                break;
            case "Cajero":
                System.out.println("Aún no está preparado");
                break;
        }
    }
    // </editor-fold>
}
