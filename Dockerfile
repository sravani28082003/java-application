# Use lightweight OpenJDK base image
FROM openjdk:17-jdk-slim
 
# Set working directory
WORKDIR /app
 
# Copy jar file into container
COPY target/task-tracker-1.0.jar app.jar
 
# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
