# Usar una imagen base oficial de OpenJDK
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo en /app
WORKDIR /app

# Copiar el archivo JAR de la aplicación al contenedor
COPY target/aeropuertoSS-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto en el que tu aplicación escucha
EXPOSE 8080

# Ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]