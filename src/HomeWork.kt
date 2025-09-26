fun main(){
    //1
//    print("Введите ваш уровень: ")
//    val num=readln().toInt()
//    val status: String
//    val bonus: Int
//    when{
//        num<10->{
//            status="Новичок"
//            bonus=10
//        }
//        num < 50->{
//            status="Опытный"
//            bonus=30
//        }
//     else ->{
//         status="Опытный"
//         bonus=100
//     }
//    }
//println("$status! Вы получаете +$bonus HP")

    //2
    print("Введите ваш возраст: ")
   val age=readln().toInt()
    if (age<12){
        println("Вы ребенок")
    }
    else if (age<=17){
        println("Вы подросток")
    }
    else{
        println("Вы взрослый")
    }
}