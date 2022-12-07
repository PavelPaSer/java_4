// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class task_1 {

    public static void main(String[] args) {
        
        LinkedList<String> rez = new LinkedList<>();
        rez.add("Жили");
        rez.add("были");
        rez.add("дед");
        rez.add("бабка");
 
        System.out.println(rez);        
        new_list(rez);
        System.out.println(rez);
    }

    private static LinkedList new_list(LinkedList rez) {
        int count = rez.size();
        for (int i = count-1; i >= 0; i--) {
            rez.add(rez.get(i));           
        }
        for (int i = 0; i < count; i++) {
            rez.removeFirst();
        }
        return rez;
    }
}