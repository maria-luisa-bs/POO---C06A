package br.inatel.computador;

public class Computador {
    private String marca;
    private float preco;
    private HardwareBasico[] hardwareBasicos; // array - hardware básicos
    private SistemaOperacional sistemaop;
    private MemoriaUSB memusb;

    // construtor da classe computador
    public Computador(String marca, float preco)
    {
        this.marca = marca;
        this.preco = preco;

        this.hardwareBasicos = new HardwareBasico[3];
    }

    public void setSistemaop(SistemaOperacional sistemaop)
    {
        this.sistemaop = sistemaop;
    }

    public void addMemusb(MemoriaUSB  memusb)
    {
        this.memusb = memusb;
    }

    public void addHardwareBasicos(HardwareBasico hb)
    {
        for(int i = 0; i < hardwareBasicos.length; i++)
        {
            if(hardwareBasicos[i] == null)
            {
                hardwareBasicos[i] = hb;
                break;
            }
        }
    }

    // getters para ver marca + preço do computador
    public String getMarca()
    {
        return marca;
    }

    public float getPreco()
    {
        return preco;
    }

    // exibir as informações do computador que o cliente vai comprar
    public void mostraPCconfigura()
    {
        System.out.println("Informações do computador: " + this.getMarca());
        System.out.println("Preço: R$" + this.getPreco());
        System.out.println("Informações sobre Hardware Básico");

        for(HardwareBasico hardwareBasico:hardwareBasicos)
        {
            if(hardwareBasico != null)
            {
                System.out.println("Tipo do dispositivo: " + hardwareBasico.getNome());
                System.out.println("Capacidade do dispositivo: " + hardwareBasico.getCapacidade());
            }
        }

        System.out.println("Sistema Operacional");
        System.out.println("Nome: " + sistemaop.getNome());
        System.out.println("Tipo: " + sistemaop.getTipo());

        System.out.println("Memória USB");
        System.out.println("Nome: " + memusb.getNome());
        System.out.println("Capacidade: " + memusb.getCapacidade());
    }

}
