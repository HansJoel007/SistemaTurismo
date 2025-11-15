package com.sistematurismo.vista;

import javax.swing.JOptionPane;

/**
 * Ventana para mostrar recomendaciones personalizadas al turista (solo vista).
 */
public class RecomendacionView extends javax.swing.JDialog {

    public RecomendacionView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabelTurista = new javax.swing.JLabel();
        txtIdTurista = new javax.swing.JTextField();
        btnCargar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaRecomendaciones = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recomendaciones personalizadas");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18));
        lblTitulo.setText("Recomendaciones para el turista");

        jLabelTurista.setText("ID Turista");

        btnCargar.setText("Cargar recomendaciones");
        btnCargar.addActionListener(evt -> btnCargarActionPerformed(evt));

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(evt -> dispose());

        txtAreaRecomendaciones.setColumns(20);
        txtAreaRecomendaciones.setRows(10);
        txtAreaRecomendaciones.setEditable(false);
        jScrollPane1.setViewportView(txtAreaRecomendaciones);

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
                        .addComponent(jLabelTurista)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdTurista, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(jLabelTurista))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdTurista, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCargar)
                        .addComponent(btnCerrar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {
        String id = txtIdTurista.getText();

        if (id.isBlank()) {
            JOptionPane.showMessageDialog(this, "Ingresa el ID del turista.");
            return;
        }

        txtAreaRecomendaciones.setText("");
        txtAreaRecomendaciones.append("Simulación de recomendaciones para turista ID: " + id + "\n\n");
        txtAreaRecomendaciones.append("- Destino recomendado 1\n");
        txtAreaRecomendaciones.append("- Destino recomendado 2\n");
        txtAreaRecomendaciones.append("- Evento destacado 1\n");
        txtAreaRecomendaciones.append("- Ruta sugerida 1\n");
        txtAreaRecomendaciones.append("\n(Esta información vendrá de la capa lógica de Recomendación.)");
    }

    // Variables declaration
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabelTurista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtAreaRecomendaciones;
    private javax.swing.JTextField txtIdTurista;
    // End of variables declaration
}
