package Formularios;

import Dao.Dao_estadistica;
import Dao.Inventario_Dao;
import Dao.vld_textbox;
import Servicios.Inventario_Servicios;
import entidades.Estadisticas;
import entidades.Inventario;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.RowSorterListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Frm_Stock extends javax.swing.JInternalFrame {

    public Frm_Stock() {
        initComponents();
        LlenarTabla();
    
        /*  this.getContentPane().setBackground(fondo);
        this.jPanel1.setBackground(fondo);
        this.jTable1.setBackground(fondo);
        this.jTable1.setForeground(fuente);
        this.comboFiltro.setBackground(fondo);
        this.comboFiltro.setForeground(fuente);
        this.jLabel1.setForeground(fuente);
        this.jLabel2.setForeground(fuente);
        this.txtstock.setForeground(fuente);
        this.txtfiltro.setForeground(fuente);
        this.txtstock.setBackground(fondo);
        this.txtfiltro.setBackground(fondo);*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        comboFiltro = new javax.swing.JComboBox<>();
        txtfiltro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtstock = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("COMPRAS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(790, 50));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboFiltro.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DESCRIPCION", "MARCA", "CATEGORIA", "TIPO", "PRECIO", "STOCK", " " }));
        jPanel1.add(comboFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, -1));

        txtfiltro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtfiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfiltroKeyTyped(evt);
            }
        });
        jPanel1.add(txtfiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 160, 30));

        jLabel2.setText("STOCK");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        txtstock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtstockKeyTyped(evt);
            }
        });
        jPanel1.add(txtstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 70, 30));

        jButton1.setText("AGREGAR ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 90, 30));

        jButton2.setText("GUARDAR CAMBIOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 23, 160, 30));

        jLabel3.setText("CLICK AL PRODUCTO QUE DESEA AUMENTAR EL STOCK");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable2KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel5.setText("PRODUCTOS A LOS QUE SE LES VA A AUMENTAR EL STOCK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltroKeyTyped

        txtfiltro.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtfiltro.getText());
                txtfiltro.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtfiltroKeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int filaVista = jTable1.getSelectedRow();
        if (filaVista < 0) {
        } else {
            int filaModelo = jTable1.convertRowIndexToModel(filaVista);

            TableModel modelo = null;
            modelo = jTable1.getModel();
            int codigo = Integer.parseInt(modelo.getValueAt(filaModelo, 0).toString());

            p = new Inventario();
            Inventario_Dao dp = new Inventario_Dao();
            p = dp.consultarPorpk(codigo);
            CargaImagen(p.getImagen());
        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (!Validar()) {
                return;
            }
            int c = 0;

            c = Integer.parseInt(txtstock.getText().trim());
            p.setCantidad(c);
            tblModificados(p);
            p = null;
            txtstock.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR :" + e.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtstockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstockKeyTyped
        new vld_textbox().soloNumeros(evt);
    }//GEN-LAST:event_txtstockKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Boolean confirma=true;
        TableModel modelo = null;
        modelo = jTable2.getModel();
        int filas = modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            int codigo = Integer.parseInt(modelo.getValueAt(i, 0).toString());

            p = new Inventario();
            Inventario_Servicios cs = new Inventario_Servicios();
            p = cs.ConsultarPorpk(codigo);

            int c = p.getCantidad()+Integer.parseInt(modelo.getValueAt(i, 8).toString().trim());
            p.setCantidad(c);
                if (cs.modificar(p)) {  
                    p = null;       
                } else {
                    JOptionPane.showMessageDialog(rootPane, "error");
                    confirma=false;
                }
          
        }
        if(confirma){
            String columnas[] = {"CODIGO", "NOMBRE", "DESCRIPCION", "CATEGORIA", "MARCA", "PROVEEDOR", "FECHA ELABORACION", "FECHA CADUCIDAD", "STOCK", "PRECIO COMPRA", "PRECIO VENTA"};
            tm1 = new DefaultTableModel(null, columnas);
            jTable2.setModel(tm1);
            LlenarTabla();
            JOptionPane.showMessageDialog(rootPane,"GUARDADO CON EXITO");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int filaVista = jTable2.getSelectedRow();
        if (filaVista < 0) {
        } else {
            int filaModelo = jTable2.convertRowIndexToModel(filaVista);

            TableModel modelo = null;
            modelo = jTable2.getModel();
            int codigo = Integer.parseInt(modelo.getValueAt(filaModelo, 0).toString());

            p = new Inventario();
            Inventario_Dao dp = new Inventario_Dao();
            p = dp.consultarPorpk(codigo);
            CargaImagen(p.getImagen());

        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyReleased
        if (jTable2.getSelectedRows().length > 0) {
            int filaVista = jTable2.getSelectedRow();
            if (filaVista < 0) {
            } else {
                int filaModelo = jTable2.convertRowIndexToModel(filaVista);

                TableModel modelo = null;
                modelo = jTable2.getModel();
                int codigo = Integer.parseInt(modelo.getValueAt(filaModelo, 0).toString());

                p = new Inventario();
                Inventario_Dao dp = new Inventario_Dao();
                p = dp.consultarPorpk(codigo);
                CargaImagen(p.getImagen());

            }
        }
    }//GEN-LAST:event_jTable2KeyReleased

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        if (jTable1.getSelectedRows().length > 0) {
            int filaVista = jTable1.getSelectedRow();
            if (filaVista < 0) {
            } else {
                int filaModelo = jTable1.convertRowIndexToModel(filaVista);

                TableModel modelo = null;
                modelo = jTable1.getModel();
                int codigo = Integer.parseInt(modelo.getValueAt(filaModelo, 0).toString());

                p = new Inventario();
                Inventario_Dao dp = new Inventario_Dao();
                p = dp.consultarPorpk(codigo);
                CargaImagen(p.getImagen());

            }
        }
    }//GEN-LAST:event_jTable1KeyReleased

    public void LlenarTabla() {

        try {
            String columnas[] = {"CODIGO", "NOMBRE", "DESCRIPCION", "CATEGORIA", "MARCA", "PROVEEDOR", "FECHA ELABORACION", "FECHA CADUCIDAD", "STOCK", "PRECIO COMPRA", "PRECIO VENTA"};
            DefaultTableModel tm = new DefaultTableModel(null, columnas);
            jTable2.setModel(tm1);
            Inventario_Servicios cs = new Inventario_Servicios();
            List<Inventario> lista = new ArrayList();
            lista = cs.ConsultarTodo();

            for (Inventario p : lista) {
                String registros[] = {p.getCodigo().toString(), p.getNombre(), p.getDescripcion(), p.getCodigoCategoria().getNombre(), p.getCodigoMarca().getNombre(), p.getCodigoProveedor().getNombre(), p.getFechaEleboracion().toString(), p.getFechaCaducidad().toString(), p.getCantidad() + "", p.getPrecioCompra().toString(), p.getPrecioVenta().toString()};
                tm.addRow(registros);
            }
            jTable1.setModel(tm);
        } catch (Exception e) {
        }

    }

    public void filtro() {
        int columnaABuscar = 0;
        if (comboFiltro.getSelectedItem().toString() == "DESCRIPCION") {
            columnaABuscar = 1;
        }
        if (comboFiltro.getSelectedItem().toString() == "MARCA") {
            columnaABuscar = 2;
        }
        if (comboFiltro.getSelectedItem().toString() == "CATEGORIA") {
            columnaABuscar = 3;
        }
        if (comboFiltro.getSelectedItem().toString() == "TIPO") {
            columnaABuscar = 4;
        }
        if (comboFiltro.getSelectedItem().toString() == "STOCK") {
            columnaABuscar = 5;
        }
        if (comboFiltro.getSelectedItem().toString() == "PRECIO") {
            columnaABuscar = 6;
        }

        trsFiltro.setRowFilter(RowFilter.regexFilter(txtfiltro.getText(), columnaABuscar));
    }

    public void tblModificados(Inventario in) {
        try {
            if (co > 0) {
                tm1 = new DefaultTableModel(null, columnas);
                co = co - 1;
            } else {

                String registros[] = {in.getCodigo().toString(), in.getNombre(), in.getDescripcion(), in.getCodigoCategoria().getNombre(), in.getCodigoMarca().getNombre(), in.getCodigoProveedor().getNombre(), in.getFechaEleboracion().toString(), in.getFechaCaducidad().toString(), in.getCantidad() + "", in.getPrecioCompra().toString(), in.getPrecioVenta().toString()};
                tm1.addRow(registros);
                jTable2.setModel(tm1);
            }
        } catch (Exception e) {
        }
    }

    public void CargaImagen(String ruta) {
        ImageIcon icon = new ImageIcon(ruta);
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
        jLabel4.setIcon(icono);
        this.repaint();
    }

    public Boolean Validar() {
        Boolean confirma = false;
        vld_textbox v = new vld_textbox();
        JTextField campos[] = {txtstock};
        if (v.camposLlenos(campos)) {
            if (p != null) {
                confirma = true;
            } else {
                JOptionPane.showMessageDialog(rootPane, "SELECCIONE UN PRODUCTO EN LA TABLA");
                confirma = false;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "LLENE TODOS LOS CAMPOS");
            confirma = false;
        }

        return confirma;
    }
    int co = 0;
    String columnas[] = {"CODIGO", "NOMBRE", "DESCRIPCION", "CATEGORIA", "MARCA", "PROVEEDOR", "FECHA ELABORACION", "FECHA CADUCIDAD", "STOCK", "PRECIO COMPRA", "PRECIO VENTA"};
    DefaultTableModel tm1 = new DefaultTableModel(null, columnas);
    Inventario p;
    private TableRowSorter trsFiltro;
    public static Color fondo = new Color(51, 51, 51);
    public static Color fuente = new Color(0, 0, 0);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtfiltro;
    private javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables
}
