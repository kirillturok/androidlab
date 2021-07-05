package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        var n_fact = fact(array[1])
        for(i in 1..array[1]){
            var res = n_fact/(fact(i)*fact(array[1]-i))
            if(res.toInt() == array[0]){
                return i
            }
        }
        return null
    }

    private fun fact(n:Int):Long{
        var res:Long=1;
        for (i in 1..n){
            res*=i
        }
        return res
    }
}
