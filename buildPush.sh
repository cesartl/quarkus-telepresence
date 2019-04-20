mvn package -Pnative -Dnative-image.docker-build=true
docker build -f src/main/docker/Dockerfile.native -t cesartl/telequark .
docker push cesartl/telequark