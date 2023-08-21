FROM amazoncorretto:17.0.5

ENV APP_NAME sample-api

WORKDIR /apps/$APP_NAME/deploy

ADD build/libs/*.jar $APP_NAME.jar

ARG ZONE
ENV ZONE=${ZONE:-test}

EXPOSE 8080

ENTRYPOINT java -Dspring.profiles.active=$ZONE -jar $APP_NAME.jar 1 > /dev/stdout 2>&1