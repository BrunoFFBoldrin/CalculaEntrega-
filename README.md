# 🍔 CalculaEntrega

Projeto de estudos desenvolvido em Java focado em boas práticas de Orientação a Objetos, captura de dados via console, validações robustas e controle de versão com Git.

> 🎓 **Projeto de Estudo:** Este repositório foi criado como uma atividade prática de estudos (Alura), com foco na consolidação de fundamentos da linguagem Java e arquitetura básica de software.  
> 🚧 **Status:** Em desenvolvimento (Work in Progress)

---

## 🎯 Objetivos de Aprendizado

- Praticar conceitos de **Programação Orientada a Objetos (POO)**: encapsulamento, responsabilidade única e visibilidade (getters/setters).
- Implementação de **validações e tratamento de exceções** (`try-catch`, `IllegalArgumentException`, `NumberFormatException`).
- Sanitização de strings e expressões regulares (`regex`).
- Organização de fluxo de trabalho no Git utilizando branches (`main` e `develop`).

---

## 📋 Funcionalidades

### ✅ Implementado (WIP)
- [x] Captura e sanitização do nome do cliente (remoção de espaços extras e validação de números).
- [x] Entrada e validação da distância da entrega em km (suporte a vírgula/ponto e verificação de valores positivos).
- [x] Seleção e validação do identificador do combo (IDs válidos de 1 a 5).
- [x] Verificação da condição climática (chuva: `s`/`sim` ou `n`/`não`).
- [x] Encapsulamento com métodos getters para leitura dos dados tratados.

### ⏳ Próximos Passos
- [ ] Implementação da regra de negócio para cálculo da taxa de entrega baseada em km.
- [ ] Regras de acréscimo para dias chuvosos e combos especiais.
- [ ] Exibição formatada do resumo do pedido e valor final no console.

---

## 🛠️ Tecnologias

- **Linguagem:** Java (JDK 17+)
- **Controle de Versão:** Git & GitHub

---

## 🚀 Como Executar Localmente

1. Clone o repositório:
   ```bash
   git clone https://github.com/BrunoFFBoldrin/CalculaEntrega.git
   ```

2. Acesse a pasta do projeto:
   ```bash
   cd CalculaEntrega
   ```

3. Compile as classes Java para a pasta `bin`:
   ```bash
   javac -d bin src/*.java
   ```

4. Execute o programa:
   ```bash
   java -cp bin Main
   ```

---

## 👤 Autor

Desenvolvido por **Bruno Boldrin** durante estudos de desenvolvimento Java.
