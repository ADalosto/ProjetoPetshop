/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopetshop;

import java.util.InputMismatchException;

/**
 *
 * @author Andrey Dalosto
 */
public class Produto {
 private String nomeProd;
    private String desc;
    private String porte;
    private int qntd;
    private double preco;
    
      public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        if(porte.equals(""))
        {
            throw new StringVazioException();
        }
        else
        {
        this.porte = porte;
    }
    }
    
    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        if(nomeProd.equals(""))
        {
            throw new StringVazioException();
        }
        else
        {
        this.nomeProd = nomeProd;
    }
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        if(qntd<0)
        {
            throw new IllegalArgumentException("Valor Negativo.Tente Novamente");
        }
           else{
        this.qntd = qntd;
    }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco<0)
        {
            throw new IllegalArgumentException("Valor Negativo.Tente Novamente");
        }
           else{
        this.preco = preco;
    }
}

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        if(desc.equals(""))
        {
            throw new StringVazioException();
        }
        else
        {
        this.desc = desc;
    }
    }
    
    
    
}