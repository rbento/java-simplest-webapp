# java-simplest-webapp

The simplest Spring Boot web application.

### About
---

Helpful while testing rolling upgrades requiring different versions of the same web application.

Expected Environment Variables:

- APP_AUTHOR, APP_CLIENT, APP_VERSION

### Requirements
---

- [Java 19][1]
- [Maven][2]
- [Docker Desktop][3]

### 1. Change Background Color

- Change it in [style.css](https://github.com/rbento/java-simplest-webapp/blob/da64a2228d6574d01fe1c2be300e443b645c8095/src/main/resources/static/style.css#L6)

### 2. Build Maven Project
---

```bash
cd java-simplest-webapp
mvn clean install
```

### 3. Build Docker Image
---

**Default Platform**

Example below assumes building on an Apple Silicon M1 Pro.

**Target Platform (AMD64)**
```bash
docker build --platform=linux/amd64 -t rodbento/webapp:1.0.1-amd64 .
```

**Target Platform (ARM64)** 
```bash
docker build -t rodbento/webapp:1.0.1-arm64 .
```

### 4. Run Docker Image
---
**Target Platform (AMD64)**

```bash
docker run --rm -p80:8080 --name webapp -d rodbento/webapp:1.0.1-amd64
```

**Target Platform (ARM64)** (Apple Silicon M1 Pro)
```bash
docker run --rm -p80:8080 --name webapp -d rodbento/webapp:1.0.1-arm64
```

### 5. Access it

The webapp should be available at [http://localhost](http://localhost)

#### See it on Docker Hub

There are 2 versions published to Docker Hub, each containing a different background colour to emphasize a new deployment.

See [https://hub.docker.com/repository/docker/rodbento/webapp][4]

[1]:https://jdk.java.net/19/
[2]:https://maven.apache.org
[3]:https://www.docker.com/
[4]:https://hub.docker.com/repository/docker/rodbento/webapp

