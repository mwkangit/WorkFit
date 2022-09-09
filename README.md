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

![image-20220910025655271](/Users/mwkang/Library/Application Support/typora-user-images/image-20220910025655271.png)

![image-20220910025848628](/Users/mwkang/Library/Application Support/typora-user-images/image-20220910025848628.png)



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
└──    └─ service
```



-----



## Result

![image-20220910032343843](/Users/mwkang/Library/Application Support/typora-user-images/image-20220910032343843.png)

![image-20220910032348930](/Users/mwkang/Library/Application Support/typora-user-images/image-20220910032348930.png)![image-20220910032414018](/Users/mwkang/Library/Application Support/typora-user-images/image-20220910032414018.png)

![image-20220910032418995](/Users/mwkang/Library/Application Support/typora-user-images/image-20220910032418995.png)

![image-20220910032436090](/Users/mwkang/Library/Application Support/typora-user-images/image-20220910032436090.png)

![image-20220910032426040](/Users/mwkang/Library/Application Support/typora-user-images/image-20220910032426040.png)







------



## Demonstration Video

[WorkFit_DemonstrationVideo](https://youtu.be/6AiK-LXMT1k)
