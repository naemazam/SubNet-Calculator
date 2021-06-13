/*

Give me a cradit when you copy please. 
GitHub: https://github.com/naemazam
 */
package calcuator;

import java.awt.Desktop;
import static java.awt.SystemColor.window;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Naem Azam 
 */
public class MainCalculator extends javax.swing.JFrame {

    /**
     * Creates new form MainCalculator
     */
    public MainCalculator() {
        initComponents();
        setTitle("SubNet Calculator");
    }
//ImageIcon logo = new ImageIcon(".//ras//subnet.ico");
ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("subnet.ico"));
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        oct1 = new javax.swing.JTextField();
        oct2 = new javax.swing.JTextField();
        oct3 = new javax.swing.JTextField();
        oct4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cidrValue = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        networkClass = new javax.swing.JTextField();
        subnetMask = new javax.swing.JTextField();
        networkAddress = new javax.swing.JTextField();
        broadcastAddress = new javax.swing.JTextField();
        noSubnets = new javax.swing.JTextField();
        hostsPSubnet = new javax.swing.JTextField();
        calBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(23, 43, 108));

        jLabel1.setForeground(new java.awt.Color(23, 43, 108));
        jLabel1.setText("IP Address");

        oct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oct1ActionPerformed(evt);
            }
        });

        oct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oct2ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(109, 21, 209));
        jLabel2.setText("CIDR values  /");

        cidrValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidrValueActionPerformed(evt);
            }
        });

        jLabel3.setText("Subnet Mask");

        jLabel4.setText("Network Address");

        jLabel5.setText("Broadcast Address");

        jLabel6.setText("Number of Subnets");

        jLabel7.setText("Hosts Per Subnet");

        jLabel8.setText("Network Class");

        networkClass.setEditable(false);

        subnetMask.setEditable(false);

        networkAddress.setEditable(false);

        broadcastAddress.setEditable(false);

        noSubnets.setBackground(new java.awt.Color(240, 240, 240));

        hostsPSubnet.setBackground(new java.awt.Color(240, 240, 240));
        hostsPSubnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostsPSubnetActionPerformed(evt);
            }
        });

        calBtn.setForeground(new java.awt.Color(64, 87, 162));
        calBtn.setText("Calculate");
        calBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(46, 55, 55));
        jLabel9.setFont(new java.awt.Font("Poor Richard", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(119, 59, 188));
        jLabel9.setText("naem azam ");

        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("HELP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(46, 55, 55));
        jLabel10.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(70, 148, 154));
        jLabel10.setText("SubNet Calculator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oct1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oct2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oct3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oct4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subnetMask)
                    .addComponent(networkAddress)
                    .addComponent(broadcastAddress)
                    .addComponent(noSubnets)
                    .addComponent(hostsPSubnet, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cidrValue, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(networkClass, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(86, 86, 86))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(255, 255, 255)
                    .addComponent(jLabel10)
                    .addContainerGap(285, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oct2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oct3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oct4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidrValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subnetMask, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(networkAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(networkClass, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(broadcastAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noSubnets, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hostsPSubnet, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel9))
                        .addGap(21, 21, 21))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(324, Short.MAX_VALUE)))
        );

        jButton1.getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(700, 396));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calBtnActionPerformed
       if(!oct1.getText().equals("")&&!oct2.getText().equals("")&&!oct3.getText().equals("")&&!oct4.getText().equals("")&&!cidrValue.getText().equals("")){
        
        int oct1v = Integer.parseInt(oct1.getText().toString());
       int oct2v = Integer.parseInt(oct2.getText().toString());
       int oct3v = Integer.parseInt(oct3.getText().toString());
       int oct4v = Integer.parseInt(oct4.getText().toString());
       
       int cidrv = Integer.parseInt(cidrValue.getText().toString());
       
       switch(cidrv){
           case 1: subnetMask.setText("128.0.0.0"); break;
           case 2: subnetMask.setText("192.0.0.0"); break;
           case 3: subnetMask.setText("224.0.0.0"); break;
           case 4: subnetMask.setText("240.0.0.0"); break;
           case 5: subnetMask.setText("248.0.0.0"); break;
           case 6: subnetMask.setText("252.0.0.0"); break;
           case 7: subnetMask.setText("254.0.0.0"); break;
           case 8: subnetMask.setText("255.0.0.0"); break;
           case 9: subnetMask.setText("255.128.0.0"); break;
           case 10: subnetMask.setText("255.192.0.0"); break;
           case 11: subnetMask.setText("255.224.0.0"); break;
           case 12: subnetMask.setText("255.240.0.0"); break;
           case 13: subnetMask.setText("255.248.0.0"); break;
           case 14: subnetMask.setText("255.252.0.0"); break;
           case 15: subnetMask.setText("255.254.0.0"); break;
           case 16: subnetMask.setText("255.255.0.0"); break;
           case 17: subnetMask.setText("255.255.128.0"); break;
           case 18: subnetMask.setText("255.255.192.0"); break;
           case 19: subnetMask.setText("255.255.224.0"); break;
           case 20: subnetMask.setText("255.255.240.0"); break;
           case 21: subnetMask.setText("255.255.248.0"); break;
           case 22: subnetMask.setText("255.255.252.0"); break;
           case 23: subnetMask.setText("255.255.254.0"); break;
           case 24: subnetMask.setText("255.255.255.0"); break;
           case 25: subnetMask.setText("255.255.255.128"); break;
           case 26: subnetMask.setText("255.255.255.192"); break;
           case 27: subnetMask.setText("255.255.255.224"); break;
           case 28: subnetMask.setText("255.255.255.240"); break;
           case 29: subnetMask.setText("255.255.255.248"); break;
           case 30: subnetMask.setText("255.255.255.252"); break;
           case 31: subnetMask.setText("255.255.255.254"); break;
           case 32: subnetMask.setText("255.255.255.255"); break;
               
           default: cidrValue.setText("Invalid");
       } 
       if(oct1v>=0&&oct1v<=127){networkClass.setText("A");
           networkAddress.setText(oct1.getText()+".0.0.0");
           int m;
           
        }
       if(oct1v>=128&&oct1v<=191){networkClass.setText("B");
           networkAddress.setText(oct1.getText()+"."+oct2.getText()+".0.0");
       }
       if(oct1v>=192&&oct1v<=223){networkClass.setText("c");
           networkAddress.setText(oct1.getText()+"."+oct2.getText()+"."+oct3.getText()+".0");
       }
       if(oct1v>=224&&oct1v<=239)networkClass.setText("D");
       if(oct1v>=240&&oct1v<=255)networkClass.setText("E");
       
       broadcastAddress.setText(oct1.getText()+"."+oct2.getText()+"."+oct3.getText()+".255");
       
      
         int value=  32-Integer.parseInt(cidrValue.getText());
         int outPut=(int) Math.pow(2, value);
       hostsPSubnet.setText( ""+outPut ) ;
       
       //now set the no of subnets
       int subnets=Integer.parseInt(hostsPSubnet.getText())/Integer.parseInt(cidrValue.getText());
       
       noSubnets.setText(""+subnets);
       }else{
       JOptionPane.showMessageDialog(null, "please enter IP address and CIDR value!!");
       }
       
    }//GEN-LAST:event_calBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
     oct1.setText("");
      oct2.setText("");
       oct3.setText("");
        oct4.setText("");
        cidrValue.setText("");
        subnetMask.setText("");
        networkAddress.setText("");
        broadcastAddress.setText("");
        noSubnets.setText("");
        hostsPSubnet.setText("");
        networkClass.setText("");
             
    }//GEN-LAST:event_resetBtnActionPerformed

    private void cidrValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidrValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidrValueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Desktop browser = Desktop.getDesktop();
        try{
        browser.browse(new URI("https://github.com/naemazam/SubNet-Calculator"));
        }
        catch(IOException err) {
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
catch(URISyntaxException err) {
    
}
    }
    private void hostsPSubnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostsPSubnetActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_hostsPSubnetActionPerformed

    private void oct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oct1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oct1ActionPerformed

    private void oct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oct2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oct2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainCalculator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField broadcastAddress;
    private javax.swing.JButton calBtn;
    private javax.swing.JTextField cidrValue;
    private javax.swing.JTextField hostsPSubnet;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField networkAddress;
    private javax.swing.JTextField networkClass;
    private javax.swing.JTextField noSubnets;
    private javax.swing.JTextField oct1;
    private javax.swing.JTextField oct2;
    private javax.swing.JTextField oct3;
    private javax.swing.JTextField oct4;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField subnetMask;
    // End of variables declaration//GEN-END:variables
}
