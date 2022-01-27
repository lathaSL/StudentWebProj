From openjdk:11
Expose 8093
Add target/studentinfo-0.0.1-SNAPSHOT.war studentinfo-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java", "-jar", "/studentinfo-0.0.1-SNAPSHOT.war"]