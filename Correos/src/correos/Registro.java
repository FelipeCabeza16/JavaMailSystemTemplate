/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correos;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Felipe Cabeza @felipecabeza16
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        this.getContentPane().setBackground(new Color(0x848484));
        
        
        jLabel1.setFont(new Font(Font.DIALOG, Font.BOLD, 30) );
        jLabel1.setForeground(Color.cyan);
        
        jLabel9.setFont(new Font(Font.DIALOG, Font.BOLD, 15) );
        jLabel9.setForeground(Color.ORANGE);
        
        
        jLabel2.setFont(new Font(Font.DIALOG, Font.BOLD, 13) );
        jLabel2.setForeground(Color.white);
        jLabel3.setFont(new Font(Font.DIALOG, Font.BOLD, 13) );
        jLabel3.setForeground(Color.white);
        jLabel4.setFont(new Font(Font.DIALOG, Font.BOLD, 13) );
        jLabel4.setForeground(Color.white);
        jLabel6.setFont(new Font(Font.DIALOG, Font.BOLD, 13) );
        jLabel6.setForeground(Color.white);
        jLabel8.setFont(new Font(Font.DIALOG, Font.BOLD, 13) );
        jLabel8.setForeground(Color.white);
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setText("REGISTRO");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Correo");

        jLabel4.setText("Contraseña");

        jLabel6.setText("Edad");

        jButton1.setText("Enviar consulta");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Confirmar Contraseña");

        jLabel9.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jTextField3)
                    .addComponent(jPasswordField2)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(169, 169, 169))
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addContainerGap(374, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       boolean continuar = true;
        if (jTextField1.getText().equals("") || jTextField2.getText().equals("") || jPasswordField1.getText().equals("") || jPasswordField2.getText().equals("") || jTextField3.getText().equals("") )
        {
           jLabel9.setText("Campos vacios");
            continuar = false ;           
        }
            if (!jPasswordField1.getText().equals(jPasswordField2.getText()))    
    {
        jLabel9.setText("Contraseñas no conciden");
        continuar=false;
    }
            if ((jPasswordField1.getText().length() <= 7 ))    
    {
     //   jLabel9.setFont(new Font(null, Font.ITALIC, 10));
        jLabel9.setText("Contraseña muy corta");
        continuar=false;
    }
            if (!jTextField2.getText().contains("@") && (!jTextField2.getText().contains(".")))
        {
        jLabel9.setText("Correo inválido");
        continuar=false;
    }
                try
    {
        
    int edad = Integer.parseInt( jTextField3.getText() );
if (edad <0)
{
       jLabel9.setText("¿La vida te debe años?");
        continuar=false;
    
}
    }
catch ( NumberFormatException nfe )
{
jLabel9.setText("Edad debe ser un numero");
    continuar = false;
}

        if (continuar){
            jLabel9.setText("Ok, Registrado!");
        Usuario usuario = new Usuario(jTextField1.getText(), jTextField2.getText(), jPasswordField1.getText(), Integer.valueOf(jTextField3.getText()));
       
        
        Escribir escritor = new Escribir(usuario);
       
       
       escritor.registrarUsuario(usuario);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
