# JavaCorrige - Biblioteca de Anotações para Gabaritos

A **JavaCorrige** é uma biblioteca auxiliar para o software **JavaCorrige**, utilizada na criação de gabaritos de correção de exercícios de Programação Orientada a Objetos (POO) em Java. Ela fornece anotações personalizadas que permitem especificar regras de correção, atribuir notas a elementos do código e realizar testes automatizados.

## Instalação

Adicione o arquivo JAR ao classpath do seu projeto:
   - No **Maven**, instale manualmente:
     ```bash
     mvn install:install-file -Dfile=javacorrige-1.0.jar -DgroupId=com.javacorrige -DartifactId=javacorrige -Dversion=1.0 -Dpackaging=jar
     ```
   - Ou importe diretamente no seu ambiente de desenvolvimento.

---

## Funcionalidades

### 1. **@Especificacao**
Define regras gerais de comparação para a classe gabarito.

#### Parâmetros:
- `todosAtributosPrivados` (default: `true`): Exige que todos os atributos sejam privados.
- `atributosExatos` (default: `false`): Determina se os atributos devem corresponder exatamente aos especificados.
- `construtoresExatos` (default: `false`): Exige que os construtores correspondam exatamente ao gabarito.
- `metodosExatos` (default: `false`): Exige que os métodos correspondam exatamente ao gabarito.
- `penalidade` (default: `0.0`): Percentual de penalidade aplicado para cada discrepância.
- `similaridade` (default: `1.0`): Define o nível mínimo de similaridade entre os nomes dos elementos.

#### Exemplo de Uso:
```java
import com.javacorrige.Especificacao;

@Especificacao(
    todosAtributosPrivados = true,
    atributosExatos = true,
    construtoresExatos = false,
    metodosExatos = true,
    penalidade = 0.2,
    similaridade = 0.8
)
public class ExemploGabarito {
    private String nome;
    private int idade;

    public ExemploGabarito(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
```

---

### 2. **@Nota**
Atribui uma nota a elementos individuais como atributos, métodos ou construtores.

#### Parâmetro:
- `value` (default: `0.0`): Representa a nota atribuída ao elemento.

#### Exemplo de Uso:
```java
import com.javacorrige.Nota;

public class ExemploGabarito {
    @Nota(value = 2.0)
    private String nome;

    @Nota(value = 3.0)
    public String getNome() {
        return nome;
    }

    @Nota(value = 1.0)
    public ExemploGabarito(String nome) {
        this.nome = nome;
    }
}
```

---

### 3. **@Testar**
Permite definir testes automatizados para métodos, especificando valores de entrada e, opcionalmente, o construtor utilizado.

#### Parâmetros:
- `parametros` (default: `{}`): Valores dos parâmetros para o método, representados como strings.
- `construtor` (default: `{}`): Parâmetros para o construtor da classe, representados como strings.

#### Exemplo de Uso:
```java
import com.javacorrige.Testar;

public class ExemploGabarito {
    private int soma;

    public ExemploGabarito(int inicial) {
        this.soma = inicial;
    }

    @Testar(parametros = {"5", "10"}, construtor = {"0"})
    public int somar(int a, int b) {
        return a + b + soma;
    }
}
```

---

## Como Utilizar no Gabarito

1. Adicione as anotações às classes e elementos do gabarito.
2. Configure as regras de correção usando `@Especificacao` na classe.
3. Atribua notas específicas a métodos, atributos ou construtores usando `@Nota`.
4. Opcionalmente, defina testes automatizados com `@Testar` para validar o comportamento.

### Estrutura do Gabarito
```java
@Especificacao(
    atributosExatos = true,
    construtoresExatos = true,
    metodosExatos = true,
    penalidade = 0.1
)
public class MeuGabarito {
    @Nota(value = 2.0)
    private String atributo;

    @Nota(value = 1.5)
    public MeuGabarito(String atributo) {
        this.atributo = atributo;
    }

    @Nota(value = 3.0)
    public String getAtributo() {
        return atributo;
    }
}
```

---

## Compatibilidade
- **Java**: Requer JDK 21 ou superior.
- **Software de Correção**: Compatível com o **JavaCorrige**.

---

