FROM openjdk:17
ADD target/Comprehension-2-0.0.1-SNAPSHOT.jar Comprehension-2.jar
ENTRYPOINT ["java","-jar","Comprehension-2.jar"]
