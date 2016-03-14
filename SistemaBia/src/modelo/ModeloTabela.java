/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ricardo
 */
public class ModeloTabela extends AbstractTableModel{
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    public ModeloTabela(ArrayList lin,String[] col){
     setLinhas(lin);
     setColunas(col);
    }
    public ArrayList getLinhas(){
        return linhas;
    }
    public void setLinhas(ArrayList dados){//metodo para preencher as linhas da tabela
        linhas = dados;
    }
    public String[] getColunas(){//esse simbolo [] significa vetor
        return colunas;
    }
    public void setColunas(String[] nomes){//seta a quantidade de linhas
        colunas = nomes;
    }
    public int getColumnCount(){//seta a quantidade de colunas
        return colunas.length;
    }
    public int getRowCount(){
        return linhas.size();//metodo p/ contar as linhas da tabela
    }
    public String getColumnName(int numCol){
        return colunas[numCol];//metodo para contar as colunas da tabela
    }
    
    public Object getValueAt(int numLin,int numCol){//pega os valores e monta a tabela
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
}
