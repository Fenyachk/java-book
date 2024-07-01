package Chapter07;
// Продемонстрировать применение аргументов переменной длины
class VarArgs17 {
    // теперь метод vaTest() объявляется с аргументами переменной длины
    static void vaTest(int ... v) {
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");
        for (int x : v) System.out.print(x + " ");
        System.out.println();
    }
// !!! Обратите внимание на возможные способы вызова метода vaTest() с аргументами переменной длины
    public static void main(String[] args) {
       vaTest(10);      // один аргумент
       vaTest(1, 2, 3); // три аргумента
       vaTest();            // без агрументов
    }
}
/* ----------------------------------------
Количество аргументов: 1 Содержимое: 10
Количество аргументов: 3 Содержимое: 1 2 3
Количество аргументов: 0 Содержимое:

 */