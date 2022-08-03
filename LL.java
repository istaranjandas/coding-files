public class LL {
    Node head = null;
    Node tail = null;
    int size = 0;
    public LL(){
        this.size = 0;
    }
    public void insertFirst(int i) {
        Node n = new Node(i);
        n.next = head;
        head = n;
        if(tail == null){
            tail = n;
        }
        size++;
    }
    public void insertLast(int i) {
        Node n = new Node(i);
        n.next = null;
        Node temp = index(size - 1);
        temp.next = n;
        tail = n;
        size++;
    }
    public void removeFirst(){
        if(size == 1){
            head = null;
            tail = null;
        }else{
            head = head.next;
        }
        
    }
    public Node index(int i){
        Node temp = head;
        for (int j = 0; j < i; j++) {
            temp = temp.next;
        }
        return temp;
    }
    public void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int value;
        private Node next;
    
    public Node(int value){
        this.value = value;
    }
    // public Node(int value, Node next){
    //     this.value = value;
    //     this.next = next;
    // }
}
public static void main(String[] args) {
    LL list = new LL();
    list.insertFirst(12);
    list.insertFirst(13);
    list.display();
    list.insertLast(14);
    list.display();
    list.removeFirst();
    list.display();
}

}
