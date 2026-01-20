# Stage 1: Build the application
FROM eclipse-temurin:17-jdk-alpine AS builder

# Set the working directory
WORKDIR /app

# Copy the application code
COPY . .

# Build the application (requires Maven or Gradle)
RUN ./mvnw clean -DskipTests

# Stage 2: Run the application
FROM eclipse-temurin:17-jre-alpine

# Set the working directory
WORKDIR /app

# Copy the JAR file from the builder stage
COPY --from=builder /app/target/*.jar app.jar

# Expose port the port the app will run on
EXPOSE 8080

