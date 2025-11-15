/*
 * Menú principal del Sistema de Turismo.
 * Solo capa vista.
 */
package com.sistematurismo.vista;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSistema = new javax.swing.JMenu();
        jMenuItemLogin = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuGestion = new javax.swing.JMenu();
        jMenuItemTurista = new javax.swing.JMenuItem();
        jMenuItemAdmin = new javax.swing.JMenuItem();
        jMenuItemDestinos = new javax.swing.JMenuItem();
        jMenuItemItinerarios = new javax.swing.JMenuItem();
        jMenuItemRutas = new javax.swing.JMenuItem();
        jMenuItemTransporte = new javax.swing.JMenuItem();
        jMenuItemEventos = new javax.swing.JMenuItem();
        jMenuServicios = new javax.swing.JMenu();
        jMenuItemClima = new javax.swing.JMenuItem();
        jMenuItemRecomendaciones = new javax.swing.JMenuItem();
        jMenuReportes = new javax.swing.JMenu();
        jMenuItemReporteUsuarios = new javax.swing.JMenuItem();
        jMenuItemReporteDestinos = new javax.swing.JMenuItem();
        jMenuItemReporteRutas = new javax.swing.JMenuItem();
        jMenuItemReporteEventos = new javax.swing.JMenuItem();
        jMenuItemReportesSistema = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemAcercaDe = new javax.swing.JMenuItem();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelSubtitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Turismo Santa Marta");

        // ====== MENÚ SISTEMA ======
        jMenuSistema.setText("Sistema");

        jMenuItemLogin.setText("Iniciar sesión");
        jMenuItemLogin.addActionListener(evt -> {
            LoginView vista = new LoginView(this, true);
            vista.setVisible(true);
        });
        jMenuSistema.add(jMenuItemLogin);

        jMenuSistema.addSeparator();

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(evt -> {
            dispose();
            System.exit(0);
        });
        jMenuSistema.add(jMenuItemSalir);

        jMenuBar1.add(jMenuSistema);

        // ====== MENÚ GESTIÓN ======
        jMenuGestion.setText("Gestión");

        jMenuItemTurista.setText("Turistas");
        jMenuItemTurista.addActionListener(evt -> {
            TuristaView vista = new TuristaView(this, true);
            vista.setVisible(true);
        });
        jMenuGestion.add(jMenuItemTurista);

        jMenuItemAdmin.setText("Administradores");
        jMenuItemAdmin.addActionListener(evt -> {
            AdminView vista = new AdminView(this, true);
            vista.setVisible(true);
        });
        jMenuGestion.add(jMenuItemAdmin);

        jMenuGestion.addSeparator();

        jMenuItemDestinos.setText("Destinos turísticos");
        jMenuItemDestinos.addActionListener(evt -> {
            DestinoView vista = new DestinoView(this, true);
            vista.setVisible(true);
        });
        jMenuGestion.add(jMenuItemDestinos);

        jMenuItemItinerarios.setText("Itinerarios");
        jMenuItemItinerarios.addActionListener(evt -> {
            ItinerarioView vista = new ItinerarioView(this, true);
            vista.setVisible(true);
        });
        jMenuGestion.add(jMenuItemItinerarios);

        jMenuItemRutas.setText("Rutas");
        jMenuItemRutas.addActionListener(evt -> {
            RutaView vista = new RutaView(this, true);
            vista.setVisible(true);
        });
        jMenuGestion.add(jMenuItemRutas);

        jMenuItemTransporte.setText("Transporte");
        jMenuItemTransporte.addActionListener(evt -> {
            TransporteView vista = new TransporteView(this, true);
            vista.setVisible(true);
        });
        jMenuGestion.add(jMenuItemTransporte);

        jMenuItemEventos.setText("Eventos turísticos");
        jMenuItemEventos.addActionListener(evt -> {
            EventoView vista = new EventoView(this, true);
            vista.setVisible(true);
        });
        jMenuGestion.add(jMenuItemEventos);

        jMenuBar1.add(jMenuGestion);

        // ====== MENÚ SERVICIOS (clima, recomendaciones) ======
        jMenuServicios.setText("Servicios");

        jMenuItemClima.setText("Clima por destino");
        jMenuItemClima.addActionListener(evt -> {
            ClimaView vista = new ClimaView(this, true);
            vista.setVisible(true);
        });
        jMenuServicios.add(jMenuItemClima);

        jMenuItemRecomendaciones.setText("Recomendaciones al turista");
        jMenuItemRecomendaciones.addActionListener(evt -> {
            RecomendacionView vista = new RecomendacionView(this, true);
            vista.setVisible(true);
        });
        jMenuServicios.add(jMenuItemRecomendaciones);

        jMenuBar1.add(jMenuServicios);

        // ====== MENÚ REPORTES ======
        jMenuReportes.setText("Reportes");

        jMenuItemReporteUsuarios.setText("Reporte de Usuarios");
        jMenuItemReporteUsuarios.addActionListener(evt -> {
            JOptionPane.showMessageDialog(this,
                "Aquí se mostrará el Reporte de Usuarios\n" +
                "(falta conectar con la lógica de reportes: ReporteUsuarios)");
        });
        jMenuReportes.add(jMenuItemReporteUsuarios);

        jMenuItemReporteDestinos.setText("Reporte de Destinos");
        jMenuItemReporteDestinos.addActionListener(evt -> {
            JOptionPane.showMessageDialog(this,
                "Aquí se mostrará el Reporte de Destinos\n" +
                "(falta conectar con ReporteDestinos, etc.)");
        });
        jMenuReportes.add(jMenuItemReporteDestinos);

        jMenuItemReporteRutas.setText("Reporte de Rutas");
        jMenuItemReporteRutas.addActionListener(evt -> {
            JOptionPane.showMessageDialog(this,
                "Aquí se mostrará el Reporte de Rutas\n" +
                "(falta conectar con ReporteRutas)");
        });
        jMenuReportes.add(jMenuItemReporteRutas);

        jMenuItemReporteEventos.setText("Reporte de Eventos");
        jMenuItemReporteEventos.addActionListener(evt -> {
            JOptionPane.showMessageDialog(this,
                "Aquí se mostrará el Reporte de Eventos\n" +
                "(falta conectar con ReporteEventos)");
        });
        jMenuReportes.add(jMenuItemReporteEventos);

        jMenuReportes.addSeparator();

        jMenuItemReportesSistema.setText("Ver todos los reportes...");
        jMenuItemReportesSistema.addActionListener(evt -> {
            ReportesView vista = new ReportesView(this, true);
            vista.setVisible(true);
        });
        jMenuReportes.add(jMenuItemReportesSistema);

        jMenuBar1.add(jMenuReportes);

        // ====== MENÚ AYUDA ======
        jMenuAyuda.setText("Ayuda");

        jMenuItemAcercaDe.setText("Acerca de");
        jMenuItemAcercaDe.addActionListener(evt -> {
            JOptionPane.showMessageDialog(this,
                "Sistema de Turismo Santa Marta\n" +
                "Capa Vista desarrollada para integrar con MVC.\n" +
                "Backend a cargo del resto del equipo.");
        });
        jMenuAyuda.add(jMenuItemAcercaDe);

        jMenuBar1.add(jMenuAyuda);

        setJMenuBar(jMenuBar1);

        // ====== LABELS DEL CENTRO ======
        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Sistema de Turismo Santa Marta");

        jLabelSubtitulo.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubtitulo.setText("Capa Vista lista para integrar con la arquitectura MVC y los servicios de turismo");

        // Layout principal (igual estilo que tenías)
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

    // ===== Variables Swing =====
    private javax.swing.JLabel jLabelSubtitulo;
    private javax.swing.JLabel jLabelTitulo;

    private javax.swing.JMenuBar jMenuBar1;

    private javax.swing.JMenu jMenuSistema;
    private javax.swing.JMenu jMenuGestion;
    private javax.swing.JMenu jMenuServicios;
    private javax.swing.JMenu jMenuReportes;
    private javax.swing.JMenu jMenuAyuda;

    private javax.swing.JMenuItem jMenuItemLogin;
    private javax.swing.JMenuItem jMenuItemSalir;

    private javax.swing.JMenuItem jMenuItemTurista;
    private javax.swing.JMenuItem jMenuItemAdmin;
    private javax.swing.JMenuItem jMenuItemDestinos;
    private javax.swing.JMenuItem jMenuItemItinerarios;
    private javax.swing.JMenuItem jMenuItemRutas;
    private javax.swing.JMenuItem jMenuItemTransporte;
    private javax.swing.JMenuItem jMenuItemEventos;

    private javax.swing.JMenuItem jMenuItemClima;
    private javax.swing.JMenuItem jMenuItemRecomendaciones;

    private javax.swing.JMenuItem jMenuItemReporteUsuarios;
    private javax.swing.JMenuItem jMenuItemReporteDestinos;
    private javax.swing.JMenuItem jMenuItemReporteRutas;
    private javax.swing.JMenuItem jMenuItemReporteEventos;
    private javax.swing.JMenuItem jMenuItemReportesSistema;

    private javax.swing.JMenuItem jMenuItemAcercaDe;
    // ===========================
}
