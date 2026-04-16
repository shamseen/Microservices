# Microservices Learning Roadmap

## Key Decisions Made So Far

| Decision | Choice | Reason |
|---|---|---|
| Repo structure | Monorepo | Easier for solo learning, good overview |
| IDE | VS Code | Already familiar, Spring Extension Pack works well |
| Java version | 24 | Latest available |
| Spring Boot version | 3.5.13 | Latest stable 3.x |
| Update behavior | Upsert | Simpler for now, 404 handling to be added later |
| Database | H2 → PostgreSQL | H2 for dev, PostgreSQL in Docker later |
---

## Phase 1 — Microservices Concepts
Big picture understanding of what microservices are and why they exist.

- [x] Monolith vs. microservices
- [x] Why microservices exist (team autonomy, independent scaling, fault isolation)
- [x] Tradeoffs (network complexity, more infrastructure, harder debugging)
- [x] Synchronous communication (REST/HTTP)
- [x] Asynchronous communication (message queues — Kafka, RabbitMQ)
- [x] Strangler Fig Pattern — extracting microservices from a monolith


## Phase 2 — Spring Boot
Building individual microservices in Java.

- [x] Spring Boot project structure
- [x] Key annotations (@RestController, @Service, @Repository, @Entity, @Autowired etc.)
- [x] Dependency injection and IoC container
- [x] JPA and H2 in-memory database
- [x] Lombok
- [x] Full CRUD REST API for `product-service`
  - GET /products
  - GET /products/{id}
  - POST /products
  - POST /products/batch
  - PUT /products/{id} (upsert)
  - DELETE /products/{id}
- [ ] `user-service` — manage users (register, get, update, delete)
- [ ] `order-service` — manage orders, references users and products

### optional — can revisit anytime
- [ ] Error handling — 404 for missing resources, global exception handler
- [ ] Input validation — @Valid, @NotNull, @Positive etc.
- [ ] Data initializer — auto-seed database on startup
- [ ] DTOs (Data Transfer Objects) — separate API response model from database model
- [ ] Pagination — handle large datasets with page/size params


## Phase 3 — Microservices Patterns
How services communicate and coordinate with each other.

- [ ] Inter-service communication — how order-service calls product-service
- [ ] RestTemplate vs WebClient — making HTTP calls between services
- [ ] Service discovery — how services find each other (Eureka)
- [ ] API Gateway — single entry point for all services (Spring Cloud Gateway)
- [ ] Circuit breaker — handling failures gracefully (Resilience4j)
- [ ] Database per service pattern — each service owns its data
- [ ] Eventual consistency — keeping data in sync across services
- [ ] Strangler Fig Pattern in practice — extracting services from a monolith

## Phase 4 — Docker
Containerizing your microservices.

- [ ] What Docker is and why it exists
- [ ] Images vs containers
- [ ] Writing a Dockerfile for a Spring Boot service
- [ ] Building and running a Docker image
- [ ] Docker Compose — running all services + databases together locally
- [ ] Switching from H2 to PostgreSQL (one container per service)
- [ ] Environment variables and configuration management
- [ ] Docker networking — how containers talk to each other

## Phase 5 — Kubernetes
Orchestrating containers at scale.

- [ ] What Kubernetes is and why it exists
- [ ] Key concepts: pods, nodes, clusters, deployments, services
- [ ] kubectl — the Kubernetes command line tool
- [ ] Writing deployment YAML files
- [ ] Services and ingress — exposing your app to the outside world
- [ ] ConfigMaps and Secrets — managing configuration and credentials
- [ ] Scaling — running multiple instances of a service
- [ ] Health checks — liveness and readiness probes
- [ ] Namespaces — organizing resources in a cluster
- [ ] Local Kubernetes with minikube or Docker Desktop

## Phase 6 — CI/CD
Automating build, test, and deployment pipelines.

- [ ] What CI/CD is and why it exists
- [ ] GitLab CI/CD overview (you have GitLab experience)
- [ ] `.gitlab-ci.yml` — pipeline configuration file
- [ ] Pipeline stages: build → test → package → deploy
- [ ] Building Docker images in the pipeline
- [ ] Running tests automatically on every push
- [ ] Deploying to Kubernetes from the pipeline
- [ ] Monorepo pipeline setup — only build changed services
- [ ] Environment-specific deployments (dev, staging, production)

## Optional Topics (real world relevance)
Things you'll likely encounter on the job that aren't in the core roadmap.

- [ ] Spring Security — authentication and authorization (JWT tokens)
- [ ] OpenAPI / Swagger — auto-generate API documentation
- [ ] Distributed tracing — tracking requests across multiple services (Zipkin, Jaeger)
- [ ] Centralized logging — aggregating logs from all services (ELK stack)
- [ ] Message queues in practice — Kafka or RabbitMQ between services
- [ ] Testing microservices — unit, integration, and contract tests
- [ ] JUnit and Mockito — Java testing framework (Jest equivalent)
- [ ] API versioning — managing breaking changes in your API
- [ ] Rate limiting — protecting your services from overload

## Technology Stack Summary

| Layer | Technology | Purpose |
|---|---|---|
| Language | Java 24 | Core language |
| Framework | Spring Boot 3.5 | Building microservices |
| Build tool | Maven | Dependency management |
| ORM | Spring Data JPA | Database access |
| Database (dev) | H2 | In-memory, no setup required |
| Database (prod) | PostgreSQL | Persistent, one per service |
| Containerization | Docker | Package and run services |
| Orchestration | Kubernetes | Manage containers at scale |
| CI/CD | GitLab CI/CD | Automate build and deploy |
| IDE | VS Code | Development environment |
| API testing | Postman | Test REST endpoints |

