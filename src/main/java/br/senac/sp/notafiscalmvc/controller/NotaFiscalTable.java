package br.senac.sp.notafiscalmvc.controller;

/**
 *
 * @author Raphaela
 */


import br.senac.sp.notafiscalmvc.DAO.NotaFiscalDAO;
import br.senac.sp.notafiscalmvc.model.NotaFiscal;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucas
 */
public class NotaFiscalTable extends AbstractTableModel {
    private String[] columnNames = {"NumNota"," DescriçãoDoProduto ","ValNota"};

    public int getColumnCount() {
        return 3;
    }

    public int getRowCount() {
        //implementar metodo                    
        return NotaFiscalDAO.conta();
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        //implementar metodo
        NotaFiscal nota;
        nota = NotaFiscalDAO.linha(row);
        // Fazer a comparação
        if(col == 0)
            return nota.getNumNota();
        if(col == 1)
            return nota.getDescricaoProduto();
            
            return nota.getValNota();
        }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

}
