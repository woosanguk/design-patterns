# Head First Design Patterns

## 객체지향 원칙

- 바뀌는 부분을 캡슐화한다.
- 상속보다는 구성을 활용한다.
- 구현이 아닌 인터페이스에 맞춰서 프로그래밍한다.
- 서로 상호작용을 하는 객체 사이에서는 가능하면 느슨하게 결합하는 디자인을 사용해야 한다.
- 클래스는 확장에 대해서는 열려 있어야 하지만 코드 변경에 대해서는 닫혀 있어야 한다.
- 추상화된 것에 의존하도록 만들어라. 구상 클래스에 의존하도록 만들지 않도록 한다.

## Patterns

### 스트래티지 패턴

알고리즘군을 정의하고 각각을 캡슐화하여 바꿔 쓸 수 있게 만듭니다. 
스트래티지 패턴을 이용하면 알고리즘을 활용하는 클라이언트와 독립적으로 알고리즘을 변경할 수 있습니다.

### 옵저버 패턴

한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고 자동으로 내용이 갱신되는 방식으로 일대다 의존성을 정의합니다.


### 데코레이터 패턴

객체에 추가적인 요건을 동적으로 첨가한다. 데코레이터는 서브클래스를 만드는 것을 통해서 기능을 유연하게 확장할 수 있는 방법을 제공한다.


### 팩토리 메소드 패턴

객체를 생성하기 위한 인터페이스를 정의하는데, 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정하게 만듭니다. 팩토리 메소드 패턴을 이용하면 크래스의 인스턴스를 만드는 일을 서브클래스에게 맡기는 것이다.


### 추상 팩토리 패턴

인터페이스를 이용하여 서로 연관된, 또는 의존하는 객체를 구상 클래스를 지정하지 않고도 생성할 수 있습니다.






