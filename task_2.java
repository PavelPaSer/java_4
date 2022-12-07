// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.
import java.util.LinkedList;
import java.util.Queue;

public class task_2 {
    public static void enqueue(Queue<Integer> queue, int element) {
        queue.offer(element);
    }

    public static void dequeue(Queue<Integer> queue) {
        queue.poll();
    }

    public static void first(Queue<Integer> queue) {
        System.out.println("Первый элемент очереди: " + queue.peek());
    }

    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            myQueue.offer(i);
        }
        System.out.println("Очередь: " + myQueue);
        enqueue(myQueue, 777);
        System.out.println("Добавить число: 777: " + myQueue);
        dequeue(myQueue);
        System.out.println("Удаление первого числа: " + myQueue);
        first(myQueue);
        System.out.println("Использования метода first: " + myQueue);
    }
}