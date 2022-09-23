# System

<br>입출력
<br>입력은 외부에서 값을 이 코드에 넣어주는 작업[변수에 대입해서 사용 가능]
<br> => InputStream in [scanner 같은]
<br>
<br>출력은 이 내부의 변수[코드]를 이용하여 외부에 값을 내보내는 작업
<br> => PrintStream out [printf 같은.]
<br> => PrintStream err

<br> 실행제어 부분은 제외하지만 설명하면. void exit(int status). 보통은 정상적인 종료는 0, 에러 발생시는 -1. 아니면 아예 의미있는 값을 만들어 넣을 수도
void gc()라고 가비지 컬렉터도 있긴 한데. 특수한 상황아니면 쓰지 않는거로 하고. [쓸 수는 있는데 성능이 떨어지는 경우도 있어서]
gc()는 이제 finalize를 호출하는데. 메모리회수가 아닌 정리작업만 하고 싶으면 void runFinalization().

