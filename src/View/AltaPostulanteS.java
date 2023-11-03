/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;

/**
 *
 * @author chial
 */
public class AltaPostulanteS extends javax.swing.JFrame {

    /**
     * Creates new form AltaPostulanteS
     */
    public AltaPostulanteS() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFrame = new javax.swing.JLabel();
        jLabelTema = new javax.swing.JLabel();
        jLabelNivel = new javax.swing.JLabel();
        jLabelExperiencia = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jSpinnerNivel = new javax.swing.JSpinner();
        jButtonAgregar = new javax.swing.JButton();
        jComboBoxTema = new javax.swing.JComboBox<>();
        jScrollPaneExperiencia = new javax.swing.JScrollPane();
        jListExperiencia = new javax.swing.JList<>();
        jSeparator = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alta Postulante");
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(374, 247));
        setPreferredSize(new java.awt.Dimension(374, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(374, 280));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelFrame.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelFrame.setLabelFor(this);
        jLabelFrame.setText("Experiencia");

        jLabelTema.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTema.setText("Tema");

        jLabelNivel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNivel.setText("Nivel");

        jLabelExperiencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelExperiencia.setText("Experiencia");

        jButtonRegistrar.setText("Registrar");

        jButtonCancelar.setText("Cancelar");

        jButtonEliminar.setText("Eliminar");

        jButtonAgregar.setText("Agregar");

        jComboBoxTema.setBackground(new java.awt.Color(236, 236, 236));

        jScrollPaneExperiencia.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray));

        jListExperiencia.setBackground(new java.awt.Color(236, 236, 236));
        jScrollPaneExperiencia.setViewportView(jListExperiencia);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 143, Short.MAX_VALUE)
                .addComponent(jLabelFrame)
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNivel)
                            .addComponent(jLabelTema))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSpinnerNivel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAgregar))
                            .addComponent(jComboBoxTema, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelExperiencia)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jScrollPaneExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelFrame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTema)
                    .addComponent(jComboBoxTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNivel)
                    .addComponent(jSpinnerNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregar))
                .addGap(10, 10, 10)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelExperiencia)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminar)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addComponent(jScrollPaneExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.getContentPane().setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_formWindowOpened
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JComboBox<String> jComboBoxTema;
    private javax.swing.JLabel jLabelExperiencia;
    private javax.swing.JLabel jLabelFrame;
    private javax.swing.JLabel jLabelNivel;
    private javax.swing.JLabel jLabelTema;
    private javax.swing.JList<String> jListExperiencia;
    private javax.swing.JScrollPane jScrollPaneExperiencia;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSpinner jSpinnerNivel;
    // End of variables declaration//GEN-END:variables
}
