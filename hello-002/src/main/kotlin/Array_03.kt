fun main() {

    // key 와 value를 쌍으로 갖는 데이터 타입
    // 불변형 map -> 즉 내용을 변경할수 없음
    val map1 = mapOf("name" to "홍길동",
                        "tel" to "010-111",
                        "addr" to "서울시")

    println(map1["name"])

    for ( (key, value ) in map1) {
        println("key : $key, Value : $value" )
    }

    val map2 = mutableMapOf(
        "name" to "이몽룡",
        "tel" to "010-111-1111",
        "addr" to "남원시"
    )

    println("변경전 map2 : $map2")
    
    map2["tel"] = "010-222-2222"
    println("변경후 map2 : $map2")
}