# Trivago challenge
Dockerized Java Rest API with Mysql database implemented by Giuseppe Iacono.

## Run application
As required, this application should work only with commands docker build and docker run.

Build command......

First of all, excute the command below to run a container where the public image provided by MySQL will be
automatically downloaded if it doesn’t already have it installed:
```
sudo docker run --name=docker-mysql --env="MYSQL_ROOT_PASSWORD=root" --env="MYSQL_PASSWORD=root" --env="MYSQL_DATABASE=test" mysql
```

Then run trivago-challenge application linked to docker-mysql container:
```
sudo docker run --link docker-mysql:mysql -p 8080:8080 -t springio/trivago-challenge
```

## Assumptions


## Best practices
- All dates are managed with LocalDate API because it is more ISO centric than Date and Calendar APIs, providing a lot of utility methods easy to use




