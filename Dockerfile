FROM adoptopenjdk/openjdk11:alpine
VOLUME /tmp
EXPOSE 8080
COPY target/*.jar /home/app.jar
ENTRYPOINT ["java","-jar","/home/app.jar"]