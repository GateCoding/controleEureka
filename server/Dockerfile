FROM maven:3.8.4-openjdk-17 AS builder

WORKDIR /app
COPY ./src ./src
COPY ./pom.xml .

RUN mvn clean install

FROM openjdk:17-alpine

COPY --from=builder /app/target/server-0.0.1-SNAPSHOT.jar /app/eureka-server.jar

EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/app/eureka-server.jar"]
