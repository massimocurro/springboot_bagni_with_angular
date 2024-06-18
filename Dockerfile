FROM openjdk:19
COPY ./target/classes/com/example/docker/ /tmp
WORKDIR /tmp
ENTRYPOINT ["java","Main"]
