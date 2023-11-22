#### 개발 환경
- JAVA 17
- Spring Boot 3.x.
- MySQL

## 📌 애플리케이션 개발환경 실행 방법

## #1 Local
1. Git clone (https://github.com/hobbyloop/hobbyloop-backend.git)
2. 아래 환경변수 기입 방법 기재
3. 로컬 MySQL 접속 후 데이터베이스 생성
4. 실행

- 데이터베이스 생성 SQL
```sql
DROP
DATABASE IF EXISTS ${DATABASE_NAME};
CREATE
DATABASE ${DATABASE_NAME};
USE
${DATABASE_NAME};
```

## 📌 애플리케이션 환경 변수 (application-environment.yml)

- application-environment.yml.default -> application-environment.yml로 변경
- 환경변수 각자 로컬 환경에 맞게 작성
- 환경변수 사용시 여기 작성해주세요 !

${DATABASE_HOST} : 데이터베이스 호스트 주소

${DATABASE_PORT} : 데이터베이스 포트 번호

${DATABASE_NAME} : 데이터베이스 이름

${DATABASE_USERNAME} : 데이터베이스 사용자 이름

${DATABASE_PASSWORD} : 데이트베이스 비밀번호

${APPLICATION_SEVER_PORT} : 애플리케이션 서버 포트

---

## 📌 멀티 모듈 아키텍처 구조

### admin-module
- 관리자 기능 추후 개발 예정

### api-module
- 접근제어, 컨트롤러, request 관리
- FacadeService를 통해 비지니스 로직 실행

### domain-module
- 도메인 계층
- db와 직접적으로 상호작용
- entity, repository, service 로 구성
- Service 는 db와 직접 접근하는 CRUD 위주로 구현

### facade-service-module
- 실제 비즈니스 서비스 로직 담당
- 비즈니스 요구사항 위주의 로직 (여러 도메인 계층 서비스를 묶어서 사용)
- 트랜잭션 관리

### core-module
- 서버 전반적으로 사용하는 기능 관리
- yml 파일 환경변수 관리 (application-environment.yml)
- configuration 설정

