
package Formularios;



import Dao.Pantalla_Dao;
import Dao.Perfiles_Dao;
import Servicios.Perfil_Pantalla_Servicios;
import entidades.Pantallas;
import entidades.Perfil;
import entidades.Perfilpantalla;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;




public class Frm_Perfil extends javax.swing.JInternalFrame {

    public Frm_Perfil() {
        initComponents();
        LLenarCombo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        t2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("PERFILES DEL SISTEMA");

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabla1.setBackground(new java.awt.Color(102, 102, 102));
        tabla1.setForeground(new java.awt.Color(255, 255, 0));
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N°", "Pantalla", "Opciones"
            }
        ));
        jScrollPane1.setViewportView(tabla1);

        t2.setBackground(new java.awt.Color(102, 102, 102));
        t2.setForeground(new java.awt.Color(255, 255, 0));
        t2.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel3.setText("PANTALLAS");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setText("PERFIL");

        t1.setBackground(new java.awt.Color(102, 102, 102));
        t1.setForeground(new java.awt.Color(255, 255, 0));
        t1.setEnabled(false);

        jButton2.setText("AGREGAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel7.setText("DESCRIPCION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(67, 67, 67)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(23, 23, 23)
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(37, 37, 37)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(7, 7, 7)
                        .addComponent(jButton3)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            TableModel modelo = tabla1.getModel();
            int filas = modelo.getRowCount();
            Perfiles_Dao ps= new Perfiles_Dao();
            Perfil p = new Perfil();
            
            
           
            p.setNombre(t1.getText());
            p.setDescripcion(t2.getText());
          
            ps.guardar2(p);
            
            for(int i=0;i<filas;i++){

                Pantallas df = new Pantallas();
                Pantalla_Dao dfs = new Pantalla_Dao();
                
                Perfilpantalla o = new Perfilpantalla();
                Perfil_Pantalla_Servicios od = new Perfil_Pantalla_Servicios();
                
                df=dfs.consultarPorNombre(modelo.getValueAt(i,1).toString());
                
                o.setCodigopantalla(df);
                o.setCodigoperfil(p);
                od.guardar2(o);
            }
            
            JOptionPane.showMessageDialog(null,"PERFIL REGISTRADO");
            t1.setText("");
            t2.setText("");
            
            
            String columnas[]={"PERFIL","PANTALLA"};
            DefaultTableModel tm=new DefaultTableModel(null,columnas);
            tabla1.setModel(tm);
            co++;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ocurrio un error");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        t1.enable();
        t2.enable();
      
       
        String columnas[]={"PERFIL","PANTALLA"};
        DefaultTableModel tm=new DefaultTableModel(null,columnas); 
        tabla1.setModel(tm);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(co>0){
            tm = new DefaultTableModel(null,columnas);
            co=co-1;
        }else{

            String registro []={t1.getText(),jComboBox2.getSelectedItem().toString()};
            tm.addRow(registro);
            tabla1.setModel(tm);

        }
    }//GEN-LAST:event_jButton2ActionPerformed
    public void LLenarCombo(){
       
        jComboBox2.setModel(new Pantalla_Dao().ObtenerPantallas());
    }
int co=0;
String columnas[]={"PERFIL","PANTALLA"};
DefaultTableModel tm=new DefaultTableModel(null,columnas);  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
