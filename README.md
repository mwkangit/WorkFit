# WorkFit

## Description

본 프로젝트는 운동자세 교정 및 운동일지 작성 서비스이다. 맨몸 운동 선택 후 사용자가 동영상을 촬영하여 제출 시 17개의 key point를 이용하여 운동자세를 pose estimate 한 평가를 제공한다. 운동일지 작성을 통해 날짜별 운동 현황, 현재 몸무게, 최대 몸무게, 최저 몸무게, BMI를 확인할 수 있다.



-----



## Environment

|                            Client                            |                            Server                            |
| :----------------------------------------------------------: | :----------------------------------------------------------: |
| <img alt="html" src ="https://img.shields.io/badge/Android-light"/> | <img alt="html" src ="https://img.shields.io/badge/AWS-orange"/>/ <img alt="html" src ="https://img.shields.io/badge/EC2-red"/> /  <img alt="html" src ="https://img.shields.io/badge/SpringBoot-green"/> |

- Android

Framework: `Android` 7.2.0

Project: `Gradle`

Packaging: `APK`

IDE: `Android Studio`

Dependencies: `OKHttp3`, `JUnit4`

- Server

Framework: `Spring Boot` 2.6.7

Project: `Gradle`

Packaging: `Jar`

IDE: `Intellij`

ORM: `JPA`(Hibernate, Spring Data JPA)

DBMS: `MySQL`

Dependencies: `Spring Web`, `Spring Data JPA`, `Spring Security`, `Lombok`, `Thymeleaf`, `JUnit4`, `swagger`

-----



## Project Structure

![image](https://user-images.githubusercontent.com/79822924/189423137-fd3d811e-0928-4bc0-bc30-2d6f567c5944.png)

![image](https://user-images.githubusercontent.com/79822924/189423173-fc24840f-1b1a-49b1-a0fe-b0aac40a2fcf.png)



------



## Installation

```markdown
# App
Build -> Generate Signed Bundle/APK
use APK in device

# Server
sudo chmod gradlew 777
./gradlew build
cd build/libs
sudo java -jar workfit-0.0.1-SNAPSHOT.jar
```



------



## Contents

```markdown
WorkFit/
├── APP
│  └─ src
│    └─ activity
│    └─ adapter
│    └─ fragment
│    └─ login
│    └─ poseCamera
│    └─ exerciseList
├── Server
│  └─ src
│    └─ advice
│    └─ controller
│    └─ config
│    └─ domain
│    └─ dto
│    └─ repository
│    └─ service
└── Docs
     └─ WorkFit_Presentation
     └─ WorkFit_Report
     └─ WorkFit_Paper 
```



-----



## Result

![image](https://user-images.githubusercontent.com/79822924/189423211-13eda1a2-ac19-45bf-bdb6-132e9880e53c.png)

![image](https://user-images.githubusercontent.com/79822924/189423304-889d0031-5f00-46cc-9126-f09d9b211804.png)

![image](https://user-images.githubusercontent.com/79822924/189423326-43030605-a312-4853-b564-b10a78d0e471.png)

![image](https://user-images.githubusercontent.com/79822924/189423362-b52dba4a-0ac0-4d27-b881-a8280f6d3410.png)

![image](https://user-images.githubusercontent.com/79822924/189423374-58577d0a-97bb-4770-8ecf-5c3b7d67ea34.png)

![image](https://user-images.githubusercontent.com/79822924/189423386-07a1b40f-1c0f-4d1b-9903-a78b46c7c66e.png)







------



## Demonstration Video

[WorkFit_DemonstrationVideo](https://youtu.be/6AiK-LXMT1k)
