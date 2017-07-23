
# Spring-boot-webflux & kotlin

## about

- Spring-boot-webflux: 2.0
- Spring: 5.0
- Kotlin: 1.1.X
- Gradle: 4.X

## dev run

```
./gradlew --info bootRun
```

with hot reload

```
./gradlew --continuous compileJava
```

it can work with spring-boot-dev-tools at bootRun(not in executable jar)

(FIXME: it could not effect at Chrome(linux). So you should use another one like FireFox)

## test

```
./gradlew test
```

## build & deploy

```
./gradlew build
java -jar ./build/libs/hello-webflux.jar
```

## Licence

MIT