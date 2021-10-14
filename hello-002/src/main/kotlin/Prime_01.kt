import kotlin.random.Random

fun main() {

    var rnd:Random = Random(System.currentTimeMillis())

    var num:Int = rnd.nextInt(until = 100) + 2

    /**
     * 2 ~ 101까지 범위중 생성된 1개의 난수가 prime 수 인지 판별
     *
     *  2 ~ 자기자신 -1까지 수중에서 약수가 없는 수
     */

    var bPrimeYes = true
    // for문을 이용해서 판별하는 코드
    for(index in 2 until num) {
        if (num % index == 0) {
            bPrimeYes = false
            break
        }
    }
    if (bPrimeYes) {
        println("$num 은 소수")
    } else {
        println("$num 은 소수가 아님")
    }

    bPrimeYes = true
    var  index = 2
    // while문을 이용해서 판별하는 코드
    while (index <= num / 2) {

        if (num % index == 0) {
            bPrimeYes = false
            break
        }
        index ++ 
    }
    
    if (index >= num / 2) {
        println("$num 는 소수")
    } else {
        println("$num 은 소수가 아님")
    }
}