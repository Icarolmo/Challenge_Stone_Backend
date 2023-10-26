# Challenge_Stone_Backend

Repositório criado com objetivo de realizar o desafio de Backend da Stone utilizando Java com Spring, banco de dados MySQL e Redis para cache. Toda a aplicação deve também rodar em Docker Container, com isso a aplicação, MySQL e Redis
rodarão em container apartados se comunicando atraves de uma network.

## Como rodar/subir o projeto: 

- Primeiro é necessário ter o Docker instalado na máquina.
- Com docker instalado, rode o  seguinte comando no terminal a partir da pasta raiz (ecommerce) do projeto:
```text
 docker build -t ecommerceservice:1.0 .
```
- Este comando irá criar a imagem da nossa aplicação a partir do Dockerfile. A imagem irá conter openjdk 17 e nosso artefato.jar.
- Com a imagem criada (confira a imagem no seu Docker Desktop) é necessário criar os containers rodando o comando abaixo no mesmo terminal:
```text
 docker compose up -d
```
- O seguinte comando deve orquestrar a criação de 3 containers: stone-mysql (container com mysql), stone-redis(container com redis) e stone-app-service(container baseado na imagem do Dockerfile).

Com isso a aplicaçao junto ao MySQL e Redis estarão rodando e poderá ser realizado testes com requisições para aplicação na porta exposta (neste caso a porta 8080).
