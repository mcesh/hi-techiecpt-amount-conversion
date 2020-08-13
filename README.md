# hi-techiecpt-amount-conversion
A Spring Boot API to convert amounts

To execute this API clone this repo and run `mvn clean install`
after the success build you can run `mvn spring-boot:run`
Once the server is up navigate to `http://localhost:8080/amount-conversion/swagger-ui.html`

Under `Schemes` please select `HTTP` as the API is not configured for SSL

if you do not select `HTTP` you will encounter `TypeError: Failed to fetch` for `HTTPS`

expand `amount-conversion-resource` page to access `endpoints` then execute any of the provided endpoints
