package com.sistematurismo.vista;

import javax.swing.JOptionPane;

/**
 * Formulario para crear y gestionar itinerarios (solo vista).
 */
public class ItinerarioView extends javax.swing.JDialog {

    public ItinerarioView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelTurista = new javax.swing.JLabel();
        jLabelDestinos = new javax.swing.JLabel();
        jLabelRutas = new javax.swing.JLabel();
        jLabelTransporte = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cmbTurista = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDestinos = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRutas = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtTransporte = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtSugerencias = new javax.swing.JTextArea();
        lblSugerencias = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnGenerarRutas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Creación de Itinerarios");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18));
        lblTitulo.setText("Itinerarios de viaje");

        jLabelNombre.setText("Nombre itinerario");

        jLabelTurista.setText("Turista");

        jLabelDestinos.setText("Destinos incluidos");

        jLabelRutas.setText("Rutas");

        jLabelTransporte.setText("Medios de transporte");

        cmbTurista.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Seleccionar...", "Turista 1", "Turista 2", "Turista 3" }
        ));

        txtDestinos.setColumns(20);
        txtDestinos.setRows(3);
        jScrollPane1.setViewportView(txtDestinos);

        txtRutas.setColumns(20);
        txtRutas.setRows(3);
        jScrollPane2.setViewportView(txtRutas);

        txtTransporte.setColumns(20);
        txtTransporte.setRows(3);
        jScrollPane3.setViewportView(txtTransporte);

        txtSugerencias.setColumns(20);
        txtSugerencias.setRows(10);
        txtSugerencias.setEditable(false);
        jScrollPane4.setViewportView(txtSugerencias);

        lblSugerencias.setText("Rutas sugeridas");

        btnGuardar.setText("Guardar itinerario");
        btnGuardar.addActionListener(evt -> btnGuardarActionPerformed(evt));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(evt -> btnLimpiarActionPerformed(evt));

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(evt -> btnCerrarActionPerformed(evt));

        btnGenerarRutas.setText("Generar rutas sugeridas");
        btnGenerarRutas.addActionListener(evt -> btnGenerarRutasActionPerformed(evt));

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelTurista)
                            .addComponent(jLabelDestinos)
                            .addComponent(jLabelRutas)
                            .addComponent(jLabelTransporte)
                            .addComponent(btnGuardar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(cmbTurista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLimpiar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCerrar))))
                    .addComponent(btnGenerarRutas))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSugerencias)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(lblSugerencias))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTurista)
                            .addComponent(cmbTurista, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDestinos)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRutas)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTransporte)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerarRutas)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnLimpiar)
                            .addComponent(btnCerrar))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 260,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btnGenerarRutasActionPerformed(java.awt.event.ActionEvent evt) {
        txtSugerencias.setText("");
        txtSugerencias.append("Aquí se mostrarán las rutas sugeridas entre los destinos del itinerario.\n");
        txtSugerencias.append("Se considerará distancia, tiempo y transporte disponible.\n");
        txtSugerencias.append("\n(Esta lógica será implementada en la capa de servicios/control.)");
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO: conectar con ItinerarioController
        JOptionPane.showMessageDialog(this,
                "Simulación de guardado de itinerario.\n" +
                "(Más adelante se guarda realmente en la base de datos).");
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        txtNombre.setText(null);
        cmbTurista.setSelectedIndex(0);
        txtDestinos.setText(null);
        txtRutas.setText(null);
        txtTransporte.setText(null);
        txtSugerencias.setText(null);
    }

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    // Variables declaration
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGenerarRutas;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbTurista;
    private javax.swing.JLabel jLabelDestinos;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRutas;
    private javax.swing.JLabel jLabelTransporte;
    private javax.swing.JLabel jLabelTurista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblSugerencias;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtDestinos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtRutas;
    private javax.swing.JTextArea txtSugerencias;
    private javax.swing.JTextArea txtTransporte;
    // End of variables declaration
}
