# solarsystem

A demo using multiple Docker containers. Tests run from the [selenium directory](selenium/README.md).

## Starting

To start the web server and database containers:

```bash
docker-compose up -d
```

## Viewing the list of planets

Visit <http://localhost/>.

## Adding data

* Visit <http://localhost:8080/> to access Mongo Express.
* Enter `solarsystemdb` as the Database Name and then hit `+ Create Database`.
* Click on the `solarsystemdb` link or the green View button next to it.
* Enter `planets` as the Collection Name and then hit `+ Create collection`.
* Click on `New Document`.
* Copy and paste the contents of [planets.json](mongodb/planets.json) or [pluto.json](mongodb/pluto.json) and then click `Save`.

## Stopping

To stop all the containers:

```bash
docker-compose stop
```

## Cleaning up

To clear the data from the database, stop the containers and then delete the `mongodb/data` directory.

To cleanup the containers when you are done:

```bash
docker-compose rm
```
