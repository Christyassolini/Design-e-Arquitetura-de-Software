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

Aula 01/09/25

Requisitos Funcionais são as telas que podemos ver

Requisitos Não Funcionais são requisitos que necessariamente precisamos cumprir

Características da arquitetura são requisitos funcionais.

Não tem como um sistema cumprir 100% das características de arquiteturais, porém buscamos cumpri-los

Decisões de arquitetura:

quando escolhemos uma arquitetura, escolhemos o futuro do nosso sistema, sendo uma das decisões mais importantes na hr de construir um sistema.

principios do design:

seria como uma regra que devemos seguir, onde temos principios a seguir para desenvolver um sistema.

O que um arquiteto faz?

- por ser uma pessoa que tem uma grande experiencia, ele toma as decisões e orienta a equipe no que deve-se usar na arquitetura do sistema que será desenvolvido.

- Continuamente acompanhar as tecnologias atuais, recomendar soluções e melhorias. Analisar situações onde devemos fazer as escolhas corretas, avaliando o que deve ser mudado dentro do sistema.

- Assegurar que os padrões estão sendo seguidos, significa que continuamente o arquiteto precisar estar analisando as linhas de códigos, procurando padrões a ser seguidos, assegurando que o código esteja funcionando.

- Geralmente o arquiteto é contratado para analisar o sistema, então é importante que ele tenha muita experiência na área, que ele tenha trabalhado em muitas áreas na construção de um sistema. Ter conhecimento do mínimo do negócio.

- Ter habilidades interpessoais, saber motivar as pessoas e lidar com seu grupo.

- Entender e lidar bem com questões políticas, saber lidar e negociar com clientes, e saber influênciar as pessoas.

- Operações/Dev0ps: É uma forma de entregar o produto de uma forma mais rápida para o cliente. Dev0ps é onde todos os participantes/desenvolvedores do projeto, são responsaveis pelo projeto, sendo uma cultura que pode ser adotadas pela empresas,
sendo muito dificil encontrar profissionais de Dev0ps.

- 
