To compile run: mvn clean compile install

To run locally, run : java -jar target/java-springboot-starter-0.0.1-SNAPSHOT.jar

Open a browser and point to http://localhost:8080/hello

It should display the text - " Hello World - Spring boot demo on OpenShift"

To run on Openshift, use the S2i process and use the java8-s2i builder
