package gui.dialog;

import classes.Pembeli;
import classes.Regist;
import database.Konfigurasi;
import gui.PilihanBuku;
import gui.Sign;
import java.awt.FontFormatException;
import java.awt.Frame;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InfoPengguna extends javax.swing.JDialog {

    public InfoPengguna(java.awt.Frame parent, Pembeli pembeli) {
        this.parent = parent;
        this.pembeli = pembeli;

        try {
            this.konfigurasi = new Konfigurasi();
        } catch (IOException | FontFormatException ex) {
            Logger.getLogger(InfoPengguna.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();
    }

    public InfoPengguna(java.awt.Frame parent, Regist regis) {
        this.parent = parent;
        this.pembeli = regis;
        this.regis = regis;

        try {
            this.konfigurasi = new Konfigurasi();
        } catch (IOException | FontFormatException ex) {
            Logger.getLogger(InfoPengguna.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();

        fieldIPNama.setEditable(true);
        fieldIPNama.setBackground(java.awt.Color.white);
        panelIPNamaSupport.setBackground(fieldIPNama.getBackground());
        buttonIPSignOut.setText("Create Account");
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

        panelIP = new javax.swing.JPanel();
        panelIPHeader = new javax.swing.JPanel();
        labelSIHeader1 = new javax.swing.JLabel();
        panelIPBody = new javax.swing.JPanel();
        panelIPEmail = new javax.swing.JPanel();
        labelIPEmail = new javax.swing.JLabel();
        fieldIPEmail = new javax.swing.JTextField();
        panelIPEmailSupport = new javax.swing.JPanel();
        panelIPNama = new javax.swing.JPanel();
        labelIPNama = new javax.swing.JLabel();
        fieldIPNama = new javax.swing.JTextField();
        panelIPNamaSupport = new javax.swing.JPanel();
        panelIPEmpty = new javax.swing.JPanel();
        panelIPFooter = new javax.swing.JPanel();
        buttonIPSignOut = new javax.swing.JButton();
        buttonIPKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 450));

        panelIP.setMaximumSize(new java.awt.Dimension(600, 450));
        panelIP.setMinimumSize(new java.awt.Dimension(600, 450));
        panelIP.setPreferredSize(new java.awt.Dimension(600, 450));
        panelIP.setLayout(new javax.swing.BoxLayout(panelIP, javax.swing.BoxLayout.PAGE_AXIS));

        panelIPHeader.setBackground(new java.awt.Color(254, 250, 224));
        panelIPHeader.setMaximumSize(new java.awt.Dimension(2147483647, 60));
        panelIPHeader.setLayout(new java.awt.GridBagLayout());

        labelSIHeader1.setFont(konfigurasi.getPhilosopher(36));
        labelSIHeader1.setText("Info Pengguna");
        labelSIHeader1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labelSIHeader1.setMaximumSize(new java.awt.Dimension(540, 60));
        labelSIHeader1.setMinimumSize(new java.awt.Dimension(540, 60));
        labelSIHeader1.setPreferredSize(new java.awt.Dimension(540, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 30);
        panelIPHeader.add(labelSIHeader1, gridBagConstraints);

        panelIP.add(panelIPHeader);

        panelIPBody.setBackground(new java.awt.Color(254, 250, 224));
        panelIPBody.setLayout(new java.awt.GridBagLayout());

        panelIPEmail.setBackground(new java.awt.Color(254, 250, 224));
        panelIPEmail.setMaximumSize(new java.awt.Dimension(600, 60));
        panelIPEmail.setMinimumSize(new java.awt.Dimension(600, 60));
        panelIPEmail.setPreferredSize(new java.awt.Dimension(600, 60));
        panelIPEmail.setLayout(new java.awt.GridBagLayout());

        labelIPEmail.setFont(konfigurasi.getPhilosopher(24));
        labelIPEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIPEmail.setText("Email:");
        labelIPEmail.setMaximumSize(new java.awt.Dimension(100, 60));
        labelIPEmail.setMinimumSize(new java.awt.Dimension(100, 60));
        labelIPEmail.setPreferredSize(new java.awt.Dimension(100, 60));
        panelIPEmail.add(labelIPEmail, new java.awt.GridBagConstraints());

        fieldIPEmail.setEditable(false);
        fieldIPEmail.setBackground(new java.awt.Color(254, 250, 224));
        fieldIPEmail.setFont(konfigurasi.getPhilosopher(18));
        fieldIPEmail.setText(pembeli.getEmail());
        fieldIPEmail.setBorder(null);
        fieldIPEmail.setMaximumSize(new java.awt.Dimension(425, 50));
        fieldIPEmail.setMinimumSize(new java.awt.Dimension(425, 50));
        fieldIPEmail.setPreferredSize(new java.awt.Dimension(425, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelIPEmail.add(fieldIPEmail, gridBagConstraints);

        panelIPEmailSupport.setBackground(fieldIPEmail.getBackground());
        panelIPEmailSupport.setMaximumSize(new java.awt.Dimension(450, 50));
        panelIPEmailSupport.setMinimumSize(new java.awt.Dimension(450, 50));
        panelIPEmailSupport.setPreferredSize(new java.awt.Dimension(450, 50));

        javax.swing.GroupLayout panelIPEmailSupportLayout = new javax.swing.GroupLayout(panelIPEmailSupport);
        panelIPEmailSupport.setLayout(panelIPEmailSupportLayout);
        panelIPEmailSupportLayout.setHorizontalGroup(
            panelIPEmailSupportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelIPEmailSupportLayout.setVerticalGroup(
            panelIPEmailSupportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelIPEmail.add(panelIPEmailSupport, gridBagConstraints);

        panelIPBody.add(panelIPEmail, new java.awt.GridBagConstraints());

        panelIPNama.setBackground(new java.awt.Color(254, 250, 224));
        panelIPNama.setMaximumSize(new java.awt.Dimension(600, 60));
        panelIPNama.setMinimumSize(new java.awt.Dimension(600, 60));
        panelIPNama.setPreferredSize(new java.awt.Dimension(600, 60));
        panelIPNama.setLayout(new java.awt.GridBagLayout());

        labelIPNama.setFont(konfigurasi.getPhilosopher(24));
        labelIPNama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIPNama.setText("Nama:");
        labelIPNama.setMaximumSize(new java.awt.Dimension(100, 60));
        labelIPNama.setMinimumSize(new java.awt.Dimension(100, 60));
        labelIPNama.setPreferredSize(new java.awt.Dimension(100, 60));
        panelIPNama.add(labelIPNama, new java.awt.GridBagConstraints());

        fieldIPNama.setEditable(false);
        fieldIPNama.setBackground(new java.awt.Color(254, 250, 224));
        fieldIPNama.setFont(konfigurasi.getPhilosopher(18));
        fieldIPNama.setText(pembeli.getNama());
        fieldIPNama.setBorder(null);
        fieldIPNama.setMaximumSize(new java.awt.Dimension(425, 50));
        fieldIPNama.setMinimumSize(new java.awt.Dimension(425, 50));
        fieldIPNama.setPreferredSize(new java.awt.Dimension(425, 50));
        fieldIPNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldIPNamaKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        panelIPNama.add(fieldIPNama, gridBagConstraints);

        panelIPNamaSupport.setBackground(fieldIPNama.getBackground());
        panelIPNamaSupport.setMaximumSize(new java.awt.Dimension(450, 50));
        panelIPNamaSupport.setMinimumSize(new java.awt.Dimension(450, 50));
        panelIPNamaSupport.setPreferredSize(new java.awt.Dimension(450, 50));

        javax.swing.GroupLayout panelIPNamaSupportLayout = new javax.swing.GroupLayout(panelIPNamaSupport);
        panelIPNamaSupport.setLayout(panelIPNamaSupportLayout);
        panelIPNamaSupportLayout.setHorizontalGroup(
            panelIPNamaSupportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelIPNamaSupportLayout.setVerticalGroup(
            panelIPNamaSupportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelIPNama.add(panelIPNamaSupport, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        panelIPBody.add(panelIPNama, gridBagConstraints);

        panelIPEmpty.setBackground(new java.awt.Color(254, 250, 224));
        panelIPEmpty.setMinimumSize(new java.awt.Dimension(600, 155));
        panelIPEmpty.setPreferredSize(new java.awt.Dimension(600, 175));

        javax.swing.GroupLayout panelIPEmptyLayout = new javax.swing.GroupLayout(panelIPEmpty);
        panelIPEmpty.setLayout(panelIPEmptyLayout);
        panelIPEmptyLayout.setHorizontalGroup(
            panelIPEmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelIPEmptyLayout.setVerticalGroup(
            panelIPEmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelIPBody.add(panelIPEmpty, gridBagConstraints);

        panelIP.add(panelIPBody);

        panelIPFooter.setBackground(new java.awt.Color(250, 237, 205));
        panelIPFooter.setMaximumSize(new java.awt.Dimension(32767, 75));
        panelIPFooter.setMinimumSize(new java.awt.Dimension(600, 75));

        buttonIPSignOut.setBackground(new java.awt.Color(212, 163, 115));
        buttonIPSignOut.setFont(konfigurasi.getRobotoBold(14));
        buttonIPSignOut.setText("Sign Out");
        buttonIPSignOut.setMaximumSize(new java.awt.Dimension(175, 50));
        buttonIPSignOut.setMinimumSize(new java.awt.Dimension(175, 50));
        buttonIPSignOut.setPreferredSize(new java.awt.Dimension(175, 50));
        buttonIPSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIPSignOutActionPerformed(evt);
            }
        });

        buttonIPKembali.setBackground(new java.awt.Color(212, 163, 115));
        buttonIPKembali.setFont(konfigurasi.getRobotoBold(14));
        buttonIPKembali.setText("Kembali");
        buttonIPKembali.setMaximumSize(new java.awt.Dimension(175, 50));
        buttonIPKembali.setMinimumSize(new java.awt.Dimension(175, 50));
        buttonIPKembali.setPreferredSize(new java.awt.Dimension(175, 50));
        buttonIPKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIPKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIPFooterLayout = new javax.swing.GroupLayout(panelIPFooter);
        panelIPFooter.setLayout(panelIPFooterLayout);
        panelIPFooterLayout.setHorizontalGroup(
            panelIPFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIPFooterLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(buttonIPKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonIPSignOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(199, 199, 199))
        );
        panelIPFooterLayout.setVerticalGroup(
            panelIPFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIPFooterLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelIPFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonIPSignOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonIPKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );

        panelIP.add(panelIPFooter);

        getContentPane().add(panelIP, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIPSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIPSignOutActionPerformed
        if (regis != null) {
            if (regis.getNama().equals("")) {
                createAccountAction();
            }
        } else {
            Sign SI = new Sign();
            SI.setLocation(parent.getLocation());
            SI.setVisible(true);

            if (parent.getExtendedState() == Frame.MAXIMIZED_BOTH) {
                SI.setExtendedState(Frame.MAXIMIZED_BOTH);
            } else {
                SI.setSize(parent.getSize());
            }

            parent.dispose();
            dispose();
        }
    }//GEN-LAST:event_buttonIPSignOutActionPerformed

    private void buttonIPKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIPKembaliActionPerformed
        dispose();
    }//GEN-LAST:event_buttonIPKembaliActionPerformed

    private void fieldIPNamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldIPNamaKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            createAccountAction();
        }
    }//GEN-LAST:event_fieldIPNamaKeyPressed

    private void createAccountAction() {
        String nama = fieldIPNama.getText().trim();
        if (nama.equals("")) {
            nama = "User-" + regis.getEmail();
        }

        regis.setNama(nama);

        try {
            regis.registrasiUser();
        } catch (IOException ex) {
            Logger.getLogger(InfoPengguna.class.getName()).log(Level.SEVERE, null, ex);
        }

        PilihanBuku PB = new PilihanBuku(regis);
        PB.setLocation(parent.getLocation());
        PB.setVisible(true);
        
        if (parent.getExtendedState() == Frame.MAXIMIZED_BOTH) {
            PB.setExtendedState(Frame.MAXIMIZED_BOTH);
        } else {
            PB.setSize(parent.getSize());
        }

        parent.dispose();
        dispose();
    }

    private final java.awt.Frame parent;
    private Pembeli pembeli;
    private Regist regis;
    private Konfigurasi konfigurasi;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIPKembali;
    private javax.swing.JButton buttonIPSignOut;
    private javax.swing.JTextField fieldIPEmail;
    private javax.swing.JTextField fieldIPNama;
    private javax.swing.JLabel labelIPEmail;
    private javax.swing.JLabel labelIPNama;
    private javax.swing.JLabel labelSIHeader1;
    private javax.swing.JPanel panelIP;
    private javax.swing.JPanel panelIPBody;
    private javax.swing.JPanel panelIPEmail;
    private javax.swing.JPanel panelIPEmailSupport;
    private javax.swing.JPanel panelIPEmpty;
    private javax.swing.JPanel panelIPFooter;
    private javax.swing.JPanel panelIPHeader;
    private javax.swing.JPanel panelIPNama;
    private javax.swing.JPanel panelIPNamaSupport;
    // End of variables declaration//GEN-END:variables
}
