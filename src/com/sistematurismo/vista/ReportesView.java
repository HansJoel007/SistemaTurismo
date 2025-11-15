package com.sistematurismo.vista;

/**
 * Ventana para mostrar reportes del sistema (solo vista).
 * Reporte de usuarios, destinos, rutas y eventos.
 */
public class ReportesView extends javax.swing.JDialog {

    public ReportesView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        btnDestinos = new javax.swing.JButton();
        btnRutas = new javax.swing.JButton();
        btnEventos = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaReporte = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reportes del sistema");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18));
        lblTitulo.setText("Reportes del sistema");

        btnUsuarios.setText("Usuarios registrados");
        btnUsuarios.addActionListener(evt -> mostrar("usuarios"));

        btnDestinos.setText("Destinos más visitados");
        btnDestinos.addActionListener(evt -> mostrar("destinos"));

        btnRutas.setText("Rutas más utilizadas");
        btnRutas.addActionListener(evt -> mostrar("rutas"));

        btnEventos.setText("Eventos con mayor asistencia");
        btnEventos.addActionListener(evt -> mostrar("eventos"));

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(evt -> dispose());

        txtAreaReporte.setColumns(20);
        txtAreaReporte.setRows(12);
        txtAreaReporte.setEditable(false);
        jScrollPane1.setViewportView(txtAreaReporte);

        // Layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDestinos, javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRutas, javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 220,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCerrar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUsuarios)
                        .addGap(12, 12, 12)
                        .addComponent(btnDestinos)
                        .addGap(12, 12, 12)
                        .addComponent(btnRutas)
                        .addGap(12, 12, 12)
                        .addComponent(btnEventos)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrar)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void mostrar(String tipo) {
        txtAreaReporte.setText("");

        switch (tipo) {
            case "usuarios":
                txtAreaReporte.append("Reporte de usuarios registrados\n\n");
                break;
            case "destinos":
                txtAreaReporte.append("Reporte de destinos más visitados\n\n");
                break;
            case "rutas":
                txtAreaReporte.append("Reporte de rutas más utilizadas\n\n");
                break;
            case "eventos":
                txtAreaReporte.append("Reporte de eventos con mayor asistencia\n\n");
                break;
        }

        txtAreaReporte.append("Aquí se mostrarán los datos calculados por la capa lógica.\n");
        txtAreaReporte.append("(Tus amigos implementan la generación real de reportes.)");
    }

    // Variables declaration
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnDestinos;
    private javax.swing.JButton btnEventos;
    private javax.swing.JButton btnRutas;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtAreaReporte;
    // End of variables declaration
}
