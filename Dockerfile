FROM oracle/graalvm-ce:20.2.0-java11
WORKDIR /work/
COPY target/demo-mvc-0.0.1-SNAPSHOT.jar /work/application.jar
RUN chmod 775 /work
EXPOSE 8080
CMD ["java","-jar","application.jar"]