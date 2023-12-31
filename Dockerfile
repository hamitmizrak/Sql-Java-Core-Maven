# JDK sürümü
FROM openjdk:17

# Bilgilerndirme
LABEL maintainer="hamitmizrak@gmail.com"

# Persist Data (Kalıcık Veri)
VOLUME /tmp

# Port
EXPOSE 4444

# Değişken
ARG JAR_FILE=/target/*.jar

# Değişkeni ekle
ADD ${JAR_FILE} blog_react

ENTRYPOINT ["java","-jar","/blog_react"]