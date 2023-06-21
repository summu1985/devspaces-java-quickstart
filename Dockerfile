FROM ubi8/openjdk-8

COPY ./target/bcparis-service-1.3.2.jar bcparis-service-1.3.2.jar

ENTRYPOINT ["java", "-jar","/bcparis-service-1.3.2.jar"]
