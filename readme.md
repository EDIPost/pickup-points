# Pickup points

We have a situation where we want to send an item to one of our customers using the Norwegian Post as carrier.
We want to use "Klimanøytral Servicepakke", a service where the shipment is sent to a pickup point. The customer will
go to the pickup point to get their shipment as soon as it's delivered. The pickup point can be a post office, store, etc.
Most receivers have more than one pickup points, and it's up to us to select the best choice for our customer.

To help with this task the Norwegian post has developed a web service to find pickup points. We input country code and
zip code, and is presented with a list of possible pickup points.

In this task we want you to create a web page where we can search for pickup points for a given combination of country
and zip code. The results from the web service should be presented as a list. Make sure to show the name and other
information we need to select the best pickup point. 

You will find documentation for the webservice at [https://developer.bring.com](https://developer.bring.com/api/pickup-point/)

We want you to solve this task using Java and [Spring Boot](https://spring.io/projects/spring-boot). You will find a
sample application in this repository which should get you started. Feel free to select any additional libraries and
technologies to solve the task. There will be bonus points for a nice and user friendly interface.

## Getting started with the sample application
### Requirements
- Java 8 or higher
- Maven
- Git

### Run project
1. Check out the git repository
2. Run project using `mvn clean spring-boot:run`
3. Open web browser and go to [http://localhost:8080/hello](http://localhost:8080/hello)