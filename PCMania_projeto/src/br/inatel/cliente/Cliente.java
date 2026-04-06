package br.inatel.cliente;

import br.inatel.computador.Computador;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores; // array - computadores comprados na loja
    private int quantidadecomp; // quantidade de computadoes que foram adicionados ao carrinho de compra

    // contrutor da classe Cliente
    public Cliente(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;

        this.computadores = new Computador[8];
        this.quantidadecomp = 0;
    }

    // getters para ver as informações "básicas"
    public String getNome()
    {
        return nome;
    }

    public String getCpf()
    {
        return cpf;
    }

    public Computador[] getComputadores()
    {
        return computadores;
    }

    public int getQuantidadecomp()
    {
        return quantidadecomp;
    }

    // adicionar um computador ao carrinho de compra
    public void comprarComputador(Computador comp)
    {
        if(quantidadecomp < computadores.length)
        {
            computadores[quantidadecomp] = comp;
            quantidadecomp++;
        }
    }

    // calcular o valor total da compra com os itens colocados no carrinho de compra
    public float TotalCompra()
    {
        float total = 0;

        for(int i = 0; i < quantidadecomp; i++)
        {
            total += computadores[i].getPreco();
        }
        return total;
    }

    // exibir informações do cliente + compra
    public void informacaoCliente()
    {
        System.out.println("Cliente: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Carrinho de compra");
        System.out.println("Quantidade de itens comprados: " + this.getQuantidadecomp());

        for(int i = 0; i < getQuantidadecomp(); i++)
        {
            System.out.println();
            computadores[i].mostraPCconfigura();
        }

        System.out.println("Preço total da compra: R$" + this.TotalCompra());
    }
}
