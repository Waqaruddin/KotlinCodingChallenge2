//Given Gary's sequence of up and down steps during his last hike,
// find and print the number of valleys he
//walked through


fun main(){

    println(valleyCount("UDDDUDUU"))
}

fun valleyCount(input:String):Int{

    var total = 0
    var valleyCount = 0

    for(i in input.indices){
        if(input[i] == 'U'){
            total ++
        }else{
            total --
        }
        if(input[i] == 'U' && total == 0){
            valleyCount += 1
        }
    }
    return valleyCount
}

