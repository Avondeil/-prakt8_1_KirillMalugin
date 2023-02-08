//Вариант 3, практическая работа 8
fun main() {
    try {
      var news1:Newspapers=Newspapers("Одуванчик", 4,"2/2/2000")
        news1.scan()
        if (news1.t==true) {
            news1.info()
        }
        news1.vvod()
        news1.scan()
        if (news1.t==true) {
            news1.info()
        }
    }
    catch (e:Exception)
    {
        println("Найдена ошибка при вводе данных")
    }
}