# Fetching latest version of Java
FROM openjdk:17

# Setting up work directory
WORKDIR /app

# Copy the jar file into our app
COPY /target/s3rekognition-0.0.1-SNAPSHOT.jar /app

ENV AWS_REGION = "eu-west-1"

# Starting the application
CMD ["java", "-jar", "s3rekognition-0.0.1-SNAPSHOT.jar"]