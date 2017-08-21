FROM docker.elastic.co/beats/filebeat:5.5.1
COPY filebeat.yml /usr/share/filebeat/filebeat.yml
USER root
RUN \
    mkdir /logs && chmod 777 /logs && \
    mkdir /filebeat && chmod 777 /filebeat && \
    chown filebeat /usr/share/filebeat/filebeat.yml
USER filebeat


VOLUME /logs
VOLUME /filebeat
