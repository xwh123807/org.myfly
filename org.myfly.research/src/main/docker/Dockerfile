FROM java:8-jre
VOLUME /tmp
ADD org.myfly.research-0.0.1.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 9080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
