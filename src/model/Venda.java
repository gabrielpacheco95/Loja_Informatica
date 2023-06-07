package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.time.LocalDate;
import java.util.ArrayList;

public class Venda {

    private int idVenda;
    private Cliente idCliente;
    private ArrayList<Produto> produtos;
    private float subTotal;
    private LocalDate dataVenda;

    public Venda() {
    }

    public Venda(int idVenda, Cliente idCliente, ArrayList<Produto> produtos, float subTotal, LocalDate dataVenda) {
        this.idVenda = idVenda;
        this.idCliente = idCliente;
        this.produtos = produtos;
        this.subTotal = subTotal;
        this.dataVenda = dataVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    @Override
    public String toString() {
        return "Venda{" + "idVenda=" + idVenda + ", idCliente=" + idCliente + ", produtos=" + produtos + ", subTotal=" + subTotal + ", dataVenda=" + dataVenda + '}';
    }

    

}// fim da classe controller

