#include <iostream>
using namespace std;

class Node{
    public:
    int data;
    Node* next;
    Node(int data_) {
        this->data = data_;
        this->next = NULL;
    }
};

class Queue
{
    public:
	    Node* front;
	    Node* rear;

	    Queue() {
	        this->front = NULL;
	        this->rear = NULL;
	    }

	    void enQueue(int value)
	    {
	    	Node* newNode = new Node(value);
	    	if(rear == NULL) {
                rear = newNode;
                front = newNode;
                return;
	    	} else {
	    	    rear->next = newNode;
	    	    rear = newNode;
	    	}
	    }

	    void deQueue()
	    {
	    	if(front == NULL) {
                return;
	    	}
	    	Node* p = front;
	    	front = front->next;
	    	if(front == NULL) {
                rear = NULL;
	    	}
	    	delete p;
	    }

	    void print() {
	        Node* p = front;
	        while(p != NULL) {
                cout << p->data << " ";
                p = p->next;
	        }
        }
};

int main()
{
    Queue q;
    int n;
    string s;
    int x;
    cin >> n;
    while(n--) {
        cin >> s;
        if(s == "enqueue") {
            cin >> x;
            q.enQueue(x);
        } else if(s == "dequeue") {
            q.deQueue();
        }
    }
    q.print();
}
