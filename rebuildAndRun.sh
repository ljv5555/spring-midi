rm  target/midi-0.0.1-SNAPSHOT.jar
./mvnw clean install -Dmaven.test.skip=true
java -jar target/midi-0.0.1-SNAPSHOT.jar
