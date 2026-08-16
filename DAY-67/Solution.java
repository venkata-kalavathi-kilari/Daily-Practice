// Node class
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

// Queue class
class myQueue {
    private Node front;
    private Node rear;
     int currSize=0;
    public myQueue() {
        // Initialize your data members
       
        front=rear=null;
    }

    public boolean isEmpty() {
        // check if the queue is empty
        return front==null;
    }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue.
        Node node=new Node(x);
        if(isEmpty()){
            front=rear=node;
        }else{
            rear.next=node;
            rear=node;
        }
        currSize++;
    }

    public void dequeue() {
        // Removes the front element of the queue
        if(isEmpty()){
            return;
        }else{
            Node temp=front;
            front=front.next;
            if(front==null) rear =null;
            currSize--;
            temp=null;
        }
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        if(front ==null) return -1;
        return front.data;
    }

    public int size() {
        // Returns the current size of the queue.
        return currSize;
    }
}
