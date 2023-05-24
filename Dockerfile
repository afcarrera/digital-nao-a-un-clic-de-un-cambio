FROM openjdk
COPY target/*.jar /
EXPOSE 8080
ENTRYPOINT ["java","-jar","/google-scholar-api/target/google-scholar-api-1.0.0-SNAPSHOT.jar"]