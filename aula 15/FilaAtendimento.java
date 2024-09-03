
public class FilaAtendimento {
    private Pessoa[] deque;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public FilaAtendimento(int k) {
        this.capacity = k;
        this.deque = new Pessoa[k];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insertFront(Pessoa pessoa) {
        if (isFull()) {
            return false;
        }
        front = (front - 1 + capacity) % capacity;
        deque[front] = pessoa;
        size++;
        return true;
    }

    public boolean insertLast(Pessoa pessoa) {
        if (isFull()) {
            return false;
        }
        deque[rear] = pessoa;
        rear = (rear + 1) % capacity;
        size++;
        return true;
    }

    public Pessoa deleteFront() {
        if (isEmpty()) {
            return null;
        }
        Pessoa pessoa = deque[front];
        front = (front + 1) % capacity;
        size--;
        return pessoa;
    }

    public Pessoa deleteLast() {
        if (isEmpty()) {
            return null;
        }
        rear = (rear - 1 + capacity) % capacity;
        Pessoa pessoa = deque[rear];
        size--;
        return pessoa;
    }

    public Pessoa getFront() {
        if (isEmpty()) {
            return null;
        }
        return deque[front];
    }

    public Pessoa getRear() {
        if (isEmpty()) {
            return null;
        }
        return deque[(rear - 1 + capacity) % capacity];
    }

    public Pessoa[] getSortedByPriority() {
        Pessoa[] sortedQueue = new Pessoa[size];
        int index = front;
        for (int i = 0; i < size; i++) {
            sortedQueue[i] = deque[index];
            index = (index + 1) % capacity;
        }
        java.util.Arrays.sort(sortedQueue, (a, b) -> b.prioridade - a.prioridade);
        return sortedQueue;
    }
}