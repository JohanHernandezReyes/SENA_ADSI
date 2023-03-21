
package RegistroMarca;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.DefaultFormatterFactory;


public class FormRegistro extends javax.swing.JFrame {

    Conexion C = new Conexion();
    Connection cn =C.Conectar();
    NumberFormat Moneda = NumberFormat.getCurrencyInstance();
    
    public FormRegistro() {
        initComponents();
        TxtValor.setText(String.valueOf(Moneda.format(0)));

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtProductos = new javax.swing.JTextField();
        TxtValor = new javax.swing.JTextField();
        TxtLogo = new javax.swing.JTextField();
        TxtFechaReg = new com.toedter.calendar.JDateChooser();
        BtnNuevo = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnVolver = new javax.swing.JButton();
        BtnSelectImage = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Marca");
        setName("FormRegistrar"); // NOI18N

        jLabel1.setText("Nombre Marca:");
        jLabel1.setName("EtNombre"); // NOI18N

        jLabel2.setText("Fecha Registro:");
        jLabel2.setName("EtFecha"); // NOI18N

        jLabel3.setText("Productos:");
        jLabel3.setName("EtProductos"); // NOI18N

        jLabel4.setText("Valor en COP($):");
        jLabel4.setName("EtValor"); // NOI18N

        jLabel5.setText("Cargar Logo:");
        jLabel5.setName("EtLogo"); // NOI18N

        TxtNombre.setToolTipText("");
        TxtNombre.setName("TxtNombre"); // NOI18N
        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });

        TxtProductos.setToolTipText("");
        TxtProductos.setName("TxtProductos"); // NOI18N
        TxtProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtProductosActionPerformed(evt);
            }
        });

        TxtValor.setText("0");
        TxtValor.setToolTipText("");
        TxtValor.setName("TxtValor"); // NOI18N
        TxtValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtValorFocusLost(evt);
            }
        });
        TxtValor.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TxtValorInputMethodTextChanged(evt);
            }
        });
        TxtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtValorActionPerformed(evt);
            }
        });
        TxtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtValorKeyTyped(evt);
            }
        });

        TxtLogo.setToolTipText("");
        TxtLogo.setName("TxtLogo"); // NOI18N
        TxtLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtLogoActionPerformed(evt);
            }
        });

        TxtFechaReg.setName("Fecha"); // NOI18N

        BtnNuevo.setText("Nuevo");
        BtnNuevo.setName("BtnNuevo"); // NOI18N
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });

        BtnGuardar.setText("Guardar");
        BtnGuardar.setName("BtnGuardar"); // NOI18N
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnVolver.setText("Volver");
        BtnVolver.setName("BtnNuevo"); // NOI18N
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });

        BtnSelectImage.setText("jToggleButton1");
        BtnSelectImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSelectImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(TxtLogo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnSelectImage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtValor))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtFechaReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtProductos))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNombre))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(TxtFechaReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSelectImage))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

    private void TxtProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtProductosActionPerformed

    private void TxtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtValorActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        
        String SQL = "INSERT INTO marcas.marcas(NombreMarca,FechaRegistro,Valor,Logo,Productos) VALUES(?,?,?,?,?);";  
        
        try{
            PreparedStatement pst = cn.prepareCall(SQL);
            pst.setString(1,TxtNombre.getText());
            java.util.Date Fecha = TxtFechaReg.getDate();
            java.sql.Date dateSql= new java.sql.Date(Fecha.getTime());
            pst.setDate(2, dateSql);
            pst.setDouble(3,Double.valueOf(TxtValor.getText().replace("$ ", "").replace(".", "").replace(",", ".")));
            try{
                byte[] Logo = Files.readAllBytes(Path.of(TxtLogo.getText()));
                pst.setBytes(4,Logo);
            }
            catch(IOException e) {
                e.printStackTrace();
            }
            pst.setString(5, TxtProductos.getText());
            pst.executeUpdate();
            System.out.println(pst);
            JOptionPane.showMessageDialog(null, "Valor registrado en la BD", "OK",  1);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        TxtNombre.setText("");
        TxtProductos.setText("");
        TxtValor.setText("");
        TxtFechaReg.cleanup();
        TxtLogo.setText("");
        TxtNombre.requestFocus();
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        this.setVisible(false);
        Inicio Home = new Inicio();
        Home.setVisible(true);
    }//GEN-LAST:event_BtnVolverActionPerformed

    private void TxtLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLogoActionPerformed

    private void BtnSelectImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSelectImageActionPerformed
        JFileChooser selectlogo = new JFileChooser();
        FileNameExtensionFilter filter= new FileNameExtensionFilter("jpg, jpeg, png & gif","jpg", "jpeg", "png", "gif");
        selectlogo.setFileFilter(filter);
        
        if (selectlogo.showOpenDialog(this)== JFileChooser.APPROVE_OPTION){
            TxtLogo.setText(selectlogo.getSelectedFile().getPath());
      
        }
    }//GEN-LAST:event_BtnSelectImageActionPerformed

    private void TxtValorInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TxtValorInputMethodTextChanged
        
    }//GEN-LAST:event_TxtValorInputMethodTextChanged

    private void TxtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtValorKeyTyped
       
    }//GEN-LAST:event_TxtValorKeyTyped

    private void TxtValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtValorFocusLost
        Double newval = Double.valueOf(TxtValor.getText());
        TxtValor.setText(String.valueOf(Moneda.format(newval)));
    }//GEN-LAST:event_TxtValorFocusLost

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JToggleButton BtnSelectImage;
    private javax.swing.JButton BtnVolver;
    private com.toedter.calendar.JDateChooser TxtFechaReg;
    private javax.swing.JTextField TxtLogo;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtProductos;
    private javax.swing.JTextField TxtValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
