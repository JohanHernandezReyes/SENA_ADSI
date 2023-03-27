

package PeluqueriaCanina.IGU;

import PeluqueriaCanina.Logica.Controlador;
import PeluqueriaCanina.Logica.Mascota;
import PeluqueriaCanina.PeluqueriaCanina;
import java.util.List;
import javax.persistence.criteria.From;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JFrame {

    Controlador control = null;
    
    public VerDatos() {
        control = new Controlador();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblVerDatos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        BtnEliminar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Visualizar Datos");

        TblVerDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TblVerDatos);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Datos de la mascota:");

        BtnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\jh25\\OneDrive\\Escritorio\\PeluqueriaCanina\\delete.png")); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\jh25\\OneDrive\\Escritorio\\PeluqueriaCanina\\edit.png")); // NOI18N
        BtnEditar.setText("Editar");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnEditar)))
                .addGap(169, 169, 169))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargartabla();
    }//GEN-LAST:event_formWindowOpened

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        if (TblVerDatos.getRowCount()>0){
            if (TblVerDatos.getSelectedRow()!=-1){
                int id = Integer.parseInt(String.valueOf(TblVerDatos.getValueAt(TblVerDatos.getSelectedRow(), 0)));
                String nombre = String.valueOf(TblVerDatos.getValueAt(TblVerDatos.getSelectedRow(),2));
                control.borrarmascota(id);
                JOptionPane.showMessageDialog(null, "Se ha eliminado con éxito la mascota " + nombre, "Eliminado exitosamente", 1);
                cargartabla();
            }
            else{
                JOptionPane.showMessageDialog(null, "No Se ha seleccionado ninguna mascota para eliminar", "Advertencia", 2);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay datos para eliminar en la tabla", "Error",0);
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        Peluqueria Inicio = new Peluqueria();
        Inicio.setVisible(true);
        Inicio.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        if (TblVerDatos.getRowCount()>0){
            if (TblVerDatos.getSelectedRow()!=-1){
                int id = Integer.parseInt(String.valueOf(TblVerDatos.getValueAt(TblVerDatos.getSelectedRow(), 0)));
                EditarDatos FormEditar = new EditarDatos(id);
                FormEditar.setVisible(true);
                FormEditar.setLocationRelativeTo(null);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "No Se ha seleccionado ninguna mascota para modificar", "Advertencia", 2);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay datos para editar en la tabla", "Error",0);
        }
    }//GEN-LAST:event_BtnEditarActionPerformed
                              


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JTable TblVerDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void cargartabla() {
        DefaultTableModel modelotabla1 = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        String titulos [] = {"Num_Cliente", "Nombre", "Raza", "Color", "Alérgico", "At. Especial", "Nom_Dueño", "Cel"};        
        modelotabla1.setColumnIdentifiers(titulos);
        List <Mascota> listamascotas = control.vermascotas();
        
        if (listamascotas!=null){
            for (Mascota M : listamascotas){
                String alergico = "";
                if (M.isAlergico()){alergico = "Sí";}
                else {alergico = "No";}
                
                String atesp = "";
                if (M.isAtencion_especial()){atesp = "Sí";}
                else {atesp = "No";}
                
                Object[] Mascota1 = {M.getNum_cliente(), M.getNombre_perro(), M.getRaza(), M.getColor(),alergico , atesp,
                                M.getIdduenio().getNombre(), M.getIdduenio().getCelular()};
                modelotabla1.addRow(Mascota1);
            }
        }
        
        TblVerDatos.setModel(modelotabla1);
    }

}
