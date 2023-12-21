FROM openjdk:17-alpine

WORKDIR /app

COPY target/gateways-0.0.1-SNAPSHOT.jar /app/gateways.jar

EXPOSE 8888

CMD ["java", "-jar", "/app/gateways.jar"]
