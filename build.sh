#!/bin/sh
javac -cp lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar -d ./build src/main/java/*.java
javac -cp lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar:build -d ./build src/test/java/*.java
java -cp build/.:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore EdgeFieldTest
java -cp ./build/ RunEdgeConvert
