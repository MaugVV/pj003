
package Formularios;



import entidades.Factura;
import entidades.Sucursal;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import Servicios.Factura_Servicios;
import entidades.Comprador;
import entidades.Vendedor;

public class Consultar_Facturas extends javax.swing.JInternalFrame {

    public Consultar_Facturas() {
        initComponents();
         this.getContentPane().setBackground(Color.lightGray);
        tabla();
    }
    private TableRowSorter trsFiltro;
public void filtro() {
        int columnaABuscar = 0;
        if (comboFiltro.getSelectedItem() == "CLIENTE") {
            columnaABuscar = 1;
        }
        if (comboFiltro.getSelectedItem().toString() == "VENDEDOR") {
            columnaABuscar = 2;
        }
        
        trsFiltro.setRowFilter(RowFilter.regexFilter(t2.getText(), columnaABuscar));
    } 
    public void tabla(){
        
        Comprador cliente =null;
        Vendedor vendedor=null;
        Sucursal sucursal=null;
  
        Factura cf = new Factura(); 
        Factura_Servicios cfs= new Factura_Servicios();
 
        String columnas[]={"NUMERO DE FACTURA","CLIENTE","VENDEDOR","SUCURSAL","SUB TOTAL","IVA","TOTAL"};
        DefaultTableModel tm=new DefaultTableModel(null,columnas);
        TablaDato.setModel(tm);
    
        List<Factura> facturs = new ArrayList();
        facturs = cfs.ConsultarTodo();

              for (Factura elem : facturs) {
                  
                  vendedor=elem.getCodigoVendedor();
                  cliente=elem.getCodigoCliente();
                  sucursal=elem.getCodigoSucursal();
                  
                  String registro []={Integer.toString(elem.getCodigo()),cliente.getNombre(),vendedor.getNombre(),sucursal.getNombre(),Double.toString(elem.getSubtotal()),Double.toString(elem.getIva()),Double.toString(elem.getTotal())};
                    
                  tm.addRow(registro);
            

              }
             
      TablaDato.setModel(tm);
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDato = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        comboFiltro = new javax.swing.JComboBox<>();
        t2 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        TablaDato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "USUARIO", "CONTRASEÑA"
            }
        ));
        jScrollPane1.setViewportView(TablaDato);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("FACTURAS REGISTRADAS EN EL SISTEMA");

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 153));
        jLabel13.setText("CEDULA DE CLIENTE");

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CLIENTE", "VENDEDOR" }));

        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel13)
                        .addGap(16, 16, 16)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)
                        .addGap(20, 20, 20)
                        .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       
        Comprador cliente =null;
        Vendedor vendedor=null;
        Sucursal sucursal=null;
  
        Factura cf = new Factura(); 
        Factura_Servicios cfs= new Factura_Servicios();
 
        String columnas[]={"NUMERO DE FACTURA","CLIENTE","VENDEDOR","SUCURSAL","SUB TOTAL","IVA","TOTAL"};
        DefaultTableModel tm=new DefaultTableModel(null,columnas);
        TablaDato.setModel(tm);
    
        List<Factura> facturs = new ArrayList();
        facturs = cfs.ConsultarTodo();

              for (Factura elem : facturs) {
                  
                  vendedor=elem.getCodigoVendedor();
                  cliente=elem.getCodigoCliente();
                  sucursal=elem.getCodigoSucursal();
                  if(cliente.getCedula().equals(t1.getText().trim())){
                  String registro []={Integer.toString(elem.getCodigo()),cliente.getNombre(),vendedor.getNombre(),sucursal.getNombre(),Double.toString(elem.getSubtotal()),Double.toString(elem.getIva()),Double.toString(elem.getTotal())};
                    
                  tm.addRow(registro);
                  }

              }
             
      TablaDato.setModel(tm);
       
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyTyped

        t2.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (t2.getText());
                t2.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(TablaDato.getModel());
        TablaDato.setRowSorter(trsFiltro);
    }//GEN-LAST:event_t2KeyTyped
 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDato;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
