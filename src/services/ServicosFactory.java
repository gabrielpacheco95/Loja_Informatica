/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author jbferraz
 */
public class ServicosFactory {
    private static ClienteServicos cServicos = new ClienteServicos();
    private static Fornecedor fServicos = new Fornecedor();
    private static ProdutoServicos produtoP = new ProdutoServicos();
 
    
    public static ClienteServicos getClienteServicos(){
        return cServicos;
    }
    public static Fornecedor getFornecedorServicos(){
        return fServicos;
    }
    
    public static ProdutoServicos getProdutoServicos(){
        return produtoP;
    }
}
