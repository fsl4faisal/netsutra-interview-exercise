# netsutra-interview-exercise
Spring 3 
MVC
Hibernate 3

Things to remember is that this project uses @ElementCollection and is working fine I had to change the dependecies to make it work.

The hibernate dependecies 

<!-- New hibernate dependencies -->

		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>3.6.10.Final</version>
		</dependency>

		<dependency>
			<groupId>org.hibernate.javax.persistence</groupId>
			<artifactId>hibernate-jpa-2.1-api</artifactId>
			<version>1.0.0.Final</version>
		</dependency>

		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-annotations</artifactId>
			<version>3.5.6-Final</version>
		</dependency>

		<dependency>
			<groupId>org.hibernate.common</groupId>
			<artifactId>hibernate-commons-annotations</artifactId>
			<version>4.0.5.Final</version>
		</dependency>
	
		<!-- For java.lang.ClassNotFoundException : javassist.util.proxy.MethodFilter -->
		<dependency>
			<groupId>javassist</groupId>
			<artifactId>javassist</artifactId>
			<version>3.12.1.GA</version>
		</dependency>

		<!-- -->
