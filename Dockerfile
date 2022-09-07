FROM openjdk:8-jre-alpine
#RUN apk add --no-cache curl
VOLUME /tmp
WORKDIR /workspace/app
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /workspace/app/app.jar"]
EXPOSE 8080