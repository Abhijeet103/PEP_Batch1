From ubuntu

RUN apt update && apt install -y openjdk-17-jdk

WORKDIR app/

COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 9090

ENTRYPOINT ["java" , "-jar" , "app.jar"]