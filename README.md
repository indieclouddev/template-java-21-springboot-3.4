# IndieCloud Template: `template-java-21-springboot-3.4-postgresql`

A minimal Java 21 + Spring Boot 3.4 project with PostgreSQL, ready to deploy on [IndieCloud](https://indiecloud.dev).  
No need to set up boilerplate for the 37th time.

## What's inside

- Java 21
- Spring Boot 3.4
- PostgreSQL (configured via `application.yml`)
- JPA/Hibernate
- Dockerfile (compatible with IndieCloud auto-build)

## How to use

### Option 1: Fork the repo  
Use GitHub’s **Fork** feature to create your own copy and push changes directly.

### Option 2: Clone & re-init git  
```bash
git clone https://github.com/indiecloud-dev/template-java-21-springboot-3.4-postgresql.git
cd template-java-21-springboot-3.4-postgresql
rm -rf .git
git init
git remote add origin https://github.com/yourusername/your-repo.git
git add .
git commit -m "Initial commit"
git push -u origin main
```

### Getting Started
See our [Getting Started with Spring Boot](https://docs.indiecloud.dev/docs/frameworks/spring-boot/) guide for details on how to set up and deploy it on IndieCloud.

### Questions?

Need help adapting this template?  
- Email: info@indiecloud.dev  
- Discord: [indiecloud.dev/discord](https://indiecloud.dev/discord)

Happy hacking!  
– The IndieCloud Team
