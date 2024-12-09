/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cadastro_pessoas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ryzen
 */
public class PesPessoa extends javax.swing.JFrame {

    /**
     * Creates new form DelPessoa
     */
    
    public String id_pessoa;
    
    public PesPessoa() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaPessoas = new javax.swing.JTable();
        BotaoDeletar = new javax.swing.JButton();
        TxtID = new javax.swing.JLabel();
        RecebeID = new javax.swing.JTextField();
        TxtNome = new javax.swing.JLabel();
        RecebeNome = new javax.swing.JTextField();
        TxtSobrenome = new javax.swing.JLabel();
        RecebeSobrenome = new javax.swing.JTextField();
        BotaoPesquisar = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();
        BotaoTelaCadastro = new javax.swing.JButton();
        BotaoTelaEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(774, 389));

        TabelaPessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Sobrenome"
            }
        ));
        TabelaPessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaPessoasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaPessoas);

        BotaoDeletar.setText("Deletar");
        BotaoDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDeletarActionPerformed(evt);
            }
        });

        TxtID.setText("ID");

        TxtNome.setText("Nome");

        TxtSobrenome.setText("Sobrenome");

        BotaoPesquisar.setText("Pesquisar");
        BotaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPesquisarActionPerformed(evt);
            }
        });

        BotaoCancelar.setText("Cancelar");
        BotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarActionPerformed(evt);
            }
        });

        BotaoTelaCadastro.setText("Cadastrar");
        BotaoTelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTelaCadastroActionPerformed(evt);
            }
        });

        BotaoTelaEditar.setText("Editar");
        BotaoTelaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTelaEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BotaoPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtSobrenome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(RecebeNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                .addComponent(RecebeID, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(RecebeSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoTelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoTelaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(BotaoDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TxtID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RecebeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RecebeNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtSobrenome)
                        .addGap(5, 5, 5)
                        .addComponent(RecebeSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoDeletar)
                    .addComponent(BotaoTelaEditar)
                    .addComponent(BotaoTelaCadastro))
                .addContainerGap(20, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaPessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaPessoasMouseClicked
        // TODO add your handling code here:
        int linhaSelecionada = TabelaPessoas.getSelectedRow();
        
        Object id = TabelaPessoas.getValueAt(linhaSelecionada, 0);
        
        id_pessoa = String.valueOf(id);
    }//GEN-LAST:event_TabelaPessoasMouseClicked

    private void BotaoDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDeletarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            
            int resposta = JOptionPane.showConfirmDialog(null, "Estas informações não retornarão deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
            
            if(resposta == 0){
                
            Connection conexao = null;
            PreparedStatement stat = null;
            
            String url = "jdbc:mysql://localhost:3306/pessoas";
            String usuario = "root";
            String senha = "";
            
            conexao = DriverManager.getConnection (url, usuario, senha) ;
            String sql = "DELETE from pessoas_cadastradas where id_pessoas = ?";
            
            stat = conexao.prepareStatement(sql);
            stat.setString(1, id_pessoa);
            stat.executeUpdate();
            
            carregarDados();
            
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_BotaoDeletarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        carregarDados();
    }//GEN-LAST:event_formWindowActivated

    private void BotaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPesquisarActionPerformed
        try {
            // TODO add your handling code here:
            carregarDadosPesquisa();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_BotaoPesquisarActionPerformed

    private void BotaoTelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTelaCadastroActionPerformed
        // TODO add your handling code here:
        CadPessoas cadastro = new CadPessoas();
        cadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoTelaCadastroActionPerformed

    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
        // TODO add your handling code here:
        RecebeID.setText("");
        RecebeNome.setText("");
        RecebeSobrenome.setText("");
    }//GEN-LAST:event_BotaoCancelarActionPerformed

    private void BotaoTelaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTelaEditarActionPerformed
        // TODO add your handling code here:
        EditPessoa edita = new EditPessoa();
        edita.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoTelaEditarActionPerformed

    public class DatabaseConnection {
        public static Connection getConnection() {
            Connection connection = null;
            try {
                String url = "jdbc:mysql://localhost:3306/pessoas";
                String user = "root";
                String password = "";

                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                System.out.println("Erro ao conectar: " + e.getMessage());
            }
            return connection;
        }
    }
    
    private void carregarDados() {
        DefaultTableModel modelo = (DefaultTableModel) TabelaPessoas.getModel();
        modelo.setRowCount(0); // Limpa a tabela antes de adicionar novos dados

        String sql = "SELECT * FROM pessoas_cadastradas"; // Substitua pelo nome da sua tabela

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            // Adicionar colunas ao modelo, se necessário
            modelo.setColumnIdentifiers(new String[]{"ID", "Nome", "Sobrenome"}); // Colunas da tabela

            // Adiciona as linhas à tabela
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getInt("id_pessoas"),       // Substitua pelos nomes das colunas do banco
                    rs.getString("nome_pessoa"),
                    rs.getString("sobrenome_pessoa")
                });
            }

        } catch (SQLException e) {
            System.out.println("Erro ao carregar dados: " + e.getMessage());
        }
    }
    
    public void carregarDadosPesquisa() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) TabelaPessoas.getModel();
        modelo.setRowCount(0); // Limpa a tabela antes de adicionar novos dados
        
        Connection conexao = null;
        PreparedStatement statement = null;
        
        String url = "jdbc:mysql://localhost:3306/pessoas";
        String usuario = "root";
        String senha = "";

        conexao = DriverManager.getConnection (url, usuario, senha) ;
        
        String sqlNome = "SELECT * FROM pessoas_cadastradas where nome_pessoa like ?;"; // Substitua pelo nome da sua tabela
        statement = conexao.prepareStatement(sqlNome);
        statement.setString(1, RecebeNome.getText()+"%"); // Adiciona o filtro na consulta
        ResultSet rsNome = statement.executeQuery();
        
        String sqlID = "SELECT * FROM pessoas_cadastradas where id_pessoas = ?;"; // Substitua pelo nome da sua tabela
        statement = conexao.prepareStatement(sqlID);
        statement.setString(1, RecebeID.getText()); // Adiciona o filtro na consulta
        ResultSet rsID = statement.executeQuery();
        
        String sqlSobrenome = "SELECT * FROM pessoas_cadastradas where sobrenome_pessoa like ?;"; // Substitua pelo nome da sua tabela
        statement = conexao.prepareStatement(sqlSobrenome);
        statement.setString(1, RecebeSobrenome.getText()+"%"); // Adiciona o filtro na consulta
        ResultSet rsSobrenome = statement.executeQuery();
        
        try {

            // Adicionar colunas ao modelo, se necessário
            modelo.setColumnIdentifiers(new String[]{"ID", "Nome", "Sobrenome"}); // Colunas da tabela

            // Adiciona as linhas à tabela
            if(!RecebeNome.getText().equals("")){
                while (rsNome.next()) {
                    modelo.addRow(new Object[]{
                        rsNome.getInt("id_pessoas"),       // Substitua pelos nomes das colunas do banco
                        rsNome.getString("nome_pessoa"),
                        rsNome.getString("sobrenome_pessoa")
                    });
                }
            }
            if(!RecebeID.getText().equals("")){
                while (rsID.next()) {
                    modelo.addRow(new Object[]{
                        rsID.getInt("id_pessoas"),       // Substitua pelos nomes das colunas do banco
                        rsID.getString("nome_pessoa"),
                        rsID.getString("sobrenome_pessoa")
                    });
                }
            }
            if(!RecebeSobrenome.getText().equals("")){
                while (rsNome.next()) {
                    modelo.addRow(new Object[]{
                        rsSobrenome.getInt("id_pessoas"),       // Substitua pelos nomes das colunas do banco
                        rsSobrenome.getString("nome_pessoa"),
                        rsSobrenome.getString("sobrenome_pessoa")
                    });
                }
            }

        } catch (SQLException e) {
            System.out.println("Erro ao carregar dados: " + e.getMessage());
        }
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
            java.util.logging.Logger.getLogger(PesPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoDeletar;
    private javax.swing.JButton BotaoPesquisar;
    private javax.swing.JButton BotaoTelaCadastro;
    private javax.swing.JButton BotaoTelaEditar;
    private javax.swing.JTextField RecebeID;
    private javax.swing.JTextField RecebeNome;
    private javax.swing.JTextField RecebeSobrenome;
    private javax.swing.JTable TabelaPessoas;
    private javax.swing.JLabel TxtID;
    private javax.swing.JLabel TxtNome;
    private javax.swing.JLabel TxtSobrenome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
