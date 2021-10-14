import java.util.*
import kotlin.math.floor
import kotlin.math.round

fun main() {

    var scan:Scanner = Scanner(System.`in`)

    println("반지름을 입력하세요 (실수형 : ")
    var strInput = scan.nextLine()

    var pi= Math.PI
    var radius:Int = Integer.valueOf(strInput)

    var result1:Double = round((radius * 2) *pi)
    var result2:Double = round((radius * radius) *pi)
    var result3:Double = round((radius * radius) * 4 * pi)
    var result4:Double = round((radius * radius * result1) * pi * (4/3))

    // 원의 둘레 : (반지름 * 2) * PI
    // 원의 면적 : (반지름 * 반지름) * pI

    // 구의 표면적 : (반지름 * 반지름) * 4 * PI
    // 구의 부피 : 반지름 * 반지름 * 반지름 * PI * (4/3)

    println("=".repeat(n = 30))
    println("원의 둘레 : $result1")
    println("=".repeat(n = 30))

    println("원의 면적 : $result2")
    println("=".repeat(n = 30))

    println("구의 표면적 : $result3")
    println("=".repeat(n = 30))

    println("구의 부피 : $result4")
    println("=".repeat(n = 30))



}