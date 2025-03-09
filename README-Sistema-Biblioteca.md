# 📚 Sistema de Biblioteca em Java

## 📖 Introdução
Este projeto é um sistema de biblioteca desenvolvido em Java para gerenciar livros, membros e empréstimos. Ele permite o cadastro e remoção de livros, registro de membros, realização e devolução de empréstimos, além da persistência dos dados em arquivos.

## 📑 Sumário
- [📖 Introdução](#-introdução)
- [🏆 Utilidade do Sistema](#-utilidade-do-sistema)
- [🚀 Funcionalidades](#-funcionalidades)
- [🛠️ Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [▶️ Como Usar](#️-como-usar)
- [🧪 Testes](#-testes)

## 🏆 Utilidade do Sistema

O **Sistema de Biblioteca em Java** foi desenvolvido para auxiliar no gerenciamento de bibliotecas, permitindo que administradores possam:
- Cadastrar e remover livros do acervo;
- Registrar novos membros da biblioteca;
- Controlar empréstimos e devoluções de livros;
- Armazenar e recuperar os dados do sistema a partir de arquivos.

Com esse sistema, é possível garantir um controle eficiente do fluxo de livros emprestados e evitar perdas ou desorganização no acervo. Além disso, sua implementação em **Java** permite fácil manutenção e escalabilidade para futuras melhorias.

## 🚀 Funcionalidades
- 📚 **Gerenciamento de Livros**
  - Adicionar livros à biblioteca.
  - Remover livros (desde que não estejam emprestados).
  
- 👤 **Gerenciamento de Membros**
  - Registrar membros na biblioteca.

- 📄 **Empréstimos e Devoluções**
  - Registrar empréstimos de livros para membros.
  - Devolver livros emprestados.

- 💾 **Persistência de Dados**
  - Salvar os dados da biblioteca em um arquivo.
  - Carregar os dados previamente armazenados.

## 🛠️ Tecnologias Utilizadas
- **Java SE 8+**
- **JUnit 5** para testes unitários
- **IDE recomendada**: IntelliJ IDEA ou Eclipse

## ▶️ Como Usar

### 📚 Adicionar livros à biblioteca
```java
biblioteca.adicionarLivro(new Livro("Livro Exemplo", "Autor Exemplo", "123456"));
```

### 👤 Registrar membro
```java
biblioteca.registrarMembro(new Membro("João", 1, "joao@email.com"));
```

### 📄 Realizar um empréstimo
```java
biblioteca.registrarEmprestimo(livro, membro
```

### 🔄 Realizar uma devolução
```java
biblioteca.devolverLivro(emprestimo);
```

### 💾 Salvar e carregar os dados
```java
biblioteca.salvarDadosEmArquivo("dados.txt");
biblioteca.carregarDadosDeArquivo("dados.txt");
```

