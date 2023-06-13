/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author jbferraz
 */
public class DAOFactory {

    private static ClienteDAO cDAO = new ClienteDAO();
    private static Fornecedor fDAO = new Fornecedor();
    private static Produto produtoDAO = new Produto();

    public DAOFactory() {
    }

    
    public static ClienteDAO getcDAO() {
        return cDAO;
    }

    public static void setcDAO(ClienteDAO cDAO) {
        DAOFactory.cDAO = cDAO;
    }

    public static Fornecedor getfDAO() {
        return fDAO;
    }

    public static void setfDAO(Fornecedor fDAO) {
        DAOFactory.fDAO = fDAO;
    }

    public static Produto getProdutoDAO() {
        return produtoDAO;
    }

    public static void setProdutoDAO(Produto produtoDAO) {
        DAOFactory.produtoDAO = produtoDAO;
    }

}
