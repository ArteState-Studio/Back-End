## 🎨 ArteState Studio - Backend da Galeria de Arte

Este é o backend do **ArteState Studio**, desenvolvido com **Spring Boot**. Ele é responsável por armazenar as obras que os usuários salvam a partir da API externa (API do Art Institute of Chicago) e permite **salvar, listar, buscar, editar e excluir** essas obras da galeria pessoal do usuário.

A API foi criada com foco em simplicidade e integração com o aplicativo mobile React Native.

---

## 🚀 Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Swagger (para documentação)
- Lombok (opcional)

---

## 🔗 Integração com API Chicago

O backend **não consome diretamente** a API do Chicago Institute. O app mobile consome essa API, e quando o usuário decide salvar uma obra, o front envia os dados necessários (título e imagem, por exemplo) para esse backend, que os guarda no banco de dados.

---

## 📁 Estrutura do Projeto

```
BACK-END/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.projeto.artstate_studio/
│   │   │       ├── controllers/        # Controladores REST
│   │   │       ├── entities/           # Entidade ObraSalva
│   │   │       ├── repositories/       # Interface JPA
│   │   │       └── service/            # Regras de negócio
│   │   └── resources/
│   │       └── application.properties  # Configuração do banco de dados
├── pom.xml                             # Dependências Maven
```
---

## 📦 Endpoints da API
````
| Método | Rota                        | Descrição                                |
|--------|-----------------------------|------------------------------------------|
| GET    | `/galeria`                  | Lista todas as obras salvas              |
| POST   | `/galeria`                  | Salva uma nova obra                      |
| PUT    | `/galeria/{id}/descricao`   | Edita a descrição da obra                |
| DELETE | `/galeria/{id}`             | Exclui uma obra salva                    |
| GET    | `/galeria/busca?titulo=x`   | Busca obras salvas por parte do título   |
````
---

## 🧪 Testando com Postman

### ✔️ Salvar nova obra (POST)
````
POST /galeria
Content-Type: application/json

{
  "titulo": "O Grito",
  "imagem": "https://link-da-imagem.com/obra.jpg",
  "descricao": "Obra expressionista de Munch"
}
````
---

### 📃 Buscar por título

GET /galeria/busca?titulo=grito

---

### ✏️ Editar descrição

PUT /galeria/1/descricao
Body (raw text): "Nova descrição para a obra"
Content-Type: text/plain

---

### 🗑️ Excluir obra

DELETE /galeria/1

---

## 🔍 Swagger - Documentação da API

Ao rodar o projeto localmente, acesse:

http://localhost:8080/swagger-ui/index.html

Você poderá visualizar e testar todos os endpoints por ali, de forma fácil e intuitiva.

---

## 🛠️ Como rodar o projeto localmente

1. Clone o repositório:
````
git clone https://github.com/ArteState-Studio/Back-End.git
cd Back-End
````

2. Configure seu banco de dados MySQL no application.properties
````
spring.datasource.url=jdbc:mysql://localhost:3306/artstate
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
````

3. Rode o projeto com sua IDE favorita (Eclipse, IntelliJ...) ou pelo terminal com:
````
./mvnw spring-boot:run
````
---

## 📝 Licença

Este backend foi criado para fins **educacionais e de estudo**.  
Pode ser usado livremente para aprendizado e projetos pessoais, mas não deve ser utilizado para fins comerciais sem autorização prévia do autor.

---

> _"A arte precisa ser sentida, vivida e guardada. Aqui, ela é sua."_ 🎨
