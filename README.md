**Maria Luisa Barroso Silva - GES 701**

**Utilização de IA:** No projeto foi utilizado o ChatGPT (GPT-5.3 OpenAI) para sanar algumas dúvidas durante o desenvolvimento do código.

---

**Prompt 1:**
<u>Pergunta:</u>
"De acordo com as orientações do PDF, queria saber se seria possível fazer uma classe estoque para armazenar as informações dos modelos de computador, seria viável?"

<u>Resposta:</u>
Sim — é totalmente viável criar uma classe Estoque… e mais: é uma boa prática de orientação a objetos.
Vantagens:
Organiza melhor os PCs disponíveis;
Evita deixar tudo “hardcoded” no main;
Facilita reutilização (boa prática de POO).

O enunciado não pede explicitamente, então não é obrigatório, mas é válido e bem visto se bem feito!

Exemplo de implementação:
```java
public class Estoque {
    private Computador[] computadores;

    public Estoque() {
        computadores = new Computador[3];

        computadores[0] = /* promoção 1 */;
        computadores[1] = /* promoção 2 */;
        computadores[2] = /* promoção 3 */;
    }

    public Computador getComputador(int indice) {
        if (indice >= 0 && indice < computadores.length) {
            return computadores[indice];
        }
        return null;
    }
}
```

Exemplo de utilização na Main:
```java id="h9k2ls"
Estoque estoque = new Estoque();

int opcao = teclado.nextInt();

Computador pcEscolhido = estoque.getComputador(opcao - 1);
```

---

**Prompt 2:**
<u>Pergunta:</u>
"Para criar essa classe estoque, tenho que criar um construtor dentro dela e chamar a classe Computador? Seria de outra maneira?"

<u>Resposta:</u>
O jeito mais correto (e mais alinhado com o PDF) é exatamente esse, criar um construtor na classe Estoque e instanciar objetos da classe Computador dentro dele.

Por que isso é o ideal?
O PDF fala claramente:
usar construtores em todas as classes;
dados podem ser estáticos (pré-definidos);
Então faz muito sentido que o Estoque já venha “montado” com os PCs.

Exemplo de estrutura:
```java id="q7n2vx"
public class Estoque {
    private Computador[] computadores;

    public Estoque() {
        computadores = new Computador[3];

        computadores[0] = new Computador(/* dados promoção 1 */);
        computadores[1] = new Computador(/* dados promoção 2 */);
        computadores[2] = new Computador(/* dados promoção 3 */);
    }

    public Computador getComputador(int indice) {
        return computadores[indice];
    }
}
```

Então respondendo sua dúvida diretamente:
- "Tenho que chamar a classe Computador?”
im. Você precisa criar objetos Computador dentro do Estoque.

- “Tem outra maneira?”
Até tem, mas não vale a pena aqui:	
Criar PCs no main	-	Fica bagunçado;
Passar PCs por parâmetro	-	Desnecessário pro exercício;
Criar dentro do Estoque	-	Mais organizado e correto.

Erro comum (evita isso aqui), não faça assim:
```java id="z8m2qr"
Computador[] computadores;
// (sem inicializar no construtor)
```

Sempre faça:
`computadores = new Computador[3];`

---

**Prompt 3:**
<u>Pergunta:</u>
"Eu gostaria de colocar um preço para cada modelo de computador, mas queria que aparecesse no momento em que mostram as configurações, mas o preço depende da marca, qual estrutura devo usar dentro do método para fazer a identificação dos preços de acordo com a marca?"

<u>Resposta:</u>
Ótima pergunta — isso aqui é bem clássico de POO e tem algumas formas de fazer. Vou te explicar a melhor.

Primeiro: cuidado com “if por marca”, você até poderia fazer assim:
```java id="t4x9pl"
if (marca.equals("Apple")) {
    preco = num;
} else if (marca.equals("Samsung")) {
    preco = num + 2600;
} else if (marca.equals("Dell")) {
    preco = num + 1500;
}
```

- Funciona? Sim.
- É a melhor forma? Não muito (fica feio e pouco orientado a objeto).

Melhor abordagem (recomendada): preço como atributo
- O PDF já diz que cada promoção tem um preço definido, então o ideal é:
   Cada objeto Computador já nasce com seu preço.

Exemplo da estrutura ideal da classe Computador:
```java id="p2d8kx"
public void mostraPCConfigs() {
    System.out.println("Marca: " + marca);
    System.out.println("Preço: R$" + preco);
}
```

Mas cuidado, na hora de criar os PCs(promoções):
```java id="u7n4az"
Computador pc1 = new Computador("Apple", num);
Computador pc2 = new Computador("Samsung", num + 2600);
Computador pc3 = new Computador("Dell", num + 1500);
```

- Aqui você resolve o problema uma vez só;
- Depois não precisa ficar verificando marca.

Por que isso é melhor?
- Evita if/else desnecessário;
- Deixa o código mais limpo;
- Segue encapsulamento (POO de verdade);
- Facilita manutenção.

Quando usar if então?
Só faria sentido usar if: se o preço mudasse dinamicamente ou se dependesse de alguma lógica (ex: desconto, estoque, etc.).
- Mas não é o caso do seu trabalho.

Conclusão: 
Não use estrutura dentro do método para identificar preço pela marca.
Use:
- Preco como atributo da classe;
- Defina o valor no construtor.

---

**Prompt 4:**
<u>Pergunta:</u>
"Dentro da classe Computador, preciso fazer com que todo o array seja percorrido, nesse caso, seria melhor utilizar um for ou um for-each?"

<u>Resposta:</u>
Nesse caso específico, for-each é a melhor escolha.

Por que usar for-each aqui?
Você só quer:
- Percorrer todos os elementos;
- Acessar cada HardwareBasico;
- Mostrar informações.
Ou seja: não precisa do índice.

Então o for-each fica:
```java id="m5r8qn"
for(HardwareBasico hardwareBasico : hardwareBasicos) {
    if(hardwareBasico != null) {
        System.out.println("Tipo: " + hardwareBasico.getNome());
        System.out.println("Capacidade: " + hardwareBasico.getCapacidade());
    }
}
```

- Mais legível;
- Mais limpo;
- Menos chance de erro.

Quando usar for normal então?
Use o `for (int i = 0; i < ...; i++)` quando precisar de índice.
- Índice (i);
- Alterar posições do array;
- Acessar posições específicas.

Use for-each, porque:
- Você só precisa percorrer o array;
- Não precisa do índice;
- Deixa o código mais simples e legível.

---

**Conclusão:** 
A utilização da Inteligência Artificial no desenvolvimento deste trabalho mostrou-se satisfatória como ferramenta de apoio, especialmente no esclarecimento de dúvidas e na organização das etapas de implementação. O uso do ChatGPT contribuiu para uma melhor compreensão dos conceitos de Programação Orientada a Objetos e para a construção de um código mais estruturado.
