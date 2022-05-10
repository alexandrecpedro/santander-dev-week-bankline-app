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
Construir um sistema de ciação de extratos bancários do Banco Santander, usando uma arquitetura robusta e testável, desde o frontend até o lado do servidor, envolvendo inclusive um aplicativo para Android.
<!-- Build an application that creates bank statements of Santander bank, using a robust and testable architecture, from app to servidor side.  -->
<br>Para o lado do servidor, construiu-se uma API RESTful com estrutura em Spring Boot.
<!-- For the servidor side, building an API RESTful with Spring Boot structure. -->
<br>Já para o lado do cliente (ou lado do frontend), permitiu-se que os clientes tivessem acesso a seus extratos bancários e o respectivo saldo.
<!-- For the client side, allow clients to access their bank statements and account balances. -->
<br>No caso do aplicativo para Android, desenvolveu-se um app que explorasse o domínio bancário, ao consumir a API previamente construída. Usou-se o padrão de projeto MVVM (Model - View - ViewModel).
<!-- For the Android, using the MVVM structural pattern.  -->
</div>
<br>

<div id="tecnologias">
<h2> 🛠 Tecnologias </h2>
As seguintes ferramentas foram usadas na construção do projeto:<br><br>

|                Tipo                |      Ferramenta      |                Referência                |
| :--------------------------------: | :------------------: | :--------------------------------------: |
|     Programming Language (App)     |        KOTLIN        |         https://kotlinlang.org/          |
|                IDE                 |    ANDROID STUDIO    |   https://developer.android.com/studio   |
|  Scripts and dependencies manager  |        GRADLE        |           https://gradle.org/            |
|          Scripts language          |        GROOVY        |           https://gradle.org/            |
|          HTTP API Library          |      RETROFIT2       |    https://square.github.io/retrofit/    |
| Programming Language (Server Side) |         JAVA         | https://docs.oracle.com/javase/tutorial/ |
|     IDE Eclipse (Server Side)      |       ECLIPSE        | https://docs.oracle.com/javase/tutorial/ |
|            Spring Boot             |     SPRING BOOT      |         https://start.spring.io/         |
|         API RESTful (JSON)         |       SWAGGER3       |           https://swagger.io/            |
|              Testing               |        JUNIT5        |        https://junit.org/junit5/         |
|              Database              |     POSTGRE SQL      |       https://www.postgresql.org/        |
|              Security              |         JWT          |             https://jwt.io/              |
| Programming Language (Client Side) |       ANGULAR        |           https://angular.io/            |
|             Bootstrap              |     BOOTSTRAP 5      |        https://getbootstrap.com/         |
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
  <h3>Database</h3>
  <img height =' 100px ' src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/postgresql/postgresql-original.svg" />
  <br>
  <br>
  <h3>Frontend</h3>
  <img width =' 100px ' src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/angularjs/angularjs-original.svg" />
  <img width =' 100px ' src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/bootstrap/bootstrap-original.svg" />
  <br>
  <br>
  <h3>Mobile App</h3>
  <img width =' 100px ' src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/kotlin/kotlin-original.svg" />
  <img width =' 100px ' src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/androidstudio/androidstudio-original.svg" />
  <img width =' 100px ' src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/gradle/gradle-plain.svg"/>
  <img width =' 100px ' src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/groovy/groovy-original.svg" />
  <br>
  <img height=' 100px ' src="./project/assets/Retrofit.jpeg" />
  <br>
</div>

<div id="percurso">
<h2> 🔎 Percurso </h2>

