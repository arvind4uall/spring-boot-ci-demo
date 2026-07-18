FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY target/*.jar spring-boot-ci-demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "spring-boot-ci-demo.jar"]