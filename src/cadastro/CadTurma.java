/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Senac 19
 */
public class CadTurma extends javax.swing.JFrame {

    Conexao conexao = new Conexao();

    /**
     * Creates new form CadCurso
     */
    public CadTurma() {
        initComponents();
    }

    public void LimparVariaveis() {
        codTurma.setText("");
        nomeTurma.setText("");
        codCurso.setText("");
        nomeCurso.setText("");
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
        codTurma = new javax.swing.JTextField();
        nomeTurma = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        botGravar = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        codCurso = new javax.swing.JTextField();
        nomeCurso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Turma");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Código");

        codTurma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        codTurma.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                codTurmaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                codTurmaFocusLost(evt);
            }
        });

        nomeTurma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nome");

        jToggleButton1.setText("Apagar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Sair");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setText("Novo");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        botGravar.setText("Gravar");
        botGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botGravarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Código do Curso");

        codCurso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        codCurso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                codCursoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                codCursoFocusLost(evt);
            }
        });

        nomeCurso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nomeCurso.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jToggleButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botGravar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(7, 7, 7)
                        .addComponent(nomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton3)
                    .addComponent(botGravar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void codTurmaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codTurmaFocusGained
        LimparVariaveis();
    }//GEN-LAST:event_codTurmaFocusGained

    private void codTurmaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codTurmaFocusLost
        String sql = "";
        try {
            if (!codTurma.getText().equals("") && !codTurma.getText().equals("NOVO")) {
                //sql = "select t.codigo, t.nome, t.cod_curso, c.nomecurso from turma as t inner join curso as c on t.cod_curso = c.idcurso where t.codigo = ?";
                sql = "select t.codigo, t.nomeTurma, t.cod_curso, c.nomecurso from turma as t inner join curso as c on t.cod_curso = c.idcurso where t.codigo = ?";
                conexao.conectar();
                conexao.sttm = conexao.con.prepareStatement(sql);
                conexao.sttm.setInt(1, Integer.parseInt(codTurma.getText()));
                ResultSet rs = conexao.sttm.executeQuery();
                if (rs.next()) {
                    codTurma.setText(rs.getString("codigo"));
                    nomeTurma.setText(rs.getString("nomeTurma"));
                    codCurso.setText(rs.getString("cod_curso"));
                    nomeCurso.setText(rs.getString("nomecurso"));
                } else {
                    codTurma.setText("NOVO");
                }
            } else {
                codTurma.setText("NOVO");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                conexao.con.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_codTurmaFocusLost

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        codTurma.grabFocus();
        nomeTurma.grabFocus();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void botGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botGravarActionPerformed
        String sql = "";
        try {
            conexao.conectar();
            if (codTurma.getText().equals("NOVO")) {
                sql = "insert into turma(nomeTurma, cod_curso) values (?, ?)";
                conexao.sttm = conexao.con.prepareStatement(sql);
                //conexao.sttm.setInt(2, Integer.parseInt(codTurma.getText()));
                conexao.sttm.setString(1, nomeTurma.getText());                
                conexao.sttm.setInt(2, Integer.parseInt(codCurso.getText()));
            } else {
                sql = "UPDATE turma Set nomeTurma = ?, cod_curso = ? WHERE codigo = ?";
                conexao.sttm = conexao.con.prepareStatement(sql);
                conexao.sttm.setString(1, nomeTurma.getText());
                conexao.sttm.setInt(2, Integer.parseInt(codCurso.getText()));
                conexao.sttm.setInt(3, Integer.parseInt(codTurma.getText()));
            }
            System.out.println(sql);
            conexao.sttm.executeUpdate();
            conexao.con.commit();
            codTurma.grabFocus();
        } catch (Exception ex) {
            try {
                conexao.con.rollback();
            } catch (Exception e) {
            }
            ex.printStackTrace();
        } finally {
            try {
                conexao.con.close();
            } catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_botGravarActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        String sql = "";
        int resp = 0;
        try {
            conexao.conectar();
            resp = JOptionPane.showConfirmDialog(null, "Confirma exclusção de curso ?");
            if (resp == 0) {
                sql = "DELETE FROM turma WHERE codigo = ?";
                conexao.sttm = conexao.con.prepareStatement(sql);
                conexao.sttm.setInt(1, Integer.parseInt(codTurma.getText()));
                conexao.sttm.executeUpdate();
                conexao.con.commit();
                codTurma.grabFocus();
            }
        } catch (Exception ex) {
            try {
                conexao.con.rollback();
            } catch (Exception e) {
            }
            ex.printStackTrace();
        } finally {
            try {
                conexao.con.close();
            } catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void codCursoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codCursoFocusGained
        // TODO add your handling code here:
        limparNomeCurso();
    }//GEN-LAST:event_codCursoFocusGained

    public void limparNomeCurso() {        
        codCurso.setText("");
        nomeCurso.setText("");
    }
    
    private void codCursoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codCursoFocusLost
        // TODO add your handling code here:
       String sql = "";
        try {
            if(!codCurso.getText().equals("") && !codCurso.getText().equals("not")){
                sql = "select * from curso where idcurso = ?";
                conexao.conectar();
                conexao.sttm = conexao.con.prepareStatement(sql);
                conexao.sttm.setInt(1, Integer.parseInt(codCurso.getText()));
                ResultSet rs = conexao.sttm.executeQuery();
                if(rs.next()){
                    codCurso.setText(rs.getString("idcurso"));
                    nomeCurso.setText(rs.getString("nomecurso"));
                }else{
                    codCurso.setText("not");
                }
            }else{
                codCurso.setText("not");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            try {
                conexao.con.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_codCursoFocusLost

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
            java.util.logging.Logger.getLogger(CadTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botGravar;
    private javax.swing.JTextField codCurso;
    private javax.swing.JTextField codTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JTextField nomeCurso;
    private javax.swing.JTextField nomeTurma;
    // End of variables declaration//GEN-END:variables
}
