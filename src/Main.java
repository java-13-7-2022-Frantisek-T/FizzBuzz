public class Main {

    public static void main(String[] args) {


//  FizzBuzz
//
//  Zadání:
//
//  Jedna ze základních motivací při vývoji softwaru je minimalizace manuální práce a snaha vyhnout se copy&paste.
//  Zkuste si vyřešit úkol FizzBuzz, který se občas používá při přijímacím řízení.
//  Počítejte od 1 do 100 a při každém kroku vypište číslo daného kroku.
//  Ale v případě, že je číslo dělitelné třemi, tak napište místo čísla Fizz.
//  Pokud je dělitelné pěti, tak místo čísla vypište Buzz.
//  A pokud je dělitelní třemi a pěti zároveň, tak FizzBuzz.

        for (byte b = 1; b<=100; b++) {

            // s je pomocná proměnná k ukládání výstupního textu.
            // Výstupním textem se rozumí buď pořadové číslo iterace nebo Fizz nebo Buzz nebo FizzBuzz.
            // při každém průchodu v cyklu je nutné ji naplnit prázdným řetězcem - tedy "vynulovat"
            String s="";

            if ((b % 3)==0) { s=s + "Fizz";}
            if ((b % 5)==0)  {s=s + "Buzz";}
            if (s.length()==0) {s= Byte.toString(b);}
            System.out.println(s);

        }
    }
}