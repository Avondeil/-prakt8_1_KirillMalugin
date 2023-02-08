//Вариант 3, практическая работа 8
class Newspapers(var name: String, var number: Int, var date:String){
    var t:Boolean=true
    fun info()
    {
        println("Название газеты: $name\nНомер газеты: $number\nДата выпуска: $date")
    }
    fun vvod()
    {
        print("Введите название газеты: ")
        name = readLine()!!.toString()
            print("Введите номер газеты: ")
            number = readLine()!!.toInt()
                print("Введите дату выпуска газеты: ")
                date = readLine()!!.toString()

    }
    fun scan()
    {
        t=true
        if(name>="a" && name<="z" || name>="а" && name <="я" || name>="A" && name<="Z" || name>="А" && name <="Я" )
        {
            if (number<0) {
            println("Номер не может быть отрицательным"); t=false;}
        }else {println("Ввод числа и знаков в названии запрещен!"); t=false; }
    }
    }



