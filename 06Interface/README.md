# 다중상속 기법

<br>1. 상속은 하나만 하고 나머지를 모두 구현으로 하는 방법
<br>2. 상속은 하나만 하고 내부에서 상속하고 싶은 클래스변수 만들기

<br>근데 문제점이 발생한다. 이미 작업이 다 끝난 상태에서 최상단의 인터페이스에 메서드를 추가한다면?
<br>그것을 구현한 다른 클래스도 다 바꿔야 할 것이다.[내부 개발이면 그나마 쉽다. 외부 개발이면 ..]

<br>
>이것에 대해 두가지 장치를 도입했다[자바8 부터라 어지간하면 구현 가능.]
<br>1. 디폴트 메서드: 인터페이스 내부에서 메서드 앞에 default라고 붙이면 클래스처럼 사용 가능하고.
<br> 그 인터페이스를 받은 클래스들은 쓰든 말든 상관없다. 
<br> 정리하자면 초기값 제시.
<br>
<br>2. 정적 메서드
<br>이거는 인터페이스 소속이라. 인터페이스로 변수를 선언했을때만 사용 가능.
<br>
<br>
> 그런데 문제는 인터페이스 내부에서 코드를 넉넉히 가질 수 있기 때문에. private 선언이 가능해졌음.
<br>
<br><br>
> 또, 인터페이스에서 그냥 코드를 가질 수 있으니깐. 다중상속이 되는 셈이라고 생각해도 된다.[그냥 다 default로 선언해버리면. 그게 클래스하고 똑같은거지]
<br><br>
> 또, 우선순위도 정해져 있는데
<br> 1. 클래스와 인터페이스가 같은 메서드를 정의하면 클래스 우선
<br> 2. 인터페이스끼리 같은 메서드를 정의하면 가까운 조상이 우선
<br>위 두 조건이 아닌경우 오류를 방출한다.
<br> 그래서 나온게 또 super. [인터페이스이름.super.메서드이름()]
<br> 이렇게 하면, 인터페이스 이름에 있던 메서드가 발동된다.
<br>
<br> 그래도 명심해야 되는건. 자바에서는 다중상속을 허용한것뿐이라, 주의점이 필요
