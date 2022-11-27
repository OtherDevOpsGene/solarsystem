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

To run the Selenium tests, you can use Maven on a container.

```powershell
docker run -it --rm --network selenium_default --volume ${PWD}:/usr/src/maven \
    --volume ${HOME}/.m2:/root/.m2 --workdir /usr/src/maven \
    maven:3.8.6-eclipse-temurin-17 mvn verify -DtargetUrl=http://555.666.777.888/
```

Replace `http://555.666.777.888/` with the URL of your web site using the
external IP address.

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
