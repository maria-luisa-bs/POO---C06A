// classe criada para "facilitar" a visualização dos produtos a serem comprados
package br.inatel.loja;

import br.inatel.computador.Computador;
import br.inatel.computador.HardwareBasico;
import br.inatel.computador.MemoriaUSB;
import br.inatel.computador.SistemaOperacional;

public class Loja {
    // usando uma matricula fixa do cliente para definir preço
    private static int matricula = 701;

    private float preco1 = matricula;
    private float preco2 = matricula + 702;
    private float preco3 = matricula + 703;

    // getters para ver o preço de cada cliente
    public float getPreco1()
    {
        return preco1;
    }

    public float getPreco2()
    {
        return preco2;
    }

    public float getPreco3()
    {
        return preco3;
    }

    private Computador[] computadors = new Computador[3]; // array - computadores disponíveis

    public Loja()
    {
        // 1° computador da loja
        // criando o computador 1
        Computador computadors1 = new Computador("Dell", this.getPreco1());
        // criando os componentes do hardware
        HardwareBasico hb11 = new HardwareBasico("i7", 4500);
        HardwareBasico hb12 = new HardwareBasico("RAM", 32);
        HardwareBasico hb13 = new HardwareBasico("HD", 2000);
        // associando hardware ao computador
        computadors1.addHardwareBasicos(hb11);
        computadors1.addHardwareBasicos(hb12);
        computadors1.addHardwareBasicos(hb13);
        // difinindo sistema operacional do computador
        SistemaOperacional s1 = new SistemaOperacional("Windows 10", 64);
        computadors1.setSistemaop(s1);
        // adicionando memória USB
        MemoriaUSB memusb1 = new MemoriaUSB("HD Externo", 1000);
        computadors1.addMemusb(memusb1);
        // associando a configuração ao computador que vai ocupar a posição 0 (1° lugar) no array
        computadors[0] = computadors1;

        // 2° computador da loja
        Computador computadors2 = new Computador("Apple", this.getPreco2());
        HardwareBasico hb21 = new HardwareBasico("i3", 2200);
        HardwareBasico hb22 = new HardwareBasico("RAM", 8);
        HardwareBasico hb23 = new HardwareBasico("HD", 500);
        computadors2.addHardwareBasicos(hb21);
        computadors2.addHardwareBasicos(hb22);
        computadors2.addHardwareBasicos(hb23);
        SistemaOperacional s2 = new SistemaOperacional("macOS Sequoia", 64);
        computadors2.setSistemaop(s2);
        MemoriaUSB memusb2 = new MemoriaUSB("Pen-drive", 16);
        computadors2.addMemusb(memusb2);
        computadors[1] = computadors2;

        // 3° computador da loja
        Computador computadors3 = new Computador("Samsung", this.getPreco3());
        HardwareBasico hb31 = new HardwareBasico("i5", 3370);
        HardwareBasico hb32 = new HardwareBasico("RAM", 16);
        HardwareBasico hb33 = new HardwareBasico("HD", 1000);
        computadors3.addHardwareBasicos(hb31);
        computadors3.addHardwareBasicos(hb32);
        computadors3.addHardwareBasicos(hb33);
        SistemaOperacional s3 = new SistemaOperacional("Windows 8", 64 );
        computadors3.setSistemaop(s3);
        MemoriaUSB memusb3 = new MemoriaUSB("Pen-drive", 32);
        computadors3.addMemusb(memusb3);
        computadors[2] = computadors3;
    }

    // getter que mostra os computadores disponíveis na loja
    public Computador[] getComputadors()
    {
        return computadors;
    }
}
