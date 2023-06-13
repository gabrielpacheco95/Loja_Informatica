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
public class DAOFactory2 {

    private static ClienteDAO cDAO = new ClienteDAO();
    private static FornecedorDAO fDAO = new FornecedorDAO();
    private static Produto produtoDAO = new Produto();

    public DAOFactory2() {
    }

    
    public static ClienteDAO getcDAO() {
        return cDAO;
    }

    public static void setcDAO(ClienteDAO cDAO) {
        DAOFactory.cDAO = cDAO;
    }

    public static FornecedorDAO getfDAO() {
        return fDAO;
    }

    public static void setfDAO(FornecedorDAO fDAO) {
        DAOFactory2.fDAO = fDAO;
    }

    public static Produto getProdutoDAO() {
        return produtoDAO;
    }

    public static void setProdutoDAO(Produto produtoDAO) {
        DAOFactory2.produtoDAO = produtoDAO;
    }

}
