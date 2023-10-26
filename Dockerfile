FROM openjdk:17

RUN mkdir /app

COPY target/ecommerce-0.0.1-SNAPSHOT.jar /app

WORKDIR /app

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "ecommerce-0.0.1-SNAPSHOT.jar"]
