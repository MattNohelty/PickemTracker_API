1) Build Docker Image

gradlew docker

2) Run application

docker run -i -t -p 5000:9003 com.nohelty/pickem-api

3) Test

GET http://localhost:5000/user