fun main() {

    // int [] nums = new int[4] -> java에서 배열을 만들때 코드
    
    // KT에서는 배열을 만들때 Collections 을 사용하여 생성한다
    
    // 정수형 배열의 생성, 정수형 list Collection 생성
    // 배열 요소가 정해져 있을때
    val arr1 = listOf(0,0,0,0,0)
    val arr11 = arrayOf("가","나","다","라")
    
    // 배열 요소가 정해져 있지 않을때
    // 요소가 정해지지 않은 blank 배열을 생성 -> 아직 내용물이 정해지지 않는 배열
    val arr2 = emptyList<Int>()
    val arr3 = emptyArray<String>()

    // 개수는 지정을 하고, 요소 내용은 정해지지 않았을때
    var arr4 = arrayOfNulls<Int>(size = 3)

    // 개수를 지정하고 람다함수를 이용하여 
    //  각 요소의 초기값을 지정하는 코드
    //  여기에서는 0,1,2,3,4의 값이 arr5에 담기게 된다
    var arr5:Array<Int> = Array(size = 5, {index -> index})

    for( arr in arr5 ) {

        print("$arr,")
    }
}