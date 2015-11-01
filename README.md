# jetty-jersey-spring-bootstrap
bootstrap project for quickly making a webservices based project that uses spring, provides support for single jar runable app.

    ./gradlew clean build shadowJar

and running it is as easy as:

    java -jar ./build/libs/dronz-app-0.0.1-SNAPSHOT-all.jar

the test that it is running:

    http://localhost:8080/rest/api/first/model
