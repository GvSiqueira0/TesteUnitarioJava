# Validador de Usuário

Este projeto é uma biblioteca Java simples para validação de dados de utilizador, incluindo nome, email e senha. Foi desenvolvido utilizando **Java 21** e **JUnit 5** para garantir a integridade das regras de negócio através de testes unitários.

## 📁 Estrutura de Pastas

A organização do projeto segue a estrutura padrão do Maven:

```text
validar-dados/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── validacao/
│   │               └── ValidadorUsuario.java    # Lógica de validação
│   └── test/
│       └── java/
│           └── com/
│               └── validacao/
│                   └── ValidadorUsuarioTest.java # Testes unitários JUnit 5
├── pom.xml                                      # Configurações e dependências Maven
└── README.md                                    # Documentação do projeto
```

## 🚀 Funcionalidades

O projeto contém métodos para validar os seguintes critérios:

* **Nome de Usuário:** Verifica se o nome tem entre 3 e 20 caracteres.
* **E-mail:** Valida o formato do e-mail utilizando expressões regulares (Regex).
* **Senha:** Garante que a senha atenda aos requisitos de segurança:
    * Mínimo de 8 caracteres.
    * Pelo menos uma letra maiúscula e uma minúscula.
    * Pelo menos um dígito numérico.
    * Pelo menos um carácter especial (ex: `!@#$%^&*`).

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 21
* **Gestor de Dependências:** Maven
* **Framework de Testes:** JUnit Jupiter (JUnit 5)

## 📋 Pré-requisitos

Antes de começar, certifique-se de que tem instalado:
* [JDK 21](https://www.oracle.com/java/technologies/downloads/)
* [Maven](https://maven.apache.org/)

## 🔧 Instalação e Execução

1.  Clone o repositório:
    ```bash
    git clone https://github.com/GvSiqueira0/TesteUnitarioJava.git
    ```

2.  Navegue até ao diretório do projeto:
    ```bash
    cd TesteUnitarioJava
    ```

3.  Compile o projeto:
    ```bash
    mvn clean install
    ```

## 🧪 Executando Testes

Para executar a suite de testes unitários e verificar se todas as validações estão a funcionar corretamente, utilize o comando:

```bash
mvn test