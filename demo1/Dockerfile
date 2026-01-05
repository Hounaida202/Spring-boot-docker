# Base image avec Java
FROM eclipse-temurin:17-jdk-jammy

# Copie ton app compilée (JAR)
COPY target/*.jar demo1-0.0.1-SNAPSHOT.jar

# Commande pour lancer l'app
ENTRYPOINT ["java", "-jar", "/demo1-0.0.1-SNAPSHOT.jar"]

