<div align = "center">
    <h1> Sistema de Criação de Extratos Bancários do Banco Santander </h1>
</div>
<br>

<div align = 'center'>
   <img width=' 200 px' src= './project/assets/Logo_Santander.jpeg' >
</div>

<h3 align = "center">
  SANTANDER DEV WEEK
</h3>

<!-- | | | | |
|:-------------------------:|:-------------------------:|:-------------------------:|:-------------------------:|
|<img width="1604" alt="login" src="./Android/assets/picpay-screen1.png"> | <img width="1604" alt="activities" src="./Android/assets/picpay-screen2.png">|<img width="1604" alt="contacts" src="./Android/assets/picpay-screen3.png">|<img width="1604" alt="profile" src="./Android/assets/picpay-screen4.png"> |
<br> -->

<p align="center">
 <a href="#objetivo">Objetivo</a> •
 <a href="#tecnologias">Tecnologias</a> •
 <a href="#percurso">Percurso</a> 
</p>
<br>
<br>

<div id="objetivo">
<h2> 💡 Objetivo </h2>
Build an application that creates bank statements of Santander bank, using a robust and testable architecture, from app to servidor side. 
For the Android, using the MVVM structural pattern. 
For the servidor side, building an API RESTful with Spring Boot structure.
For the client side, allow clients to access their bank statements and account balances.
</div>
<br>

<div id="tecnologias">
<h2> 🛠 Tecnologias </h2>
As seguintes ferramentas foram usadas na construção do projeto:<br><br>

|                  Tipo                  |                Ferramenta                |                                 Referência                                  |
| :------------------------------------: | :---------------------------------: | :-------------------------------------------------------------------------: |
|       Programming Language (App)       |              KOTLIN                 |              https://kotlinlang.org/                                        | 
|                   IDE                  |          ANDROID STUDIO             |              https://developer.android.com/studio                           |
|   Scripts and dependencies manager     |              GRADLE                 |              https://gradle.org/                                            |
|           Scripts language             |              GROOVY                 |              https://gradle.org/                                            |
<!-- |          Injection Framework           |                KOIN                 |              https://insert-koin.io/                                        | -->
|            HTTP API Library            |              RETROFIT2              |              https://square.github.io/retrofit/                             |
<!-- |          HTTP Client Library           |              OkHTTP3                |              https://square.github.io/okhttp/                               | -->
|   Programming Language (Server Side)   |                JAVA                 |              https://docs.oracle.com/javase/tutorial/                       |
|          IDE Eclipse (Server Side)     |                ECLIPSE              |              https://docs.oracle.com/javase/tutorial/                       |
|               Spring Boot              |            SPRING BOOT              |              https://start.spring.io/                                       |
|           API RESTful (JSON)           |               SWAGGER3              |              https://swagger.io/                                            |
|                 Testing                |                JUNIT5               |              https://junit.org/junit5/                              |
|                 Database               |            POSTGRE SQL              |              https://www.postgresql.org/                                    |
<!-- |          In-memory data store          |                 REDIS               |              https://redis.io/                                    | -->
|                 Security               |                 JWT                 |              https://jwt.io/                                          |
|   Programming Language (Client Side)   |                ANGULAR              |              https://angular.io/                       |


<br>
<br>

<div align = 'center'>
  <h3>Backend | API</h3>
  <img height =' 100px ' src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg"/>
  <img height =' 100px ' src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" />
  <img height =' 100px ' src="https://jwt.io/img/logo-asset.svg" />
  <img height =' 100px ' src="https://junit.org/junit5/assets/img/junit5-logo.png" />
  <br>
  <br>
  <h3>Databases</h3>
  <img height =' 100px ' src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/postgresql/postgresql-original.svg" />
  <br>
  <br>
  <h3>Frontend</h3>
  <img width =' 100px ' src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/angularjs/angularjs-original.svg" />
  <br>
  <br>
  <h3>Mobile App</h3>
  <img width =' 100px ' src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/kotlin/kotlin-original.svg" />
  <img width =' 100px ' src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/androidstudio/androidstudio-original.svg" />
  <img width =' 100px ' src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/gradle/gradle-plain.svg"/>
  <img width =' 100px ' src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/groovy/groovy-original.svg" />
  <!-- <img width =' 100px ' src="https://insert-koin.io/img/koin_new_logo.png" /> -->
  <br>
  <img height=' 100px ' src="./project/assets/Retrofit.jpeg" />
  <br>
  <!-- <img height =' 100px ' src="./Android/assets/OkHttp.png" /> -->
  <br>
  <!-- <img height =' 100px ' src="./project/assets/redis.png" /> -->
</div>

<div id="percurso">
<h2> 🔎 Percurso </h2>

<ol>
    <li>Aula 1 - Configurando/preparando os ambientes de desenvolvimento (Infraestrutura)
      <ul>
        <li>Instalar Eclipse (IDE) e JDK 8 (1.8), VS Code, PostgreSQL, Android Studio</li>
        <li>Abrir e logar o Eclipse com JDK 8 (1.8)</li>
        <li>Abrir, logar e criar um novo banco de dados (banklineapi_db) no PostgreSQL</li>
        <li>Abrir o VS Code</li>
      </ul>
    </li>
    <br>
    <li>Aula 2 - Abstraindo o domínio bancário em uma API REST com Java (Backend)</li>
    <br>
    <li>Parte 3 - Criando back-end com Java Spring Boot
      <ul>
        <li>Abrir o Spring Initializr e configurar o Spring Boot</li>
        <li>Gerar o arquivo Spring Boot e abrir no Eclipse</li>
        <li>Verificar as dependências a serem usadas e configurar o Maven</li>
        <li>Construir a API em Java Spring Boot - classes, objetos, datas e interfaces</li>
        <li>Fazer arquivo de configuração de acesso ao PostgreSQL</li>
        <li>Integrar o Swagger 3 para documentação da API, adicionando a sua dependência no projeto</li>
        <li>Buildar os arquivos principais da API</li>
        <li>Testar as rotas no SWAGGER
        URL: http://localhost:8080/swagger-ui/index.html
        </li>
      </ul>
    </li>
    <br>
    <li>Aula 4 - Construindo um Frontend Angular de extrato bancário
      <ul>
        <li>Novo projeto: ng new nomeProjeto </li>
        <li>Iniciando projeto: ng server --open </li>
        <li>Novo componente: ng generate component nomeComponente </li>
        <li>Criar interface: src/app/model/participante.ts</li>
        <li>Criando rota: ng generate module app-routing --flat --module=app</li>
        <li>Importar HttpClientModule em app.module.ts [parte de imports]</li>
        <li>Criar serviço: src/app/service/RestService.ts</li>
        <li>Add @CrossOrigin em ParticipanteController.java e VotacaoController.java</li>
        <li>Implementar as rotas</li>
      </ul>
    </li>
    <br>
    <li>Parte 5 - Integrando back-end/front-end e acessando dados</li>  
    <li>Aula 6 - Construindo um App Android de extrato bancário
        <ul>
            <li>Parte 1 - Introdução ao Desenvolvimento Mobile</li>
            <li>Parte 2 - Android Nativo: Ambiente de Desenvolvimento</li>
            <li>Parte 3 - Android Nativo: Estrutura de Projetos</li>
        </ul>
    </li>  
</ol>
</div>
<br>
<br>