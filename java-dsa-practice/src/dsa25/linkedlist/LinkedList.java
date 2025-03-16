package dsa25.linkedlist;

public class LinkedList <T extends Comparable<T>> implements List<T>{

    private Node<T> root;
    private int numOfItems;


    @Override
    public void insert(T data) {
        if(root == null){
            root = new Node<>(data);
        } else {
            insertEnd(data, root);
        }

    }
//We just to update the reference o(1)
    private void insertBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        root = newNode;
    }
    //because we have to start with the root node
    // first we have to find the last node in o(n)
    private void insertEnd(T data, Node<T> node) {

        if(node.getNextNode() !=null){
            insertEnd(data, node.getNextNode());
        } else {
            Node<T> newNode = new Node<T>(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {

        if(root == null) return;
        if(root.getData().compareTo(data) == 0){
            root = root.getNextNode();
        } else{
            remove(data, root, root.getNextNode());
        }
    }

    private void remove(T data, Node<T> previousNode, Node<T> actualNode) {

        while(actualNode !=null){
            if(actualNode.getData().compareTo(data) == 0){
                numOfItems--;
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode=null;
                return;
            }
            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public void traverse() {

        if(root == null) return;
            Node<T> actualNode = root;
            while(actualNode !=null){
                System.out.println(actualNode);
                actualNode = actualNode.getNextNode();
        }

    }

    @Override
    public int size() {
        return 0;
    }
}
