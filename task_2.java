public class task_2 {
    public static void main (String[] args){ 
        Queue<String> qu = new Queue<String>(5);
 
        qu.enqueue("Russia");
        qu.enqueue("Japan");
        qu.enqueue("France");
 
        qu.first();
        qu.dequeue();
        qu.first();
        System.out.println("The queue size is " + qu.size());
        qu.dequeue();
        qu.dequeue();
 
        if (qu.isEmpty()){
            System.out.println("The queue is empty");
        }else{
            System.out.println("The queue is not empty");
        }
    }
}
