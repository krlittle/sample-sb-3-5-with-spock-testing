# sample-sb-3-5-with-spock-testing

Calculates a tip over REST, tested with Spock.

## Stack

- Spring Boot 3.5.16
- Java 21
- Gradle 8.14.5
- Spock 2.4-groovy-4.0

## Build

```
./gradlew build
```

## Run

```
./gradlew bootRun
```

```
curl 'localhost:8080/tip?bill=20.00&percent=15'
```
