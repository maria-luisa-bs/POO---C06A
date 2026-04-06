package br.inatel.computador;

public class SistemaOperacional {
    private String nome;
    private int tipo;

    public SistemaOperacional(String nome, int tipo)
    {
        this.nome = nome;
        this.tipo = tipo;
    }

    // getters para ver nome e tipo
    public String getNome()
    {
        return nome;
    }

    public int getTipo()
    {
        return tipo;
    }
}
