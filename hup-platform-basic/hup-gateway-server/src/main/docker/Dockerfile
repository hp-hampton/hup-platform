FROM java:8
#VOLUME /tmp
ADD hup-gateway-server-1.0-SNAPSHOT.jar gateway-server.jar
#ENTRYPOINT [ "java","-Djava.security.egd=file:/dev/./urandom","-jar","gateway-server.jar"]
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /gateway-server.jar"]
EXPOSE 8000
