# springboot-load-balancing-with-service-discovery 

* At first we have to run the eureka server and check eureka server on:
  > http://localhost:8761/
  
* In intellij idea we can run the multiple instance of doctor service by clicking on the dropdown on top right dropdown with application name. Then click on `edit configuration`, then click on `copy configuration` icon at the top left to copy the configuration and modify the name of application.In my case I have created 3 instance of doctor service.
  The name of 3 instances are `DoctorServiceApplication`,`DoctorServiceApplication-9082` and `DoctorServiceApplication-9083`. We have to provide program argument on the new instance with value as server port.
  > --server.port=9082  for DoctorServiceApplication-9082
  >
  > --server.port=9083  for DoctorServiceApplication-9083

* Then we have to run the all instance of doctor service.
  
* Then all the service got register on eureka server.
* Then execute doctor-portal doctors endpoint on browser:
  > http://localhost:7081/doctors