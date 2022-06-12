- name : type -> type이 뒤에 나옴
- 코틀린에서는 명시적으로 null을 인자로 넣을 수 없다.
- type에 ?을 붙힘으로 null 가능한 변수임으 명시적으로 표현.
- data class 는 toString(), hashCode(), equals(), copy() 를 자동으로 만들어준다
- 코틀린은 변수를 생성하면 자동으로 get, set 를 내부적으로 생성해준다.


- MutableList, List 코틀린에서는 읽기 전용 변수(val)와 수정할 수 있는 변수(var)처럼 리스트도 읽기 전용 리스트(list), 수정할 수 있는 리스트(mutable)이 있다.



    * 범위 지정 함수(Scope function)
    * apply : 객체 자기자신을 반환