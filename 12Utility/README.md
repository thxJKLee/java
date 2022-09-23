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

---

---

# Calendar [Date타입이 아닌 이유는 폐기됐기 때문인데 가끔 씀]

---

> currentTimeMillis 만으로 하기에는, 일상속에는 너무 다양한 시간진법이 있어서
>
> ## java.tuil.Calendar 클래스.
>
> ---
>
> 사실은, 좀 더 구체적인 다른 클래스를 사용함

---

# java.util.GregorianCalendar 클래스.

> 여기에는 아예 생략
> 또는, 년,달,일,[시,분,초] // 뒤에는 생략가능
>
> > int get(int field)로 각 요소를 뽑을 수 있는데
> > 이때 field에는 Calendar 클래스의 static 상수를 사용한다.;

---

---

---

## java.text.SimpleDateFormat

> 포매팅과 비슷하게 작성하면 거기에 맞춰서 작동함.
> String format(Date date)
>
> > Date타입은 Calendar 객체에서 getTime().

| 패턴 | 설명      |
| ---- | --------- |
| y    | 년        |
| M    | 월        |
| d    | 일        |
| a    | 오전,오후 |
| E    | 요일      |
| H    | 0~23 시간 |
| k    | 1~24 시간 |
| K    | 0~11 시간 |
| h    | 1~12 시간 |
| m    | 분        |
| s    | 초        |
| S    | 1/1000초  |

> 날짜간의 연산
>
> > add(int field, int amount)
> > roll(int field, int amount)
> >
> > > add는 넘치면 알아서 다음것을 넘기는데, roll은 자르는 방식으로 함.
> > > 말그대로 날짜끼리의 차는 직접 해줘야 됨. [_003Calendar.java Line:31]

하지만 Calendar 클래스의 경우 윤초를 제대로 못다루고 항상 수정 가능성이 있음.

---

---

# LocalDate, LocalTime

> LocalDate 는 년 분 월
>
> > 1.  int getYear()
> > 2.  Month getMonth()
> > 3.  int getMonthValue()
> > 4.  int getDayOfMonth()
> > 5.  DayOfWeek getDayOfWeek()
>
> LocalTime 은 시 분 초
>
> > 1.  int getHour()
> > 2.  int getMinute()
> > 3.  int getSecond()
> > 4.  int getNano()
>
> 1. LocalDate plusDays(long daysToAdd)
> 2. LocalDate minusDays(long daysToSubtract)
> 3. LocalTime plusMinutes(long minutesToAdd)
> 4. LocalTime minusMinutes(long minutesToSubtract)

---

---

> 물론 여기서 제일 주요한 점은. 만... 만나이 처럼. 만으로 계산하는 경우가. 날짜에서는 특히 많아서. 그거를 좀 주의하면 좋을 듯
