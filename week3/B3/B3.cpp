#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node* next;
    Node* prev;
    Node(int data_) {
        this->data = data_;
        this->next = NULL;
        this->prev = NULL;
    }
};

Node* insert(Node* head, int data) {
    Node* newNode = new Node(data);
    if(head == NULL) {
        newNode->prev = NULL;
        newNode->next = NULL;
        head = newNode;
        return head;
    }
    Node* p = head;
    while(p->next != NULL) {
        p = p->next;
    }
    p->next = newNode;
    newNode->prev = p;
    newNode->next = NULL;
}

void print(Node* head) {
    Node* p = head;
    while(p != NULL) {
        cout << p->data << " ";
    }
}

int main() {
    int n;
    cin >> n;
    int x;
    Node* head = NULL;
    while(n--) {
        cin >> x;
        insert(head, x);
    }
    print(head);
}
