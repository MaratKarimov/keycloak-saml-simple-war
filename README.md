# keycloak-saml-simple-war

Simple web archive to show Keycloak work with Java Servlet Filter Adapter 

## Build app
To build app:
```sh
$ mvn clean package
```
## Deploy war file
To start web server with builded web archive you can use [Payara Micro](http://www.payara.fish/downloads), for example [v.4.1.1.164](https://s3-eu-west-1.amazonaws.com/payara.fish/Payara+Downloads/Payara+4.1.1.164/payara-micro-4.1.1.164.jar)
```sh
$ java -jar payara-micro-4.1.1.164.jar --deploy simplewar.war
```
## Run Keycloak server
To start Keycloak server, you can use [Wildfly Swarm Keycloak server](https://wildfly-swarm.gitbooks.io/wildfly-swarm-users-guide/content/server/keycloak.html), for example [v.2017.1](http://repo2.maven.org/maven2/org/wildfly/swarm/servers/keycloak/2017.1/keycloak-2017.1-swarm.jar):
```sh
$ java -Dswarm.port.offset=100 -jar keycloak-2017.1-swarm.jar
```
After this you must create new user with password on this form: http://localhost:8180/auth

## Import Keycloak realm
Upload src/main/resources/demosaml.json to form: http://localhost:8180/auth/admin/master/console/#/create/realm

# Test
If you open http://localhost:8080/secured, you must be redirect to Keycloak auth form. After you fill it with 'admin'/'password', you must be redirected to http://localhost:8080/secured.
