# Cardápio Web

## Descrição do Projeto

O projeto **Cardápio Web** é uma aplicação que permite a visualização e gerenciamento de um cardápio de alimentos. O objetivo é fornecer uma interface fácil de usar para visualizar e consultar informações sobre diferentes itens de um cardápio, incluindo nome, descrição e preço dos alimentos.


## Tecnologias Usadas

- **Java**: Linguagem de programação principal utilizada para o desenvolvimento do back-end da aplicação.
- **Spring Boot**: Framework utilizado para criar e configurar a aplicação de forma rápida e fácil, fornecendo suporte para REST APIs e injeção de dependências.
- **Spring Data JPA**: Utilizado para simplificar o acesso e a manipulação de dados com o banco de dados, usando a interface `JpaRepository` para operações CRUD.
- **Lombok**: Biblioteca que reduz a quantidade de código boilerplate, gerando automaticamente métodos getters, setters e construtores.
- **Java Streams**: Facilita o processamento de coleções de dados, permitindo transformações e operações funcionais, como a conversão de entidades em DTOs.

## Estrutura do Projeto

- **`Food`**: Entidade que representa um alimento no banco de dados.
- **`FoodRepository`**: Interface que estende `JpaRepository` para operações CRUD no banco de dados.
- **`FoodController`**: Controlador REST que expõe uma API para consultar a lista de alimentos.
- **`FoodResponseDTO`**: Data Transfer Object que representa a forma como os dados dos alimentos são retornados para o cliente.




![Projeto no VSCODE](https://github.com/user-attachments/assets/34261dc7-8ad2-4916-8f43-6e0b50ad6adf)
![Captura de tela 2024-08-29 160411](https://github.com/user-attachments/assets/d151670c-f827-4a74-a691-eaeaa2f44ea7)
