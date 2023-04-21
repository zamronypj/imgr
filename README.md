# AI Placeholder Image Application

Spring boot 3.0.5 placeholder image application which generate image using AI.

## Prerequisite

- Git
- [Apache Maven 3.8+](https://maven.apache.org/guides/index.html)
- Java Development Kit 17
- MariaDB/MySQL 8.0

## Installation

```
$ git clone https://github.com/zamronypj/imgr
$ cd imgr
$ cp src/main/resources/application.properties.example src/main/resources/application.properties
```
Edit `application.properties` database settings to match your system.

Install project dependencies

```
$ mvn clean install
```

## Run application

```
$ mvn spring-boot:run
```
