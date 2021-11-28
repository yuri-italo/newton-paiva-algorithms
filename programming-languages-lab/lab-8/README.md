# 2021/1: LdP - Lab 8 Cadastro e Pesquisa de Livros (5pts)

**Problema**:

Você recebeu uma tarefa do seu gerente para construir um sistema de cadastro de livros para uma biblioteca pública. O sistema deverá permitir que usuários cadastrem livros e realizem operações de pesquisa por unidades cadastradas.

O laboratório 8 deverá ser realizado através das etapas.

**1. Configurar o banco de dados H2 para gerenciar a tabela abaixo:**

Livros<br>
\- título (string)<br>
\- autor (string)<br>
\- ano de publicação (inteiro)<br>
\- editora (string)<br>
\- categoria (ex. ficção, romance, infantil)<br>

```
create table livros (
  id INT NOT NULL AUTO_INCREMENT,
  titulo VARCHAR(64) NOT NULL,
  autor VARCHAR(64) NOT NULL,
  ano_publicacao INT NOT NULL,
  editora VARCHAR(64) NOT NULL,
  categorias VARCHAR(100) NOT NULL,
  PRIMARY KEY (id)
);
```

**2. Utilizando o JDBC e exemplos vistos em sala de aula, IMPLEMENTE um sistema que permita ao usuário realizar as seguintes operações (i.e. menu de operações):**

a) Cadastrar um novo livro<br>
b) Lista todos os livros cadastrados no sistema<br>
c) Pesquisar livros por **titulo**: o usuário informa a palavra que deseja realizar a pesquisa (string)<br>
d) Pesquisar livros por **categoria**: o usuário informa a categoria desejada (string)<br>
e) Excluir um livro por ID<br>

As operações podem ser realizadas através de Scanner (console) ou JOptionPane (janelas de diálogo).

Junto com o trabalho, uma documentação breve (arquivo texto, readme.txt) explicando como executá-lo deve ser entregue.

**3. Realize testes manuais no sistema para cada uma das operações acima, mostrando que o sistema funciona sem erros.**