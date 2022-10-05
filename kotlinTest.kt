class Kote3 {
    class Solution {
        fun isPrime(n: Long): Boolean {
            var i = 2L
            while (i * i <= n) {
                if (n % i++ == 0L) return false
            }
            return true
        }

        fun solution(n: Long): LongArray {

            var alreadyChecked = false
            var answer = longArrayOf()
            for (i in 2 until n/2) {
                val candi = n / i
                if(n == candi * i){
                    //candi와 i는 두 소수여야 한다
                    if(alreadyChecked)
                    {
                        if(answer.filter { it == i }.size == 1 && answer.filter { it == candi }.size == 1)
                        {

                        }
                        else
                        {
                            answer += -1
                            answer += -1
                        }
                        break
                    }

                    if(isPrime(i) && isPrime(candi))
                    {
                        alreadyChecked = true
                        if(i < candi) {
                            answer += i
                            answer += candi
                        }
                        else{
                            answer += candi
                            answer += i
                        }
                        break
                    }
                    else
                    {
                        answer += -1
                        answer += -1
                        break
                    }
                }
            }

            if(alreadyChecked)
            {
                val shortened = (n / answer[0]) / answer [1]
                for (i in 2 until shortened/2) {
                    val candi = n / i
                    if(n == candi * i){
                        answer[0] = -1
                        answer[1] = -1
                    }
                }
            }

            if(answer.isEmpty()) {
                answer += -1
                answer += -1
            }

            return answer
        }
    }

}

fun main(){
    Kote3.Solution().solution(12)
}
