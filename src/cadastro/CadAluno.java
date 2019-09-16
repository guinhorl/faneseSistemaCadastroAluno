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
 * @author Guinho
 */
public class CadAluno extends javax.swing.JFrame {

    Conexao conn = new Conexao();
    /**
     * Creates new form CadAluno
     */
    public CadAluno() {
        initComponents();
    }
    //Função de limpar 
    public void limparVariaveis(){
        matrAluno.setText("");
        nomeAluno.setText("");
        numFone.setText("");
        numCelular.setText("");
        emailAluno.setText("");
        idCurso.setText("");
        nomeCurso.setText("");
        idTurma.setText("");
        nomeTurma.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numFone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        numCelular = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailAluno = new javax.swing.JTextField();
        butNovoAluno = new javax.swing.JButton();
        butGravarAluno = new javax.swing.JButton();
        butApagarAluno = new javax.swing.JButton();
        butSairCadAluno = new javax.swing.JButton();
        matrAluno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        codAluno = new javax.swing.JLabel();
        nomeAluno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        idTurma = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        idCurso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nomeCurso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nomeTurma = new javax.swing.JTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Telefone:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Celular:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Email:");

        butNovoAluno.setText("Novo");
        butNovoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNovoAlunoActionPerformed(evt);
            }
        });

        butGravarAluno.setText("Gravar");
        butGravarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGravarAlunoActionPerformed(evt);
            }
        });

        butApagarAluno.setText("Apagar");
        butApagarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butApagarAlunoActionPerformed(evt);
            }
        });

        butSairCadAluno.setText("Sair");
        butSairCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSairCadAlunoActionPerformed(evt);
            }
        });

        matrAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                matrAlunoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                matrAlunoFocusLost(evt);
            }
        });
        matrAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrAlunoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Matrícula:");

        codAluno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        codAluno.setText("Nome:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("id. Turma:");

        idTurma.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idTurmaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idTurmaFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("id. Curso:");

        idCurso.setEnabled(false);
        idCurso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idCursoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idCursoFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Nome:");

        nomeCurso.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Nome:");

        nomeTurma.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(numFone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(numCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(matrAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codAluno)
                        .addGap(18, 18, 18)
                        .addComponent(nomeAluno))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(butNovoAluno)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(butGravarAluno)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(butApagarAluno)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(butSairCadAluno))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(idCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel7)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nomeCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(nomeTurma)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matrAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(codAluno)
                    .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(numCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emailAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(idTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(nomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(nomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butNovoAluno)
                    .addComponent(butGravarAluno)
                    .addComponent(butApagarAluno)
                    .addComponent(butSairCadAluno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void matrAlunoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_matrAlunoFocusGained
        limparVariaveis();
    }//GEN-LAST:event_matrAlunoFocusGained

    private void matrAlunoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_matrAlunoFocusLost
        String sql = "";
        try {
            if(!matrAluno.getText().equals("") && !matrAluno.getText().equals("NOVO")){
                //sql = "select * from aluno where matricula = ? ";
                //SQL foda da poha mano de ceu
                //sql = "select A.matricula, A.nome, A.telefone, A.celular, A.email, T.nomeTurma, C.nomecurso from aluno as A inner join curso as C left join turma as T on A.id_curso = C.idcurso where A.matricula = ?";
                sql = "select A.matricula, A.nome, A.telefone, A.celular, A.email, T.nomeTurma, C.nomecurso, A.id_turma, A.id_curso from aluno A inner join curso C on A.id_curso = C.idcurso  inner join turma T on A.id_turma = T.codigo where A.matricula = ?";
                conn.conectar();
                conn.sttm = conn.con.prepareStatement(sql);
                conn.sttm.setInt(1, Integer.parseInt(matrAluno.getText()));
                ResultSet rs = conn.sttm.executeQuery();
                if(rs.next()){
                    matrAluno.setText(rs.getString("matricula"));
                    nomeAluno.setText(rs.getString("nome"));
                    numFone.setText(rs.getString("telefone"));
                    numCelular.setText(rs.getString("celular"));
                    emailAluno.setText(rs.getString("email"));
                    nomeTurma.setText(rs.getString("nomeTurma"));
                    nomeCurso.setText(rs.getString("nomecurso"));
                    idTurma.setText(rs.getString("id_turma"));                    
                    idCurso.setText(rs.getString("id_curso"));
                }else{
                    matrAluno.setText("NOVO");
                }
            }else{
                matrAluno.setText("NOVO");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                conn.con.close();
            } catch (Exception e) {                
            }
        }
    }//GEN-LAST:event_matrAlunoFocusLost
    //Botão Novo
    private void butNovoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNovoAlunoActionPerformed
        matrAluno.grabFocus();
        nomeAluno.grabFocus();
        numFone.grabFocus();
        numCelular.grabFocus();
        emailAluno.grabFocus();        
    }//GEN-LAST:event_butNovoAlunoActionPerformed
    //Botão de Gravar e Atualizar
    private void butGravarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGravarAlunoActionPerformed
        String sql = "";
        try {
            conn.conectar();
            if(matrAluno.getText().equals("NOVO")){
                sql = "insert into aluno(nome,telefone,celular,email,id_curso,id_turma) values(?,?,?,?,?,?)";
                conn.sttm = conn.con.prepareStatement(sql);
                conn.sttm.setString(1, nomeAluno.getText());
                conn.sttm.setInt(2, Integer.parseInt(numFone.getText()));
                conn.sttm.setInt(3, Integer.parseInt(numCelular.getText()));
                conn.sttm.setString(4, emailAluno.getText());
                conn.sttm.setInt(5, Integer.parseInt(idCurso.getText()));
                conn.sttm.setInt(6, Integer.parseInt(idTurma.getText()));
            }else{
                sql = "update aluno set nome = ?, telefone = ?, celular = ?, email = ?, id_curso = ?, id_turma = ? where matricula = ?";
                conn.sttm = conn.con.prepareStatement(sql);
                conn.sttm.setString(1, nomeAluno.getText());
                conn.sttm.setInt(2, Integer.parseInt(numFone.getText()));
                conn.sttm.setInt(3, Integer.parseInt(numCelular.getText()));
                conn.sttm.setString(4, emailAluno.getText());
                conn.sttm.setInt(5, Integer.parseInt(idCurso.getText()));
                conn.sttm.setInt(6, Integer.parseInt(idTurma.getText()));
                conn.sttm.setInt(7, Integer.parseInt(matrAluno.getText()));
            }
            conn.sttm.executeUpdate();
            conn.con.commit();
            matrAluno.grabFocus();
        } catch (Exception ex) {
           try {
                conn.con.rollback();
            } catch (Exception e) {
            }
            ex.printStackTrace();
        }finally{
            try {
                conn.con.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_butGravarAlunoActionPerformed
    //Botão de sair da tela 
    private void butSairCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSairCadAlunoActionPerformed
        this.dispose();
    }//GEN-LAST:event_butSairCadAlunoActionPerformed
    //Botão apagar aluno
    private void butApagarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butApagarAlunoActionPerformed
        String sql = "";
        int aux = 0;
        try {
            conn.conectar();
            aux = JOptionPane.showConfirmDialog(null, "Confirmar a exclusão do aluno?");
            if(aux == 0){
                sql = "delete from aluno where matricula = ?";
                conn.sttm = conn.con.prepareStatement(sql);
                conn.sttm.setInt(1, Integer.parseInt(matrAluno.getText()));
                conn.sttm.executeUpdate();
                conn.con.commit();
                matrAluno.grabFocus();
            }            
        } catch (Exception ex) {
            try {
                conn.con.rollback();
            } catch (Exception e) {
            }
            ex.printStackTrace();
        }finally{
            try {
                conn.con.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_butApagarAlunoActionPerformed

    private void matrAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrAlunoActionPerformed
        // TODO add your hanadling code here:
    }//GEN-LAST:event_matrAlunoActionPerformed

    private void idCursoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idCursoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_idCursoFocusLost
    
    private void idCursoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idCursoFocusGained
   
    }//GEN-LAST:event_idCursoFocusGained

    private void idTurmaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idTurmaFocusLost
        // TODO add your handling code here:
          String sql = "";
        try {
            if(!idTurma.getText().equals("") && !idTurma.getText().equals("not")){
                //sql = "select * from curso where idcurso = ?";
                sql = "select T.codigo, T.nomeTurma, T.cod_curso, C.nomecurso from turma T inner join curso C on T.cod_curso = C.idcurso where T.codigo = ?";                
                conn.conectar();
                conn.sttm = conn.con.prepareStatement(sql);
                conn.sttm.setInt(1, Integer.parseInt(idTurma.getText()));
                ResultSet rs = conn.sttm.executeQuery();
                if(rs.next()){
                    idTurma.setText(rs.getString("codigo"));
                    nomeTurma.setText(rs.getString("nomeTurma"));
                    idCurso.setText(rs.getString("cod_curso"));
                    nomeCurso.setText(rs.getString("nomecurso"));
                }else{
                    idTurma.setText("not");
                }
            }else{
                idTurma.setText("not");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            try {
                conn.con.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_idTurmaFocusLost

    private void idTurmaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idTurmaFocusGained
        // TODO add your handling code here:
        limparTurmaCurso();
    }//GEN-LAST:event_idTurmaFocusGained

    public void limparTurmaCurso(){        
        idTurma.setText("");
        nomeTurma.setText("");
        idCurso.setText("");
        nomeCurso.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(CadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butApagarAluno;
    private javax.swing.JButton butGravarAluno;
    private javax.swing.JButton butNovoAluno;
    private javax.swing.JButton butSairCadAluno;
    private javax.swing.JLabel codAluno;
    private javax.swing.JTextField emailAluno;
    private javax.swing.JTextField idCurso;
    private javax.swing.JTextField idTurma;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField matrAluno;
    private javax.swing.JTextField nomeAluno;
    private javax.swing.JTextField nomeCurso;
    private javax.swing.JTextField nomeTurma;
    private javax.swing.JTextField numCelular;
    private javax.swing.JTextField numFone;
    // End of variables declaration//GEN-END:variables
}
