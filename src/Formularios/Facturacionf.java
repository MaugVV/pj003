
package Formularios;

import Servicios.Comprador_Servicios;
import Servicios.Detalle_Servicios;
import Servicios.Factura_Servicios;
import Servicios.Inventario_Servicios;
import Servicios.Sucursal_Servicios;
import Servicios.Vendedor_Servicios;
import entidades.Comprador;

import entidades.Detalle;
import entidades.Factura;
import entidades.Inventario;
import entidades.Sucursal;
import entidades.Vendedor;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Facturacionf extends javax.swing.JInternalFrame {

    public Facturacionf() {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
         txtFecha.setText(fechaActual());
         productos();
         sucursales();
         vendedores();
         numeroFactura();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        labelNumero = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        comboproducto = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        combosucursal = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        combovendedor = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDato = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtsub = new javax.swing.JTextField();
        txtiva = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel10.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("MINIMARKET \"JUAN\"");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("FECHA:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        txtFecha.setBackground(new java.awt.Color(51, 51, 51));
        txtFecha.setForeground(new java.awt.Color(255, 255, 0));
        txtFecha.setEnabled(false);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 150, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("FACTURA N°");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        labelNumero.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        labelNumero.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(labelNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 70, 40));

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 0));
        jLabel18.setText("CEDULA");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("NOMBRE");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("APELLIDO");

        t1.setBackground(new java.awt.Color(51, 51, 51));
        t1.setForeground(new java.awt.Color(255, 255, 0));
        t1.setEnabled(false);

        t2.setBackground(new java.awt.Color(51, 51, 51));
        t2.setForeground(new java.awt.Color(255, 255, 0));
        t2.setEnabled(false);

        t3.setBackground(new java.awt.Color(51, 51, 51));
        t3.setForeground(new java.awt.Color(255, 255, 0));
        t3.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("DIRECCION");

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setText("TELEFONO");

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 0));
        jLabel19.setText("CELULAR");

        t4.setBackground(new java.awt.Color(51, 51, 51));
        t4.setForeground(new java.awt.Color(255, 255, 0));
        t4.setEnabled(false);

        t5.setBackground(new java.awt.Color(51, 51, 51));
        t5.setForeground(new java.awt.Color(255, 255, 0));
        t5.setEnabled(false);

        t6.setBackground(new java.awt.Color(51, 51, 51));
        t6.setForeground(new java.awt.Color(255, 255, 0));
        t6.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 0));
        jLabel17.setText("EMAIL");

        t7.setBackground(new java.awt.Color(51, 51, 51));
        t7.setForeground(new java.awt.Color(255, 255, 0));
        t7.setEnabled(false);

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setForeground(new java.awt.Color(255, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/document-preview (1).png"))); // NOI18N
        jButton5.setText("BUSCAR CLEINTE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 153, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("PRODUCTO");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel2.add(comboproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 160, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("CANTIDAD");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        txtcantidad.setEnabled(false);
        jPanel2.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 160, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("SUCURSAL");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jPanel2.add(combosucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 160, -1));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("VENDEDOR");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jPanel2.add(combovendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 160, -1));

        TablaDato.setBackground(new java.awt.Color(0, 51, 51));
        TablaDato.setForeground(new java.awt.Color(255, 255, 0));
        TablaDato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DESCRIPCION", "CANTIDAD", "PRECIO"
            }
        ));
        jScrollPane2.setViewportView(TablaDato);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 0));
        jLabel14.setText("subtotal:");

        txtsub.setBackground(new java.awt.Color(51, 51, 51));
        txtsub.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtsub.setForeground(new java.awt.Color(255, 255, 0));
        txtsub.setEnabled(false);
        txtsub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsubMouseClicked(evt);
            }
        });

        txtiva.setBackground(new java.awt.Color(51, 51, 51));
        txtiva.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtiva.setForeground(new java.awt.Color(255, 255, 0));
        txtiva.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 0));
        jLabel15.setText("I.V.A");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setText("Total factura");

        txttotal.setBackground(new java.awt.Color(51, 51, 51));
        txttotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txttotal.setForeground(new java.awt.Color(255, 255, 0));
        txttotal.setEnabled(false);
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Folder Black User.png"))); // NOI18N
        jButton2.setText("NUEVO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/favourite.png"))); // NOI18N
        jButton4.setText("ADD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel10))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel18)
                .addGap(30, 30, 30)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addGap(16, 16, 16)
                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel17)
                .addGap(23, 23, 23)
                .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel13)
                .addGap(19, 19, 19)
                .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel19)
                .addGap(1, 1, 1)
                .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jButton5))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(jLabel14)
                        .addGap(11, 11, 11)
                        .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jLabel15)
                .addGap(15, 15, 15)
                .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel16)
                .addGap(8, 8, 8)
                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addComponent(jButton4))
            .addGroup(layout.createSequentialGroup()
                .addGap(580, 580, 580)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public static String fechaActual() {
        Date Fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(Fecha);

    }
 public void productos(){
    
    
    
     List<Inventario> listu = new ArrayList();
     listu = ps.ConsultarTodo();
     
      for (Inventario elem : listu) {
        comboproducto.addItem(elem.getNombre());
        }

}
 public void sucursales(){

   
    List<Sucursal> listu = new ArrayList();
     listu = ss.ConsultarTodo();
     
      for (Sucursal elem : listu) {
       
          combosucursal.addItem(elem.getNombre());
        }

}
public void vendedores(){

    List<Vendedor> listu = new ArrayList();
     listu = es.ConsultarTodo();
     
      for (Vendedor elem : listu) {
       
          combovendedor.addItem(elem.getNombre());
        }

}
    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
       
    }//GEN-LAST:event_txtFechaActionPerformed
