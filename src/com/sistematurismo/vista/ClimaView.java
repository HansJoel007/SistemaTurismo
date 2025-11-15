package com.sistematurismo.vista;

import javax.swing.JOptionPane;

/**
 * Ventana para consultar clima de un destino.
 * Solo vista; luego se conecta a servicios de clima.
 */
public class ClimaView extends javax.swing.JDialog {

    public ClimaView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabelDestino = new javax.swing.JLabel();
        cmbDestino = new javax.swing.JComboBox<>();
        btnConsultar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaClima = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de clima");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18));
        lblTitulo.setText("Clima por destino");

        jLabelDestino.setText("Destino turístico");

        cmbDestino.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Santa Marta", "Cartagena", "Bogotá", "Medellín", "Otro" }
        ));

        btnConsultar.setText("Consultar clima");
        btnConsultar.addActionListener(evt -> btnConsultarActionPerformed(evt));

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(evt -> btnCerrarActionPerformed(evt));

        txtAreaClima.setColumns(20);
        txtAreaClima.setRows(8);
        txtAreaClima.setEditable(false);
        jScrollPane1.setViewportView(txtAreaClima);

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
                        .addComponent(jLabelDestino)
                        .addGap(18, 18, 18)
                        .addComponent(cmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultar))
                    .addComponent(btnCerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDestino)
                    .addComponent(cmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addGap(18, 18, 18)
                .addComponent(btnCerrar)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                    layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {
        String destino = (String) cmbDestino.getSelectedItem();

        txtAreaClima.setText("");
        txtAreaClima.append("Simulación de consulta de clima para: " + destino + "\n\n");
        txtAreaClima.append("Aquí se mostrará la información actualizada del clima\n");
        txtAreaClima.append("(temperatura, estado, humedad, etc.)\n");
        txtAreaClima.append("\nEsta lógica se conectará más adelante.");
    }

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    // Variables declaration
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JComboBox<String> cmbDestino;
    private javax.swing.JLabel jLabelDestino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtAreaClima;
    // End of variables declaration
}
