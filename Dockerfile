FROM openjdk:24
COPY ./target/classes /app
WORKDIR /app
ENTRYPOINT ["java", "-cp", "/app", "com.napier.devops.App"]
