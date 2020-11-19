# keycloak-spring
Simple Spring Boot Security sample with Keycloak acting as a broker acting to yet another Keycloak Identity provider

# Setup Keycloak using docker
Browse to the `keycloak` folder and invoke the `docker-compose.yml` script. This will setup two instances of Keycloak. One will live on `locolhost:6971` and shall act as an identity broker for the second Keycloak instance living on `localhost:7981`. In order to setup the two Keycloak instances correctly, use the realm import configurations in the `broker` and `idp` folders.

# Setup Spring boot sample
The Spring Boot sample is a gradle project which has been setup to use the aforementioned Keycloak broker for authentication and authorization purposes. The sample is located in the `security` folder.
