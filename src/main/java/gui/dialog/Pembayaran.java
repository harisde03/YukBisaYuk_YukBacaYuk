package gui.dialog;

import classes.Pembeli;
import database.Konfigurasi;
import java.awt.FontFormatException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pembayaran extends javax.swing.JDialog {

    public Pembayaran(java.awt.Frame parent, Pembeli pembeli) {
        this.parent = parent;
        this.pembeli = pembeli;
        this.status = false;

        try {
            this.konfigurasi = new Konfigurasi();
        } catch (IOException | FontFormatException ex) {
            Logger.getLogger(Pembayaran.class.getName()).log(Level.SEVERE, null, ex);
        }

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
        java.awt.GridBagConstraints gridBagConstraints;

        panelPB = new javax.swing.JPanel();
        panelPBHeader = new javax.swing.JPanel();
        labelSIHeader1 = new javax.swing.JLabel();
        panelPBBody = new javax.swing.JPanel();
        panelPBEmail = new javax.swing.JPanel();
        labelPBEmail = new javax.swing.JLabel();
        fieldPBEmail = new javax.swing.JTextField();
        panelPBEmailSupport = new javax.swing.JPanel();
        panelPBEPass = new javax.swing.JPanel();
        labelPBPass = new javax.swing.JLabel();
        fieldPBPass = new javax.swing.JPasswordField();
        panelPBPassSupport = new javax.swing.JPanel();
        panelPBEmpty = new javax.swing.JPanel();
        labelSalah = new javax.swing.JLabel();
        panelPBFooter = new javax.swing.JPanel();
        buttonPBBayar = new javax.swing.JButton();
        buttonPBKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setSize(new java.awt.Dimension(600, 450));

        panelPB.setMaximumSize(new java.awt.Dimension(600, 450));
        panelPB.setMinimumSize(new java.awt.Dimension(600, 450));
        panelPB.setPreferredSize(new java.awt.Dimension(600, 450));
        panelPB.setLayout(new javax.swing.BoxLayout(panelPB, javax.swing.BoxLayout.PAGE_AXIS));

        panelPBHeader.setBackground(new java.awt.Color(254, 250, 224));
        panelPBHeader.setMaximumSize(new java.awt.Dimension(2147483647, 60));
        panelPBHeader.setLayout(new java.awt.GridBagLayout());

        labelSIHeader1.setFont(konfigurasi.getPhilosopher(36));
        labelSIHeader1.setText("Konfirmasi Pembayaran");
        labelSIHeader1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labelSIHeader1.setMaximumSize(new java.awt.Dimension(540, 60));
        labelSIHeader1.setMinimumSize(new java.awt.Dimension(540, 60));
        labelSIHeader1.setPreferredSize(new java.awt.Dimension(540, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 30);
        panelPBHeader.add(labelSIHeader1, gridBagConstraints);

        panelPB.add(panelPBHeader);

        panelPBBody.setBackground(new java.awt.Color(254, 250, 224));
        panelPBBody.setLayout(new java.awt.GridBagLayout());

        panelPBEmail.setBackground(new java.awt.Color(254, 250, 224));
        panelPBEmail.setMaximumSize(new java.awt.Dimension(600, 60));
        panelPBEmail.setMinimumSize(new java.awt.Dimension(600, 60));
        panelPBEmail.setPreferredSize(new java.awt.Dimension(600, 60));
        panelPBEmail.setLayout(new java.awt.GridBagLayout());

        labelPBEmail.setFont(konfigurasi.getPhilosopher(24));
        labelPBEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPBEmail.setText("Email:");
        labelPBEmail.setMaximumSize(new java.awt.Dimension(100, 60));
        labelPBEmail.setMinimumSize(new java.awt.Dimension(100, 60));
        labelPBEmail.setPreferredSize(new java.awt.Dimension(100, 60));
        panelPBEmail.add(labelPBEmail, new java.awt.GridBagConstraints());

        fieldPBEmail.setEditable(false);
        fieldPBEmail.setBackground(new java.awt.Color(254, 250, 224));
        fieldPBEmail.setFont(konfigurasi.getPhilosopher(18));
        fieldPBEmail.setText(pembeli.getEmail());
        fieldPBEmail.setBorder(null);
        fieldPBEmail.setMaximumSize(new java.awt.Dimension(425, 50));
        fieldPBEmail.setMinimumSize(new java.awt.Dimension(425, 50));
        fieldPBEmail.setPreferredSize(new java.awt.Dimension(425, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPBEmail.add(fieldPBEmail, gridBagConstraints);

        panelPBEmailSupport.setBackground(fieldPBEmail.getBackground());
        panelPBEmailSupport.setMaximumSize(new java.awt.Dimension(450, 50));
        panelPBEmailSupport.setMinimumSize(new java.awt.Dimension(450, 50));

        javax.swing.GroupLayout panelPBEmailSupportLayout = new javax.swing.GroupLayout(panelPBEmailSupport);
        panelPBEmailSupport.setLayout(panelPBEmailSupportLayout);
        panelPBEmailSupportLayout.setHorizontalGroup(
            panelPBEmailSupportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPBEmailSupportLayout.setVerticalGroup(
            panelPBEmailSupportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPBEmail.add(panelPBEmailSupport, gridBagConstraints);

        panelPBBody.add(panelPBEmail, new java.awt.GridBagConstraints());

        panelPBEPass.setBackground(new java.awt.Color(254, 250, 224));
        panelPBEPass.setMaximumSize(new java.awt.Dimension(600, 60));
        panelPBEPass.setMinimumSize(new java.awt.Dimension(600, 60));
        panelPBEPass.setPreferredSize(new java.awt.Dimension(600, 60));
        panelPBEPass.setLayout(new java.awt.GridBagLayout());

        labelPBPass.setFont(konfigurasi.getPhilosopher(24));
        labelPBPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPBPass.setText("Pass:");
        labelPBPass.setMaximumSize(new java.awt.Dimension(100, 60));
        labelPBPass.setMinimumSize(new java.awt.Dimension(100, 60));
        labelPBPass.setPreferredSize(new java.awt.Dimension(100, 60));
        panelPBEPass.add(labelPBPass, new java.awt.GridBagConstraints());

        fieldPBPass.setBackground(new java.awt.Color(255, 255, 254));
        fieldPBPass.setFont(konfigurasi.getPhilosopher(18));
        fieldPBPass.setBorder(null);
        fieldPBPass.setMaximumSize(new java.awt.Dimension(425, 50));
        fieldPBPass.setMinimumSize(new java.awt.Dimension(425, 50));
        fieldPBPass.setPreferredSize(new java.awt.Dimension(425, 50));
        fieldPBPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldPBPassFocusGained(evt);
            }
        });
        fieldPBPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldPBPassKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPBEPass.add(fieldPBPass, gridBagConstraints);

        panelPBPassSupport.setBackground(fieldPBPass.getBackground());
        panelPBPassSupport.setMaximumSize(new java.awt.Dimension(450, 50));
        panelPBPassSupport.setMinimumSize(new java.awt.Dimension(450, 50));

        javax.swing.GroupLayout panelPBPassSupportLayout = new javax.swing.GroupLayout(panelPBPassSupport);
        panelPBPassSupport.setLayout(panelPBPassSupportLayout);
        panelPBPassSupportLayout.setHorizontalGroup(
            panelPBPassSupportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPBPassSupportLayout.setVerticalGroup(
            panelPBPassSupportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPBEPass.add(panelPBPassSupport, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        panelPBBody.add(panelPBEPass, gridBagConstraints);

        panelPBEmpty.setBackground(new java.awt.Color(254, 250, 224));
        panelPBEmpty.setMinimumSize(new java.awt.Dimension(600, 155));
        panelPBEmpty.setPreferredSize(new java.awt.Dimension(600, 175));
        panelPBEmpty.setLayout(new java.awt.BorderLayout());

        labelSalah.setFont(konfigurasi.getRobotoBold(14));
        labelSalah.setForeground(new java.awt.Color(255, 0, 0));
        labelSalah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSalah.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panelPBEmpty.add(labelSalah, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelPBBody.add(panelPBEmpty, gridBagConstraints);

        panelPB.add(panelPBBody);

        panelPBFooter.setBackground(new java.awt.Color(250, 237, 205));
        panelPBFooter.setMaximumSize(new java.awt.Dimension(32767, 75));
        panelPBFooter.setMinimumSize(new java.awt.Dimension(600, 75));

        buttonPBBayar.setBackground(new java.awt.Color(212, 163, 115));
        buttonPBBayar.setFont(konfigurasi.getRobotoBold(14));
        buttonPBBayar.setText("Bayar");
        buttonPBBayar.setMaximumSize(new java.awt.Dimension(175, 50));
        buttonPBBayar.setMinimumSize(new java.awt.Dimension(175, 50));
        buttonPBBayar.setPreferredSize(new java.awt.Dimension(175, 50));
        buttonPBBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPBBayarActionPerformed(evt);
            }
        });

        buttonPBKembali.setBackground(new java.awt.Color(212, 163, 115));
        buttonPBKembali.setFont(konfigurasi.getRobotoBold(14));
        buttonPBKembali.setText("Kembali");
        buttonPBKembali.setMaximumSize(new java.awt.Dimension(175, 50));
        buttonPBKembali.setMinimumSize(new java.awt.Dimension(175, 50));
        buttonPBKembali.setPreferredSize(new java.awt.Dimension(175, 50));
        buttonPBKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPBKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPBFooterLayout = new javax.swing.GroupLayout(panelPBFooter);
        panelPBFooter.setLayout(panelPBFooterLayout);
        panelPBFooterLayout.setHorizontalGroup(
            panelPBFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPBFooterLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(buttonPBKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPBBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(199, 199, 199))
        );
        panelPBFooterLayout.setVerticalGroup(
            panelPBFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPBFooterLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelPBFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPBBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPBKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );

        panelPB.add(panelPBFooter);

        getContentPane().add(panelPB, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPBBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPBBayarActionPerformed
        cekPassword();
    }//GEN-LAST:event_buttonPBBayarActionPerformed

    private void buttonPBKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPBKembaliActionPerformed
        dispose();
    }//GEN-LAST:event_buttonPBKembaliActionPerformed

    private void fieldPBPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldPBPassKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            cekPassword();
        }
    }//GEN-LAST:event_fieldPBPassKeyPressed

    private void fieldPBPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldPBPassFocusGained
        labelSalah.setText("");
    }//GEN-LAST:event_fieldPBPassFocusGained

    private void cekPassword() {
        String passW = String.valueOf(fieldPBPass.getPassword());
        if (passW.equals(pembeli.getPassword())) {
            status = true;
            dispose();
        } else {
            labelSalah.setText("\nPassword yang anda masukkan salah.");
        }
    }
    
    public boolean getStatus() {
        return status;
    }

    private java.awt.Frame parent;
    private Pembeli pembeli;
    private Konfigurasi konfigurasi;
    private boolean status;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPBBayar;
    private javax.swing.JButton buttonPBKembali;
    private javax.swing.JTextField fieldPBEmail;
    private javax.swing.JPasswordField fieldPBPass;
    private javax.swing.JLabel labelPBEmail;
    private javax.swing.JLabel labelPBPass;
    private javax.swing.JLabel labelSIHeader1;
    private javax.swing.JLabel labelSalah;
    private javax.swing.JPanel panelPB;
    private javax.swing.JPanel panelPBBody;
    private javax.swing.JPanel panelPBEPass;
    private javax.swing.JPanel panelPBEmail;
    private javax.swing.JPanel panelPBEmailSupport;
    private javax.swing.JPanel panelPBEmpty;
    private javax.swing.JPanel panelPBFooter;
    private javax.swing.JPanel panelPBHeader;
    private javax.swing.JPanel panelPBPassSupport;
    // End of variables declaration//GEN-END:variables
}