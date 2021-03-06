/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.greyjoyinformatica.view;

import br.com.greyjoyinformatica.bean.Chamada;
import br.com.greyjoyinformatica.bean.Disciplina;
import br.com.greyjoyinformatica.bean.Matricula;
import br.com.greyjoyinformatica.rn.AlunoRn;
import br.com.greyjoyinformatica.rn.ChamadaRn;
import br.com.greyjoyinformatica.rn.DisciplinaRn;
import br.com.greyjoyinformatica.rn.MatriculaRn;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class RealizarChamada extends javax.swing.JFrame {

    /**
     * Creates new form Chamada
     */
    public RealizarChamada() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        DisciplinaRn disciplina = new DisciplinaRn();
        List lista = disciplina.listar(null);
        
        if(lista.size() == 0){
            JOptionPane.showMessageDialog(null, "Voce precisa ter turmas para efetuar chamadas");
        }else{
            for(Object dis : lista){
                cbbDisciplina.addItem(dis);
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

        jLabel1 = new javax.swing.JLabel();
        cbbDisciplina = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Seleciona Disciplina");

        jButton1.setText("Chamada");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancela");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Realizar Chamada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jButton1)
                .addGap(53, 53, 53)
                .addComponent(jButton2)
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbbDisciplina, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbbDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        RealizarChamada.this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        MatriculaRn matricula = new MatriculaRn();
        Chamada chamada = new Chamada();
        Matricula matri = new Matricula();
        
        try{
            Disciplina dis = (Disciplina) cbbDisciplina.getSelectedItem();
            matri.setDisciplinaidDisciplina(dis.getIdDisciplina());
            List lista = matricula.Chamada(matri);
            
            if(lista.size() == 0){
                JOptionPane.showMessageDialog(null, "Voce nao tem alunos para esta turma");
            }else{
            
                for(Object mat : lista){
                
                    int resposta =  JOptionPane.showConfirmDialog(null,
                            new AlunoRn().consultarId(Integer.parseInt(mat.toString())) +
                                " Esta Presente","chamada",JOptionPane.YES_NO_OPTION);
                
                    if(resposta == JOptionPane.YES_OPTION){
                        chamada.setAlunoidAluno(Integer.parseInt(mat.toString()));
                        chamada.setDisciplinaIdDisciplina(dis.getIdDisciplina());
                        chamada.setPresente(true);
                        try{
                            new ChamadaRn().salvar(chamada);
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    
                    }else{
                        chamada.setAlunoidAluno(Integer.parseInt(mat.toString()));
                        chamada.setDisciplinaIdDisciplina(dis.getIdDisciplina());
                        chamada.setPresente(false);
                        try{
                            new ChamadaRn().salvar(chamada);
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    }
                }
                JOptionPane.showMessageDialog(null, "fim da chmada");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Voce precisa ter turmas para efetuar chamadas");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RealizarChamada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealizarChamada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealizarChamada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealizarChamada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealizarChamada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbbDisciplina;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
