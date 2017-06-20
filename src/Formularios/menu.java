package Formularios;

import entidades.Pantallas;
import entidades.Perfil;
import entidades.Perfilpantalla;
import java.util.ArrayList;
import java.util.List;
import Servicios.Pantallas_Servicios;

import Servicios.Perfil_Pantalla_Servicios;
import Servicios.Perfiles_Servicios;
import java.awt.Color;
import java.beans.PropertyVetoException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class menu extends javax.swing.JFrame {

    public menu(Perfil parametros) {
        initComponents();
        perf = parametros;
       
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

//      for(int a = 0 ;a<consultas.getItemCount();a++){ 
//            consultas.getItem(a).setVisible(false);
//     }for(int a = 0 ;a<admi.getItemCount();a++){ 
//            admi.getItem(a).setVisible(false);
//     }for(int a = 0 ;a<ventas.getItemCount();a++){ 
//            ventas.getItem(a).setVisible(false);
//     }for(int a = 0 ;a<registros.getItemCount();a++){ 
//            registros.getItem(a).setVisible(false);
//     }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        admi = new javax.swing.JMenu();
        menu = new javax.swing.JMenuItem();
        perfil = new javax.swing.JMenuItem();
        usuarios = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        ventas = new javax.swing.JMenu();
        mnufacturar = new javax.swing.JMenuItem();
        mnuconscliente = new javax.swing.JMenuItem();
        mnuconsfacturas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        registros = new javax.swing.JMenu();
        facultadmant1 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        consultas = new javax.swing.JMenu();
        estudiantemant1 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        consultaE1 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 0));
        jMenuBar1.setAutoscrolls(true);

        admi.setBackground(new java.awt.Color(0, 51, 51));
        admi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/admin.png"))); // NOI18N
        admi.setText("ADMINISTRADOR");
        admi.setName(""); // NOI18N

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/television.png"))); // NOI18N
        menu.setText("NUEVA PANTALLA");
        menu.setName("menu"); // NOI18N
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        admi.add(menu);

        perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sharing.png"))); // NOI18N
        perfil.setText("NUEVO PERFIL");
        perfil.setName("perfil"); // NOI18N
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });
        admi.add(perfil);

        usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        usuarios.setText("NUEVO USUARIO");
        usuarios.setName("usuarios"); // NOI18N
        usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosActionPerformed(evt);
            }
        });
        admi.add(usuarios);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit.png"))); // NOI18N
        jMenuItem5.setText("PARAMETROS");
        jMenuItem5.setName("sparametros"); // NOI18N
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        admi.add(jMenuItem5);

        jMenuBar1.add(admi);

        ventas.setBackground(new java.awt.Color(0, 51, 51));
        ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ebook.png"))); // NOI18N
        ventas.setText("VENTAS");

        mnufacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete archive.png"))); // NOI18N
        mnufacturar.setText("DESPACHADOR");
        mnufacturar.setName("mnufacturar"); // NOI18N
        mnufacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnufacturarActionPerformed(evt);
            }
        });
        ventas.add(mnufacturar);

        mnuconscliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/construction_worker_37654_1.png"))); // NOI18N
        mnuconscliente.setText("AUMENTAR STOCK");
        mnuconscliente.setName("mnuconsclientes"); // NOI18N
        mnuconscliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuconsclienteActionPerformed(evt);
            }
        });
        ventas.add(mnuconscliente);

        mnuconsfacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/document-preview (1).png"))); // NOI18N
        mnuconsfacturas.setText("CONSULTAR ESTADISTICAS");
        mnuconsfacturas.setName("mnuconsfacturas"); // NOI18N
        mnuconsfacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuconsfacturasActionPerformed(evt);
            }
        });
        ventas.add(mnuconsfacturas);

        jMenuBar1.add(ventas);

        jMenu2.setBackground(new java.awt.Color(0, 51, 51));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/settings.png"))); // NOI18N
        jMenu2.setText("MATENIMIENTO");

        registros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Folder Black User.png"))); // NOI18N
        registros.setText("REGISTROS");

        facultadmant1.setText("CLIENTES");
        facultadmant1.setName("mnuregclientes"); // NOI18N
        facultadmant1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultadmant1ActionPerformed(evt);
            }
        });
        registros.add(facultadmant1);

        jMenuItem10.setText("EMPLEADOS");
        jMenuItem10.setName("mnuregempleados"); // NOI18N
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        registros.add(jMenuItem10);

        jMenuItem11.setText("PROVEEDORES");
        jMenuItem11.setName("mnuregproveedores"); // NOI18N
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        registros.add(jMenuItem11);

        jMenuItem13.setText("INVENTARIO");
        jMenuItem13.setName("mnureginventario"); // NOI18N
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        registros.add(jMenuItem13);

        jMenuItem14.setText("SUCURSAL");
        jMenuItem14.setName("mnuregsucursal"); // NOI18N
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        registros.add(jMenuItem14);

        jMenuItem2.setText("CATEGORIAS Y MARCAS");
        jMenuItem2.setName("mnurmc"); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        registros.add(jMenuItem2);

        jMenu2.add(registros);

        consultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/document-preview (1).png"))); // NOI18N
        consultas.setText("CONSULTAS");

        estudiantemant1.setText("CONSULTAR CLIENTES");
        estudiantemant1.setName("mnuconsclientes"); // NOI18N
        estudiantemant1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudiantemant1ActionPerformed(evt);
            }
        });
        consultas.add(estudiantemant1);

        jMenuItem15.setText("CONSULTAR EMPLEADOS");
        jMenuItem15.setName("mnuconsempleados"); // NOI18N
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        consultas.add(jMenuItem15);

        consultaE1.setText("CONSULTAR PROVEEDORES");
        consultaE1.setName("mnuconsproveedores"); // NOI18N
        consultaE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaE1ActionPerformed(evt);
            }
        });
        consultas.add(consultaE1);

        jMenuItem16.setText("CONSULTAR FACTURAS");
        jMenuItem16.setName("mnuconsfacturas"); // NOI18N
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        consultas.add(jMenuItem16);

        jMenuItem17.setText("CONSULTAR INVENTARIO");
        jMenuItem17.setName("mnuconsinventario"); // NOI18N
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        consultas.add(jMenuItem17);

        jMenuItem18.setText("CONSULTAR SUCURSALES");
        jMenuItem18.setName("mnuconssucursales"); // NOI18N
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        consultas.add(jMenuItem18);

        jMenu2.add(consultas);

        jMenuBar1.add(jMenu2);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/security-on.png"))); // NOI18N
        jMenu1.setText("SISTEMA");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logout (2).png"))); // NOI18N
        jMenuItem3.setText("CERRAR SESION");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon.png"))); // NOI18N
        jMenuItem4.setText("SALIR");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        int c = perf.getCodigo();

        Perfiles_Servicios pers = new Perfiles_Servicios();
        Perfil per = new Perfil();

        Perfil_Pantalla_Servicios pps = new Perfil_Pantalla_Servicios();
        Perfilpantalla pp = new Perfilpantalla();

        Pantallas_Servicios ps = new Pantallas_Servicios();
        Pantallas p = new Pantallas();

        List<Perfilpantalla> listpp = new ArrayList();
        listpp = pps.ConsultarTodo();

        for (Perfilpantalla elem : listpp) {

            codigo_de_perfiles = elem.getCodigoperfil();
            if (codigo_de_perfiles.getCodigo() == c) {

                seleccion_pantallas_segun_codigo_perfil[indice] = elem.getCodigopantalla();
                indice++;

            }

        }

        List<Pantallas> listp = new ArrayList();
        listp = ps.ConsultarTodo();

        for (Pantallas elem : listp) {

            for (int i = 0; i < indice; i++) {

                if (seleccion_pantallas_segun_codigo_perfil[i].getCodigo() == elem.getCodigo()) {

                    for (int a = 0; a < consultas.getItemCount(); a++) {

                        if (consultas.getItem(a).getName().equals(elem.getCodigoMenu())) {
                            consultas.getItem(a).setVisible(true);
                        }
                    }
                    for (int b = 0; b < admi.getItemCount(); b++) {
                        if (admi.getItem(b).getName().equals(elem.getCodigoMenu())) {
                            admi.getItem(b).setVisible(true);
                        }
                    }
                    for (int b = 0; b < ventas.getItemCount(); b++) {
                        if (ventas.getItem(b).getName().equals(elem.getCodigoMenu())) {
                            ventas.getItem(b).setVisible(true);
                        }
                    }
                    for (int b = 0; b < registros.getItemCount(); b++) {
                        if (registros.getItem(b).getName().equals(elem.getCodigoMenu())) {
                            registros.getItem(b).setVisible(true);
                        }
                    }

                }
            }
        }


    }//GEN-LAST:event_formWindowOpened

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        Pantallasf pf = new Pantallasf();
        panel1.add(pf);
        pf.show();
    }//GEN-LAST:event_menuActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        login l = new login();
        l.show();
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        Frm_Perfil pf = new Frm_Perfil();
        panel1.add(pf);
        pf.show();

    }//GEN-LAST:event_perfilActionPerformed

    private void usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosActionPerformed
        Usuariosf pf = new Usuariosf();
        panel1.add(pf);
        pf.show();
    }//GEN-LAST:event_usuariosActionPerformed

    private void mnufacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnufacturarActionPerformed
        try {
            Frm_Despachador pf = new Frm_Despachador();
            panel1.add(pf);
            pf.setMaximum(true);
            pf.show();
        } catch (PropertyVetoException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_mnufacturarActionPerformed

    private void mnuconsclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuconsclienteActionPerformed
        try {
            Frm_Stock pf = new Frm_Stock();
            panel1.add(pf);
            pf.setMaximum(true);
            pf.show();
        } catch (PropertyVetoException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_mnuconsclienteActionPerformed

    private void mnuconsfacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuconsfacturasActionPerformed
        Frm_Estadisticas pf = new Frm_Estadisticas();
        panel1.add(pf);
        pf.show();
    }//GEN-LAST:event_mnuconsfacturasActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        Sucursalf pf = new Sucursalf();
        panel1.add(pf);
        pf.show();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        Inventariof pf = new Inventariof();
        panel1.add(pf);
        pf.show();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        Proveedorf pf = new Proveedorf();
        panel1.add(pf);
        pf.show();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Vendedorf pf = new Vendedorf();
        panel1.add(pf);
        pf.show();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void facultadmant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultadmant1ActionPerformed
        Compradorf pf = new Compradorf();
        panel1.add(pf);
        pf.show();
    }//GEN-LAST:event_facultadmant1ActionPerformed

    private void estudiantemant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudiantemant1ActionPerformed
        Consultar_Clientes pf = new Consultar_Clientes();
        panel1.add(pf);
        pf.show();
    }//GEN-LAST:event_estudiantemant1ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        Consultar_Vendedores pf = new Consultar_Vendedores();
        panel1.add(pf);
        pf.show();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void consultaE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaE1ActionPerformed
        Consultar_Proveedores pf = new Consultar_Proveedores();
        panel1.add(pf);
        pf.show();
    }//GEN-LAST:event_consultaE1ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        Consultar_Facturas pf = new Consultar_Facturas();
        panel1.add(pf);
        pf.show();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        Consultar_Inventario pf = new Consultar_Inventario();
        panel1.add(pf);
        pf.show();
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        Consultar_Sucursal pf = new Consultar_Sucursal();
        panel1.add(pf);
        pf.show();
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Frm_Cat_MC pf = new Frm_Cat_MC();
        panel1.add(pf);
        pf.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Frm_Parametros_Sistema pf = new Frm_Parametros_Sistema();
        panel1.add(pf);
        pf.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //           new menu().setVisible(true);
            }
        });
    }
    Perfil codigo_de_perfiles = null;
    int indice = 0;
    Pantallas[] seleccion_pantallas_segun_codigo_perfil = new Pantallas[100];

    Perfil perf = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu admi;
    private javax.swing.JMenuItem consultaE1;
    private javax.swing.JMenu consultas;
    private javax.swing.JMenuItem estudiantemant1;
    private javax.swing.JMenuItem facultadmant1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem menu;
    private javax.swing.JMenuItem mnuconscliente;
    private javax.swing.JMenuItem mnuconsfacturas;
    private javax.swing.JMenuItem mnufacturar;
    private javax.swing.JDesktopPane panel1;
    private javax.swing.JMenuItem perfil;
    private javax.swing.JMenu registros;
    private javax.swing.JMenuItem usuarios;
    private javax.swing.JMenu ventas;
    // End of variables declaration//GEN-END:variables
}
