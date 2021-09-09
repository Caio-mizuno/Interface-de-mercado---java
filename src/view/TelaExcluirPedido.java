/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Caio
 */
public class TelaExcluirPedido extends javax.swing.JInternalFrame {
    
    private ArrayList<Pedido> ped;
    /**
     * Creates new form TelaExcluirPedido
     */
    public TelaExcluirPedido(Listadepedido pedido) {
        initComponents();
        ped = new ArrayList<>();
        
        for(Pedido e : pedido.getPedido()){
            this.ped.add(e);
            this.boxPedido.addItem(e.getCliente().getNome()+"-"+e.getP().getNome());
        }
        
    }
    
    
    public ArrayList<Pedido> retornaPedido(){
        return this.ped;
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NomeCliente = new javax.swing.JLabel();
        cadastrarP = new javax.swing.JButton();
        boxPedido = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Excluir Pedido");

        NomeCliente.setText("Pedido:");

        cadastrarP.setText("Excluir Pedido");
        cadastrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarPActionPerformed(evt);
            }
        });

        boxPedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        boxPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(NomeCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cadastrarP)
                        .addGap(88, 88, 88)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeCliente)
                    .addComponent(boxPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(cadastrarP)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cadastrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarPActionPerformed
        this.dispose();
        for(Pedido t : ped){
                String texto = t.getCliente().getNome()+"-"+t.getP().getNome();
            if(texto.equals(this.boxPedido.getSelectedItem())){
                ped.remove(t);
            }
        }
        
    }//GEN-LAST:event_cadastrarPActionPerformed

    private void boxPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxPedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NomeCliente;
    private javax.swing.JComboBox<Object> boxPedido;
    private javax.swing.JButton cadastrarP;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
