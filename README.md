# Atividade colaborativa

## Respostas do livro Batista & Moraes (2013).  42-44

# Questão 1

a) ( F ) byte x = 300;

b) ( F ) short $mom = 43;

c) ( F ) int num = 2.5;

d) ( V ) double d = 20;

e) ( F ) char c = 25;

f) ( F ) boolean epar = (4%2=0)

g) ( F ) char nome = “Maria”;

h) ( V ) String b = “1”

i) ( V ) float x = 2.7;

j) ( F ) int a = false;

# Questão 4

Resposta: Ao tentar realizar uma adição com duas variaveis de tipos distintos, resultará em um erro Type mismatch sendo o int somando com um long e isso irá resultar em long e esse tipo não corresponde com o tipo da variavel int2.


Para corrigir esse problema se faz necessário um casting:
```

int int2 = (int) (int1 + long1);
```