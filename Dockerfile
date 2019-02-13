FROM maven:3-jdk-8

LABEL maintainer "Alexander Malic <alexander.malic@maastrichtuniversity.nl>"

ENV APP_DIR /app
ENV TMP_DIR /tmp/dqa

WORKDIR $TMP_DIR

# caching dependencies - this only runs if pom.xml changes
COPY pom.xml .
RUN mvn verify clean --fail-never

COPY src/ ./src/
RUN mvn package && \
    mkdir $APP_DIR && \
    mv target/xanalyzer-1.0.0-jar-with-dependencies.jar $APP_DIR/xanalyzer.jar && \
    rm -rf $TMP_DIR
    
WORKDIR $APP_DIR

ENTRYPOINT ["java","-jar","xanalyzer.jar"]