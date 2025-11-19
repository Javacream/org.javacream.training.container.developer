# Spring Boot REST API – VS Code Dev Container + GitLab CI (BuildKit Build-Container)

## Lokal starten (im Dev Container)
1. Ordner in VS Code öffnen
2. `F1` → **Dev Containers: Reopen in Container**
3. Im Container-Terminal:
   ```bash
   mvn spring-boot:run
   ```
4. Teste:
   - `GET http://localhost:8080/api/hello`
   - `GET http://localhost:8080/api/people`
   - `POST http://localhost:8080/api/people`
     ```json
     {"firstName":"Ada","lastName":"Lovelace"}
     ```

## Docker Image lokal bauen
```bash
docker build -t springboot-devcontainer-demo:local .
docker run --rm -p 8080:8080 springboot-devcontainer-demo:local
```

## GitLab CI
Die Pipeline führt aus:
- `mvn test`
- `docker buildx build` mit **docker-container** Builder (Build-Container) und Push ins GitLab Registry

> Hinweis: `docker:dind` benötigt i.d.R. einen GitLab Runner im privileged mode.
