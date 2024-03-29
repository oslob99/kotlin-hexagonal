> 아키텍처 선정에 앞서 다양한 아키텍처를 조사하고 학습한다.
>

### 아키텍처

- DDD
- Hexagonal

![스크린샷 2024-01-11 오전 11 18 17](https://github.com/oslob99/kotlin-hexagonal/assets/126937987/76a4e71b-37bb-41e7-8fea-22b1223bf64f)


`헥사고날`의 특징 중 하나가 `하나의 기능`마다 클래스를 전부 나누어 주는 것.

가능한 `단일 책임 원칙(SRP)`에 `기반`해, 각 요청을 전부 나누어주는 것이 좋다.

이에 따른 장점

- `가독성`이 훨씬 더 뛰어나다
    - 한 클래스에 메서드가 많은 것보다, 클래스가 많은 것이 훨씬 `가독성이 좋`다.
    - 클래스에 몇 만줄의 코드가 들어있다면 그보다 파악하기 어려운 유형의 코드는 없을 것.
- `테스트` 하기가 `수월`해진다.
    - 테스트를 작성할 때도 테스트 할 기능을 파악하기 `수월`해진다.
- `동시 작업`이 `수월`해진다.
    - 각 기능들은 전부 클래스로 분리되어 있고, 따라서 병합 충돌이 일어날 일이 없다.
-

### `헥사고날` 용어

1. **Adapter**

외부로부터 요청을 받거나 외부에 요청을 보내는 곳.

- `in adapter`

web 요청을 받거나 외부 시스템으로 부터의 요청을 보내는 곳.

web 요청을 받아 처리하는 곳은 우리가 잘 알고 있는 `Controller`와 `Mapping` 됩니다.

- `out adapter`

DB쪽에 요청을 보내거나 `Kafka`를 통해 외부 시스템으로 요청을 보내는 곳.

Persistence Adapter는 Domain 객체와 Repository 사이에 `매개체`가 된다.

Entity와 `Domain - Entity` 간 변환을 말을 Mapper도 해당 패키지에 속한다.

1. **Port**

`Adapter` 와 `Usecase` 사이의 매개체. 주로 `Interface` 이고 port도 adapter처럼 in/out으로 나뉨.

- `in port`

`in adapter` 로 어떤 요청들이 들어올지 `명시`해놓는 곳.

Controller를 통해 들어온 요청을 `interface로 선언`합니다.

Ex) 회원 저장, 수정, 삭제 → [ `CreateUserUsecase`, `EditUserUsecase`  .. ] `interface`로 선언

- `out`

out adapter 로 어떤 요청들을 보낼지 명시해 놓는 곳.

비즈니스 로직 처리를 위해 필요한 데이터를 Repository에 접근해 가져오거나 저장하는 Case들을 선언.

1. **`Usecase`**
- 외부로부터 들어온 요청을 도메인을 이용해 요청사항을 처리하는 `시나리오들`.
- `Service 계층`에 속하며, `Input Port 인터페이스`를 구현한 `Service`이다.
- 각 비즈니스 로직을 갖고 있어 `비즈니스 규칙을 검증`한다.
    - `유효성 검사`는 진행하지 않는다.
    - 유효성 검사는 `입력 모델(AddLineRequest)` 에서 진행한다.

1. **Entity**

`Domain` 은 소프트웨어로 해결하고자 하는 문제 영역, 외부로 부터 받은 요청을 처리하는 `메인 비즈니스 로직`이 담긴 곳.

### 헥사고날 **아키텍처** vs **MVC 아키텍처**

|       | 설명                                                                                                            | 장점                                                                                                                  | 단점                                                                                        |
|-------|-----------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------|
| MVC   | • 사용자 인터페이스와 비즈니스 로직, 데이터 저장소 등을 분리해 각각의 역할을 독립적으로 수행하도록 구성하는 방식  | • 중간에 구조를 바꿀때 해당 부분만 바꾸면 된다                                                                         | • 결합도가 높아진다. ◦ 각 계층이 서로 의존하고 있어 한 계층에서 발생한 변경이 다른 계층에도 영향이 갈 수 있다. • 복잡성이 증가한다. ◦ 계층마다 데이터를 전달하고 처리하는 데 필요한 로직이 많아지기 때문. |
| 헥사고날 | • 소프트웨어를 내부적인 도메인(비즈니스 로직, 데이터 모델)과 외부적인 요소로 분리.                             | • 헥사고날의 특징 중 하나가 하나의 기능마다 클래스를 전부 나눈다. ◦ 가독성이 훨씬 더 뛰어나다 ▪ 한 클래스에 메서드가 많은 것보다, 클래스가 많은 것이 훨씬 가독성이 좋다. ▪ 클래스에 몇 만줄의 코드가 들어있다면 그보다 파악하기 어려운 유형의 코드는 없을 것. ◦ 테스트 하기가 수월해진다. ▪ 테스트를 작성할 때도 테스트 할 기능을 파악하기 수월해진다. ◦ 동시 작업이 수월해진다. ▪ 각 기능들은 전부 클래스로 분리되어 있고, 따라서 병합 충돌이 일어날 일이 없다. | • 초반 개발 시간이 증가될 수도 있다. ◦ 아키텍처를 처음 구축할 때 익숙하지 않아 시간과 노력이 필요하다.                    |


![스크린샷 2024-01-11 오전 11 18 17](https://github.com/oslob99/kotlin-hexagonal/assets/126937987/76a4e71b-37bb-41e7-8fea-22b1223bf64f)
