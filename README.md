# keycloak-spring
Simple Spring Boot Security sample with Keycloak acting as a broker acting to yet another Keycloak Identity provider

# Setup Keycloak using docker
Browse to the `keycloak` folder and invoke the `docker-compose.yml` script. This will setup two instances of Keycloak. One will live on `locolhost:6971` and shall act as an identity broker for the second Keycloak instance living on `localhost:7981`. In order to setup the two Keycloak instances correctly, use the realm import configurations in the `broker` and `idp` folders.

## Admin pages
Each Keycloak instance has its own admin page. Login using the credentials (username, password) = (admin, admin) at:
* http://localhost:6971/auth/admin
* http://localhost:7981/auth/admin

## General user aspect
Since the first Keycloak instance behaves as a broker to the Keycloak IDP, users are to be managed in the second Keycloak server. Adding users and assigning them roles in the second Keycloak instance will automatically make the broker adjust by adding / adjusting corresponding users in its own local database.

# Setup Spring boot sample
The Spring Boot sample is a gradle project which has been setup to use the aforementioned Keycloak broker for authentication and authorization purposes. The sample is located in the `security` folder. When running the gradle project, the application will be accessible from `http://localhost:8080`. The project is mostly based on the first of the following two samples, though the second samle has also served as some source of inspiration.
* https://www.baeldung.com/spring-boot-keycloak
* https://www.baeldung.com/keycloak-embedded-in-spring-boot-app
