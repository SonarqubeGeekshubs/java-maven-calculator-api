FROM maven:3.9.6-eclipse-temurin-17

RUN adduser --gecos "First Last,RoomNumber,WorkPhone,HomePhone" --disabled-password jetty
USER jetty
WORKDIR /home/jetty

EXPOSE 8080
# Run subsequent commands as jetty user
USER jetty

ADD pom.xml /home/jetty
ADD src /home/jetty/src

RUN mvn package
# Run script
CMD mvn jetty:run
