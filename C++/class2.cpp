#include <iostream>
#include <list>
#include <set>
#include <map>

using namespace std;

template <typename T>
void writeList(list<T> &alist)
{
    typename list<T>::iterator it = alist.begin();
    cout << '[';
    while (it != alist.end())
    {
        cout << *it;
        it++;
        if (it == alist.end())
        {
            cout << ']';
        }
        else
        {
            cout << ',';
        }
    }
}

template <typename T>
void removeDups(list<T> &alist)
{
    set<T> s;
    typename list<T>::iterator it;
    it = alist.begin();
    while (it != alist.end())
    {
        if (s.count(*it) > 0)
        {
            alist.erase(it++);
        }
        else
        {
            s.insert(*it);
            it++;
        }
    }
}

template <typename T>
void removeDups2(list<T> &alist)
{
    set<T> s;
    typename list<T>::iterator it;
    it = alist.begin();
    while (it != alist.end())
    {
        pair<typename set<T>::iterator, bool> p = s.insert(*it);
        if (p.second == false)
        {
            alist.erase(it++);
        }
        else
        {
            it++;
        }
    }
}

template <typename T>
list<T> mergeSorted(list<T> &lst1, list<T> &lst2)
{
    list<T> mergedList;
    typename list<T>::iterator it1, it2;
    it1 = lst1.begin();
    it2 = lst2.begin();
    while (it1 != lst1.end() && it2 != lst2.end())
    {
        if (*it1 <= *it2)
        {
            mergedList.push_back(*it1++);
        }
        else
        {
            mergedList.push_back(*it2++);
        }
    }
    while (it1 != lst1.end())
    {
        mergedList.push_back(*it1++);
    }
    while (it2 != lst2.end())
    {
        mergedList.push_back(*it2++);
    }
    return mergedList;
}

set<int> sieve(int n)
{
    int i;
    set<int> s;
    for (i = 2; i <= n; i++)
        s.insert(i);

    set<int>::iterator it = s.begin();
    while (it != s.end())
    {
        int p = *it++;
        set<int>::iterator it2 = it;
        while (it2 != s.end())
        {
            if (*it2 % p == 0)
            {
                s.erase(it2++);
            }
            else
            {
                it2++;
            }
        }
    }
    return s;
}

int main()
{
    /*
  int a[] = {4,7,8,10,15,7,15,20};
  list<int> lst(a, a+sizeof(a)/sizeof(int));
  writeList(lst); cout << endl;
  removeDups2(lst);
  writeList(lst); cout << endl;

  int a[] = {1,3,5};
  int b[] = {1,2,4,6,7};
  list<int> lst1(a,a+3);
  list<int> lst2(b,b+5);
  list<int> lst3 = mergeSorted(lst1,lst2);
  writeList(lst3); cout << endl;  

  set<int> primes = sieve(100);
  for (set<int>::iterator it = primes.begin(); it != primes.end(); it++){
	cout << *it << ' ';
  }
  cout << endl;
  */

    map<string, string> dic;
    dic["zero"] = "zero";
    dic["one"] = "uno";
    dic["two"] = "dos";
    dic["three"] = "tres";
    dic["four"] = "cuatro";
    dic["five"] = "cinco";
    dic["six"] = "seis";
    dic["seven"] = "siete";
    dic["eight"] = "ocho";
    dic["nine"] = "nueve";
    dic["ten"] = "diez";

    cout << dic["eleven"] << endl;

    map<string, string>::iterator it = dic.begin();
    while (it != dic.end())
    {
        cout << (*it).first << ' ' << (*it).second << endl;
        it++;
    }
    /*
  string e_word;
  
  cout << "type an English word of a number:";
  cin >> e_word;
  cout << dic[e_word] << endl;
  */

    return 0;
}