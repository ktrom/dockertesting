# java version
FROM openjdk:17-oracle

# EXPOSE 80

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]