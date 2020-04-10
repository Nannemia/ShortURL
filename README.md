# ShortURL
Web application to navigate short URLs. Mapping from long URLs to Short

In order to shorten the URL, we make use of a counter(i), which is incremented for every new URL.
We put the URL along with its counter in a HashMap. This way we can retrieve it later at the time of navigating shorten URL.

## Technologied Used:
Java, Spring Boot, HTML, inline JavaScript and Maven


## Assumptions & Analysis:

The range of URLs that can be shorten is limited by the range of int.
The length of URL is not necessarily shorter than given long URL.
The problem with Counter is, it is very easy to predict next generated shorter URL (next int number). To fix this we can use RNG(Random Number Generator) or using Hashing method (Object.hashCode) or custom Hashing

The hashCode()/custom Hashing does not generate unique codes for different strings and leads to failure with collisions. And also as the number of URLs increases, the probability of collisions increases.


## Run the Application:

To run the application, run the following command in a terminal window directory(navigate to application pom.xml file directory)
1) Using Maven - This will compile, build and run the application
* ./mvnw spring-boot:run

2) Using executable JAR
* java -jar target/shortURL-0.0.1.jar
