package dsa25.linkedlist;

public class App {

    public static void main(String[] args){
        LinkedList<String> names = new LinkedList<>();
        names.insert("Ravi");
        names.insert("Raj");
        names.insert("Ram");
        names.insert("Ramesh");
        names.traverse();
        names.remove("Ram");
        names.traverse();
    }
}
