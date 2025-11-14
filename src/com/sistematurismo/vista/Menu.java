/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sistematurismo.vista;

import javax.swing.JOptionPane;

/**
 * Menú principal del Sistema de Turismo.
 * Solo capa vista.
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSistema = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuGestion = new javax.swing.JMenu();
        jMenuItemTurista = new javax.swing.JMenuItem();
        jMenuItemAdmin = new javax.swing.JMenuItem();
        jMenuReportes = new javax.swing.JMenu();
        jMenuItemReporteUsuarios = new javax.swing.JMenuItem();
        jMenuItemReporteDestinos = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemAcercaDe = new javax.swing.JMenuItem();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelSubtitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Turismo Santa Marta");

        jMenuSistema.setText("Sistema");

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(evt -> {
            dispose();
            System.exit(0);
        });
        jMenuSistema.add(jMenuItemSalir);
        jMenuBar1.add(jMenuSistema);

        jMenuGestion.setText("Gestión");

        jMenuItemTurista.setText("Turistas");
        jMenuItemTurista.addActionListener(evt -> {
            TuristaView vista = new TuristaView(this, true);
            vista.setVisible(true);
            // TODO: luego conectar con controlador
        });
        jMenuGestion.add(jMenuItemTurista);

        jMenuItemAdmin.setText("Administradores");
        jMenuItemAdmin.addActionListener(evt -> {
            AdminView vista = new AdminView(this, true);
            vista.setVisible(true);
        });
        jMenuGestion.add(jMenuItemAdmin);

        jMenuBar1.add(jMenuGestion);

        jMenuReportes.setText("Reportes");

        jMenuItemReporteUsuarios.setText("Reporte de Usuarios");
        jMenuItemReporteUsuarios.addActionListener(evt -> {
            JOptionPane.showMessageDialog(this,
                "Aquí se mostrará el Reporte de Usuarios\n" +
                "(falta conectar con la lógica de reportes)");
        });
        jMenuReportes.add(jMenuItemReporteUsuarios);

        jMenuItemReporteDestinos.setText("Reporte de Destinos");
        jMenuItemReporteDestinos.addActionListener(evt -> {
            JOptionPane.showMessageDialog(this,
                "Aquí se mostrará el Reporte de Destinos\n" +
                "(falta conectar con ReporteDestinos, etc.)");
        });
        jMenuReportes.add(jMenuItemReporteDestinos);

        jMenuBar1.add(jMenuReportes);

        jMenuAyuda.setText("Ayuda");

        jMenuItemAcercaDe.setText("Acerca de");
        jMenuItemAcercaDe.addActionListener(evt -> {
            JOptionPane.showMessageDialog(this,
                "Sistema de Turismo Santa Marta\n" +
                "Capa Vista por Hans Joel.\n" +
                "Luego se acopla a modelo/servicio/control.");
        });
        jMenuAyuda.add(jMenuItemAcercaDe);

        jMenuBar1.add(jMenuAyuda);

        setJMenuBar(jMenuBar1);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Sistema de Turismo Santa Marta");

        jLabelSubtitulo.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubtitulo.setText("Capa Vista lista para integrar con la arquitectura MVC");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addComponent(jLabelSubtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jLabelTitulo)
                    .addGap(18, 18, 18)
                    .addComponent(jLabelSubtitulo)
                    .addContainerGap(320, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    // ==== MAIN AQUÍ MISMO ====
    public static void main(String args[]) {
        // Nimbus opcional
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info :
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            // ignoramos
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables Swing
    private javax.swing.JLabel jLabelSubtitulo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuGestion;
    private javax.swing.JMenuItem jMenuItemAcercaDe;
    private javax.swing.JMenuItem jMenuItemAdmin;
    private javax.swing.JMenuItem jMenuItemReporteDestinos;
    private javax.swing.JMenuItem jMenuItemReporteUsuarios;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenuItem jMenuItemTurista;
    private javax.swing.JMenu jMenuReportes;
    private javax.swing.JMenu jMenuSistema;
    // End of variables declaration                   
}

