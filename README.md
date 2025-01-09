# **Refatorações e Implementações Diversas**

Este repositório contém diversas refatorações e implementações que seguem os princípios SOLID, além de adicionar novas funcionalidades e melhorias significativas à interatividade e flexibilidade do sistema.

---

## **Principais Alterações**

### **1. Refatoração para Seguir o Princípio da Substituição de Liskov (LSP)**
- Criada a interface `Forma` com o método `getArea()`.
- Implementada a classe `Retangulo` com atributos `largura` e `altura`, seguindo a interface `Forma`.
- Implementada a classe `Quadrado` com atributo `lado`, seguindo a interface `Forma`.
- Removida a relação de herança entre `Quadrado` e `Retangulo` para evitar inconsistências de comportamento.
- Garantido que `Quadrado` e `Retangulo` sejam tratados de forma independente e consistente.

---

### **2. Adição de Menu Interativo para Gerenciamento de Contas Bancárias**
- Adicionado menu principal para seleção entre `Conta Corrente` e `Conta Poupança`.
- Implementado menu de ações para:
  - Depósito
  - Saque
  - Consulta de saldo
  - Cálculo de taxa
- Integrado o `GerenciadorTransacoes` para envio de notificações (e-mail e SMS) durante transações.
- Adicionada validação de entrada do usuário para garantir interatividade e evitar erros.
- Utilizado `Scanner` para entrada de dados do cliente.

---

### **3. Refatoração para Seguir o Princípio da Inversão de Dependência (DIP)**
- Adicionada a interface `DispositivoEntrada` para abstrair dispositivos de entrada.
- Modificada a classe `Teclado` para implementar a interface `DispositivoEntrada`.
- Adicionada a classe `Mouse` como uma nova implementação de `DispositivoEntrada`.
- Refatorada a classe `Computador` para depender da abstração `DispositivoEntrada`, permitindo maior flexibilidade na escolha do dispositivo de entrada.
- Incluído exemplo de uso com injeção de dependência para `Teclado` e `Mouse`.

---

### **4. Refatoração para Seguir o Princípio da Segregação de Interfaces (ISP)**
- Criada a interface `Programador` com o método `programar`.
- Criada a interface `Atendente` com o método `atenderCliente()`.
- Refatorada a classe `Desenvolvedor` para implementar apenas a interface `Programador`.
- Refatorada a classe `AtendenteBanco` para implementar apenas a interface `Atendente`.
- Removidos métodos desnecessários e melhorada a organização do código.

---

### **5. Implementação de Estrutura para Calculadora com Suporte a Múltiplas Operações**
- Adicionada a interface `Operacao` para definir operações matemáticas.
- Implementadas as operações:
  - `Adicao`: Soma
  - `Subtracao`: Subtração
  - `Multiplicacao`: Multiplicação
- Refatorada a classe `Calculadora` para utilizar a interface `Operacao`, permitindo maior flexibilidade.
- Adicionado o `MenuCalculadora` para interação com o usuário, permitindo realizar operações matemáticas.

---

### **6. Adição de Classes para Geração e Envio de Relatórios Financeiros**
- `EnviarPorEmail.java`: Implementa funcionalidade para envio de relatórios por e-mail.
- `GerarRelatorio.java`: Contém lógica para geração de relatórios genéricos.
- `GerarRelatorioFinanceiro.java`: Integra a geração de relatórios financeiros e o envio por e-mail.

---

## **Como Testar**

1. Clone o repositório e faça checkout para a branch principal.
2. Compile e execute o sistema.
3. Navegue pelos menus interativos para testar as funcionalidades:
   - Gerenciamento de contas bancárias.
   - Operações matemáticas na calculadora.
4. Verifique a geração e envio de relatórios financeiros.
5. Teste a flexibilidade do sistema ao alternar entre diferentes dispositivos de entrada.

---

## **Considerações Finais**

Este projeto melhora significativamente a estrutura do código, garantindo maior modularidade, flexibilidade e aderência aos princípios SOLID. Além disso, adiciona funcionalidades úteis e interatividade ao sistema, tornando-o mais robusto e fácil de usar.
