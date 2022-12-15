import java.util.LinkedList;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, 
//dequeue() - возвращает первый элемент из очереди и удаляет его, 
//first() - возвращает первый элемент из очереди, не удаляя.



    public class Queue<E>{
        private LinkedList<E> lst;      // коллекция для хранения элементов queue
        private int size;               // максимальная емкость queue
        private int count;              // текущий размер queue
 
    // Конструктор для инициализации queue
        public Queue(int size){
            this.lst = new LinkedList<E>();
            this.size = size;
            count = 0;
        }
        // Вспомогательная функция для возврата размера queue
        public int size(){
            return count;
        }

        // Вспомогательная функция для проверки, пуста ли queue или нет
        public boolean isEmpty(){
            return (size() == 0);
        }

        // Вспомогательная функция для проверки того, заполнена ли queue или нет
        public boolean isFull(){
            return (size() == size);
        }

        // Вспомогательная функция для добавления элемента в queue
        public void enqueue(E item){
            // Проверка на переполнение queue
            if (isFull()){
                System.out.println("\n Overflow");
                System.exit(-1);
            }
            System.out.println("Inserting " + item); 
            lst.addLast(item);
            count++;
        }
        // Удаление переднего элемента queue
        public void dequeue(){
            if (isEmpty()){
                System.out.println("\nUnderflow");
                System.exit(-1);
            }else{
                System.out.println("Removing " + lst.removeFirst());
                count--;
            }
        }
        
        // Возврат первого элемента queue
        public void first(){
            if (isEmpty()){
                System.out.println("\nUnderflow");
                System.exit(-1);
            }
            System.out.println("First element of the queue is: " + lst.getFirst());
        }

 
}
