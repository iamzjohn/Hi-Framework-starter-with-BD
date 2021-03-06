# Hi-Framework with Hibernate

A getting started Project with the basics to use Hi-Framework and Hibernate using MYSQL as BD

## Getting Started

First you must only clone the project and start editing, doesn't mather if how you will organize your folders but the project separates in folder the controllers, data(services, DAOs, Models), frontiers and utils

The configuration of the database can be found in _**src/main/resources/META-INF/persistence.xml**_ and in the DAO _**src/main/java/com/mycompany/hi/framework/hibernate/data/daos/DAO.java**_

Information about Hi-Framework can be found in [documentation](https://docs.hi-framework.org/latest/getting-started/index.html)  and about Hibernate in http://docs.jboss.org/hibernate/orm/5.1/userguide/html_single/Hibernate_User_Guide.html

### Prerequisites

Most of requisites can be found on documentation of Hi and Hibernate but are: 

- Java 8
- Maven 3
- Any server that supports CDI 1.2(tomcat/jetty/glassfish/etc)
- Mysql Server

in this specific case the DB will be created automatically as (mozdevz)


### Installing

After cloning you only need configure your DB access credentials(**username** and **password**) to run the project on your IDE, and access the page on http://yourlocalhost:yourport/members/index (ex: _**http://localhost:8080/members/index**_ ), or just access de root context



### Modeling and coding

To make your own code you can edit the persistence.xml to add your on DB configurations, and you can model your classes using the Hibernate and JPA annotations,
on the dao package you can extend your classes from DAO to make it have all DAO reference from the Generic DAO.

Like: 

```java

@ApplicationScoped
public class MemberDAO extends DAO<Member>{

    @Override
    public Class<Member> getEntityClass() {
       return Member.class;
    }

   
}

``` 

## Deployment

After testing and after all coding your webapp you only need to build a war file and deploy it on the server or can use the exploded war.

## Built With

* [Hi FrameWork](https://hi-framework.org) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [Hibernate](http://hibernate.org/orm/) - ORM 

## Contributing

Please read open an Issue if you have any problem and feel free to fork and make full requests to improve this example



## Authors

* **Adelino José Ngomacha** - *Junior Web Developer* - [iamzjohn](https://github.com/iamzjohn)




