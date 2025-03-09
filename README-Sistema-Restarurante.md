# 🍽️ Sistema de Gerenciamento de Restaurante

## 📌 Introdução
Este projeto é um sistema simples para gerenciamento de um restaurante, permitindo visualizar o cardápio, fazer pedidos e calcular o valor total dos pedidos. O sistema foi desenvolvido em Java e segue uma abordagem modular, organizando a lógica em diferentes classes para facilitar a manutenção e expansão.

---

## 📜 Sumário
- [🎯 Utilidade](#-utilidade)
- [💡 Funcionalidades](#-funcionalidades)
- [⚙️ Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [🚀 Como Usar](#-como-usar)
- [📌 Estrutura do Projeto](#-estrutura-do-projeto)
- [🛠️ Testes](#-testes)

---

## 🎯 Utilidade

O **Sistema de Gerenciamento de Restaurante** torna o atendimento mais rápido e eficiente, ajudando na organização de pedidos e controle do cardápio. Ele evita erros humanos, melhora a comunicação entre atendimento e cozinha, e facilita o cálculo dos valores dos pedidos.

### 🔹 Principais Benefícios:
- 📜 **Gestão do Cardápio**: Adicione, remova e consulte pratos facilmente.
- 🛒 **Registro de Pedidos**: Clientes escolhem pratos, e o sistema calcula o total automaticamente.
- 💰 **Fechamento Rápido da Conta**: O sistema soma os valores, agilizando o pagamento.
- 🔍 **Busca Rápida de Pratos**: Facilita a localização dos itens no cardápio.
- ✅ **Redução de Erros**: Evita confusões na cozinha e melhora a organização dos pedidos.

Com esse sistema, **o restaurante opera de forma mais ágil, organizada e profissional**, garantindo um melhor atendimento ao cliente. 🚀

---

## 💡 Funcionalidades
- 📜 **Exibição do Cardápio:** Lista os pratos disponíveis com nome, preço e descrição.
- 🛒 **Criação de Pedidos:** Permite que os clientes selecionem pratos e adicionem ao pedido.
- 💰 **Cálculo Automático do Total:** Soma os valores dos pratos no pedido.
- 🗑️ **Remoção de Pratos do Pedido:** Permite remover itens do pedido antes da finalização.
- ✅ **Validação de Pedidos:** Confirmação e visualização dos pedidos antes da finalização.
- 🔍 **Busca de Pratos no Cardápio:** Pesquisa pratos por nome.

---

## ⚙️ Tecnologias Utilizadas
- ☕ **Java** (linguagem de programação)
- ✅ **JUnit** (para testes automatizados)

---

## 🚀 Como Usar

1. **Execute o programa** e escolha uma opção no menu:
2. **Selecione "1"** para visualizar o cardápio completo com nome, preço e descrição dos pratos.
3. **Selecione "2"** para iniciar um pedido:
- Digite o nome do cliente.
- Adicione pratos digitando o nome de cada um.
- Quando terminar, digite **"fim"** para concluir o pedido.
- O total do pedido será exibido.
4. **Selecione "3"** para encerrar o sistema.

---

## 📌 Estrutura do Projeto

A organização do código segue uma estrutura modular:

```plaintext
📦 sistema-restaurante
 ┣ 📜 Restaurante.java     # Classe principal do sistema
 ┣ 📜 Cardapio.java        # Gerenciamento dos pratos disponíveis
 ┣ 📜 Pedido.java          # Controle dos pedidos e cálculo do total
 ┣ 📜 Prato.java           # Definição da classe Prato
 ┗ 📜 PedidoTest.java      # Testes unitários com JUnit
```

---

## 🛠️ Testes

O projeto inclui testes automatizados para verificar se os pedidos estão sendo corretamente adicionados e removidos.

### ✅ Rodando os Testes
Para executar os testes unitários, utilize:

```bash
javac -cp .:junit-5.7.0.jar PedidoTest.java
java -cp .:junit-5.7.0.jar org.junit.runner.JUnitCore PedidoTest
```


