/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Fornecedor;

/**
 *
 * @author jbferraz
 */
public class FornecedorDAO {

    public void cadastrarFornecedorDAO(Fornecedor fVO) {
        try {
            //busca conexão com o BD
            Connection con = Conexao.getConexao();
            //cria espaço de trabalho SQl, é a área no Java onde
            //vamo executar os scripts SQL
            String sql;
            sql = "insert into fornecedor values (null, ?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, fVO.getNmFornecedor());
            pst.setString(2, fVO.getCnpj());
            pst.setString(3, fVO.getEndereco());
            pst.setString(4, fVO.getTelefone());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar!\n"
                    + ex.getMessage());
        }
    }//fim cadastrar

    public ArrayList<Fornecedor> getFornecedorDAO() {
        ArrayList<Fornecedor> fornecedor = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            Statement stat = con.createStatement();
            String sql = "select * from fornecedor";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                Fornecedor f = new Fornecedor();
                //lado do java |x| (lado do banco)
                f.setIdFornecedor(rs.getInt("ideditora"));
                f.setNmFornecedor(rs.getString("nomeFornecedor"));
                f.setCnpj(rs.getString("cnpj"));
                f.setEndereco(rs.getString("endereco"));
                f.setTelefone(rs.getString("telefone"));
                fornecedor.add(f);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao Listar!\n"
                    + ex.getMessage());
        }
        return fornecedor;
    }//fim do listar

    public Fornecedor getFornecedorByDoc(String cnpj) {
        Fornecedor f = new Fornecedor();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from fornecedor where cnpj = ?;";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cnpj);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                //lado do java |x| (lado do banco)
                f.setIdFornecedor(rs.getInt("idFornecedor"));
                f.setNmFornecedor(rs.getString("nmFornecedor"));
                f.setCnpj(rs.getString("cnpj"));
                f.setEndereco(rs.getString("endereco"));
                f.setTelefone(rs.getString("telefone"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar CNPJ!\n"
                    + ex.getMessage());
        }
        return f;
    }

    public void deletarFornecedorDAO(String cnpj) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from fornecedor where cnpj = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cnpj);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar CNPJ!\n"
                    + ex.getMessage());
        }
    }//fim deletarFornecedor

    public void atualizaFornecedorByDoc(Fornecedor fVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update fornecedor set nomeFornecedor = ?, endereco = ?, telefone = ?"
                    + "where cnpj = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, fVO.getNmFornecedor());
            pst.setString(5, fVO.getCnpj());
            pst.setString(2, fVO.getEndereco());
            pst.setString(3, fVO.getTelefone());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar CNPJ!\n"
                    + ex.getMessage());
        }
    }
}
