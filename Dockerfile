
FROM maven:3.8.5-openjdk-17 AS builder

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -Dmaven.test.skip=true

FROM openjdk:17-ea-16-jdk

WORKDIR /app

COPY --from=builder /app/target/clustered_data_warehouse-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

CMD ["java", "-jar", "/app/clustered_data_warehouse-0.0.1-SNAPSHOT.jar"]