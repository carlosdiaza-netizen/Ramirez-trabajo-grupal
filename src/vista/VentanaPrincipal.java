package vista;

import java.awt.Dimension;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Carlos DEFINITIVO
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        
        pnlContenido.setLayout(new java.awt.BorderLayout());
        
        MenuInicio.setIcon(new javax.swing.ImageIcon("iconos/inicio.png"));
        MenuSobre.setIcon(new javax.swing.ImageIcon("iconos/sobrenosotros.png"));
        MenuNovedades.setIcon(new javax.swing.ImageIcon("iconos/novedades.png"));
        MenuMueblesMadera.setIcon(new javax.swing.ImageIcon("iconos/mueblesmadera.png"));
        MenuMueblesMelamine.setIcon(new javax.swing.ImageIcon("iconos/mueblesmelamine.png"));
        MenuContactanos.setIcon(new javax.swing.ImageIcon("iconos/contactanos.png"));
        
        // AGREGAR BORDES A LOS BOTONES
        javax.swing.border.Border borde=javax.swing.BorderFactory.createRaisedBevelBorder();
        btnNuevo.setBorder(borde);
        btnNuevo.setBackground(new java.awt.Color(200,200,200));
        btnNuevo.setOpaque(true);
        
        btnEditar.setBorder(borde);
        btnEditar.setBackground(new java.awt.Color(200,200,200));
        btnEditar.setOpaque(true);
        
        btnSalir.setBorder(borde);
        btnSalir.setBackground(new java.awt.Color(200,200,200));
        btnSalir.setOpaque(true);
        
         //Mejorar menu principal
        java.awt.Font fuenteMenu = new java.awt.Font("Segoe UI",java.awt.Font.BOLD,14);
        MenuInicio.setFont(fuenteMenu);
        MenuSobre.setFont(fuenteMenu);
        MenuNovedades.setFont(fuenteMenu);
        MenuMueblesMadera.setFont(fuenteMenu);
        MenuMueblesMelamine.setFont(fuenteMenu);
        MenuContactanos.setFont(fuenteMenu);
        
        //agregar iconos a los botones
        btnNuevo.setIcon(new javax.swing.ImageIcon("iconos/nuevo.png"));
        btnNuevo.setText("Nuevo");
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        
        btnEditar.setIcon(new javax.swing.ImageIcon("iconos/editar.png"));
        btnEditar.setText("Editar");
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
         
        btnSalir.setIcon(new javax.swing.ImageIcon("iconos/salir.png"));
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        
        //AUMENTAR DE FUENTES EN LOS BOTONES
        java.awt.Font fuenteGrande = new java.awt.Font("Segoe UI",java.awt.Font.BOLD,14);
        btnNuevo.setFont(fuenteGrande);
        btnEditar.setFont(fuenteGrande);
        btnSalir.setFont(fuenteGrande);
        
        //HACER MAS GRANDES LOS BOTONES DE TOOL BAR
        java.awt.Dimension tamaño=new java.awt.Dimension (80,350);
        btnNuevo.setPreferredSize(tamaño);
        btnNuevo.setMaximumSize(tamaño);
        
        btnEditar.setPreferredSize(tamaño);
        btnEditar.setMaximumSize(tamaño);
        
        btnSalir.setPreferredSize(tamaño);
        btnSalir.setMaximumSize(tamaño);
        //xd
        
        
        //botones de panel modulo
        Dimension tamañoBoton = new Dimension(180, 50);
        btnCliente.setPreferredSize(tamañoBoton);
        btnCliente.setMinimumSize(tamañoBoton);
        btnCliente.setMaximumSize(tamañoBoton);
        
        btnCliente.setIcon(new javax.swing.ImageIcon("iconos/cliente.png"));
        btnCliente.setText("Datos Cliente");
        btnCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        
        
        btnMetodopago.setPreferredSize(tamañoBoton);
        btnMetodopago.setMinimumSize(tamañoBoton);
        btnMetodopago.setMaximumSize(tamañoBoton);
        
        btnMetodopago.setIcon(new javax.swing.ImageIcon("iconos/metodopago.png"));
        btnMetodopago.setText("Metodo de pago");
        btnMetodopago.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        
        
        btnProgramarenvio.setPreferredSize(tamañoBoton);
        btnProgramarenvio.setMinimumSize(tamañoBoton);
        btnProgramarenvio.setMaximumSize(tamañoBoton);
        
        btnProgramarenvio.setIcon(new javax.swing.ImageIcon("iconos/programarenvio.png"));
        btnProgramarenvio.setText("Programar envios");
        btnProgramarenvio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        
        
        //Se  configura la ventana principal para permitir navegar con los paneles
        setLocationRelativeTo(null);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setTitle("Sistema de Gestión de Biblioteca");
         setSize(1000, 700);
        // cargar panel de libros por defecto
        cargarPanel(new VentanaDatosCliente());
    }
    
    
    //se creara la funcion cargaPanel
    private void cargarPanel(javax.swing.JPanel panel) {
    try {
        System.out.println("Intentando cargar panel: " + panel.getClass().getName());
        
        pnlContenido.removeAll();
        pnlContenido.add(panel, java.awt.BorderLayout.CENTER);
        pnlContenido.revalidate();
        pnlContenido.repaint();    
        System.out.println("✓ Panel cargado correctamente");
    } catch (Exception e) {
        System.err.println("✗ Error al cargar panel: " + e.getMessage());
        e.printStackTrace();
    }
    
    
}
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCliente = new javax.swing.JButton();
        btnMetodopago = new javax.swing.JButton();
        btnProgramarenvio = new javax.swing.JButton();
        pnlContenido = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuInicio = new javax.swing.JMenu();
        MenuSobre = new javax.swing.JMenu();
        MenuNovedades = new javax.swing.JMenu();
        MenuMueblesMadera = new javax.swing.JMenu();
        MenuMueblesMelamine = new javax.swing.JMenu();
        MenuContactanos = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnNuevo.setText("jButton1");
        jToolBar1.add(btnNuevo);

        btnEditar.setText("jButton2");
        jToolBar1.add(btnEditar);

        btnSalir.setText("jButton3");
        btnSalir.setFocusable(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSalir);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jLabel1.setText("Gestionar envios");

        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnMetodopago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetodopagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnMetodopago, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProgramarenvio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMetodopago, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProgramarenvio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pnlContenido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlContenidoLayout = new javax.swing.GroupLayout(pnlContenido);
        pnlContenido.setLayout(pnlContenidoLayout);
        pnlContenidoLayout.setHorizontalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );
        pnlContenidoLayout.setVerticalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MenuInicio.setText("Inicio");
        jMenuBar1.add(MenuInicio);

        MenuSobre.setText("Sobre nosotros");
        jMenuBar1.add(MenuSobre);

        MenuNovedades.setText("Novedades");
        jMenuBar1.add(MenuNovedades);

        MenuMueblesMadera.setText("Muebles de madera");
        jMenuBar1.add(MenuMueblesMadera);

        MenuMueblesMelamine.setText("Muebles de melamine");
        jMenuBar1.add(MenuMueblesMelamine);

        MenuContactanos.setText("Contactanos");
        jMenuBar1.add(MenuContactanos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(pnlContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMetodopagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMetodopagoActionPerformed
        cargarPanel(new VentanaMetodoPago());
    }//GEN-LAST:event_btnMetodopagoActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        cargarPanel(new VentanaDatosCliente());
    }//GEN-LAST:event_btnClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
                }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuContactanos;
    private javax.swing.JMenu MenuInicio;
    private javax.swing.JMenu MenuMueblesMadera;
    private javax.swing.JMenu MenuMueblesMelamine;
    private javax.swing.JMenu MenuNovedades;
    private javax.swing.JMenu MenuSobre;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnMetodopago;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnProgramarenvio;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel pnlContenido;
    // End of variables declaration//GEN-END:variables
}
