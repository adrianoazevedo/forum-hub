# 📚 Fórum Hub API - Oracle ONE
Este é o Forum Hub, projeto do challenge da formação `Java e Spring Framework T6 - ONE`, pertencente a trilha do programa Oracle ONE.

## 💡Objetivo
O objetivo deste desafio é a contrução de uma `API Rest`, a qual seria o `backend` de um fórum realizando um `CRUD`.

## 📝 End Points
Os end points dessa API estão mapeados com o Swagger. Para acessar esse mapeamento, rode o projeto e entre em:

```
http://localhost:8080/swagger-ui/index.html#/
```

Dentre os end points, está listado abaixo as possibilidades disponibilizadas pelos mesmos:

1. Realizar Login
2. Postar Tópico
3. Cadastrar Usuário
4. Postar Resposta
5. Cadastrar Curso
6. Listar Todos os Tópicos Postados
7. Listar Usuários Cadastrados
8. Listar Respostas de Tópicos Específicos
9. Listar Todos os Tópicos por Curso e Ano de Publicação
10. Listar Tópico por ID
11. Excluir Tópico por ID
12. Exclusão Lógica Usuário por ID
13. Excluir Resposta por ID
14. Atualizar/Editar Tópico por ID
15. Atualizar/Editar Usuário por ID
16. Atualizar/Editar Específica por ID
17. Marcar Tópico Como Resolvido

## 📌 Dependências
Para o funcionamento do Fórum Hub, deve-se instalar das dependências abaixo.
 - [`MySQL`](https://dev.mysql.com/downloads/installer/): Banco de dados usado pelo Fórum Hub
 - [`Maven`](https://maven.apache.org/install.html): Gerenciador de dependências usado pelo Fórum Hub

## ⚙️ Configurações
Antes de executar o projeto devemos configurar algumas variáveis de ambiente em nossa máquina.

Segue as variáveis que deverão ser criadas e os dados de cada uma:
|Variável|Conteúdo|Exemplo|
|---|---|---|
|`DB_FORUMHUB_API_HOST`|Host do banco de dados. O endereço para acessar o mesmo juntamente com a porta|127.0.0.1:3306|
|`DB_FORUMHUB_API_DATABASE`|Informa o nome do banco de dados que o Fórum Hub irá persistir|forum_hub|
|`DB_FORUMHUB_API_USER`|Informa o nome do usuário para se conectar ao banco de dados|root|
|`DB_FORUMHUB_API_PASSWORD`|Informa a senha do usuário definido na variável anterior|10203040|
|`JWT_FORUMHUB_API_SECRET`|Informa a chave secreta utilizada para assinar e verificar a autenticidade dos tokens JWT. Deve ser um número aleatório e secreto.|91723847|

## 🚀 Uso
Para executar o projeto temos duas opções:

### 1ª Opção
Abra o mesmo com a `IDE IntelliJ IDEA` e execute o método abaixo na classe `ForumhubApplication`:

``` Java
public static void main(String[] args)
```


### 2ª Opção
Entre na pasta do projeto pelo terminal e execute o comando abaixo:

```
mvn spring-boot:run
```
> [!NOTE]
> Caso encontre problemas com o Maven na execução do Fórum Hub, instale a versão `3.9.5`.

Após a execução do programa, enviar uma requisição para o end point `/login`, informando email e senha em um `JSON` (estes que devem estar previamente cadastrados no banco de dados na tabela `Usuarios`, sendo a senha criptografada pelo BCrypt), para pegar o `Token JWT`.

Em seguida, basta usar normalmente os endpoins para realizar as ações desejadas, informando o Token JWT para realizar sua autenticação. Vale mencionar que o Token JWT possui uma duração máxima de `duas horas`.

## ⚠️ Avisos
1. Este projeto foi construído e testado sobre o JDK 17, dessa forma recomendamos o uso do mesmo durante a execução do mesmo.
