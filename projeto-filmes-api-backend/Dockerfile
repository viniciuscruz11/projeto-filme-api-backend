# Use a imagem do OpenJDK como base
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho
WORKDIR /app

# Copia o arquivo JAR do backend para o contêiner
COPY target/seu-backend.jar app.jar

# Expõe a porta que o backend irá usar
EXPOSE 8080

# Comando para executar o aplicativo
CMD ["java", "-jar", "app.jar"]