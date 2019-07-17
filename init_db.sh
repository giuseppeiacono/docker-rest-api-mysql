#!/bin/bash
echo 'MySQL database is being initialized...'
mysql -u root -p root trivagodb < /docker-entrypoint-initdb.d/trivagodb.sql