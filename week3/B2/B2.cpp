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

Node* insert(Node* head, int p, int x) {
    Node* newNode = new Node(x);
    if (head == NULL) {
        head = newNode;
        return head;
    }
    if (p == 0) {
        newNode->next = head;
        head = newNode;
        return head;
    }
    Node* q = head;
    while (p > 1) {
        q = q->next;
        p--;
    }
    newNode->next = q->next;
    q->next = newNode;
    return head;
}

Node* delete1(Node* head, int p) {
    if (head == NULL) {
        return head;
    }
    if (p == 0) {
        Node* i = head;
        head = NULL;
        delete i;
        return head;
    }
    Node* q = head;
    while (p > 1) {
        q = q->next;
        p--;
    }
    Node* tmp = q->next;
    q->next = tmp->next;
    delete tmp;
    return head;
}

void print(Node* head) {
    if(head == NULL) {
        cout << "NULL" << endl;
        return;
    }
    Node* p = head;
    while(p != NULL) {
        cout << p->data << " ";
        p = p->next;
    }
}

int main() {
    int n;
    cin >> n;
    int p;
    int x;
    string Op;
    Node* head = NULL;
    while (n--) {
        cin >> Op;
        if (Op == "insert") {
            cin >> p >> x;
            head = insert(head, p, x);
        } else if (Op == "delete") {
            cin >> p;
            delete1(head, p);
        }
    }
    print(head);
}
