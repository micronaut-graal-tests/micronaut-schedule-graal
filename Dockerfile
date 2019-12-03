FROM oracle/graalvm-ce:19.2.1 as graalvm
COPY . /home/app/micronaut-schedule-graal
WORKDIR /home/app/micronaut-schedule-graal
RUN gu install native-image
RUN native-image --no-server -cp build/libs/micronaut-schedule-graal-*-all.jar

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/micronaut-schedule-graal .
ENTRYPOINT ["./micronaut-schedule-graal"]
