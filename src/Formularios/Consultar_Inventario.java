
package Formularios;

import Dao.Inventario_Dao;
import Servicios.Inventario_Servicios;
import entidades.Inventario;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class Consultar_Inventario extends javax.swing.JInternalFrame {

    public Consultar_Inventario() {
        initComponents();
        this.getContentPane().setBackground(Color.lightGray);
         tabla();
    }
    
      private TableRowSorter trsFiltro;
public void filtro() {
        int columnaABuscar = 0;
        if (comboFiltro.getSelectedItem() == "NOMBRE") {
            columnaABuscar = 1;
        }
        if (comboFiltro.getSelectedItem().toString() == "CATEGORIA") {
            columnaABuscar = 3;
        }
        
        trsFiltro.setRowFilter(RowFilter.regexFilter(t1.getText(), columnaABuscar));
    } 
public void tabla() {
        try {
           
            String columnas[] = {"CODIGO", "NOMBRE","DESCRIPCION","CATEGORIA","MARCA","PROVEEDOR","FECHA ELABORACION","FECHA CADUCIDAD","STOCK","PRECIO COMPRA","PRECIO VENTA","IMAGEN"};
            DefaultTableModel tm = new DefaultTableModel(null, columnas);

            Inventario_Servicios cs = new Inventario_Servicios();
            List<Inventario> lista = new ArrayList();
            lista = cs.ConsultarTodo();

            for (Inventario p : lista) {
                String registros[] = {p.getCodigo().toString(), p.getNombre(),p.getDescripcion(),p.getCodigoCategoria().getNombre(),p.getCodigoMarca().getNombre(),p.getCodigoProveedor().getNombre(),p.getFechaEleboracion().toString(),p.getFechaCaducidad().toString(),p.getCantidad()+"",p.getPrecioCompra().toString(),p.getPrecioVenta().toString(),p.getImagen()};
                tm.addRow(registros);
            }
            
            tabla1.setModel(tm);
        } catch (Exception e) {
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        comboFiltro = new javax.swing.JComboBox<>();
        t1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 153, 0));
        jLabel8.setText("INVENTARIO");

        jScrollPane1.setEnabled(false);

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N°", "Pantalla", "Descripcion"
            }
        ));
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        tabla1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabla1);

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOMBRE", "CATEGORIA" }));

        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(t1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.Alignment.LEADING, 0, 194, Short.MAX_VALUE))
                .addGap(173, 173, 173)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 440, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(438, 438, 438))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 124, Short.MAX_VALUE)
                        .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped

        t1.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (t1.getText());
                t1.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(tabla1.getModel());
        tabla1.setRowSorter(trsFiltro);
    }//GEN-LAST:event_t1KeyTyped

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        int filaVista = tabla1.getSelectedRow();
        if (filaVista < 0) {
        } else {
            int filaModelo = tabla1.convertRowIndexToModel(filaVista);

            TableModel modelo = null;
            modelo = tabla1.getModel();
            int codigo = Integer.parseInt(modelo.getValueAt(filaModelo, 0).toString());

            p = new Inventario();
            Inventario_Dao dp = new Inventario_Dao();
            p = dp.consultarPorpk(codigo);
            CargaImagen(p.getImagen());
        }
    }//GEN-LAST:event_tabla1MouseClicked

    private void tabla1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla1KeyReleased
                if( tabla1.getSelectedRows().length > 0 ) { 
                    int filaVista = tabla1.getSelectedRow();
                    if (filaVista < 0) {
                    } else {
                        int filaModelo = tabla1.convertRowIndexToModel(filaVista);

                        TableModel modelo = null;
                        modelo = tabla1.getModel();
                        int codigo = Integer.parseInt(modelo.getValueAt(filaModelo, 0).toString());

                        p = new Inventario();
                        Inventario_Dao dp = new Inventario_Dao();
                        p = dp.consultarPorpk(codigo);
                        CargaImagen(p.getImagen());
     
                    }
             }
    }//GEN-LAST:event_tabla1KeyReleased
    public void CargaImagen(String ruta){
                ImageIcon icon = new ImageIcon(ruta); 
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
                jLabel1.setIcon(icono); 
                this.repaint();
    }
Inventario p;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
