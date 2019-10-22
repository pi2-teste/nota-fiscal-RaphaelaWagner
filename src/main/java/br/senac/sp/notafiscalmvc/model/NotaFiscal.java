/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.notafiscalmvc.model;

/**
 *
 * @author Raphaela
 */
public class NotaFiscal {
    // Definir variáveis
    double valNota;
    String descricaoProduto;
    int numNota;
    
    public NotaFiscal() {
        System.out.println("inicializando um objeto do tipo NotaFiscal");
    }
    
    public String getDescricaoProduto(){
        return descricaoProduto;
    }
    
    public double getValNota() {
        return valNota;
    }

    public void setValNota(double valNota) {
        System.out.print("O objeto nota recebeu um valor:");
        System.out.println(valNota);
        this.valNota = valNota;
    }

    public int getNumNota() {
        return numNota;
    }

    public void setNumNota(int numNota) {
        System.out.print("O objeto nota recebeu um numero de nota:");
        System.out.println(numNota);
        this.numNota = numNota;
    }
    
    public void setDescricaoProduto(String descricaoProduto){
        System.out.println("O produto recebeu dados: ");
        System.out.println(descricaoProduto);
        this.descricaoProduto = descricaoProduto;
    }
    
    
}