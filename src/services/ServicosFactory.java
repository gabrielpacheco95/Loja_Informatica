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
    private static Fornecedor eServicos = new Fornecedor();
    private static LivroServicos livroS = new LivroServicos();
    private static VendaLivroServicos vlS = new VendaLivroServicos();
    
    public static ClienteServicos getClienteServicos(){
        return cServicos;
    }
    public static Fornecedor getEditoraServicos(){
        return eServicos;
    }
    
    public static LivroServicos getLivroServicos(){
        return livroS;
    }
    
    public static VendaLivroServicos getVendaLivros(){
        return vlS;
    }
}
