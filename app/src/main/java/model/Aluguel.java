/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

import java.util.Date;
import model.Veiculo;
import model.Cliente;
/**
 *
 * @author User
 */
public class Aluguel {
    
    
   int id;
   Veiculo veiculo;
   Date dataAluguel;
   Date dataEntrega;
   Cliente cliente;
   String entregue;
   String observacao;
   float valorPago;

   
   public Aluguel() {
        this.veiculo = new Veiculo();
        this.cliente = new Cliente();
   }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Veiculo getVeiculo() { 
        
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Date getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(Date dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getEntregue() {
        return entregue;
    }

    public void setEntregue(String entregue) {
        this.entregue = entregue;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }
   
   
   
}
