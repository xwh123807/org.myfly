#启动docker remote api
docker rm docker-api
docker run --name docker-api -d -v /var/run/docker.sock:/var/run/docker.sock -p 2375:2375 bobrik/socat TCP4-LISTEN:2375,fork,reuseaddr UNIX-CONNECT:/var/run/docker.sock

cd org.myfly.cloud.discovery
mvn package docker:build
cd ..

cd org.myfly.cloud.configserver
mvn package docker:build
cd ..

cd org.myfly.cloud.gateway
mvn package docker:build
cd ..

cd org.myfly.cloud.sleuth
mvn package docker:build
cd ..

cd org.myfly.cloud.uilibs
mvn package docker:build
cd ..

