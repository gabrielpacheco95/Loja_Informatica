/*
 * To change this pcense header, choose License Headers in Project Properties.
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
import model.Produto;
import services.Fornecedor;
import services.ServicosFactory;

/**
 *
 * @author jbferraz
 */
public class Produto {

    public void cadastrarProdutoDAO(Produto produtoVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "insert into produto values (null, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, produtoVO.getProduto());
            pst.setString(2, produtoVO.getMarca());
            pst.setInt(3, produtoVO.getEstoque());
            pst.setFloat(4, produtoVO.getPreco());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar pvro.\n" + e.getMessage());
        }
    }//fim cadastrarProduto

    public ArrayList<Produto> getProdutosDAO() {
        ArrayList<Produto> produto = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select produto.*, e.cnpj from produto "
                    + "join editoras e using(ideditora)";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            Fornecedor editoraS = ServicosFactory.getEditoraServicos();
            while (rs.next()) {                
                Produto p = new Produto();
                //lado do java |x| (lado do banco)
                p.setIdProduto(rs.getInt("idProduto"));
                p.setProduto(rs.getString("Produto"));
                p.setMarca(rs.getString("marca"));
                p.setEstoque(rs.getInt("estoque"));
                p.setPreco(rs.getFloat("preco"));
                p.setIdFornecedor(FornecedorS.buscarEditorabyCNPJ(rs.getString("cnpj")));
                produto.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao pstar produto.\n" + e.getMessage());
        }
        return produto;
    }//fim getProdutosDAO
    
    public Produto getProdutoByISBN(String isbn){
        Produto p = new Produto();
        Fornecedor fornecedorS = ServicosFactory.getFornecedorServicos();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select produto.*, e.cnpj from produto "
                    + "join editoras e using(ideditora) where isbn = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, isbn);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                p.setIdProduto(rs.getInt("idProduto"));
                p.setProduto(rs.getString("Produto"));
                p.setMarca(rs.getString("marca"));
                p.setEstoque(rs.getInt("estoque"));
                p.setPreco(rs.getFloat("preco"));
                p.setIdFornecedor(FornecedorS.buscarEditorabyCNPJ(rs.getString("cnpj")));
                produto.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar pvro.\n" + e.getMessage());
        }
        return p;
    }//fim buscaProduto
    
    public void atualizarProdutoDAO(Produto pvroVO){
        try {
            Connection con = Conexao.getConexao();
            String sql = "update produto set estoque = ?, preco = ?,marca = ?,"
                    + " where isbn = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, pvroVO.getEstoque());
            pst.setFloat(2, pvroVO.getPreco());
            pst.setString(3, pvroVO.getMarca()); 
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atuapzar pvro.\n" + e.getMessage());
        }
    }//fim do atualziar
    
    public void deletarProdutoDAO(String isbn){
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from produto where isbn = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, isbn);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao deletar pvro.\n" + e.getMessage());
        }
    }//fim deletarProduto

}//fim da classe
