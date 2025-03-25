# 베이스 이미지 선택
FROM openjdk:17-jdk-alpine

# 작업 디렉토리 설정
WORKDIR /app

# Jar 파일 복사
COPY build/libs/*.jar app.jar

# 실행 명령어
CMD ["java", "-jar", "app.jar"]

# 포트 노출
EXPOSE 8080