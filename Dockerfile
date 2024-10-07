ARG VERSION=21
FROM arm64v8/eclipse-temurin:${VERSION}

RUN mkdir -p /opt/boot

ARG JAR_FILE=./build/libs/*.jar
COPY ${JAR_FILE} /opt/boot/app.jar

WORKDIR /opt/boot
CMD [ "java","-jar","app.jar" ]
