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

# Fetching Objects in Hibernate 

In hibernate, get() and load() are two methods which is used to fetch data for the given identifier. They both belong to Hibernate session class. Get() method return null, If no row is available in the session cache or the database for the given identifier whereas load() method throws object not found exception.

Demo program for fetching data - [click here](https://github.com/neerajchavan/hibernate/blob/master/src/main/java/com/hibernate/learning_hibernate/FetchDemo.java)

| Key | get()  | load() |
| -------------- | ------------- | ------------- |
| Basic | It  is used to fetch data from the database for the given identifier. |It  is also used to fetch data from the database for the given identifier. |
| Null Object  | It object not found for the given identifier then it will return null object. |It will throw object not found exception. |
| Lazy or Eager loading | It returns fully initialized object so this method eager load the object. |It always returns proxy object so this method is lazy load the object. |
| Performance | It is slower than load() because it return fully initialized object which impact the performance of the application. |It is slightly faster. |
| Use Case | If you are not sure that object exist then use get() method |If you are sure that object exist then use load() method. |

# Embedding objects - [click here](https://www.youtube.com/watch?v=niSfoMlQafk&list=PL0zysOflRCekX8OO7V7pGQ9kxZ28JyJlk&index=10)

# Hibernate Mapping

Explanation video - [click here](https://www.youtube.com/watch?v=VLlDaIcb3jE&list=PLsyeobzWxl7qBZtsEvp_n2A7sJs2MpF3r&index=13)

1. **One to One Mapping :**
   - Using annotations :
     - theory - [click here](https://www.javatpoint.com/hibernate-one-to-one-example-using-annotation)
     - program files - [click here](https://github.com/neerajchavan/hibernate/tree/master/src/main/java/com/mapping)

   - Using XML :
     - thoery - [click here](https://www.javatpoint.com/hibernate-one-to-one-example-using-xml)


2. **One to Many :**
    - Using annotations :
      - thoery - [click here](https://www.javatpoint.com/hibernate-one-to-many-mapping-using-annotation-example)
      - program files - 

    - Using XML :
      - theory - [click here](https://www.javatpoint.com/hibernate-one-to-many-example-using-xml)


# Fetch Technique - Early & Lazy Loading

   Lazy and Eager are two types of data loading strategies in ORMs such as hibernate and eclipse Link.  These data loading strategies we used when one entity class is having references to other Entities like Employee and Phone (phone in the employee). 

**Lazy Loading** − Associated data loads only when we explicitly call getter or size method.
 - Use Lazy Loading when you are using one-to-many collections.
 - Use Lazy Loading when you are sure that you are not using related entities. 


**Eager Loading** − Data loading happens at the time of their parent is fetched.

  - Use Eager Loading when the relations are not too much. Thus, Eager Loading is a good practice to reduce further queries on the Server.
  - Use Eager Loading when you are sure that you will be using related entities with the main entity everywhere.

## Difference between eager and lazy loading

| Key | Lazy  | Eager |
| -------------- | ------------- | ------------- |
| Fetching strategy | In Lazy loading, associated data loads only when we explicitly call getter or size method. |In Eager loading, data loading happens at the time of their parent is fetched. |
| Default Strategy in ORM Layers  | ManyToMany and OneToMany associations used lazy loading strategy by default. |ManyToOne and OneToOne associations used lazy loading strategy by default. |
| Loading Configuration | It can be enabled by using the annotation parameter : fetch = FetchType.LAZY |It can be enabled by using the annotation parameter : fetch = FetchType.EAGER |
| Performance | Initial load time much smaller than Eager loading. | Loading too much unnecessary data might impact performance. |

**Loading configuration - Eager loading**
```java
@OneToMany(mappedBy = "question", fetch = FetchType.EAGER)
private List<Answer> answers;
```

### **Note : By deafult fetch type is Lazy** ###

# Hibernate Lifecycle

- [YouTube Tutorial](https://www.youtube.com/watch?v=opOX3Acd0o0&list=PL0zysOflRCekX8OO7V7pGQ9kxZ28JyJlk&index=17)
- [Theory](https://www.javatpoint.com/hibernate-lifecycle)

# Hibernate Caching
Hibernate caching improves the performance of the application by pooling the object in the cache. It is useful when we have to fetch the same data multiple times. Caching is a mechanism to enhance the performance of a system. It is a buffer memorythat lies between the application and the database. Cache memory stores recently used data items in order to reduce the number of database hits as much as possible.

**There are mainly two types of caching:**
1. **First Level Cache** - Session object holds the first level cache data. It is enabled by default. The first level cache data will not be available to entire application. An application can use many session object.
[Detail Explaination](https://howtodoinjava.com/hibernate/understanding-hibernate-first-level-cache-with-example/)
1. [**Second Level Cache**](https://howtodoinjava.com/hibernate/how-hibernate-second-level-cache-works/)

# Hibernate Query Lanugage

- [Recource 1](https://www.javatpoint.com/hql)
- [Recource 2](https://docs.jboss.org/hibernate/orm/3.5/reference/en/html/queryhql.html)
- [Recource 3](https://howtodoinjava.com/hibernate/complete-hibernate-query-language-hql-tutorial/)