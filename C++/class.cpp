#include <iostream>
#include <queue>

using namespace std;

template <typename T>
class node
{
  public:
    T nodeValue;
    node<T> *next;

    node(const T &elm) : nodeValue(elm), next(NULL){};

    node(const T &elm, node<T> *ptr) : nodeValue(elm), next(ptr){};
};

template <typename T>
int listLen(node<T> *p)
{
    if (p == NULL)
        return 0;
    return listLen(p->next) + 1;
}

template <typename T>
int listLen2(node<T> *p)
{
    int count = 0;
    while (p != NULL)
    {
        count++;
        p = p->next;
    }
    return count;
}

template <typename T>
void writeList(node<T> *p)
{
    cout << '[';
    while (p != NULL)
    {
        cout << p->nodeValue;
        p = p->next;
        if (p == NULL)
            cout << ']';
        else
            cout << ',';
    }
}

template <typename T>
node<T> *add(node<T> *p, const T &elm)
{
    return new node<T>(elm, p);
}

template <typename T>
node<T> *addLast(node<T> *p, const T &elm)
{
    if (p == NULL)
        return new node<T>(elm);
    node<T> *front = p;
    while (p->next != NULL)
    {
        p = p->next;
    }
    p->next = new node<T>(elm);
    return front;
}

template <typename T>
class dnode
{
  public:
    T nodeValue;
    dnode<T> *prev;
    dnode<T> *next;

    dnode(const T &elm) : nodeValue(elm),
                          prev(NULL),
                          next(NULL){};

    dnode(const T &elm, dnode<T> *pr, dnode<T> *ne) : nodeValue(elm),
                                                      prev(pr),
                                                      next(ne){};
};

template <typename T>
class myList
{
  public:
    myList()
    {
        header = new dnode<T>(T());
        header->prev = header;
        header->next = header;

        size = 0;
    }

    void push_front(const T &elm)
    {
        dnode<T> *p = new dnode<T>(elm);
        dnode<T> *p_first = header->next;
        header->next = p;  // 1
        p->prev = header;  // 2
        p->next = p_first; // 3
        p_first->prev = p; // 4
        size++;
    }

    void push_back(const T &elm)
    {
        dnode<T> *p = new dnode<T>(elm);
        dnode<T> *p_last = header->prev;
        p_last->next = p;
        p->prev = p_last;
        header->prev = p;
        p->next = header;
        size++;
    }

    T &front()
    {
        if (size == 0)
            throw "empty list";
        dnode<T> *p_first = header->next;
        return p_first->nodeValue;
    }

    T &back()
    {
        if (size == 0)
            throw "empty list";
        return header->prev->nodeValue;
    }

    void print()
    {
        dnode<T> *p = header->next;
        cout << '[';
        while (p != header)
        {
            cout << p->nodeValue;
            p = p->next;
            if (p != header)
                cout << ',';
            else
                cout << ']';
        }
    }

  private:
    dnode<T> *header;
    int size;
};

template <typename T>
class tnode
{
  public:
    T nodeValue;
    tnode<T> *left;
    tnode<T> *right;

    tnode(const T &elm) : nodeValue(elm),
                          left(NULL),
                          right(NULL)
    {
    }

    tnode(const T &elm, tnode<T> *l, tnode<T> *r) : nodeValue(elm),
                                                    left(l),
                                                    right(r)
    {
    }
};

template <typename T>
void writeTree(tnode<T> *root)
{
    if (root == NULL)
        return;
    queue<tnode<T> *> q;
    q.push(root);
    while (!q.empty())
    {
        tnode<T> *p = q.front();
        q.pop();
        cout << p->nodeValue << ' ';
        if (p->left != NULL)
            q.push(p->left);
        if (p->right != NULL)
            q.push(p->right);
    }
    cout << endl;
}

template <typename T>
void inorder(tnode<T> *root)
{
    if (root == NULL)
        return;
    inorder(root->left);
    cout << root->nodeValue << ' ';
    inorder(root->right);
}

/* binary tree search */
template <typename T>
tnode<T> *find(tnode<T> *root, const T &target)
{
    if (root == NULL)
        return NULL;
    if (root->nodeValue == target)
        return root;
    if (target < root->nodeValue)
        return find(root->left, target);
    return find(root->right, target);
}

/* return the inorder traversal as a list
template <typename T>
void inorderList(tnode<T> *root, list<T> &lst){
    
}
*/

int main()
{

    tnode<char> *p1 = new tnode<char>('1');
    tnode<char> *p2 = new tnode<char>('2');
    tnode<char> *p3 = new tnode<char>('3');
    tnode<char> *p_plus = new tnode<char>('+', p1, p2);
    tnode<char> *p_mul = new tnode<char>('*', p_plus, p3);

    writeTree(p_mul);

    inorder(p_mul);

    /*
    myList<int> lst;
    lst.push_front(1);
    lst.push_back(2);
    lst.push_back(3);
    lst.print();
    cout << lst.front() << endl;
    cout << lst.back() << endl;
 */
    return 0;
}