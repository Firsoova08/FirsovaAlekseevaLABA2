fun main(){
    //1
    print("Введите ваш уровень: ")
    val num=readln().toInt()
    val status: String
    val bonus: Int
    when{
        num>10->{
            status="Новичок"
            bonus=10
        }
        num < 50->{
            status="Опытный"
            bonus=30
        }
     else ->{
         status="Опытный"
         bonus=100
     }
    }
println("$status! Вы получаете +$bonus HP")

}