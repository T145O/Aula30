package br.com.starlog.model;

public class Produto {
    private Long id;
    private String nome;
    private double preco;
    private int estoque;

    public Produto(Long id, String nome, double preco, int estoque) throws IllegalArgumentException{
        if(nome == null || nome.trim().length() < 3){
            throw new IllegalArgumentException("Nome não pode ser nulo ou ter menos que três caracteres.");
        }
        if(preco <= 0){
            throw new IllegalArgumentException("Preco não pode ser zero ou negativo.");
        }
        if(estoque < 0){
            throw new IllegalArgumentException("Estoque não pode ser negativo.");
        }
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Produto( String nome, double preco, int estoque) throws IllegalArgumentException{
        if(nome == null || nome.trim().length() < 3){
            throw new IllegalArgumentException("Nome não pode ser nulo ou ter menos que três caracteres.");
        }
        if(preco <= 0){
            throw new IllegalArgumentException("Preco não pode ser zero ou negativo.");
        }
        if(estoque < 0){
            throw new IllegalArgumentException("Estoque não pode ser negativo.");
        }
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
    

}
