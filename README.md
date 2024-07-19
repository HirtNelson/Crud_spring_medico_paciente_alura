# CRUD Spring - Médico e Paciente

Este projeto é um sistema CRUD (Create, Read, Update, Delete) desenvolvido com Spring Boot para gerenciar dados de médicos e pacientes.

## Funcionalidades

- Cadastro de médicos
- Cadastro de pacientes
- Atualização de informações
- Exclusão de registros
- Listagem de todos os registros

## Tecnologias Utilizadas

- Java
- Spring Boot
- Maven
- H2 Database (ou outro banco de dados à sua escolha)

## Estrutura do Projeto

- **src/main/java**: Contém o código fonte do projeto
  - **controller**: Classes responsáveis por lidar com as requisições HTTP
  - **model**: Classes que representam as entidades Médico e Paciente
  - **repository**: Interfaces que estendem JpaRepository para acesso ao banco de dados
  - **service**: Classes que contêm a lógica de negócio

- **src/main/resources**: Contém arquivos de configuração e templates
  - **application.properties**: Configurações do Spring Boot

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/HirtNelson/Crud_spring_medico_paciente_alura.git
