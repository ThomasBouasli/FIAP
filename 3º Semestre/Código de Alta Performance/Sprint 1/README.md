# Códigos de Alta Performance
### Profa. Patrícia Magna

Supondo que sua equipe desenvolva uma aplicação que permita uma melhor interação
com clientes e o banco PAN, ou seja, seu projeto é uma solução em software (app ou
aplicativo) o ideal é que sua equipe receba periodicamente feedback dos usuários de seu
produto para que sua solução possa ser aprimorada.
Assim, a tarefa da disciplina nessa etapa é:
 - Criar o tipo de dado PilhaMensagens que utilize a implementação sequencial de pilha
para armazenar os textos das mensagens enviadas pelo usuário.

 - Criar o tipo de dado Usuário que deve ter como atributos: identificador e nome do
usuário e pilha de feedback e o status do atendimento. O status seria “ok” (quando não
há mensagens para ser lidas) ou “não ok” (quando a pilha tiver mensagens ainda não
lidas). As operações que devem compor esse tipo de dado (métodos em JAVA) são:
o construtor, que além de inserir nome e id do cliente também inicia a pilha de
mensagens e status “ok”;

 - o enviaMsg(msg): que empilha msg lida e altera status para “não ok”
 - o leMsg(): que desempilha todas as mensagens, apresentando na tela de saída, e altera
    status para “ok”.
 - A classe SAC que contém o método main() (disponível para realizar testes) que utiliza
 - os tipos de dados solicitados foi elaborado é apresentado a seguir: 