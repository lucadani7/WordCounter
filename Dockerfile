FROM maven:3.9.6-eclipse-temurin-21

# Create app directory
WORKDIR /app

# Copy source files
COPY wordcounter/pom.xml .
COPY wordcounter/src ./src
COPY wordcounter/target/wordcounter-1.0-SNAPSHOT.jar app.jar

# Build the app (assuming Maven)
RUN mvn package

# Run your app
CMD ["java", "-jar", "app.jar"]