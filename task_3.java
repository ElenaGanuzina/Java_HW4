import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* Написать программу, определяющую правильность расстановки скобок в выражении.
a+(d*3) - истина
\[a+(1*3) - ложь
\[6+(3*3)] - истина
{a}\[+\]{(d*3)} - истина
<{a}+{(d*3)}> - истина
{a+]}{(d*3)} - ложь
*/

public class task_3 {
    public static void main(String[] args){
        System.out.println(bracketsCounter());
    }
    
    public static boolean bracketsCounter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an expression ");
        List<String> lst = new ArrayList<>();
        lst = Arrays.asList(sc.nextLine().split(""));
        sc.close();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(String ch : lst){
            if(ch.equals("(")){
                count1 ++;
            }
            if(ch.equals("{")){
                count2 ++;
            }
            if(ch.equals("[")){
                count3 ++;
            }
            if(ch.equals(")")){
                count1 ++;
            }
            if(ch.equals("}")){
                count2 ++;
            }
            if(ch.equals("]")){
                count3 ++;
            }
        }
    
        if(count1 % 2 == 0 && count2 % 2 == 0 && count3 % 2 == 0)
            return true;
        else return false;
    }
    
}

