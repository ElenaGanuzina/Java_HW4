import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

public class task_1 {
    public static void main(String[] args){
        LinkedList<String> lst = new LinkedList<>();
        String str1 = new String("Dura");
        String str2 = new String("lex");
        String str3 = new String("sed");
        String str4 = new String("lex");
        lst.add(str1);
        lst.add(str2);
        lst.add(str3);
        lst.add(str4);
        System.out.println(lst);
        System.out.println(getReversedList(lst));
    }
    public static <E> LinkedList<E> getReversedList(LinkedList<E> lst){
        LinkedList<E> result = new LinkedList<>();
        for (E string : lst) {
            result.addFirst(string);
        }
        return result;
    }
}