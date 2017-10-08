rm  target/midi-0.0.1-SNAPSHOT.jar
sleep 2
/Users/joe/Desktop/workspace-sts/midi/src/main/java/org/verderbergroup/midi/
./mvnw clean install -Dmaven.test.skip=true
sleep 5
java -jar target/midi-0.0.1-SNAPSHOT.jar
