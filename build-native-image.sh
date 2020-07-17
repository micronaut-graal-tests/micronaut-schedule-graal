./gradlew assemble
native-image --no-fallback --class-path build/libs/micronaut-schedule-graal-*-all.jar
