
build_:
	./gradlew clean build
	 ls build/libs

run:
	./gradlew run -DmyName=lucas

run/jar: build_
	java  -DmyName=lucas -jar build/libs/gradle-groovy-application-jar-example-1.0.0.jar

