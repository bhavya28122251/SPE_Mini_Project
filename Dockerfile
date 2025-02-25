# Use an official JDK runtime as base image
FROM openjdk:17

# Set the working directory
WORKDIR /app

# Copy the built JAR file from target/ folder to the container
COPY target/scientific-calculator-1.0-SNAPSHOT.jar app.jar

# Command to run the application
CMD ["java", "-jar", "app.jar"]
