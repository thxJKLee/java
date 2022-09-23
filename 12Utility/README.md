# String.

<br> String도 클래스지만, 자주쓰이기 때문에 편의성을 제공해준 형태라고 생각하면 됨.
<br> 분명히 클래스이기 때문에 new String() 같은 형식으로

---

- String()
- String(byte[] bytes)
- String(char[] value)
- String(String original)
- String(StringBuffer builder) // 나중에 동적인 느낌이 강한 문자열 형태 배움

---

> 그런데 그냥
> String str = "ㅁㄴㅇ"
> 이런식도 허용해줍니다.

## String 은 참조형이지만 기본형처럼 사용 가능.

---

---

# Math

<br> 이부분은 알던거 투성이라 긴 말 없습니다.
<br> 굳이 얘기하면 static으로 붙어있어서. 곧장 사용하면 됨.
<br> 기억할거 정도라고 하면

1. abs 절대값
2. ceil 올림
3. floor 내림
4. round 반올림[리턴값 long]
   - round half up. 우리가 일반적으로 알던 01234내림, 56789올림
5. rint 반올림[리턴값 double; 정수는 맞긴 함]
   - round half to even. 짝수로 향하는 round.
   - 예를들어 확실히 절반이라면. 수학이라면 무조건 올림했는데
   - 짝수로 향함.
     - 2.50 => 2
     - 2.51 => 3
     - 3.49 => 3
     - 3.50 => 4
6. 삼각함수에 들어가는 argument 는 라디안 값.
7. 그래서 toRadians, toDegrees
8. 지수함수류는 검색해보면서
9. 난수도 Math 클래스에 있음

> 추가내용 java.util.Random
>
> > 여기서 생성자로 Random 클래스를 생성하고
> > int nextInt()
> > int nextInt(int n)
> > long nextLong()
> > double nextDouble()
> > 그외 nextGaussian 이나, setSeed로 시드를 중간에 변경하는 방식.
