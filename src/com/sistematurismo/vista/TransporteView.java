package com.sistematurismo.vista;

import javax.swing.JOptionPane;

/**
 * Formulario para gestionar Transportes (solo vista).
 */
public class TransporteView extends javax.swing.JDialog {

    public TransporteView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelCapacidad = new javax.swing.JLabel();
        jLabelHorario = new javax.swing.JLabel();
        jLabelRuta = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        txtCapacidad = new javax.swing.JTextField();
        txtHorario = new javax.swing.JTextField();
        txtRutaAsociada = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administración de Transporte");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18));
        lblTitulo.setText("Medios de transporte");

        jLabelId.setText("ID");

        jLabelTipo.setText("Tipo");

        jLabelCapacidad.setText("Capacidad");

        jLabelHorario.setText("Horario");

        jLabelRuta.setText("Ruta asociada");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Bus", "Avión", "Lancha", "Taxi", "Otro" }
        ));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(evt -> mostrarAccion());

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(evt -> limpiar());

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(evt -> dispose());

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
                            .addComponent(jLabelId)
                            .addComponent(jLabelTipo)
                            .addComponent(jLabelCapacidad)
                            .addComponent(jLabelHorario)
                            .addComponent(jLabelRuta))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCapacidad)
                            .addComponent(txtHorario)
                            .addComponent(txtRutaAsociada, javax.swing.GroupLayout.PREFERRED_SIZE, 220,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrar)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCapacidad)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHorario)
                    .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRuta)
                    .addComponent(txtRutaAsociada, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCerrar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void mostrarAccion() {
        JOptionPane.showMessageDialog(this,
                "Simulación registro/gestión de transporte.\n" +
                "(La lógica real va en la capa de servicios).");
    }

    private void limpiar() {
        txtId.setText(null);
        cmbTipo.setSelectedIndex(0);
        txtCapacidad.setText(null);
        txtHorario.setText(null);
        txtRutaAsociada.setText(null);
    }

    // Variables declaration
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabelCapacidad;
    private javax.swing.JLabel jLabelHorario;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelRuta;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtRutaAsociada;
    // End of variables declaration
}
