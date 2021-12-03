package gui;

import classes.Pembeli;
import classes.Regist;//penambahan import
import java.io.IOException;
import database.DataBase;
import java.awt.CardLayout;


public class Sign extends javax.swing.JFrame {

    /**
     * Creates new form SignIn
     */
    public Sign() {
        initComponents();
        this.card = (CardLayout) getContentPane().getLayout();
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

        panelSIBackground = new javax.swing.JPanel();
        panelSI = new javax.swing.JPanel();
        labelSIEmail = new javax.swing.JLabel();
        fieldSIEmail = new javax.swing.JTextField();
        labelSIPassword = new javax.swing.JLabel();
        fieldSIPassword = new javax.swing.JPasswordField();
        buttonSignIn = new javax.swing.JButton();
        buttonCreateAccount = new javax.swing.JButton();
        buttonSignAsGuest = new javax.swing.JButton();
        panelSISupport = new javax.swing.JPanel();
        labelSITitle = new javax.swing.JLabel();
        panelSUBackground = new javax.swing.JPanel();
        panelSU = new javax.swing.JPanel();
        labelSUEmail = new javax.swing.JLabel();
        fieldSUEmail = new javax.swing.JTextField();
        labelSUPassword = new javax.swing.JLabel();
        fieldSUPassword = new javax.swing.JPasswordField();
        labelSUConPassword = new javax.swing.JLabel();
        fieldSUConPassword = new javax.swing.JPasswordField();
        buttonCancel = new javax.swing.JButton();
        buttonSignUp = new javax.swing.JButton();
        panelSUSupport = new javax.swing.JPanel();
        labelSUTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("YukBacaYuk - Sign In");
        setMinimumSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new java.awt.CardLayout());

        panelSIBackground.setBackground(new java.awt.Color(204, 213, 174));
        panelSIBackground.setToolTipText(null);
        panelSIBackground.setLayout(new java.awt.GridBagLayout());

        panelSI.setBackground(new java.awt.Color(233, 237, 201));
        panelSI.setMaximumSize(new java.awt.Dimension(400, 300));
        panelSI.setMinimumSize(new java.awt.Dimension(400, 300));
        panelSI.setPreferredSize(new java.awt.Dimension(400, 300));
        java.awt.GridBagLayout panelSignLayout = new java.awt.GridBagLayout();
        panelSignLayout.columnWidths = new int[] {0, 0, 0};
        panelSignLayout.rowHeights = new int[] {0, 20, 0, 20, 0};
        panelSI.setLayout(panelSignLayout);

