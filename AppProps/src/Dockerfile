FROM public.ecr.aws/docker/library/openjdk:21
MAINTAINER "Arpita Kashyao <>"
COPY target/AppProps-0.0.1-SNAPSHOT.jar /usr/app/app.jar
WORKDIR /usr/app/
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "app.jar"]
