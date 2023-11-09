# Springboot-Todo
_________________________________

REST API with the following HttpRequests:
-----------------------------------------
    🔗 GET
    🔗 GET with Id
    🔗 POST
    🔗 PUT
    🔗 DELETE
 
 
  -> '💻-Java' for coding
 
   
Steps followed to develop the API:-
----------------------------------
    👉 Used Model for information, Controller for business logic and Repository for Database queries.
    👉 Added the required maven dependency for Sql and Spring.
    👉 Used '@RestController' for creating RESTful web services using Spring MVC.
    👉 Used required Annotations for handling HttpRequests like @GetMapping, @PostMapping etc..
    👉 Achieved Dependency Injection via constructor using @Autowired annotation.
    👉 Used 'JdbcTemplate' for connecting database and executing query.
    👉 Used application.properties file for storing the connection URL.
    👉 Used BeanPropertyRowMapper to map the model class with the tables.
 
 
Screenshots:
-----------
 
🔗 GET:
-------
![api-fetchAll](https://github.com/saravanan-sarav/Springboot-Todo/assets/145537699/4a0d5561-9a4d-4913-8840-7d991ff301b3)

🔗 GET with Id:
---------------
![api-fetchparticualarID](https://github.com/saravanan-sarav/Springboot-Todo/assets/145537699/87663b71-cc2c-4adc-86af-49a69fc6544f)

 
🔗 POST:
--------
![api-additem](https://github.com/saravanan-sarav/Springboot-Todo/assets/145537699/e7c6aad0-0599-436f-b15a-02ef8b4f0b2e)

 
🔗 PUT:
-------
 ![api-update](https://github.com/saravanan-sarav/Springboot-Todo/assets/145537699/dad6cc53-77ad-49a0-b6db-189c94418034)

🔗 DELETE:
----------
![api-deleteitem](https://github.com/saravanan-sarav/Springboot-Todo/assets/145537699/d26a5148-f551-47fc-808f-3cf4ce2278bb)
