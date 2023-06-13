/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.Fornecedor;
import dao.DAOFactory;
import java.util.ArrayList;
import model.Fornecedor;

/**
 *
 * @author jbferraz
 */
public class Fornecedor {

    public void cadFornecedor(Fornecedor fVO) {
        Fornecedor fDAO = DAOFactory.getFornecedorDAO();
        fDAO.cadastrarFornecedorDAO(eVO);
    }
    
    public void atualizarFornecedor(Fornecedor fVO){
        Fornecedor fDAO = DAOFactory.getFornecedorDAO();
        eDAO.atualizaFornecedorByDoc(eVO);
    }
    
    public void deletarFornecedor(String cnpj){
        Fornecedor fDAO = DAOFactory.getFornecedorDAO();
        eDAO.deletarFornecedorDAO(cnpj);
    }
    
    public Fornecedor buscarFornecedorbyCNPJ(String cnpj){
        Fornecedor fDAO = DAOFactory.getFornecedorDAO();
        return eDAO.getFornecedorByDoc(cnpj);
    }
    
    public ArrayList<Fornecedor> getFornecedor() {
        Fornecedor fDAO = DAOFactory.getFornecedorDAO();
        return fDAO.getFornecedorsDAO();
    }
}
