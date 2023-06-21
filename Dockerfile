FROM ubi8/openjdk-8

COPY ./target/quaydemo-0.0.1-SNAPSHOT.jar quaydemo-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar","/quaydemo-0.0.1-SNAPSHOT.jar"]
