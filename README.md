Design e Arquitetura de Software

AULA 1 04/05/25:

Uma estratégia importante para combater a complexidade de sistemas de software passa pela criação de abstrações.
Uma abstração— pelo menos em Computação — é uma representação simplificada de uma entidade.

Abstração é quando transformamos algo da vida real em dados de banco de dados

controller  = api rest / html
entity  = dados
repository = con bd
service = lógica

OCULTAMENTO DE INFORMAÇÕES

Encapsular em java / Programação orientada a objetos = private

O que um Software Coeso

Um código que faz uma coisa(métodos) bem feita, onde tem apenas as representações dos dados, códigos faceis de entender, onde não terá outra função no código,
são mais faceis de fazer testes.

Acoplamento:
O quanto uma classe depende de outra classe para funcionar.

Código com aclopamento:
Mexer num código e ele pode dar erro em tudo

baixo aclopamento:
apagar um código e ele continuar certo

AULA 2 05/08/25

Para acabar ajudar a solucionar o acoplamento você usa a técnica chamada Injeção de Dependência.

SOLID:

Um macronimo de um conceito, solid foi criado por robert martin e michael feather, são 5 principios, Solid em resumo seria usar orientação a objetos do jeito certo/mais correto possível.

*S = principio da responsabilidade única (coesão), toda classe deve ter uma resposabilidade única.*
  
  MVC é um caso que usamos a responsabilidade única

    M = Representação dos dados V = HTML/tela C = Controle de tela

*O = *
*L = *
*I = Interface Segregation principle *
*D = *

Segregação de interface

Ter uma interface especifica para cada uma responsabilidade, interface para botão da tela, interface para movimento do mouse, etc.

*https://refactoring.guru/ - Site que tem solução para problemas de PROGRAMAÇÃO ORIENTADA A OBJETOS*


AULA 3 11/08/2025

PRINCIPIO DA INVERSÃO DE INDEPENDÊNCIA:
Um classe deve depender apenas de uma abstração e não de uma implementação completa

@autowired - É usado para diminuir acoplamento, evitando que uma classe implemente em outra classe

COMPOSIÇÃO DE HERANÇA:

Quando devemos usar Herança - exemplo:

       __ Animal __
       |           |
    Gato         Cachorro


Nesse exemplo acima vemos que usando a herança, será o melhor momento para usa-la, pois um gato nunca poderá ser um cachorro ou vice versa

       __ Pessoa __
       |           |
    Cliente     Funcionário


Nesse exemplo acima devemos usar associação, pois vemos que se usarmos herança a nosso funcionário cadastrado no banco de dados, nunca poderá ser um cliente e vice versa
ele terá dois cadastros iguais dentro do banco de dados porém, em tabelas diferentes.


PRINCÍPIO DE DEMETER:

O Demeter tenta evitar variaveis globais.

Variáveis globais são variáveis onde ocorre o acoplamento, caso a gente mude essa variável de lugar ou mudarmos o conteúdo, ela possívelmente irá quebrar todo o código.

PRICÍPIO DO ABERTO/FECHADO:

Proteger o comportamento do seus objetos para ninguem possa quebrar eles, para ninguem quebre o código, porém podem extender seus objetos, extender as funcionalidades.

Principio de Substituição de Liskov:

Os filhos herdam o padrão dos pais, onde se trocarmos os filhos eles continuaram funcionando dentro do código.

AULA 18/08/25

variavel global, static ele faz com que ele seja alocado na memória antes que o objeto