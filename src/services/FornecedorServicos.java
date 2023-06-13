/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.FornecedorDAO;
import dao.DAOFactory;
import java.util.ArrayList;
import model.Fornecedor;

/**
 *
 * @author jbferraz
 */
public class FornecedorServicos {

    public void cadFornecedor(Fornecedor fVO) {
        Fornecedor fDAO = DAOFactory.getFornecedorDAO();
        fDAO.cadastrarFornecedorDAO(fVO);
    }
    
    public void atualizarFornecedor(Fornecedor fVO){
        Fornecedor fDAO = DAOFactory.getFornecedorDAO();
        fDAO.atualizaFornecedorByDoc(fVO);
    }
    
    public void deletarFornecedor(String cnpj){
        Fornecedor fDAO = DAOFactory.getFornecedorDAO();
        fDAO.deletarFornecedorDAO(cnpj);
    }
    
    public Fornecedor buscarFornecedorbyCNPJ(String cnpj){
        Fornecedor fDAO = DAOFactory.getFornecedorDAO();
        return fDAO.getFornecedorByDoc(cnpj);
    }
    
    public ArrayList<Fornecedor> getFornecedor() {
        Fornecedor fDAO = DAOFactory.getFornecedorDAO();
        return fDAO.getFornecedorsDAO();
    }
}
