# java-simplest-webapp

The simplest Spring Boot web application.

### About
---

Helpful while testing rolling upgrades requiring different versions of the same web application.

Accessing the context / displays a page with information from environment variables and a different background colour for each different version.

Expected Environment Variables:

- APP_AUTHOR, APP_CLIENT, APP_VERSION

### Requirements
---

- [Java 17][1]
- [Maven][2]
- [Docker Desktop][3]

### Build with Maven
---

```bash
cd java-simplest-webapp
mvn clean install
```

### Docker Image
---

##### Local Build

```bash
docker build -t webapp:latest .
docker run --rm -p80:8080 --name webapp webapp:latest
```

##### Get From Docker Hub

There are 3 versions published to Docker Hub, each just containing a different background colour.

See [https://hub.docker.com/repository/docker/rodbento/webapp][4]


### Run Pre-Built Image
---


*x86-64*
```bash
docker run --rm -p80:8080 --name webapp rodbento/webapp:1.0.0-amd64
```

*ARM64* (Apple Silicon M1 Pro)

```bash
docker run --rm -p80:8080 --name webapp rodbento/webapp:1.0.0-arm64
```

[1]:https://jdk.java.net/17/
[2]:https://maven.apache.org
[3]:https://www.docker.com/
[4]:https://hub.docker.com/repository/docker/rodbento/webapp

