/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package UI;

import java.awt.Image;
import javax.swing.ImageIcon;
import untils.XImage;

/**
 *
 * @author ASUS
 */
public class dashboardDialog extends javax.swing.JDialog {

    /**
     * Creates new form dashboard
     */
         void init(){
        setIconImage(XImage.getAppIcon());
        setTitle("VINFAST SHOWROOM MANAGEMENT");
        setLocationRelativeTo(null);
        // set logo
        int hight1 = lbl_logo.getHeight();
        int width1 = lbl_logo.getWidth();
        ImageIcon login_img1 = new ImageIcon("E:\\Desktop\\F_poly\\SPRING_24\\DUAN1\\project1\\src\\main\\resources\\imgs\\bigLogo.png");
        Image background_login1 = login_img1.getImage().getScaledInstance(width1, hight1, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon(background_login1);
         lbl_logo.setIcon(scaledIcon1); 
    }
    
    public dashboardDialog() {
    new dlg_login(null, true).setVisible(true);  
        initComponents();
        setLocationRelativeTo(null);
        initComponents();
        init();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();
        jToolBar9 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jToolBar4 = new javax.swing.JToolBar();
        jLabel11 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jToolBar5 = new javax.swing.JToolBar();
        jLabel5 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jToolBar6 = new javax.swing.JToolBar();
        jLabel3 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jToolBar10 = new javax.swing.JToolBar();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jToolBar11 = new javax.swing.JToolBar();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jToolBar12 = new javax.swing.JToolBar();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jToolBar8 = new javax.swing.JToolBar();
        lbl_carIcon = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jToolBar13 = new javax.swing.JToolBar();
        lbl_reparing = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jToolBar14 = new javax.swing.JToolBar();
        jLabel15 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jToolBar15 = new javax.swing.JToolBar();
        jLabel16 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1333, 750));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("   Chức năng");

        jToolBar2.setRollover(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fn_icon/icons8-homepage-35.png"))); // NOI18N
        jToolBar2.add(jLabel2);

        jToolBar9.setRollover(true);
        jToolBar2.add(jToolBar9);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Bảng điều khiển");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton1);

        jToolBar1.setRollover(true);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fn_icon/icons8-statistics-35.png"))); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(38, 32));
        jToolBar1.add(jLabel10);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Thống kê doanh thu");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        jToolBar3.setRollover(true);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fn_icon/icons8-calendar-35.png"))); // NOI18N
        jLabel13.setPreferredSize(new java.awt.Dimension(38, 32));
        jToolBar3.add(jLabel13);

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Lịch giao xe");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton3);

        jToolBar4.setRollover(true);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fn_icon/icons8-transaction-35.png"))); // NOI18N
        jLabel11.setPreferredSize(new java.awt.Dimension(38, 32));
        jToolBar4.add(jLabel11);

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton7.setText("Lịch sử giao dịch");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar4.add(jButton7);

        jToolBar5.setRollover(true);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fn_icon/icons8-history-35.png"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(38, 32));
        jToolBar5.add(jLabel5);

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton8.setText("Lịch sử nhập hàng");
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar5.add(jButton8);

        jToolBar6.setRollover(true);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fn_icon/icons8-repairing-35.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(38, 32));
        jToolBar6.add(jLabel3);

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton9.setText("Lịch sửa chữa bảo hành");
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar6.add(jButton9);

        jToolBar10.setRollover(true);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fn_icon/icons8-branch-35.png"))); // NOI18N
        jLabel9.setPreferredSize(new java.awt.Dimension(38, 32));
        jToolBar10.add(jLabel9);

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setText("Chi nhánh");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar10.add(jButton4);

        jToolBar11.setRollover(true);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fn_icon/icons8-employee-35.png"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(38, 32));
        jToolBar11.add(jLabel7);

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setText("Nhân viên");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar11.add(jButton5);

        jToolBar12.setRollover(true);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fn_icon/icons8-customer-35.png"))); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(38, 32));
        jToolBar12.add(jLabel8);

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton6.setText("Khách hàng");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar12.add(jButton6);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel12.setText("Quản lý");

        jToolBar8.setRollover(true);

        lbl_carIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fn_icon/icons8-car-35.png"))); // NOI18N
        lbl_carIcon.setText("jLabel6");
        lbl_carIcon.setMaximumSize(new java.awt.Dimension(35, 35));
        lbl_carIcon.setMinimumSize(new java.awt.Dimension(35, 35));
        lbl_carIcon.setPreferredSize(new java.awt.Dimension(35, 35));
        jToolBar8.add(lbl_carIcon);

        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton11.setText("Sản phẩm");
        jButton11.setFocusable(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar8.add(jButton11);

        jToolBar13.setRollover(true);

        lbl_reparing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fn_icon/icons8-service-35.png"))); // NOI18N
        jToolBar13.add(lbl_reparing);

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton12.setText("Bảo dưỡng và dịch vụ");
        jButton12.setFocusable(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar13.add(jButton12);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel14.setText("Khác");

        jToolBar14.setRollover(true);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Icons/process.png"))); // NOI18N
        jToolBar14.add(jLabel15);

        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton13.setText("Cài đặt");
        jButton13.setFocusable(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar14.add(jButton13);

        jToolBar15.setRollover(true);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Icons/info.png"))); // NOI18N
        jToolBar15.add(jLabel16);

        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton14.setText("Hỗ trợ");
        jButton14.setFocusable(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar15.add(jButton14);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jToolBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jToolBar3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jToolBar4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jToolBar5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jToolBar6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jToolBar10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jToolBar11, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jToolBar12, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jToolBar2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 208, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(jToolBar8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jToolBar13, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jLabel14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 179, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jToolBar14, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jToolBar15, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jToolBar2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jToolBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jToolBar3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jToolBar4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jToolBar5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jToolBar6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel12)
                .add(11, 11, 11)
                .add(jToolBar10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jToolBar11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jToolBar12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jToolBar8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jToolBar13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jToolBar14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jToolBar15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(35, 35, 35)
                .add(lbl_logo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .add(lbl_logo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(14, 14, 14))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("BẢNG ĐIỀU KHIỂN");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 767, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 630, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(36, 36, 36)
                        .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 218, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(1, 1, 1)
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(dashboardDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboardDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboardDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboardDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboardDialog().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar10;
    private javax.swing.JToolBar jToolBar11;
    private javax.swing.JToolBar jToolBar12;
    private javax.swing.JToolBar jToolBar13;
    private javax.swing.JToolBar jToolBar14;
    private javax.swing.JToolBar jToolBar15;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JToolBar jToolBar6;
    private javax.swing.JToolBar jToolBar8;
    private javax.swing.JToolBar jToolBar9;
    private javax.swing.JLabel lbl_carIcon;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_reparing;
    // End of variables declaration//GEN-END:variables
}
