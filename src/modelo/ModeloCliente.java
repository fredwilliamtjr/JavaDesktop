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
public class ModeloCliente {
    
    int id_Cliente;
    String nome_Cliente;
    String endereco_Cliente;
    String rg_Clinete;
    String cpf_Cliente;
    int id_Bairro;
    int id_cidade;
    String nome_bairro;
    String nome_cidade;
    String nome_estado;

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getNome_Cliente() {
        return nome_Cliente;
    }

    public void setNome_Cliente(String nome_Cliente) {
        this.nome_Cliente = nome_Cliente;
    }

    public String getEndereco_Cliente() {
        return endereco_Cliente;
    }

    public void setEndereco_Cliente(String endereco_Cliente) {
        this.endereco_Cliente = endereco_Cliente;
    }

    public String getRg_Clinete() {
        return rg_Clinete;
    }

    public void setRg_Clinete(String rg_Clinete) {
        this.rg_Clinete = rg_Clinete;
    }

    public String getCpf_Cliente() {
        return cpf_Cliente;
    }

    public void setCpf_Cliente(String cpf_Cliente) {
        this.cpf_Cliente = cpf_Cliente;
    }

    public int getId_Bairro() {
        return id_Bairro;
    }

    public void setId_Bairro(int id_Bairro) {
        this.id_Bairro = id_Bairro;
    }

    public int getId_cidade() {
        return id_cidade;
    }

    public void setId_cidade(int id_cidade) {
        this.id_cidade = id_cidade;
    }

    public String getNome_bairro() {
        return nome_bairro;
    }

    public void setNome_bairro(String nome_bairro) {
        this.nome_bairro = nome_bairro;
    }

    public String getNome_cidade() {
        return nome_cidade;
    }

    public void setNome_cidade(String nome_cidade) {
        this.nome_cidade = nome_cidade;
    }

    public String getNome_estado() {
        return nome_estado;
    }

    public void setNome_estado(String nome_estado) {
        this.nome_estado = nome_estado;
    }
    
    
}
