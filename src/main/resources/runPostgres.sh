docker run -d -p 5432:5432 --name postgresql -e POSTGRES_PASSWORD=password -e POSTGRES_USER=user -e POSTGRES_DB=customer postgres:15.2