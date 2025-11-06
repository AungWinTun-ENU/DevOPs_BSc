FROM mysql/mysql-server:latest

# Copy initialization scripts
COPY test_db/*.sql /docker-entrypoint-initdb.d/
COPY test_db/*.dump /docker-entrypoint-initdb.d/

# Set environment variables for root and test user
ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_DATABASE=employees
ENV MYSQL_USER=testuser
ENV MYSQL_PASSWORD=testpassword
