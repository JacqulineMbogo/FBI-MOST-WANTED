# Step 1: Build the app
FROM gradle:8.3.0-jdk17 AS builder
WORKDIR /app

# Optional but recommended: ignore .gradle and build cache from host
COPY . .

# Use the Gradle wrapper to avoid version mismatch
RUN ./gradlew clean build --no-daemon

# Step 2: Create lightweight image to run the app
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy the built JAR from the builder stage
COPY --from=builder /app/build/libs/fbi-most-wanted-0.0.1-SNAPSHOT.jar .

# Expose the port your Spring Boot app runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "fbi-most-wanted-0.0.1-SNAPSHOT.jar"]
