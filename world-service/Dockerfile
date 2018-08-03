FROM openjdk:10-slim
LABEL maintainer=d.schuldt@eos-ts.com

ADD build/libs/world-service* /app/world-service.jar
CMD ["java","-jar","/app/world-service.jar","--spring.config.location=/app/config/","spring.cloud.bootstrap.location=/app/config/"]
