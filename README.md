# spring-cf-demo

Simple Spring Boot Demo App (REST service) to deploy into Cloud Foundry with default java build pack


### Build
 * ./gradlew clean assemble
 

### Deploy to Cloud Foundry  

 * Without manifest (manifest.yml)  -->  cf push demo -p build/libs/cf01-0.0.1.jar -d scapp.swisscom.com --random-route
 * With manifest --> cf push 
 
 
### Call the service
 * https://{domain}/demo