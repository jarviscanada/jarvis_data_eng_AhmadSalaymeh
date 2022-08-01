FROM python:3.8-slim-buster

WORKDIR /app


RUN pip install --upgrade pip
RUN pip install --upgrade wheel
RUN pip install --upgrade setuptools
RUN pip install psycopg2-binary

COPY ./python_db_app.py .



ENTRYPOINT [ "python3", "./python_db_app.py"]


sudo docker run --network python-db-shared --mount type=bind,source="$(pwd)"/data,target=/app/data python-db-docker "172.19.0.2" "5432" "postgres" "1234" "exercises" "cd.members" "output2" 