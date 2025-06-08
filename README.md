# 🐾 PetAdota: Plataforma de Adoção de Animais

![Linguagem](https://img.shields.io/badge/Java-17-blue?style=for-the-badge&logo=java)
![Framework](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=for-the-badge&logo=spring)
![Frontend](https://img.shields.io/badge/Frontend-Thymeleaf-orange?style=for-the-badge&logo=html5)
![Status](https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge)

<br>

## 📄 Visão Geral do Projeto

**PetAdota** é uma aplicação web full-stack desenvolvida para a disciplina de Programação Orientada a Objetos III. O projeto simula uma plataforma para abrigos de animais gerenciarem o cadastro de pets disponíveis para adoção, facilitando o encontro entre animais que precisam de um lar e pessoas dispostas a adotá-los.

A aplicação conta com um **backend RESTful** robusto construído com Spring Boot e uma **interface web interativa** renderizada no servidor com Thymeleaf, permitindo uma experiência de usuário completa.

<br>

## 📸 Telas da Aplicação

Abaixo estão algumas telas da interface web, demonstrando o visual limpo e profissional da plataforma.

| Tela Principal (Listagem em Cards) | Tela de Formulário (Criar/Editar) |
| :---: | :---: |
| *![Tela Principal com cards de animais](https://github.com/anasalgado1/PetAdota/blob/main/P%C3%A1gina%20Inicial.jpg)* | *![Tela de Formulário para cadastro e edição](https://github.com/anasalgado1/PetAdota/blob/main/P%C3%A1gina%20de%20Cadastro.jpg)* |

<br>

## ✨ Funcionalidades

A plataforma oferece um ciclo CRUD completo, tanto pela API quanto pela interface web:

* ✔️ **Backend (API RESTful)**
    * Endpoints para `CREATE`, `READ`, `UPDATE` e `DELETE` de animais.
    * Validação de dados de entrada.
    * Tratamento de exceções para respostas de erro claras.

* ✔️ **Frontend (Interface Web com Thymeleaf)**
    * Página principal com listagem visual de animais em formato de "cards".
    * Formulário unificado para **cadastrar** um novo animal.
    * Funcionalidade para **editar** as informações de um animal existente.
    * Botão para **excluir** um animal com diálogo de confirmação.

<br>

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Propósito |
| :--- | :--- |
| **Java 17** | Linguagem de programação principal |
| **Spring Boot** | Framework para o backend e a aplicação web |
| **Spring Data JPA / Hibernate** | Persistência de dados e comunicação com o banco |
| **H2 Database** | Banco de dados relacional (configurado em modo arquivo) |
| **Thymeleaf** | Motor de templates para renderizar as páginas HTML no servidor |
| **HTML5 & CSS3** | Estrutura e estilização do frontend |
| **Bootstrap 5** | Framework CSS para responsividade e componentes visuais |
| **Maven** | Gerenciador de dependências e build do projeto |

<br>

## ⚙️ Como Executar o Projeto

Siga os passos abaixo para rodar a aplicação em seu ambiente local.

### Pré-requisitos
* Java Development Kit (JDK) 17 ou superior.
* Apache Maven 3.8 ou superior.

### Passos para Execução

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/anasalgado1/PetAdota.git
    ```
2.  **Navegue até a pasta do projeto:**
    ```bash
    cd '.\Projeto - PetAdota API\'
    ```
3.  **Execute a aplicação:**
    * **Pela sua IDE**
        * Importe o projeto como um projeto Maven.
        * Encontre a classe `PetadotaApiApplication.java` e execute o método `main`.

4.  A aplicação estará disponível no seu navegador.
   
❗ **IMPORTANTE** ❗

    💡 Banco de Dados Pré-Populado Incluso

    Para que você possa ver a aplicação em ação imediatamente, este repositório já vem com um banco de dados (petadotadb.mv.db) populado com alguns animais de exemplo.

    Quer começar com uma base de dados limpa?

    É muito simples:

        Pare a aplicação, se estiver rodando.
        Na pasta raiz do projeto, delete o arquivo petadotadb.mv.db.
        Inicie a aplicação novamente.

    Um novo banco de dados, limpo e vazio, será criado automaticamente para você começar a cadastrar do seu jeito!

<br>

## 🚀 Acessando a Aplicação

Depois de iniciar o servidor, acesse as seguintes URLs no seu navegador:

* **Interface Web Principal:** `http://localhost:8080/web/animais`
* **Base da API RESTful:** `http://localhost:8080/api/animais`
* **Console do Banco de Dados H2:** `http://localhost:8080/h2-console`
    * **JDBC URL:** `jdbc:h2:file:./petadotadb`
    * **User Name:** `userdatabase`
    * **Password:** `senha123`

<br>

## 👨‍💻 Autores

Este projeto foi desenvolvido com dedicação por:

* Ana Luiza Pimentel Salgado

<br>

## 📜 Licença

Este projeto está sob a licença MIT.
