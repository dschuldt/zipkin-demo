FROM openjdk:10-slim
LABEL maintainer=dev@dschuldt.de

ADD build/libs/hello-service* /app/hello-service.jar
CMD ["java","-jar","/app/hello-service.jar","--spring.config.location=/app/config/","spring.cloud.bootstrap.location=/app/config/"]
