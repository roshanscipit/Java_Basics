Relationship demo (Maven)

This small Maven project demonstrates JPA entity relationships (OneToOne, OneToMany/ManyToOne, ManyToMany) using Hibernate + H2 in-memory DB.

Run:

From project root `c:\Users\user\fist_program\JPA\relationship-demo`:

# build and run via Maven exec
mvn clean compile exec:java

# or build and run manually
mvn clean package dependency:copy-dependencies
java -cp "target/classes;target/dependency/*" com.demo.Main

The program prints SQL (Hibernate) and verifies persisted relationships.
