#stage 1 :  building jar file
FROM maven:3.9.9-eclipse-temurin-17 AS builder

WORKDIR app/

COPY pom.xml .

RUN mvn dependency:go-offline

COPY . .


RUN mvn clean package -Dskiptest


# stage 2 running jar file


FROM maven:3.9.9-eclipse-temurin-17

WORKDIR app/


COPY --from=builder /app/target/demo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 9090


ENTRYPOINT ["java" , "-jar" , "app.jar"]


