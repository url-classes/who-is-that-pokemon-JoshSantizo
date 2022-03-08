/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import classes.*;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Matul <https://github.com/MigueMat4>
 */
public class frmMain extends javax.swing.JFrame {
    
    Pokemon whoIsThatPokemon; // objeto de la clase que hace match con los datos de la API
    Pokedex dexter = new Pokedex();
    PokeViewer visor = new PokeViewer();
    Reloj horaActual = new Reloj();

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        horaActual.start();
    }
   
    Respuesta1 hilo1 = new Respuesta1();
    Respuesta2 hilo2 = new Respuesta2();
    Respuesta3 hilo3 = new Respuesta3();
    Respuesta4 hilo4 = new Respuesta4();
    imagen5 hilo5 = new imagen5();
    
    public class Respuesta1 extends Thread{
        int z;
        public void run(){
                try {
                    whoIsThatPokemon = dexter.buscarPokemon();
                } catch (IOException ex) {
                    Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
                }
                btnPokemon1.setText(whoIsThatPokemon.getName());
        }
     }
     
     public class Respuesta2 extends Thread{
          int z;
        public void run(){
                try {
                    whoIsThatPokemon = dexter.buscarPokemon();
                } catch (IOException ex) {
                    Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
                }
                btnPokemon2.setText(whoIsThatPokemon.getName());
        }
         
     }
     
     public class Respuesta3 extends Thread{
          int z;
        public void run(){
            

                try {
                    whoIsThatPokemon = dexter.buscarPokemon();
                } catch (IOException ex) {
                    Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
                }
                btnPokemon3.setText(whoIsThatPokemon.getName());
            
            
        }
       
     }
     
     public class Respuesta4 extends Thread{
          int z;
        public void run(){
            
           
                try {
                    whoIsThatPokemon = dexter.buscarPokemon();
                } catch (IOException ex) {
                    Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
                }
                btnPokemon4.setText(whoIsThatPokemon.getName());
            
            
        }
        
     }
     public class imagen5 extends Thread{
         boolean activo=true;
         
         @Override
         public void run(){
             
             try {
                 whoIsThatPokemon = dexter.buscarPokemon();
             } catch (IOException ex) {
                 Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InterruptedException ex) {
                 Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
             }
            
             Random num = new Random();
             
             if (num.nextInt() == 1){
                 btnPokemon1.setText(whoIsThatPokemon.getName());
                 hilo1.z=1;
             }
             
             if (num.nextInt() == 2){
                  btnPokemon2.setText(whoIsThatPokemon.getName());
                  hilo2.z=1;
             }
             
             if (num.nextInt() == 3){
                  btnPokemon3.setText(whoIsThatPokemon.getName());
                   hilo3.z=1;
             }
             
             if (num.nextInt() == 4){
                 btnPokemon4.setText(whoIsThatPokemon.getName());
                  hilo4.z=1;
             } 
             
         }
         
     }
    
    
    public class PokeViewer {
        public void mostrarSprites() {
            if (whoIsThatPokemon != null){
                try {
                    lblSprite.setText("");
                    // obtengo la url del listado de cada uno de los sprites que me dio la API
                    URL url = new URL(whoIsThatPokemon.getSprites().get("front_default").toString());
                    Image img = ImageIO.read(url);
                    lblSprite.setIcon(new ImageIcon(img));
                    // 1 segundo para cada cambio de sprite
                    Thread.sleep(1000);
                        
                    url = new URL(whoIsThatPokemon.getSprites().get("back_default").toString());
                    img = ImageIO.read(url);
                    lblSprite.setIcon(new ImageIcon(img));
                    Thread.sleep(1000);
                } catch (MalformedURLException ex) {
                    Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException | IOException ex) {
                    Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                lblSprite.setText("?");
                btnPokemon1.setText("???");
                btnPokemon2.setText("???");
                btnPokemon3.setText("???");
                btnPokemon4.setText("???");
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSprite = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnPokemon1 = new javax.swing.JButton();
        btnPokemon2 = new javax.swing.JButton();
        btnPokemon3 = new javax.swing.JButton();
        btnPokemon4 = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        lblHoraSistema = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSprite.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblSprite.setText("?");

        btnPokemon1.setText("???");
        btnPokemon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPokemon1ActionPerformed(evt);
            }
        });

        btnPokemon2.setText("???");
        btnPokemon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPokemon2ActionPerformed(evt);
            }
        });

        btnPokemon3.setText("???");
        btnPokemon3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPokemon3ActionPerformed(evt);
            }
        });

        btnPokemon4.setText("???");
        btnPokemon4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPokemon4ActionPerformed(evt);
            }
        });

        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        lblHoraSistema.setText("Hora sistema");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnPokemon4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPokemon3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPokemon2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPokemon1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 124, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHoraSistema)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSprite)
                                .addGap(148, 148, 148)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHoraSistema)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSprite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnPokemon1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPokemon2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPokemon3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPokemon4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        
        hilo1 = new Respuesta1();
        hilo2 = new Respuesta2();
        hilo3 = new Respuesta3();
        hilo4 = new Respuesta4();
        hilo5 = new imagen5();
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        btnJugar.setText("Jugar de nuevo");
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnPokemon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPokemon1ActionPerformed
        // TODO add your handling code here:
        
        if (whoIsThatPokemon.getName() == btnPokemon1.getText()){
            JOptionPane.showMessageDialog(frmMain.this," FELICIDADES, GANADOR!!!");
        }

    }//GEN-LAST:event_btnPokemon1ActionPerformed

    private void btnPokemon3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPokemon3ActionPerformed
        // TODO add your handling code here:
        if (whoIsThatPokemon.getName() == btnPokemon3.getText()){
            JOptionPane.showMessageDialog(frmMain.this," FELICIDADES, GANADOR!!!");
        }
    }//GEN-LAST:event_btnPokemon3ActionPerformed

    private void btnPokemon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPokemon2ActionPerformed
        // TODO add your handling code here:
        if (whoIsThatPokemon.getName() == btnPokemon2.getText()){
            JOptionPane.showMessageDialog(frmMain.this," FELICIDADES, GANADOR!!!");
        }
    }//GEN-LAST:event_btnPokemon2ActionPerformed

    private void btnPokemon4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPokemon4ActionPerformed
        // TODO add your handling code here:
        if (whoIsThatPokemon.getName() == btnPokemon4.getText()){
            JOptionPane.showMessageDialog(frmMain.this," FELICIDADES, GANADOR!!!");
        }
    }//GEN-LAST:event_btnPokemon4ActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }
    
    // clase para la hora del sistema. ¡No modificar!
    public class Reloj extends Thread {
        Calendar calendario;
        
        @Override
        public void run() {
            while (true) {
                String horaSistema = "";
                calendario = Calendar.getInstance();
                if (calendario.get(Calendar.HOUR_OF_DAY)<10)
                    horaSistema += String.valueOf("0"+calendario.get(Calendar.HOUR_OF_DAY)) + ":";
                else
                    horaSistema += String.valueOf(calendario.get(Calendar.HOUR_OF_DAY)) + ":";
                if (calendario.get(Calendar.MINUTE)<10)
                    horaSistema += String.valueOf("0"+calendario.get(Calendar.MINUTE)) + ":";
                else
                    horaSistema += String.valueOf(calendario.get(Calendar.MINUTE)) + ":";
                if (calendario.get(Calendar.SECOND)<10)
                    horaSistema += String.valueOf("0"+calendario.get(Calendar.SECOND)) + ":";
                else
                    horaSistema += String.valueOf(calendario.get(Calendar.SECOND)) + ":";
                horaSistema += String.valueOf(calendario.get(Calendar.MILLISECOND)) + " hrs";
                lblHoraSistema.setText(horaSistema);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnPokemon1;
    private javax.swing.JButton btnPokemon2;
    private javax.swing.JButton btnPokemon3;
    private javax.swing.JButton btnPokemon4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblHoraSistema;
    private javax.swing.JLabel lblSprite;
    // End of variables declaration//GEN-END:variables
}
