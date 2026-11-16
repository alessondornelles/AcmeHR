//----------

• Descrição do Projeto

O Acme HR é um Sistema de Gerenciamento de Funcionários e Folha de Pagamento que gerencia cadastros de funcionários e realiza o cálculo das respectivas remunerações.

Com o sistema Acme HR é possível:

- Cadastrar funcionários.
- Listar todos os funcionários cadastrados.
- Buscar um funcionário pelo seu identificador.
- Remover um funcionário cadastrado.
- Calcular a remuneração de cada funcionário.
- Exibir os dados completos de um funcionário.
- Gerar um relatório contendo todos os funcionários e seus respectivos salários.
- Calcular o total da folha de pagamento da empresa.



//----------

• Tecnologias Utilizadas

O sistema Acme HR foi desenvolvido em Java (Oracle OpenJDK 27), Maven (versão 3.9.9), JUnit (junit-platform-console-standalone-1.11.4).



//----------

• Arquitetura

O sistema Acme HR foi desenvolvido utilizando arquitetura em camadas, obedecendo a seguinte organização:

* arquivos fonte:

- model: Representar as entidades e regras de negócio específicas dos funcionários (ex: Funcionario.java, FuncionarioCLT.java).
- repository: Gerenciar o armazenamento e a recuperação dos funcionários/Camada que lida com os dados (ex: FuncionarioRepository.java).
- service: Implementar as regras de negócio e coordenar as operações/Camada de regras de negócio e controle do fluxo (ex: FuncionarioService.java).
- view: Interagir com o usuário e apresentar os resultados (ex: FuncionarioView.java).
- exception: Representar situações excepcionais do sistema/Tratamento de exceções (ex: FuncionarioNaoEncontradoException.java).

* arquivos de teste

- terá a mesma estrutura de organização dos arquivos fonte. Fará a diferenciação utilizando o sufixo Test (ex: FuncionarioTest.java).

OBS: o armazenamento de dados será realizado somente em memória de execução.

