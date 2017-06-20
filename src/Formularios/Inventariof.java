
package Formularios;


import Dao.Dao_categoria;
import Dao.Dao_marca;
import Dao.ParametroSistema_Dao;
import Servicios.Inventario_Servicios;
import entidades.Proveedor;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import Servicios.Proveedor_Servicios;
import entidades.Categoria;
import entidades.Inventario;
import entidades.Marca;
import entidades.Parametrossistema;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;


public class Inventariof extends javax.swing.JInternalFrame {

  
    public Inventariof() {
        initComponents();
          this.getContentPane().setBackground(Color.lightGray);
          proveedores();
          Tabla();
          CargarCombos();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cuadro = new javax.swing.JDialog();
        selector = new javax.swing.JFileChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        comboproveedor = new javax.swing.JComboBox();
        comboCategoria = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        comboMarca = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        fecha_caduca = new javax.swing.JSpinner();
        fecha_elaboracion = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();

        selector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cuadroLayout = new javax.swing.GroupLayout(cuadro.getContentPane());
        cuadro.getContentPane().setLayout(cuadroLayout);
        cuadroLayout.setHorizontalGroup(
            cuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuadroLayout.createSequentialGroup()
                .addComponent(selector, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cuadroLayout.setVerticalGroup(
            cuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selector, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setClosable(true);
        setIconifiable(true);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 153, 0));
        jLabel8.setText("PRODUCTOS");

        jLabel1.setText("CATEGORIA");

        jLabel7.setText("NOMBRE");

        jLabel2.setText("MARCA");

        jLabel3.setText("FECHA DE CADUCIDAD");

        jLabel4.setText("PRECIO COMPRA");

        jLabel5.setText("PROVEEDOR");

        jButton1.setText("NUEVO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("GUARDAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("MODIFICAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("ELIMINAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("BUSCAR POR NOMBRE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("CANTIDAD");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel9.setText("FECHA DE ELABORACION");

        fecha_caduca.setModel(new javax.swing.SpinnerDateModel());

        fecha_elaboracion.setModel(new javax.swing.SpinnerDateModel());

        jLabel11.setText("DESCRIPCION");

        jLabel13.setText("PRECIO VENTA");

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
        jScrollPane2.setViewportView(jTable1);

        jButton6.setText("EXAMNINAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(448, 448, 448)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel13)
                            .addComponent(jLabel6))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jButton6)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel5)
                        .addGap(19, 19, 19)
                        .addComponent(comboproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(fecha_elaboracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton3)
                        .addGap(19, 19, 19)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel11)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(fecha_caduca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton2)
                        .addGap(19, 19, 19)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(comboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel13)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel6)))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(fecha_elaboracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton5))))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3)
                            .addComponent(fecha_caduca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jButton4))))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        t1.enable();
        
        t4.enable();
        t5.enable();
        
    }//GEN-LAST:event_jButton1ActionPerformed
public void proveedores(){

    Proveedor p = new Proveedor();
    Proveedor_Servicios ps = new Proveedor_Servicios();
    
    List<Proveedor> listu = new ArrayList();
         listu = ps.ConsultarTodo();
         
         for (Proveedor elem : listu) {
         
          comboproveedor.addItem(elem.getNombre());
        }


}
public void CargarCombos(){
        comboCategoria.setModel(new Dao_categoria().LlenarCombo());
        comboMarca.setModel(new Dao_marca().LlenarCombo());
    }