public void numeroFactura(){
    int n=0;
    Factura f = new Factura();
    Factura_Servicios fs = new Factura_Servicios();
    List<Factura> listu = new ArrayList();
     listu = fs.ConsultarTodo();
     
     for (Factura elem : listu) {
       if(elem.getCodigo()>n){
           n=elem.getCodigo();
       }
        
     }
     labelNumero.setText(Integer.toString(n+1));
}
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        Comprador c = new Comprador();
            Comprador_Servicios cs = new Comprador_Servicios();

        try {
            c=cs.ConsultarPorCedula(t1.getText());

            t2.setText(c.getNombre());
            t3.setText(c.getApellido());
            t4.setText(c.getDireccion());
            t5.setText(c.getTelefono());
            t6.setText(c.getCelular());
            t7.setText(c.getEmail());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "cliente no registrado");
        }

    }//GEN-LAST:event_jButton5ActionPerformed
public void limpiar(){

   
        String columnas[]={"DESCRIPCION","CANTIDAD","PRECIO"};
        DefaultTableModel tm=new DefaultTableModel(null,columnas);  
         TablaDato.setModel(tm);
         
            t2.setText("");
           
            t1.setText("");
            t3.setText("");          
            txtcantidad.setText("");
            txtsub.setText("");
            txttotal.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
           
            co++;
            st=0.0;
            t=0.0;
}
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        p=ps.ConsultarPorNombre(comboproducto.getSelectedItem().toString());
        if(co>0){
            tm = new DefaultTableModel(null,columnas);
            co=co-1;
        }else{

            String registro []={comboproducto.getSelectedItem().toString(),txtcantidad.getText(),Double.toString(p.getPrecioVenta())};

            tm.addRow(registro);

            TablaDato.setModel(tm);

            st+=Double.parseDouble(txtcantidad.getText())*p.getPrecioVenta();
            iva=st*0.14;
            t=Math.rint((st*0.14)+st);
            txtsub.setText(Double.toString(Math.rint(st)));
            txtiva.setText(Double.toString(Math.rint(iva)));
            txttotal.setText(Double.toString(Math.rint(t)));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtsubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsubMouseClicked

    }//GEN-LAST:event_txtsubMouseClicked

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed

    }//GEN-LAST:event_txttotalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            Factura cf = new Factura();
            Factura_Servicios cfs= new Factura_Servicios();

            TableModel modelo = TablaDato.getModel();
            int filas = modelo.getRowCount();

            Comprador c = new Comprador();
            Comprador_Servicios cs = new Comprador_Servicios();

            c=cs.ConsultarPorCedula(t1.getText());
            s=ss.ConsultarPorNombre(combosucursal.getSelectedItem().toString());
            e=es.ConsultarPorNombre(combovendedor.getSelectedItem().toString());
 
            cf.setCodigoCliente(c);
            cf.setCodigoSucursal(s);
            cf.setCodigoVendedor(e);
            cf.setFecha(txtFecha.getText());
            cf.setSubtotal(Double.parseDouble(txtsub.getText()));
            cf.setIva(Double.parseDouble(txtiva.getText()));
            cf.setTotal(Double.parseDouble(txttotal.getText()));
            cfs.guardar2(cf);

            for(int i=0;i<filas;i++){

                Detalle df = new Detalle();
                Detalle_Servicios dfs = new Detalle_Servicios();

                p=ps.ConsultarPorNombre(modelo.getValueAt(i,0).toString());

                df.setCodigoFactura(cf);
                df.setCantidad(Integer.parseInt(modelo.getValueAt(i,1).toString()));
                df.setCodigoProducto(p);
                df.setPrecio(Double.parseDouble(modelo.getValueAt(i,2).toString()));

                dfs.guardar2(df);
            }

            JOptionPane.showMessageDialog(null,"FACTURA REGISTRADA");
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERRO AL GUARDAR");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        t1.enable();
        txtcantidad.enable();
        t2.enable();
        t3.enable();
        t4.enable();
        t5.enable();
        t6.enable();
        t7.enable();
        String columnas[]={"DESCRIPCION","CANTIDAD","PRECIO"};
        DefaultTableModel tm=new DefaultTableModel(null,columnas);
        TablaDato.setModel(tm);
    }//GEN-LAST:event_jButton2ActionPerformed
String columnas[]={"DESCRIPCION","CANTIDAD","PRECIO"};
          DefaultTableModel tm=new DefaultTableModel(null,columnas);  
        
 Double st=0.0;
 Double t,iva;
  int co=0;   
Sucursal_Servicios ss= new Sucursal_Servicios();
Sucursal s = new Sucursal();

Vendedor_Servicios es=new Vendedor_Servicios();
Vendedor e = new Vendedor();
 
Inventario p = new Inventario();
Inventario_Servicios ps = new Inventario_Servicios();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDato;
    private javax.swing.JComboBox<String> comboproducto;
    private javax.swing.JComboBox<String> combosucursal;
    private javax.swing.JComboBox<String> combovendedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtiva;
    private javax.swing.JTextField txtsub;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
