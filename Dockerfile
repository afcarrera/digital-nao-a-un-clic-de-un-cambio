FROM openjdk
COPY google-scholar-api/target/*.jar /
EXPOSE 8080
ENTRYPOINT ["java","-jar","/google-scholar-api-1.0.0-SNAPSHOT.jar"]
