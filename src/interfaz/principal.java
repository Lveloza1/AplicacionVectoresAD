/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author lveloza1
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    double v[];

    public principal() {
        initComponents();
        cmdCrear.setEnabled(true);
        cmdLlenarManual.setEnabled(false);
        cmdLlenarAutomatico.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdBorrar.setEnabled(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenarManual = new javax.swing.JButton();
        cmdLlenarAutomatico = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Manejo De Vectores");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Longitud:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });
        jPanel5.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 80, 30));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 160, 110));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel6.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        cmdLlenarManual.setText("Llenar Manual");
        cmdLlenarManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarManualActionPerformed(evt);
            }
        });
        jPanel6.add(cmdLlenarManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 30));

        cmdLlenarAutomatico.setText("Llenar Automático");
        cmdLlenarAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarAutomaticoActionPerformed(evt);
            }
        });
        jPanel6.add(cmdLlenarAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 130, 130, 30));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel6.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 30));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel6.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, 30));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 180, 280));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane2.setViewportView(txtResultado);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 56, 170, 90));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 220, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(632, 460));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int longitud;
        if (txtLongitud.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite la longitud del vector", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (Integer.parseInt(txtLongitud.getText().trim()) == 0) {
            JOptionPane.showMessageDialog(this, "La longitud no puede ser 0", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
            txtLongitud.selectAll();
        } else {
            longitud = Integer.parseInt(txtLongitud.getText());
            v = new double[longitud];
            JOptionPane.showMessageDialog(this, "El vector ha sido creado exitoxamente");

            cmdLlenarManual.setEnabled(true);
            cmdLlenarAutomatico.setEnabled(true);
            cmdMostrar.setEnabled(false);
            cmdCrear.setEnabled(false);
            cmdBorrar.setEnabled(true);
            txtLongitud.setEditable(false);

        }


    }//GEN-LAST:event_cmdCrearActionPerformed

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_txtLongitudKeyTyped

    private void cmdLlenarManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarManualActionPerformed
        double n;
        int sw, res;
        boolean aux=true;
        for (int i = 0; i < v.length; i++) {
            do {
                sw = 1;
                try {
                    n = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite el elemento número " + (i + 1)));
                    v[i] = n;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Digote un número valido");
                    sw = 0;
                } catch (NullPointerException e) {
                    res = JOptionPane.showConfirmDialog(this, "¿Desea Abandonar?", "Salr", JOptionPane.YES_NO_OPTION);
                    if (res == 0) {
                        sw = 1;
                        i = v.length;
                        aux=false;
                    } else {
                        sw = 0;
                    }

                }
            } while (sw == 0);
        }
        cmdCrear.setEnabled(false);
        cmdLlenarManual.setEnabled(false);
        cmdLlenarAutomatico.setEnabled(false);
        cmdMostrar.setEnabled(aux);
        cmdBorrar.setEnabled(true);
    }//GEN-LAST:event_cmdLlenarManualActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        for (int i = 0; i < v.length; i++) {
            txtResultado.append(v[i] + "\n");

        }
        cmdCrear.setEnabled(false);
        cmdLlenarManual.setEnabled(false);
        cmdLlenarAutomatico.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdBorrar.setEnabled(true);
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtLongitud.setText("");
        txtResultado.setText("");
        v = null;
        txtLongitud.requestFocusInWindow();
        cmdCrear.setEnabled(true);
        cmdLlenarManual.setEnabled(false);
        cmdLlenarAutomatico.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdBorrar.setEnabled(true);
        txtLongitud.setEditable(true);

    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdLlenarAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarAutomaticoActionPerformed
        double n;
        for (int i = 0; i < v.length; i++) {

            n = (int) (Math.random() * 50 + 1);
            v[i] = n;
        }

        JOptionPane.showMessageDialog(this, "Vector llenado correctamente");

        cmdCrear.setEnabled(false);
        cmdLlenarManual.setEnabled(false);
        cmdLlenarAutomatico.setEnabled(false);
        cmdMostrar.setEnabled(true);
        cmdBorrar.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_cmdLlenarAutomaticoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLlenarAutomatico;
    private javax.swing.JButton cmdLlenarManual;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
