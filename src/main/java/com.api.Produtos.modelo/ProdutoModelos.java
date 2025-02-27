package com.api.Produtos.modelo;


import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
public class ProdutoModelos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigo")
    private int codigo;

    @Column(name="nome")
    private String nome;

    @Column(name="valor")
    private double valor;


    //Get e Set
    public int getCodigo() {
        return codigo;
    }

    public void setCodido(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
