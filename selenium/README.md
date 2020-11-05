# Selenium tests for solarsystem

A Selenium Grid demo using multiple Docker containers.

## Starting

To start the Selenium Grid containers:

```bash
docker-compose up -d
```

## Viewing the Hub

Visit <http://localhost:4444/grid/console/>.

## Running tests

```bash
docker run -it --rm --name maven \
    -v "$(pwd)":/usr/src/maven \
    -v "$HOME/.m2":/root/.m2 \
    --workdir /usr/src/maven \
    --network selenium_default \
    maven:3.6.3-jdk-11 \
    mvn clean test -DtargetUrl=http://localhost/
```

## Stopping

To stop all the containers:

```bash
docker-compose stop
```

## Cleaning up

To cleanup the containers when you are done:

```bash
docker-compose rm -f
```
