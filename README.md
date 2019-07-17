# Trivago challenge
Dockerized Java Rest API with Mysql database implemented by Giuseppe Iacono.


## Run application
As required, this application should work only with commands docker build and docker run.


### Build application



### Run database container
Excute the command below to run a container where the public image provided by MySQL will be
automatically downloaded if it doesn’t already have been installed:
```
sudo docker run --name=docker-mysql --env="MYSQL_ROOT_PASSWORD=root" --env="MYSQL_PASSWORD=root" --env="MYSQL_DATABASE=trivagodb" mysql
```

Now you can access docker-mysql container and run MySQL commands:
```
// access container from your host
sudo docker exec -it docker-mysql bash

// access database
cd /usr/bin
mysql -h root -u root -p
```


### Run REST API container
Run trivago-challenge application linked to database container ran before:
```
sudo docker run --link docker-mysql:mysql -p 8080:8080 -t springio/trivago-challenge
```


## Assumptions


## Best practices
- All dates are managed with LocalDate API because it is more ISO centric than Date and Calendar APIs, providing a lot of utility methods easy to use




