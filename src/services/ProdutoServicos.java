/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.DAOFactory;
import dao.Produto;
import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author jbferraz
 */
public class ProdutoServicos {

    public void cadastrarProduto(Produto pVO) {
        Produto ´produtoDAO = DAOFactory.getProdutoDAO();
        produtoDAO.cadastrarProdutoDAO(ProdutoVO);
    }
    
    public ArrayList<Produto> buscaProdutos(){
        Produto produtoDAO = DAOFactory.getProdutoDAO();
        return produtoDAO.getProdutosDAO();
    }
    
 
    }
    
    public void deletarProduto(String isbn){
        Produto ProdutoDAO = DAOFactory.getProdutoDAO();
        ProdutoDAO.deletarProdutoDAO();
    }
    
    public void atualizarProduto(Produto ProdutoVO){
        Produto ProdutoDAO = DAOFactory.getProdutoDAO();
        ProdutoDAO.atualizarProdutoDAO(ProdutoVO);
    }
}
