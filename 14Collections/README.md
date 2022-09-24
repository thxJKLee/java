# Collection / Container

대규모의 자료를 그룹으로 묶어 관리하는 객체. 단순히 배열같은 것도 컬렉션으로 만들 수 있겠지.
<br> 기본적으로 java.util.* 이다. 꼭 import 하자.


> > 현재로써는 그냥, 다음과 같은 구조가 있다는 거로만 파악해두자
>
> 리스트 : 순서있고 중복있고
> 집합 : 순서없고 중복없고
> 맵 : 키와 값의 쌍. 딕셔너리. 키는중복없고 값은중복있고
> 큐 : 임시적인 값. 삽입 추출기능

> Collection 인터페이스 에서는 모든 컬렉션이 가지는 일반적인 기능을 선언
>
> 구현은 안되어 있고 메서드 선언문만 있음.
> 하위클래스에서 이러한 기능을 어떻게 할건지 구현하는 셈.
> 고급기능은 필요없다면 굳이 구현할 필요없고..
> 이제 이 기능을 이용한 여러 서브클래스가 있고. 그 서브클래스는 List, Set 인터페이스 그러한 것들임.
> 물론 자체적으로 만들 수 있긴한데 어려운편이고, 이미 자연스럽게 구현된것도 있어서.
> [구현가능하다. 정도만으로 알아도]

- boolean add(E e)
- boolean remove(Object o)
- boolean contains(Object o)
- int size()
- void clear()
- boolean isEmpty()
- Object[] toArray()
- <T> T[] toArray(T[] a)
- Iterator<E> iterator => 데이터 순환을 빠르게 하기 위한 반복자
- boolean addAll(Collection<? extends E> c)
- boolean removeAll(Collection<?> c)
- boolean containsAll(Collection<?> c)

> > > 중복값이 있냐 없냐에 따라서도 실패할 수도 있어서 반환타입이 boolean.
