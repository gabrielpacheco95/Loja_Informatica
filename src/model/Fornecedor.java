/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 311101245
 */
public class Fornecedor {
    private int idFornecedor;
    private String nmFornecedor;
    private String cnpj;
    private String endereco;
    private String telefone;

    public Fornecedor() {
    }

    public Fornecedor(int idFornecedor, String nmFornecedor, String cnpj, String endereco, String telefone) {
        this.idFornecedor = idFornecedor;
        this.nmFornecedor = nmFornecedor;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Fornecedor(int idFornecedor, String nmFornecedor, String cnpj, String endereco, String telefone, String gerente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNmFornecedor() {
        return nmFornecedor;
    }

    public void setNmFornecedor(String nmFornecedor) {
        this.nmFornecedor = nmFornecedor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
     
}
