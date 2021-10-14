fun main() {

    var numbers = Array(size = 45, {index -> index+1})

    viewList(numbers)
    println("=".repeat(n = 50))

    // collection에 담긴 데이터를 무작위로 섞어주는 함수
    numbers.shuffle()
    viewList(numbers)
    
    // 0 ~ 5번까지 6개를 잘라서 복사
    var lottoNum = numbers.slice(0..5)

    println("=".repeat(n = 50))
    println("오늘 행운의 숫자")
    println("=".repeat(n = 50))
    
    // 잘라내서 복사한 배열을 다시 정렬하여 보여주기
    println(lottoNum.sorted())
    println("=".repeat(n = 50))
}

fun viewList(numbers:Array<Int>) {

    for ( (index, num ) in numbers.withIndex()) {
        print("$num,")
        if ((index +1 ) % 5 == 0 ) println()
    }

}
