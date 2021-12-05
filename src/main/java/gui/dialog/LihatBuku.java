package gui.dialog;

import classes.Buku;
import classes.Pembeli;
import database.Konfigurasi;
import java.awt.FontFormatException;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class LihatBuku extends javax.swing.JDialog {

    public LihatBuku(java.awt.Frame parent, Buku buku, Pembeli pembeli) {
        this.parent = parent;
        this.buku = buku;
        this.pembeli = pembeli;
        
        try {
            this.konfigurasi = new Konfigurasi();
            this.cover = ImageIO.read(new File("src/main/java/database/" + buku.getDir()))
                    .getScaledInstance(120, 180, Image.SCALE_AREA_AVERAGING);
        } catch (IOException | FontFormatException ex) {
            Logger.getLogger(LihatBuku.class.getName()).log(Level.SEVERE, null, ex);
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

        panelLB = new javax.swing.JPanel();
        panelLBBody1 = new javax.swing.JPanel();
        panelLBCover = new javax.swing.JPanel();
        panelLBCoverSupport = new javax.swing.JPanel();
        labelLBCover = new javax.swing.JLabel();
        panelLBRating = new javax.swing.JLabel();
        panelLBJudul = new javax.swing.JLabel();
        panelLBPenulis = new javax.swing.JLabel();
        panelLBKategori = new javax.swing.JLabel();
        panelLBHarga = new javax.swing.JLabel();
        panelLBBody2 = new javax.swing.JPanel();
        scrollPaneLB = new javax.swing.JScrollPane();
        textAreaLBReview = new javax.swing.JTextArea();
        panelLBFooter = new javax.swing.JPanel();
        buttonLBKeranjang = new javax.swing.JButton();
        buttonLBKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("YukBeliYuk - Lihat Buku");
        setModal(true);
        setPreferredSize(new java.awt.Dimension(600, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 450));

        panelLB.setBackground(new java.awt.Color(254, 250, 224));
        panelLB.setMaximumSize(new java.awt.Dimension(600, 450));
        panelLB.setMinimumSize(new java.awt.Dimension(600, 450));
        panelLB.setLayout(new javax.swing.BoxLayout(panelLB, javax.swing.BoxLayout.PAGE_AXIS));

        panelLBBody1.setBackground(new java.awt.Color(254, 250, 224));
        panelLBBody1.setMaximumSize(new java.awt.Dimension(600, 225));
        panelLBBody1.setMinimumSize(new java.awt.Dimension(600, 225));
        panelLBBody1.setPreferredSize(new java.awt.Dimension(600, 225));
        java.awt.GridBagLayout panelLBBody1Layout = new java.awt.GridBagLayout();
        panelLBBody1Layout.columnWidths = new int[] {0, 10, 0, 10, 0, 10, 0};
        panelLBBody1Layout.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0};
        panelLBBody1.setLayout(panelLBBody1Layout);

        panelLBCover.setMaximumSize(new java.awt.Dimension(120, 180));
        panelLBCover.setMinimumSize(new java.awt.Dimension(120, 180));
        panelLBCover.setPreferredSize(new java.awt.Dimension(120, 180));

        panelLBCoverSupport.setMaximumSize(new java.awt.Dimension(120, 180));
        panelLBCoverSupport.setMinimumSize(new java.awt.Dimension(120, 180));
        panelLBCoverSupport.setLayout(new java.awt.BorderLayout());

        labelLBCover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLBCover.setIcon(new ImageIcon(cover));
        labelLBCover.setMaximumSize(new java.awt.Dimension(120, 180));
        labelLBCover.setMinimumSize(new java.awt.Dimension(120, 180));
        labelLBCover.setPreferredSize(new java.awt.Dimension(120, 180));
        panelLBCoverSupport.add(labelLBCover, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout panelLBCoverLayout = new javax.swing.GroupLayout(panelLBCover);
        panelLBCover.setLayout(panelLBCoverLayout);
        panelLBCoverLayout.setHorizontalGroup(
            panelLBCoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLBCoverSupport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLBCoverLayout.setVerticalGroup(
            panelLBCoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLBCoverSupport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 7;
        panelLBBody1.add(panelLBCover, gridBagConstraints);

        panelLBRating.setFont(konfigurasi.getAwesome(36));
        panelLBRating.setForeground(new java.awt.Color(204, 213, 174));
        panelLBRating.setText(getStar(buku.getRating()));
        panelLBRating.setPreferredSize(new java.awt.Dimension(400, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelLBBody1.add(panelLBRating, gridBagConstraints);

        panelLBJudul.setFont(konfigurasi.getRoboto(24));
        panelLBJudul.setText(String.format("<html><div WIDTH=%d>%s</div></html>", 400, buku.getJudul()));
        panelLBJudul.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelLBJudul.setMaximumSize(new java.awt.Dimension(400, 90));
        panelLBJudul.setMinimumSize(new java.awt.Dimension(400, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelLBBody1.add(panelLBJudul, gridBagConstraints);

        panelLBPenulis.setFont(konfigurasi.getRoboto(14));
        panelLBPenulis.setText("<html>" + buku.getPenulis() + "</html>");
        panelLBPenulis.setPreferredSize(new java.awt.Dimension(400, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelLBBody1.add(panelLBPenulis, gridBagConstraints);

        panelLBKategori.setFont(konfigurasi.getRoboto(12));
        panelLBKategori.setForeground(new java.awt.Color(128, 128, 128));
        panelLBKategori.setText(buku.getKategori());
        panelLBKategori.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panelLBKategori.setPreferredSize(new java.awt.Dimension(400, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        panelLBBody1.add(panelLBKategori, gridBagConstraints);

        panelLBHarga.setFont(konfigurasi.getRoboto(24));
        panelLBHarga.setText("Rp. " + String.format("%,d", (int) buku.getHarga()).replace(',', '.'));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_END;
        panelLBBody1.add(panelLBHarga, gridBagConstraints);

        panelLB.add(panelLBBody1);

        panelLBBody2.setBackground(new java.awt.Color(254, 250, 224));
        panelLBBody2.setLayout(new java.awt.GridBagLayout());

        scrollPaneLB.setBorder(null);
        scrollPaneLB.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneLB.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scrollPaneLB.setMaximumSize(new java.awt.Dimension(550, 150));
        scrollPaneLB.setMinimumSize(new java.awt.Dimension(550, 120));
        scrollPaneLB.setPreferredSize(new java.awt.Dimension(550, 150));

        textAreaLBReview.setEditable(false);
        textAreaLBReview.setBackground(new java.awt.Color(254, 250, 224));
        textAreaLBReview.setColumns(20);
        textAreaLBReview.setFont(konfigurasi.getRoboto(12));
        textAreaLBReview.setText("No Review");
        textAreaLBReview.setWrapStyleWord(true);
        textAreaLBReview.setBorder(null);
        scrollPaneLB.setViewportView(textAreaLBReview);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        panelLBBody2.add(scrollPaneLB, gridBagConstraints);

        panelLB.add(panelLBBody2);

        panelLBFooter.setBackground(new java.awt.Color(250, 237, 205));
        panelLBFooter.setMaximumSize(new java.awt.Dimension(600, 75));
        panelLBFooter.setMinimumSize(new java.awt.Dimension(600, 75));

        buttonLBKeranjang.setBackground(new java.awt.Color(212, 163, 115));
        buttonLBKeranjang.setFont(konfigurasi.getRobotoBold(14));
        buttonLBKeranjang.setText("Masukkan Keranjang");
        buttonLBKeranjang.setMaximumSize(new java.awt.Dimension(175, 50));
        buttonLBKeranjang.setMinimumSize(new java.awt.Dimension(175, 50));
        buttonLBKeranjang.setPreferredSize(new java.awt.Dimension(175, 50));
        buttonLBKeranjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLBKeranjangActionPerformed(evt);
            }
        });

        buttonLBKembali.setBackground(new java.awt.Color(212, 163, 115));
        buttonLBKembali.setFont(konfigurasi.getRobotoBold(14));
        buttonLBKembali.setText("Kembali");
        buttonLBKembali.setMaximumSize(new java.awt.Dimension(175, 50));
        buttonLBKembali.setMinimumSize(new java.awt.Dimension(175, 50));
        buttonLBKembali.setPreferredSize(new java.awt.Dimension(175, 50));
        buttonLBKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLBKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLBFooterLayout = new javax.swing.GroupLayout(panelLBFooter);
        panelLBFooter.setLayout(panelLBFooterLayout);
        panelLBFooterLayout.setHorizontalGroup(
            panelLBFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLBFooterLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(buttonLBKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLBKeranjang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(199, 199, 199))
        );
        panelLBFooterLayout.setVerticalGroup(
            panelLBFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLBFooterLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelLBFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLBKeranjang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLBKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );

        panelLB.add(panelLBFooter);

        getContentPane().add(panelLB, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLBKeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLBKeranjangActionPerformed
        // TODO add your handling code here:
        if (pembeli.getNama().equals("Guest")) {
            dispose();

            GuestAlert dSI = new GuestAlert(parent);
            dSI.setLocationRelativeTo(null);
            dSI.setVisible(true);
        } else {           
            dispose();
            
            pembeli.addBuku(buku.getKode(), buku);
        }
    }//GEN-LAST:event_buttonLBKeranjangActionPerformed

    private void buttonLBKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLBKembaliActionPerformed
        dispose();
    }//GEN-LAST:event_buttonLBKembaliActionPerformed

    private String getStar(double rating) {
        String stars = "";
        
        for (int i = 0; i < (int) rating; i++) {
            stars += "\uf005";
        }
        
        if (rating - (int) rating == 0.5) {
            stars += "\uf089";
        }
        
        return stars;
    }
        
    private final Buku buku;
    private final Pembeli pembeli;
    private final java.awt.Frame parent;
    private Image cover;
    private Konfigurasi konfigurasi;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLBKembali;
    private javax.swing.JButton buttonLBKeranjang;
    private javax.swing.JLabel labelLBCover;
    private javax.swing.JPanel panelLB;
    private javax.swing.JPanel panelLBBody1;
    private javax.swing.JPanel panelLBBody2;
    private javax.swing.JPanel panelLBCover;
    private javax.swing.JPanel panelLBCoverSupport;
    private javax.swing.JPanel panelLBFooter;
    private javax.swing.JLabel panelLBHarga;
    private javax.swing.JLabel panelLBJudul;
    private javax.swing.JLabel panelLBKategori;
    private javax.swing.JLabel panelLBPenulis;
    private javax.swing.JLabel panelLBRating;
    private javax.swing.JScrollPane scrollPaneLB;
    private javax.swing.JTextArea textAreaLBReview;
    // End of variables declaration//GEN-END:variables
}
