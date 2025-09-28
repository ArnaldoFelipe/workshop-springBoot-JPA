🛒 E-commerce API - Spring Boot RESTful
Uma aplicação Backend completa para gerenciamento de um sistema de E-commerce. Desenvolvida com Spring Boot, esta API fornece todos os endpoints necessários para gerenciar usuários, produtos, pedidos e pagamentos.

🚀 Tecnologias Utilizadas
Este projeto foi construído utilizando o ecossistema Java e o framework Spring Boot para garantir robustez, escalabilidade e facilidade de desenvolvimento.

Linguagem: Java

Framework: Spring Boot

Persistência: Spring Data JPA

Banco de Dados: H2 Database (em memória, para desenvolvimento e testes)

Arquitetura: RESTful

🧩 Funcionalidades e Entidades
O projeto implementa uma arquitetura baseada em CRUD (Create, Read, Update, Delete) para as principais entidades do domínio de e-commerce.

Entidade	Descrição
User (Usuário)	Gerenciamento de clientes e suas informações de acesso.
Category (Categoria)	Classificação de produtos (ex: Eletrônicos, Livros, Moda).
Product (Produto)	Itens disponíveis para venda, incluindo preço e associação com categorias.
Order (Pedido)	O objeto transacional principal, representando a compra de um cliente.
OrderItem (Item de Pedido)	Detalhes de quais produtos e em que quantidade foram comprados em um Order.
Payment (Pagamento)	Informações sobre a transação financeira relacionada ao Order.

Exportar para as Planilhas
🛠️ Como Executar o Projeto
Para rodar o projeto localmente, siga os passos abaixo:

Pré-requisitos
Certifique-se de ter o seguinte instalado em sua máquina:

Java JDK 17+ (ou a versão utilizada no projeto)

Maven ou Gradle (dependendo da sua ferramenta de build)

Passos
Clone o Repositório:

Bash

git clone (https://github.com/ArnaldoFelipe/workshop-springBoot-JPA)
cd nome-do-seu-projeto
Compile e Execute (Maven):

Bash

mvn clean install
mvn spring-boot:run
(Se você usou Gradle, o comando será diferente.)

Acesse a API:
A aplicação será iniciada na porta padrão do Spring Boot: http://localhost:8080.

🧪 Teste a API com o Postman
Como o projeto utiliza o banco de dados H2 em memória, alguns dados de teste são carregados automaticamente ao iniciar o servidor, permitindo que você teste os endpoints imediatamente.

Use ferramentas como o Postman ou Insomnia para enviar requisições.

Operação	Método	Endpoint de Exemplo	Descrição
Listar Produtos	GET	/products	Retorna todos os produtos.
Buscar Pedido	GET	/orders/{id}	Retorna um pedido específico.
Criar Usuário	POST	/users	Envia um novo usuário para o sistema.
Deletar Produto	DELETE	/products/{id}	Remove um produto do catálogo.

Exportar para as Planilhas
💡 Próximos Passos e Melhorias
Migrar do H2 em memória para um banco de dados persistente (PostgreSQL, MySQL).

Implementar segurança (Autenticação e Autorização) com Spring Security e JWT.

Adicionar validações robustas em todos os endpoints (DTOs e Bean Validation).

Criação de testes unitários e de integração.
