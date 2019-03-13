FROM java:8
WORKDIR /
ADD segfault-java.jar segfault-java.jar
ADD lib/ lib/
EXPOSE 8080
CMD java -jar segfault-java.jar