<ol>
    <li>Aula 1 - Configurando/preparando os ambientes de desenvolvimento (Infraestrutura)
      <br>
      <ul><strong>Backend</strong>
        <li>Instalar Eclipse (IDE) e JDK 8 (1.8)</li>
        <li>Abrir e logar o Eclipse com JDK 8 (1.8)</li>
      </ul>
      <br>
      <ul><strong>Banco de Dados</strong>
        <li>Instalar PostgreSQL</li>
        <li>Abrir, logar e criar um novo banco de dados (banklineapi_db) no PostgreSQL</li>
      </ul>
      <br>
      <ul><strong>Frontend</strong>
        <li>Instalar e abrir VS Code</li>
        <li>Instalar NodeJS</li>
        <li>Instalar Angular CLI na raiz do projeto</li>
      </ul>
      <br>
      <ul><strong>Mobile - Android</strong>
        <li>Instalar e abrir Android Studio</li>
        <li>Criar novo projeto: Bankline-Android</li>
        <li>
          <ul>Entendo o conceito do projeto mobile para Android
            <li>Parte 1 - Introdução ao Desenvolvimento Mobile</li>
            <li>Parte 2 - Android Nativo: Ambiente de Desenvolvimento</li>
            <li>Parte 3 - Android Nativo: Estrutura de Projetos</li>
          </ul>
        </li>
      </ul>
    </li>
    <br>
    <li>Aula 2 - Abstraindo o domínio bancário em uma API REST com Java Spring Boot (Backend)</li>
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
        <li>Subir código no GitHub e fazer conexão desses arquivos GitHub no Heroku</li>
      </ul>
    </li>
    <br>
    <li>Aula 3 - Construindo um Frontend Angular de extrato bancário
      <ul>
        <li>Abrir teminal de comando do VS Code na pasta do projeto </li> 
        <li>Instalar, no NodeJS, o Angular CLI: npm install -g @angular/cli</li>
        <li>Novo projeto: ng new nomeProjeto </li>
        <li>Iniciando projeto: ng serve --open || ng serve -o</li>
        <br>
        <ul><strong>Construção do App</strong>
          <li>Novo componente: ng generate component nomeComponente 
          - exibir as movimentações: ng g c components/movimentacao-list<br>
          - adicionar uma nova movimentação: ng g c components/movimentacao-new</li>
          <li>Configurando a rota para exibir os novos componentes: src/app/app-routing.module.ts</li>
          <li>Removendo conteúdo gerado pelo Angular e exibir nossos componentes: app.component.html</li>
          <li>Adicionando a biblioteca do Bootstrap pelo angular-cli: ng add @ng-bootstrap/ng-bootstrap
            Ps: Se ao tentar instalar o bootstrap apresentar algum erro, execute os comandos: 
            (1) npm config set legacy-peer-deps true
            (2) ng add @ng-bootstrap/ng-bootstrap
          </li>
          <li>Criando uma variável que representará as nossas movimentações: movimentacao-list.component.ts</li>
          <li>Estruturando a tabela que exibibirá as movimentações: movimentacao-list.component.html</li>
        </ul>
        <br>
        <ul><strong>Backend CORS</strong>
          <li>Configurar CORS: com.dio.santander.bankline.api.config/WebConfig.java</li>
          <li>Rodar backend SpringBoot</li>
        </ul>
        <br>
        <ul><strong>Integrando com nossa API</strong>
          <li>Criando o serviço de movimentações: ng g s services/movimentacao </li>
          <li>Adicionar duas dependências no projeto:
          // app.module.ts
            import { FormsModule } from '@angular/forms';
            import { HttpClientModule } from '@angular/common/http';
            @NgModule({
              imports: [
                FormsModule,
                HttpClientModule
              ],  
            })
          </li>
          <li>Criar recurso para movimentações já realizadas: movimentacao.service.ts</li>
          <li>Determinar que quando o componente de listagem de movimentações for carregado seja realizada uma requisição à nossa API: movimentacao-list.component.ts</li>
        </ul>
        <br>
        <ul><strong>Formatando campos na tela</strong>
          <li>Adicionado algumas configurações no módulo do projeto: app.module.ts</li>
          <li>Adicionando as formatações nos campos Data Hora e Valor: movimentacao-list.component.html</li>
          <li>Aplicando estilo com base em uma condição em nossos registros: movimentacao-list.component.html</li>
          <li>Adicionando o botão Novo na página de movimentação: movimentacao-list.component.html</li>
          <li>Centralizando o conteúdo da página: movimentacao-list.component.html</li>
          <li>Configurando a rota para a página para cadastrar uma nova movimentação: movimentacao-list.component.html</li>
        </ul>
        <br>
        <ul><strong>Nova Movimentação</strong>
          <li>Exibindo e atualizando campos para entrada de nova movimentação: movimentacao-new.component.html</li>
          <li>Criando o serviço para acessar os recursos de Correntista: ng g s services/correntista</li>
          <li>Inserindo a regra de negócio: services/correntista.service.ts</li>
          <li>Conectar a nossa API para buscar os correntistas do banco de dados: components/movimentacao-new.component.ts</li>
          <li>Exibir os correntistas na tela de nova movimentação: movimentacao-new.component.html</li>
          <li>Criar uma variável correntista para poder identificar qual foi o correntista selecionado: movimentacao-new.component.ts</li>
          <li>Instalar componente ng2-currency-mask: npm i ng2-currency-mask</li>
          <li>Definir uma máscara no campos R$ Valor: transaction-new.component.html</li>
        </ul>
        <br>
        <ul><strong>Incluindo uma movimentação</strong>
          <li>Adicionando o método de inclusão (POST) via API: services/movimentacao.service.ts</li>
          <li>Criando o método para ser chamado na tela e assim incluir a movimentação: components/movimentacao-new.component.ts</li>
          <li>Executar o método save no click do botão Confirmar: components/movimentacao-new.components.html</li>
        </ul>
        <br>
        <ul><strong>Movimentações por Correntista</strong>
          <li>Interação constante com a API Back-end, e isso será via Swagger</li>
          <li>Refinando nossa tela de consulta de movimentações: transaction-list.component.html</li>
          <li>Criando o serviço para listar as movimentações por correntista: 
          services/movimentacao.service.ts && components/movimentacao-list.component.ts</li>
        </ul>
        <br>
        <ul><strong>Correntistas</strong>
          <li>Novo componente correntista: ng g c components/correntista</li>
          <li>Nova rota para novo componente: app-routing.module.ts</li>
          <li>Navegação simples para a rota correntistas e CorrentistaComponent: movimentacao-list.component.html</li>
          <li>Tela para inclusão e listagem de correntistas: components/correntista.component.html</li>
          <li>Regra de negócio para inclusão e listagem dos correntistas: 
          components/correntista.component.ts</li>
          <li>Criando mais uma funcionalidade no serviço de correntistas: 
          services/correntista.service.ts</li>
        </ul>
      </ul>
    <br>
    <li>Aula 4 - Construindo um App Android de extrato bancário
      <br><br>
      <ul><strong>Parte 1 - Conhecendo a API: Modelagem do Domínio</strong>
        <li>Domínio/Problema - desenvolver um app Android nativo que explore o domínio bancário (o extrato com as movimentações do correntista)</li>
        <li>Integrando o Parcelable: id 'kotlin-parcelize'</li>
        <li>Ativando a viewBinding em build.gradle
          // Reference: https://developer.android.com/topic/libraries/view-binding
            buildFeatures {
                viewBinding true
            }
        </li>
        <li>Construir as views os modelos de domínio e ui, bem como os seus respectivos layouts</li>
        <li>Atualizar o AndroidManifest.xml</li>
      </ul>
      <br>
      <ul><strong>Parte 2 - Construindo a UX/UI: Material Design</strong>
        <li>Padronizar os temas, cores, dimensões e strings em inglês e português</li>
        <li>Novas dependências a serem adicionadas:
          // Additional dependencies AndroidX:
            implementation 'androidx.swiperefreshlayout:swiperefreshlayout:1.1.0'
        </li>
        <li>Criar classe BankStatementAdapter.kt</li>
      </ul>
      <br>
      <ul><strong>Parte 3 - Consumindo a API: Retrofit, Coroutines e LiveData</strong>
        <li>Injetar dependência do Live Data
          // Additional dependencies AndroidX:
            implementation 'androidx.activity:activity-ktx:1.4.0'
            implementation 'androidx.lifecycle:lifecycle-livedata-ktx:2.4.1'
        </li>
        <li>Injetar dependência do Retrofit em build.gradle:
          // Reference: https://github.com/square/retrofit
            implementation 'com.squareup.retrofit2:retrofit:2.9.0'
            implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
        </li>
        <li>Criar BanklineApi interface com coroutine: data.remote.BanklineApi.kt</li>
        <li>Criar BanklineRepository (padrão singleton): data.BanklineRepository.kt</li>
        <li>Criar State (sealed class): data.State.kt</li>
        <li>Criar BankStatementViewModel (class): ui.statement.BankStatementViewModel.kt</li>
        <li>Integrar Binding com SwipeRefresh: ui.statement.BankStatementActivity.kt</li>
      </ul>
      <br>
      <ul><strong>Parte 4 - Conclusão e dicas finais</strong>
        <li>Modificar ícone do app</li>
        <li>Possibilidades de melhorias no app: verificar os To Do's (TODO)</li>
      </ul>
    </li>  
</ol>
</div>
<br>
<br>
