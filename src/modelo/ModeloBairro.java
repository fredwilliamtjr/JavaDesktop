/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author fredw
 */
public class ModeloBairro {
    private int codigo;
    private String nome;
    private int cod_Cidade;
    private String nome_Cidade;

    public String getNome_Cidade() {
        return nome_Cidade;
    }

    public void setNome_Cidade(String nome_Cidade) {
        this.nome_Cidade = nome_Cidade;
    }



    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cod_Cidade
     */
    public int getCod_Cidade() {
        return cod_Cidade;
    }

    /**
     * @param cod_cidade the cod_Cidade to set
     */
    public void setCod_Cidade(int cod_cidade) {
        this.cod_Cidade = cod_cidade;
    }
    
}
