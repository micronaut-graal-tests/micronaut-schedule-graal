./gradlew assemble
native-image --no-server --static --no-fallback --class-path build/libs/micronaut-schedule-graal-*-all.jar
