
package Formularios;

import Servicios.Proveedor_Servicios;
import entidades.Proveedor;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;



public class Consultar_Proveedores extends javax.swing.JInternalFrame {

   
    public Consultar_Proveedores() {
        initComponents();
         this.getContentPane().setBackground(Color.lightGray);
         tabla();
    }
  private TableRowSorter trsFiltro;
public void filtro() {
        int columnaABuscar = 0;
        if (comboFiltro.getSelectedItem() == "NOMBRE") {
            columnaABuscar = 2;
        }
        if (comboFiltro.getSelectedItem().toString() == "DIRECCION") {
            columnaABuscar = 3;
        }
        
        trsFiltro.setRowFilter(RowFilter.regexFilter(t1.getText(), columnaABuscar));
    } 
   public void tabla(){
   int co=0;
        Proveedor c = new Proveedor();
        Proveedor_Servicios cs = new Proveedor_Servicios();
        
        List<Proveedor> listu = new ArrayList();
         listu = cs.ConsultarTodo();
         
         String columnas[]={"N°","CEDULA","NOMBRE","DIRECCION","TELEFONO","CELULAR","EMAIL","DESCRIPCION"};
         DefaultTableModel tm=new DefaultTableModel(null,columnas);
         tabla1.setModel(tm);
         
         for (Proveedor elem : listu) {
         co++;
             String registro []={Integer.toString(co),elem.getRuc(),elem.getNombre(),elem.getDireccion(),elem.getTelefono(),elem.getCelular(),elem.getEmail(),elem.getDescripcion()};
            tm.addRow(registro);
        }
          tabla1.setModel(tm);     
   
   
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox<>();
        t1 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        tabla1.setBackground(new java.awt.Color(102, 102, 102));
        tabla1.setForeground(new java.awt.Color(255, 255, 0));
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
        jScrollPane1.setViewportView(tabla1);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 153, 0));
        jLabel8.setText("PROVEEDORES REGISTRADOS");

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOMBRE", "DIRECCION" }));

        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel8)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