public void limpiar(){
    t1.setText(null);
    t6.setText(null);
    t4.setText(null);
    t5.setText(null);
    jTextArea1.setText("");
   
}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Inventario c = new Inventario();
        Inventario_Servicios cs = new Inventario_Servicios();
        
        Dao_categoria dc = new Dao_categoria();
        Categoria ca = new Categoria();
        
        Dao_marca dm = new Dao_marca();
        Marca m = new Marca();
            
        Proveedor p = new Proveedor();
        Proveedor_Servicios ps = new Proveedor_Servicios();

        try {
            
            p=ps.ConsultarPorNombre(comboproveedor.getSelectedItem().toString());
            ca=dc.consultarPorNombre(comboCategoria.getSelectedItem().toString());
            m=dm.consultarPorNombre(comboMarca.getSelectedItem().toString());
            
            c.setCodigoProveedor(p);
            c.setNombre(t1.getText());
            c.setCodigoCategoria(ca);
            c.setCodigoMarca(m);
            c.setDescripcion(jTextArea1.getText());
            
            c.setCantidad(Integer.parseInt(t4.getText()));
            c.setPrecioCompra(Double.parseDouble(t5.getText()));
            c.setPrecioVenta(Double.parseDouble(t6.getText()));
            c.setFechaEleboracion(fecha(fecha_elaboracion));
            c.setFechaCaducidad(fecha(fecha_caduca));
            c.setImagen(ruta);

            cs.guardar2(c);
            JOptionPane.showMessageDialog(rootPane, "GUARDADO");
            Tabla();
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Inventario c = new Inventario();
        Inventario_Servicios cs = new Inventario_Servicios();
        
        Dao_categoria dc = new Dao_categoria();
        Categoria ca = new Categoria();
        
        Dao_marca dm = new Dao_marca();
        Marca m = new Marca();
            
        Proveedor p = new Proveedor();
        Proveedor_Servicios ps = new Proveedor_Servicios();

        try {
            
            p=ps.ConsultarPorNombre(comboproveedor.getSelectedItem().toString());
            ca=dc.consultarPorNombre(comboCategoria.getSelectedItem().toString());
            m=dm.consultarPorNombre(comboMarca.getSelectedItem().toString());
            
            c.setCodigo(codigo);
            c.setCodigoProveedor(p);
            c.setNombre(t1.getText());
            c.setCodigoCategoria(ca);
            c.setCodigoMarca(m);
            c.setDescripcion(jTextArea1.getText());
            
            c.setCantidad(Integer.parseInt(t4.getText()));
            c.setPrecioCompra(Double.parseDouble(t5.getText()));
            c.setPrecioVenta(Double.parseDouble(t6.getText()));
            c.setFechaEleboracion(fecha(fecha_elaboracion));
            c.setFechaCaducidad(fecha(fecha_caduca));
            c.setImagen(ruta);
            
            cs.modificar(c);
            Tabla();
            JOptionPane.showMessageDialog(rootPane, "GUARDADO");
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Inventario c = new Inventario();
        Inventario_Servicios cs = new Inventario_Servicios();

        try {
            cs.Eliminar(codigo);
            JOptionPane.showMessageDialog(rootPane, "ELIMINADO");
            limpiar();
            Tabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        Inventario c = new Inventario();
        Inventario_Servicios cs = new Inventario_Servicios();

        try {
            c=cs.ConsultarPorNombre(t1.getText());
            codigo=c.getCodigo();
         //   t2.setText(c.getCategoria());
          //  t3.setText(c.getMarca());
            t4.setText(Integer.toString(c.getCantidad()));
         //   t5.setText(Double.toString(c.getPrecio()));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void selectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorActionPerformed
        String op = evt.getActionCommand();
        if (op.equals(JFileChooser.APPROVE_SELECTION)) {
            File file = selector.getSelectedFile();
            try{
                ruta=RutaImagen(file.getName());
                FileInputStream fis = new FileInputStream(file.getPath()); //inFile -> Archivo a copiar
                FileOutputStream fos = new FileOutputStream(ruta); //outFile -> Copia del archivo
                FileChannel inChannel = fis.getChannel(); 
                FileChannel outChannel = fos.getChannel(); 
                inChannel.transferTo(0, inChannel.size(), outChannel); 
                fis.close(); 
                fos.close();
                
 
                ImageIcon icon = new ImageIcon(ruta); 
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jLabel12.getWidth(), jLabel12.getHeight(), Image.SCALE_DEFAULT));
                jLabel12.setIcon(icono); 
                this.repaint();
                 
                
            }catch (IOException ioe) {
                JOptionPane.showMessageDialog(rootPane, "ERROR INTENTELO NUEVAMENTE");
            }
        }
        cuadro.dispose();
    }//GEN-LAST:event_selectorActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        cuadro.setSize(800, 450);
        cuadro.setLocationRelativeTo(rootPane);
        cuadro.show();
    }//GEN-LAST:event_jButton6ActionPerformed
    public java.sql.Date fecha(JSpinner sp){
        Date Fecha = (Date) sp.getValue();
        java.sql.Date fecha = new java.sql.Date(Fecha.getYear(),Fecha.getMonth(),Fecha.getDate());
        return fecha;
    }
    public void Tabla() {
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
            jTable1.setModel(tm);
        } catch (Exception e) {
        }

    }
    public String RutaImagen(String foto){
        String ruta ="";
        ParametroSistema_Dao pd = new ParametroSistema_Dao();
        Parametrossistema p = new Parametrossistema();
        
        p = pd.consultarPorNombre("fotos productos");   
        
        ruta=p.getParametro()+foto;
        return ruta;
    }
String ruta="";
int codigo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboMarca;
    private javax.swing.JComboBox comboproveedor;
    private javax.swing.JDialog cuadro;
    private javax.swing.JSpinner fecha_caduca;
    private javax.swing.JSpinner fecha_elaboracion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JFileChooser selector;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}
