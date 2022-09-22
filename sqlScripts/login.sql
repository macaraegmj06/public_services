docker pull postgres
docker images

docker run --rm --name postgresql -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=password -d -v /srv/postgres:/var/lib/postgresql/data -p 5432:5432 postgres

docker ps -a
docker start postgresql
docker stop postgresql

psql -U admin
list users
\du

list database
\l

switch to database
\c databasename

list tables
\d
