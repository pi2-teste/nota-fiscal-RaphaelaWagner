/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.notafiscalmvc.controller;

import br.senac.sp.notafiscalmvc.DAO.NotaFiscalDAO;
import br.senac.sp.notafiscalmvc.model.NotaFiscal;

/**
 *
 * @author lucas
 */
public class NotaFiscalController {
    
    public static boolean salvar(int numeroNota, String descricaodaNota,double valorNota){
        System.out.println("Agora estou no controller");
        
        NotaFiscal NFiscal = new NotaFiscal();
        
        NFiscal.setNumNota(numeroNota);
        NFiscal.setDescricaoNota(descricaodaNota);
        NFiscal.setValNota(valorNota);
        
        NotaFiscalDAO dao = new NotaFiscalDAO();
        dao.addNota(NFiscal);
        
        return true;
    }

}
