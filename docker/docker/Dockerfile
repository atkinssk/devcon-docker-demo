FROM openjdk:8-jdk-slim

ARG jarFile

EXPOSE 8080

ADD files/ /
RUN chmod +x /app/*.sh

RUN \
    apt-get update \
    && apt-get install -y --no-install-recommends \
		curl \
	&& rm -rf /var/lib/apt/lists/*

WORKDIR /app

CMD ["/bin/bash", "-c", "/app/docker-entrypoint.sh" ]

RUN mkdir /logs && chmod 777 /logs
VOLUME /logs


ADD ${jarFile} /app/
ENV APP_JAR="/app/${jarFile}"


HEALTHCHECK \
    --interval=10s \
    --timeout=5s \
    --start-period=10s \
    --retries=2 \
    CMD /app/healthcheck.sh