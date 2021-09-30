# Especificação:

Utilizando **interfaces gráficas de usuário em Java (GUIs)** e **conjuntos de dados EM MEMÓRIA**, apresente uma solução em forma de software que resolva o problema abaixo:

Tela:

```
Cadastro e listagem (N)

Número registro:    1
Nome completo:      [             ]
CPF:                [             ]
Email:              [             ]
Telefone:           [             ]
Data de Nascimento: [             ]

<Voltar> <Avançar>      <Salvar> <Excluir>
```

(N): apresenta a quantidade de registros salvos<br>
**&lt;Voltar&gt;**: acessa o registro anterior<br>
**&lt;Avançar&gt;**: acessa o próximo registro, se existir. Caso contrário, exibe um formulário vazio para criação<br>
**&lt;Salvar&gt;**: Salva o registro (existente ou novo) na lista (ArrayList)<br>
**&lt;Excluir&gt;**: remove o registro da lista (arranjo)<br>

**Partes (MVC)**:<br>
\- **Visão**: compomentes de interface<br>
\- **Controle**: execução de eventos a partir da interface<br>
\- **Modelo**: dados armazenados e exibidos na visão<br>

Classe: **PessoaFisica**<br>