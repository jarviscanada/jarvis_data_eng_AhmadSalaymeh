cmd=$1
docker_ip=$2
db_username=$3
db_f=$4


sudo systemctl status docker || sudo systemctl start docker

docker container inspect jrvs-psql
container_status=$?

case $cmd in

  create)
      #checking if user has4 arguments in cli
      if [ $# -ne 4 ]
        then
        echo 'Create requires username and password'
        exit 1
      fi

    psql -h $docker_ip -U $db_username -f $db_f
    exit 0
    ;;
  start|stop)
          if [ "$container_status" -ne 0 ]
            then
            echo "Container already exists"
            exit 1
          fi


        psql -h $docker_ip -U $db_username
    ;;
  esac


