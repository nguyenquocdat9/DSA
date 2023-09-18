#include <iostream>
using namespace std;

class Node {
    public:
    int data;
    Node* next;
    Node(int data_) {
        this->data = data_;
        this->next = NULL;
    }
};

class Stack {
    public:
    Node* top;
    Stack() {
        top = NULL;
    }

    void push(int value) {
        Node* newNode = new Node(value);
        if(!newNode) {
            return;
        }
        newNode->next = top;
        top = newNode;
    }

    void pop() {
        Node* p;
        if(top == NULL) {
            return;
        }
        p = top;
        top = top->next;
        delete p;
    }
    void print() {
        Node* p = top;
        Stack q;
        while(p != NULL) {
            q.push(p->data);
            p = p->next;
        }
        p = q.top;
        while(p != NULL) {
            cout << p->data << " ";
            p = p->next;
        }
    }
};

int main() {
    int n;
    Stack St;
    string s;
    int x;
    cin >> n;
    while(n--) {
        cin >> s;
        if(s == "push") {
            cin >> x;
            St.push(x);
        } else if(s == "pop") {
            St.pop();
        }
    }
    St.print();
}
