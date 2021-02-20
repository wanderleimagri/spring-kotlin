FROM adoptopenjdk/openjdk11:alpine-jre
ADD build/libs/springkotlin-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]