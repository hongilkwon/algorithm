package math

/*
    모듈러 연산(mod %)

    정의
    A를 B로 나누었을 때의 결과(몫이 Q이고 나머지가 R)이라고 하자.

    A / B = Q,
    A %(mod) B = R

    A = BQ + R

    합동
    A mod C = B mod C 이면 합동(A ≡ B(mod C))이다.


    (A-B)(mod C) = 0

    5 mod 7 = 5
    12 mod 7 = 5
    19 mod 7 = 5

    특징
    대칭성 : A ≡ B(mod C)이면 B ≡ A(mod C)
    추이성 : A ≡ B(mod C)이고 B ≡ D(mod C)이면 A ≡ D(mod C)

    알고리즘에 필요한 지식

    (A+B) mod C =(A mod C + B mod C) mod C
    (A-B) mod C =(A mod C - B mod C) mod C
    (A*B) mod C =(A mod C * B mod C) mod C

    * 나눗셈은 성립하지 않음.

 */