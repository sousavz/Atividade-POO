## Breve descrição do sistema.
Este sistema consiste em uma aplicação para gerenciar informações de pessoas, como nome, CPF e idade. Ele é composto por três classes principais: _Classe Pessoa, Classe GerenciadorPessoas, Classe Main_

O sistema simula o cadastro e manipulação de dados de duas pessoas e permite a atualização dessas informações em tempo de execução.


## Instruções de compilação e execução.

Abra o terminal ou prompt de comando e navegue até o diretório onde os arquivos .java estão salvos. Execute o seguinte comando para compilar os três arquivos:
javac Pessoa.java GerenciadorPessoas.java Main.java

Depois de compilar o código, execute o programa com o comando:
java Main


## Exemplo de uso.

Ao executar o programa, o console exibirá algo parecido com:

Nome: vitória | CPF: 021.916.641-21 | Idade: 18

Informações da Pessoa 1:
Nome: Maria | CPF: 273.183.158-38 | Idade: 37

Informações da Pessoa 2:
Nome: José | CPF: 055.653.822-62 | Idade: 38

Informações da Pessoa 1 (atualizadas):
Nome: Pedro | CPF: 125.348.365-54 | Idade: 35

Informações da Pessoa 2 (atualizadas):
Nome: Lucas | CPF: 346.165.324-36 | Idade: 40

## Explicação de como a lógica de encapsulamento foi aplicada no sistema.

Em forma de proteção os atributos da classe *Pessoa* não podem ser acessados diretamente de fora da classe, impedindo alterações indevidas. A classe tem controle total sobre como seus dados são acessados ou alterados, garantindo que modificações sejam feitas de maneira segura.

o encapsulamento garante que os atributos de uma classe estejam protegidos e só possam ser acessados ou modificados através de métodos controlados, permitindo validações e controlando o fluxo de dados dentro do sistema.






