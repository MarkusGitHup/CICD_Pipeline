FROM mysql:5.7

ENV MYSQL_DATABASE NAME parcel_database
ENV MYSQL_ROOT_PASSWORD ''
ENV MYSQL_ALLOW_EMPTY_PASSWORD true

EXPOSE 3306

ADD ./data.sql /docker-entrypoint-initdb.d/
