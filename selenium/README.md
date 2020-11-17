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
docker run -it --rm --name maven -v ${PWD}:/usr/src/maven -v ${HOME}/.m2:/root/.m2 --workdir /usr/src/maven --network selenium_default maven:3.6.3-jdk-11 mvn verify -DtargetUrl=http://44.55.66.77/
```

Replace `http://44.55.66.77/` with the URL of your web site using the external
IP address.

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
