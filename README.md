# Hibernate Framework
Hibernate is a Java framework that simplifies the development of Java application to interact with the database. It is an open source, lightweight, [ORM (Object Relational Mapping)](https://www.tutorialspoint.com/hibernate/orm_overview.htm) tool. Hibernate implements the specifications of [JPA (Java Persistence API)](https://www.vogella.com/tutorials/JavaPersistenceAPI/article.html) for data persistence.

# Advantages of Hibernate Framework
Following are the advantages of hibernate framework:

1) **Open Source and Lightweight :**
Hibernate framework is open source under the LGPL license and lightweight.

2) **Fast Performance :**
The performance of hibernate framework is fast because cache is internally used in hibernate framework. There are two types of cache in hibernate framework first level cache and second level cache. First level cache is enabled by default.

3) **Database Independent Query :**
HQL (Hibernate Query Language) is the object-oriented version of SQL. It generates the database independent queries. So you don't need to write database specific queries. Before Hibernate, if database is changed for the project, we need to change the SQL query as well that leads to the maintenance problem.

4) **Automatic Table Creation :**
Hibernate framework provides the facility to create the tables of the database automatically. So there is no need to create tables in the database manually.

5) **Simplifies Complex Join :**
Fetching data from multiple tables is easy in hibernate framework.

6) **Provides Query Statistics and Database Status :**
Hibernate supports Query cache and provide statistics about query and database status.

# Important Readings
 - [Hibernate-ORM Overview](https://www.tutorialspoint.com/hibernate/orm_overview.htm)
 - [Hibernate Architecture](https://www.tutorialspoint.com/hibernate/hibernate_architecture.htm)

# Hibernate Configuration Using `@Annotation`
1. Create the maven project.
2. Add project information and configuration in [pom.xml](https://github.com/neerajchavan/hibernate/blob/master/pom.xml) file.
3. Create the Persistence class. ([Student.java](https://github.com/neerajchavan/hibernate/blob/master/src/main/java/com/hibernate/learning_hibernate/Student.java))
   
- [What is persistence class?](https://www.tutorialspoint.com/hibernate/hibernate_persistent_classes.htm)
- **@Entity** : Standard annotations are contained in the `javax.persistence` package, so we import this package as the first step. Second, we used the @Entity annotation to the  [Student](https://github.com/neerajchavan/hibernate/blob/master/src/main/java/com/hibernate/learning_hibernate/Student.java) & [Address](https://github.com/neerajchavan/hibernate/blob/master/src/main/java/com/hibernate/learning_hibernate/Address.java) class, which marks this class as an entity bean, so it must have a no-argument constructor that is visible with at least protected scope.

- **@Table** : This annotation allows you to specify the details of the table that will be used to persist the entity in the database.The `@Table` annotation provides four attributes, allowing you to override the name of the table, its catalogue, and its schema, and enforce unique constraints on columns in the table. If you don't use `@Table` annotation, hibernate will use the class name as the table name by default.

- **@Id** : Each entity bean will have a primary key, which you annotate on the class with the `@Id` annotation. The primary key can be a single field or a combination of multiple fields depending on your table structure.
By default, the `@Id` annotation will automatically determine the most appropriate primary key generation strategy to be used but you can override this by applying the `@GeneratedValue` annotation, which takes two parameters strategy and generator that I'm not going to discuss here, so let us use only the default key generation strategy. Letting Hibernate determine which generator type to use makes your code portable between different databases.

- **@Column** : The `@Column` annotation is used to specify the details of the column to which a field or property will be mapped. You can use column annotation with the following most commonly used attributes −

  * `name` - this attribute permits the name of the column to be explicitly specified.

  * `length` - this attribute permits the size of the column used to map a value particularly for a String value.

   * `nullable` - this attribute permits the column to be marked NOT NULL when the schema is generated.

  * `unique` - this attribute permits the column to be marked as containing only unique values.
  
4. Create the Configuration file. ([configuration file](https://github.com/neerajchavan/hibernate/blob/master/src/main/java/hibernate.cfg.xml))
5. Create the class that retrieves or stores the persistent object. ([App.java](https://github.com/neerajchavan/hibernate/blob/master/src/main/java/com/hibernate/learning_hibernate/App.java))
6. Run the application.

# Hibernate Configuration Using `XML` - [click here](https://www.javatpoint.com/example-to-create-hibernate-application-in-eclipse-ide)


