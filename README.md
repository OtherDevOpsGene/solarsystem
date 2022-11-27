# solarsystem

A demo using multiple Docker containers. Tests run from the [selenium
directory](selenium/README.md).

## Starting

To start the web server and database containers:

```bash
docker-compose up -d
```

## Viewing the list of planets

Visit <http://localhost/>.

## Viewing the database

Visit <http://localhost:8080/> to access Mongo Express.

## Adding data

* Visit <http://localhost:8080/db/solarsystemdb/planets> to see the `planets`
  collection in the `solarsystemdb` database
* Click on `New Document`.
* Copy and paste the contents of [pluto.json](mongodb/pluto.json) and then click
  `Save`.

## Stopping

To stop all the containers:

```bash
docker-compose stop
```

## Cleaning up

To clear the data from the database, stop the containers and then delete the
`mongodb/data` directory.

To cleanup the containers when you are done:

```bash
docker-compose rm -f
```

## Architecture

![Architecture](architecture.svg?raw=true "Architecture of networks")
