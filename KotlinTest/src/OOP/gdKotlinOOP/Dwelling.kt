package OOP.gdKotlinOOP

/*  Пояснние по ООП в Котлине на примере иерархии зданий Dwelling
https://developer.android.com/codelabs/basic-android-kotlin-training-classes-and-inheritance?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-classes-and-inheritance#2
        среди них  Dwelling - основной абстрактный класс
                        SquareCabin - деревянный квадратный дом
                        RoundHunt - круглая одноэтажная хижина из соломы
                            RoundTower - круглая многоэтажная башня из камня
*/

/* Dwelling - это базовый абстрактный класс удерживающий общую
    информацию о жилищах
    - базовый класс не может иметь реализаций в объекты потому что он
        не имеет полной реализации, о нем можно думать как о скетче
        (наброске без деталей), а сами детали реализуются в его классах
        потомках - чертежах.
    - основное преимущество абстрактного класса в том что он содержит
        свойства и описание поведения которые являются общими для его
        классов потомков
    - если значения свойств и реализация функций отсутствует такой класс
        является абстрактным
*/


abstract class Dwelling(
    //количество собственников
    //использование private означает что это свойство может использоваться
    //только этим классом и видно только ему. Приватным установлено потому что
    //количество проживающих в доме жильцов это закрытая информация

    private var residents: Int
) {
    //поле должно быть определено или описано как абстрактное
    abstract val buildingMaterial: String

    //capacity - свойство количества людей которые могут жить в жилище
    abstract val capacity: Int

    //функция для определения есть ли место для новых жильцов
    fun hasRoom(): Boolean {
        return residents < capacity
    }

    //Функция для расчета площади которая есть у всех но
    //рассчитывается по разному

    abstract fun floorArea() :Double


    //функция печати
    fun printAboutDwelling() {
        println("\n${this::class.simpleName}\n=============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room?: ${hasRoom()}")
        println("Total floor area: %.2f".format(floorArea()))
    }
}