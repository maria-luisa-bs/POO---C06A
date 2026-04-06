package br.inatel.estoque;

import br.inatel.computador.Computador;
import br.inatel.computador.HardwareBasico;
import br.inatel.computador.MemoriaUSB;
import br.inatel.computador.SistemaOperacional;

public class Estoque {

    // usando um número fixo para o cliente, e assim definindo os preços
    private static int num = 2500;

    public static Computador[] getComputadors() {

        float preco1 = num;
        float preco2 = num + 2600;
        float preco3 = num + 1500;

        Computador[] computadors = new Computador[3];

        // o que esta sendo feito
        // 1 - vamos criar um computador;
        // 2 - criamos os componetes do computador (hardware)
        // 3 - fazemos a associação entre hardware e computador
        // 4 - definimos o sistema operacional do computador
        // 5 - definimos o valor de memória
        // 6 - vamos associar as configuração com a posição que o computador vai ocupar dentro do array

        // 1° computador no estoque
        // 1
        Computador computadors1 = new Computador("Dell", preco1);

        // 2 e 3
        HardwareBasico hb11 = new HardwareBasico("i7", 4500);
        HardwareBasico hb12 = new HardwareBasico("RAM", 32);
        HardwareBasico hb13 = new HardwareBasico("HD", 2000);
        computadors1.addHardwareBasicos(hb11);
        computadors1.addHardwareBasicos(hb12);
        computadors1.addHardwareBasicos(hb13);

        // 4 e 5
        SistemaOperacional s1 = new SistemaOperacional("Windows 10", 64);
        computadors1.setSistemaop(s1);
        MemoriaUSB memusb1 = new MemoriaUSB("HD Externo", 1000);
        computadors1.addMemusb(memusb1);

        // 6
        computadors[0] = computadors1;

        // 2° computador no estoque
        Computador computadors2 = new Computador("Apple", preco2);

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

        // 3° computador no estoque
        Computador computadors3 = new Computador("Samsung", preco3);

        HardwareBasico hb31 = new HardwareBasico("i5", 3370);
        HardwareBasico hb32 = new HardwareBasico("RAM", 16);
        HardwareBasico hb33 = new HardwareBasico("HD", 1000);
        computadors3.addHardwareBasicos(hb31);
        computadors3.addHardwareBasicos(hb32);
        computadors3.addHardwareBasicos(hb33);

        SistemaOperacional s3 = new SistemaOperacional("Windows 8", 64);
        computadors3.setSistemaop(s3);
        MemoriaUSB memusb3 = new MemoriaUSB("Pen-drive", 32);
        computadors3.addMemusb(memusb3);

        computadors[2] = computadors3;

        return computadors;
    }
}