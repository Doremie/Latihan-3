
import java.awt.Color;
import java.awt.Font;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class myframe extends javax.swing.JFrame {

    /**
     * Creates new form myframe
     */
    public myframe() {
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

        txtjudul = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtoutput = new javax.swing.JTextArea();
        txtsize = new javax.swing.JLabel();
        txtfont = new javax.swing.JLabel();
        txtwarna = new javax.swing.JLabel();
        cbfont = new javax.swing.JComboBox<>();
        cbsize = new javax.swing.JComboBox<>();
        cbwarna = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtjudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtjudul.setText("Latihan 3.2");

        txtoutput.setColumns(20);
        txtoutput.setRows(5);
        jScrollPane1.setViewportView(txtoutput);

        txtsize.setText("Ukuran");

        txtfont.setText("Jenis Font");

        txtwarna.setText("Warna");

        cbfont.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Verdana", "Tahoma" }));
        cbfont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbfontActionPerformed(evt);
            }
        });

        cbsize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "14", "16", "18" }));
        cbsize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsizeActionPerformed(evt);
            }
        });

        cbwarna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Merah", "Hijau", "Biru" }));
        cbwarna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbwarnaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtjudul, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfont, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsize, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtwarna, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbfont, 0, 90, Short.MAX_VALUE)
                            .addComponent(cbsize, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbwarna, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtjudul, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfont, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbfont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsize, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbsize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtwarna, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbwarna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 113, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbfontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbfontActionPerformed
        if(cbfont.getSelectedItem()=="Arial")
        {
            txtoutput.setFont(new Font("Arial",Font.PLAIN,12));
        }
            else if(cbfont.getSelectedItem()=="Verdana")
            {
            txtoutput.setFont(new Font("Verdana",Font.PLAIN,12));
            }
                else if(cbfont.getSelectedItem()=="Tahoma")
                {
                    txtoutput.setFont(new Font("Tahoma",Font.PLAIN,12));
                }
    }//GEN-LAST:event_cbfontActionPerformed

    private void cbsizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsizeActionPerformed
        // TODO add your handling code here:
        Font f = cbsize.getFont();
        if(cbsize.getSelectedItem()=="14")
        {
            txtoutput.setFont(f.deriveFont(new Float(""+cbsize.getSelectedItem()).floatValue()));
        }
        else if(cbsize.getSelectedItem()=="16")
        {
            txtoutput.setFont(f.deriveFont(new Float(""+cbsize.getSelectedItem()).floatValue()));
        }
        else if(cbsize.getSelectedItem()=="18")
        {
            txtoutput.setFont(f.deriveFont(new Float(""+cbsize.getSelectedItem()).floatValue()));
        }
    }//GEN-LAST:event_cbsizeActionPerformed

    private void cbwarnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbwarnaActionPerformed
        // TODO add your handling code here:
        if(cbwarna.getSelectedItem()=="Merah")
        {
            txtoutput.setForeground(Color.red);
        }
        else if(cbwarna.getSelectedItem()=="Hijau")
        {
            txtoutput.setForeground(Color.green);
        }
        else if(cbwarna.getSelectedItem()=="Biru")
        {
            txtoutput.setForeground(Color.blue);
        }
    }//GEN-LAST:event_cbwarnaActionPerformed

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
            java.util.logging.Logger.getLogger(myframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbfont;
    private javax.swing.JComboBox<String> cbsize;
    private javax.swing.JComboBox<String> cbwarna;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtfont;
    private javax.swing.JLabel txtjudul;
    private javax.swing.JTextArea txtoutput;
    private javax.swing.JLabel txtsize;
    private javax.swing.JLabel txtwarna;
    // End of variables declaration//GEN-END:variables
}