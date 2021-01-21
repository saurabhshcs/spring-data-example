# spring-data-example

Build - gradle
dependencies used - spring-jpa, spring-web, spring-security, io.jsonwebtoken, mysql-connector

# How to run this application

## Machine Prerequisite
- Java 8 or later
- Docker
- Docker compose

Both docker and docker compose come with an installation of Docker Desktop. 


To clone this repository AND all submodules execute the following:
```
git clone https://github.com/saurabhshcs/spring-data-example.git
```

## Local environment

In order to run the Integration tests a Postgres database is required.

In order to run this service locally, an ActiveMQ service is required. 

Create Postgres database and ActiveMQ service with docker-compose:
 
```
docker-compose up -d
```

This will install and setup Postgres database with correct database name, username and password,
likewise for ActiveMQ.

### Running service for the first time
In order to force the download of dependencies outside of IntelliJ:

`./gradlew build --refresh-dependencies`

### Run any service

`./gradlew bootRun`

### Test and build

#### Run tests (also runs big tests)
`./gradlew clean test`

#### Build conditionally on tests
`./gradlew clean build`  


This application is running on default port 6009 so that it can be accessible on http://localhost:8080


- 📫 Feel free to reach me: @ https://about.me/saurabhshcs

Reach out to me via [about.me](https://about.me/saurabhshcs)

![My github stats](https://github-readme-stats.vercel.app/api?username=saurabhshcs&show_icons=true)


![Profile views](https://komarev.com/ghpvc/?username=saurabhshcs)
