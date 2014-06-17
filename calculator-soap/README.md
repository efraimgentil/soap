Calculator-SOAP
=====================

Calculator is a simples websevice using SOAP, it contains services to handle the four basic arithmetic operations, adition , subtraction, mutiplication, division.

How to use
--------------------
- Download Tomcat 7
- Download Apache Axis 2 war
- Install Tomcat 7, i will refer tomcat 7 directory as TOMCAT_HOME
- Move apache Axis2.war to yout "TOMCAT_HOME/webapps" directory
- Start tomcat and access "http://localhost:8080/axis2" to se if everything is running
- Download the Calculator-Soap project
- Build the project using Ant Builder
- Copy the files Calculator.aar and Calculator.wsdl, that are now in the "build" folder of the project, to "TOMCAT_HOME/webapps/axis2/WEB-INF/services" directory
- Restart Tomcat and access "http://localhost:8080/axis2/services/listServices" on your browser, if you see Calculator service, the service is running properly and you can use the service now
 
You can use the made client "https://github.com/efraimgentil/soap/tree/master/calculator-client", or create your own client using the wsdl file.


Tecnologies in use
--------------------
- Java 7
- Apache Axis 2
- Ant
- Maven
- Tomcat 7
