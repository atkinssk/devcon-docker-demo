FROM openjdk:8-jdk-slim

ARG jarFile

EXPOSE 8080

ADD docker-entrypoint.sh /app/
RUN chmod +x /app/docker-entrypoint.sh

ADD ${jarFile} /app/

WORKDIR /app

ENV APP_JAR="/app/${jarFile}"

CMD ["/bin/bash", "-c", "/app/docker-entrypoint.sh" ]