        labelSIEmail.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelSIEmail.setText("Email:");
        labelSIEmail.setMaximumSize(new java.awt.Dimension(40, 15));
        labelSIEmail.setMinimumSize(new java.awt.Dimension(40, 15));
        labelSIEmail.setPreferredSize(new java.awt.Dimension(40, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelSI.add(labelSIEmail, gridBagConstraints);

        fieldSIEmail.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fieldSIEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldSIEmail.setPreferredSize(new java.awt.Dimension(300, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panelSI.add(fieldSIEmail, gridBagConstraints);

        labelSIPassword.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelSIPassword.setText("Password:");
        labelSIPassword.setMaximumSize(new java.awt.Dimension(66, 15));
        labelSIPassword.setMinimumSize(new java.awt.Dimension(66, 15));
        labelSIPassword.setPreferredSize(new java.awt.Dimension(66, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelSI.add(labelSIPassword, gridBagConstraints);

        fieldSIPassword.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fieldSIPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldSIPassword.setPreferredSize(new java.awt.Dimension(300, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panelSI.add(fieldSIPassword, gridBagConstraints);

        buttonSignIn.setBackground(new java.awt.Color(204, 213, 174));
        buttonSignIn.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        buttonSignIn.setText("Sign In");
        buttonSignIn.setMaximumSize(new java.awt.Dimension(150, 50));
        buttonSignIn.setMinimumSize(new java.awt.Dimension(150, 50));
        buttonSignIn.setPreferredSize(new java.awt.Dimension(150, 50));
        buttonSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignInActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        panelSI.add(buttonSignIn, gridBagConstraints);

        buttonCreateAccount.setBackground(new java.awt.Color(204, 213, 174));
        buttonCreateAccount.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        buttonCreateAccount.setText("Create Account");
        buttonCreateAccount.setPreferredSize(new java.awt.Dimension(150, 25));
        buttonCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateAccountActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        panelSI.add(buttonCreateAccount, gridBagConstraints);

        buttonSignAsGuest.setBackground(new java.awt.Color(204, 213, 174));
        buttonSignAsGuest.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        buttonSignAsGuest.setText("Sign As Guest");
        buttonSignAsGuest.setPreferredSize(new java.awt.Dimension(150, 25));
        buttonSignAsGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignAsGuestActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        panelSI.add(buttonSignAsGuest, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        panelSIBackground.add(panelSI, gridBagConstraints);

        panelSISupport.setBackground(new java.awt.Color(204, 213, 174));
        panelSISupport.setPreferredSize(new java.awt.Dimension(600, 450));
        panelSISupport.setLayout(new java.awt.BorderLayout());

        labelSITitle.setFont(new java.awt.Font("Philosopher", 0, 48)); // NOI18N
        labelSITitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSITitle.setText("YukBacaYuk");
        labelSITitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panelSISupport.add(labelSITitle, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        panelSIBackground.add(panelSISupport, gridBagConstraints);

        getContentPane().add(panelSIBackground, "SignIn");

        panelSUBackground.setBackground(new java.awt.Color(204, 213, 174));
        panelSUBackground.setToolTipText(null);
        panelSUBackground.setMinimumSize(new java.awt.Dimension(800, 600));
        panelSUBackground.setPreferredSize(new java.awt.Dimension(800, 600));
        panelSUBackground.setLayout(new java.awt.GridBagLayout());

        panelSU.setBackground(new java.awt.Color(233, 237, 201));
        panelSU.setPreferredSize(new java.awt.Dimension(400, 350));
        java.awt.GridBagLayout panelSULayout = new java.awt.GridBagLayout();
        panelSULayout.columnWidths = new int[] {0, 0, 0, 0};
        panelSULayout.rowHeights = new int[] {0, 20, 0, 20, 0, 20, 0};
        panelSU.setLayout(panelSULayout);

        labelSUEmail.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelSUEmail.setText("Email:");
        labelSUEmail.setMaximumSize(new java.awt.Dimension(40, 15));
        labelSUEmail.setMinimumSize(new java.awt.Dimension(40, 15));
        labelSUEmail.setPreferredSize(new java.awt.Dimension(40, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelSU.add(labelSUEmail, gridBagConstraints);

        fieldSUEmail.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fieldSUEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldSUEmail.setPreferredSize(new java.awt.Dimension(300, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panelSU.add(fieldSUEmail, gridBagConstraints);

        labelSUPassword.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelSUPassword.setText("Password:");
        labelSUPassword.setMaximumSize(new java.awt.Dimension(40, 15));
        labelSUPassword.setMinimumSize(new java.awt.Dimension(40, 15));
        labelSUPassword.setPreferredSize(new java.awt.Dimension(40, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelSU.add(labelSUPassword, gridBagConstraints);

        fieldSUPassword.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fieldSUPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldSUPassword.setPreferredSize(new java.awt.Dimension(300, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panelSU.add(fieldSUPassword, gridBagConstraints);

        labelSUConPassword.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelSUConPassword.setText("Confirm Password:");
        labelSUConPassword.setMaximumSize(new java.awt.Dimension(40, 15));
        labelSUConPassword.setMinimumSize(new java.awt.Dimension(40, 15));
        labelSUConPassword.setPreferredSize(new java.awt.Dimension(40, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelSU.add(labelSUConPassword, gridBagConstraints);

        fieldSUConPassword.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fieldSUConPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldSUConPassword.setPreferredSize(new java.awt.Dimension(300, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panelSU.add(fieldSUConPassword, gridBagConstraints);

        buttonCancel.setBackground(new java.awt.Color(204, 213, 174));
        buttonCancel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        buttonCancel.setText("Cancel");
        buttonCancel.setMaximumSize(new java.awt.Dimension(150, 50));
        buttonCancel.setMinimumSize(new java.awt.Dimension(150, 50));
        buttonCancel.setPreferredSize(new java.awt.Dimension(150, 50));
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelSU.add(buttonCancel, gridBagConstraints);

        buttonSignUp.setBackground(new java.awt.Color(204, 213, 174));
        buttonSignUp.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        buttonSignUp.setText("Sign Up");
        buttonSignUp.setMaximumSize(new java.awt.Dimension(150, 50));
        buttonSignUp.setMinimumSize(new java.awt.Dimension(150, 50));
        buttonSignUp.setPreferredSize(new java.awt.Dimension(150, 50));
        buttonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignUpActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        panelSU.add(buttonSignUp, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        panelSUBackground.add(panelSU, gridBagConstraints);

        panelSUSupport.setBackground(new java.awt.Color(204, 213, 174));
        panelSUSupport.setPreferredSize(new java.awt.Dimension(600, 450));
        panelSUSupport.setLayout(new java.awt.BorderLayout());

        labelSUTitle.setFont(new java.awt.Font("Philosopher", 0, 48)); // NOI18N
        labelSUTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSUTitle.setText("YukDaftarYuk");
        labelSUTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panelSUSupport.add(labelSUTitle, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        panelSUBackground.add(panelSUSupport, gridBagConstraints);

        getContentPane().add(panelSUBackground, "SignUp");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignInActionPerformed
        // TODO Buat handler untuk pengecekan email dan password. Kemudian Masuk Next Halaman
        String email = fieldSIEmail.getText().trim();
        String passW = String.valueOf(fieldSIPassword.getPassword());

        // if (validateIN(email, passW)) {
        //     toTheNextPage();
        // }
        
    }//GEN-LAST:event_buttonSignInActionPerformed

    private void buttonCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateAccountActionPerformed
        card.show(getContentPane(), "SignUp");
    }//GEN-LAST:event_buttonCreateAccountActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        card.show(getContentPane(), "SignIn");
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignUpActionPerformed
        // TODO Buat handler untuk pengecekan email dan password. Kemudian Daftar
        String email = fieldSUEmail.getText().trim();
        String passW = String.valueOf(fieldSUPassword.getPassword());
        String passC = String.valueOf(fieldSUConPassword.getPassword());
        
        // if (validateUP(email, passW, passC)) {
        //     toTheNextPage();
        // } //comment semntara
        
    }//GEN-LAST:event_buttonSignUpActionPerformed

    private void buttonSignAsGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignAsGuestActionPerformed
        toTheNextPage();
    }//GEN-LAST:event_buttonSignAsGuestActionPerformed

    private void toTheNextPage() {
        PilihanBuku PB = new PilihanBuku();
        PB.setLocation(getLocation());
        PB.setSize(getSize());
        PB.setVisible(true);
        
        dispose();
    }
    
    /**
     * TODO 1. 
     * Validasikan email dan passW ada di database.
     * Pastikan passW itu memang milik si email.
     * Jika berhasil return true.
     * Jika gagal return false.
     */
    //ubah modifier semntara untuk testing uji:)
    private boolean validateIN(Regist pembeli) throws IOException{
        boolean cek = pembeli.cekNamaPembeli();
        if(cek == true){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * TODO 2.
     * Validasikan apabila passW dan passC itu sama.
     * Validasikan tidak ada email yang sama di database.
     * Jika berhasil return true.
     * Jika gagal return false.
     */

   
    private boolean validateUP(Regist pembeli, String passC) throws IOException{
        boolean cek;
        System.out.println(pembeli.getPassword()+pembeli.getEmail());
        if(pembeli.getPassword().equalsIgnoreCase(passC)){
            cek = pembeli.cekNamaPembeli();
            if(cek == true){
                return false;
            }else{
                pembeli.registrasiUser();
                return true;
            }

        }else{
            return false;
        }
    }
    
    private final CardLayout card;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonCreateAccount;
    private javax.swing.JButton buttonSignAsGuest;
    private javax.swing.JButton buttonSignIn;
    private javax.swing.JButton buttonSignUp;
    private javax.swing.JTextField fieldSIEmail;
    private javax.swing.JPasswordField fieldSIPassword;
    private javax.swing.JPasswordField fieldSUConPassword;
    private javax.swing.JTextField fieldSUEmail;
    private javax.swing.JPasswordField fieldSUPassword;
    private javax.swing.JLabel labelSIEmail;
    private javax.swing.JLabel labelSIPassword;
    private javax.swing.JLabel labelSITitle;
    private javax.swing.JLabel labelSUConPassword;
    private javax.swing.JLabel labelSUEmail;
    private javax.swing.JLabel labelSUPassword;
    private javax.swing.JLabel labelSUTitle;
    private javax.swing.JPanel panelSI;
    private javax.swing.JPanel panelSIBackground;
    private javax.swing.JPanel panelSISupport;
    private javax.swing.JPanel panelSU;
    private javax.swing.JPanel panelSUBackground;
    private javax.swing.JPanel panelSUSupport;
    // End of variables declaration//GEN-END:variables
}
