#include <iostream>

using namespace std;
int main()
{

    int n;
    cin >> n;
    int array[n];
    for(int i = 0;i < n;i++)
    {
        cin >> array[i];
    }
    int k;
    for(int i = 0;i < n;i++)
    {
        k = i;
        for(int j = i + 1;j < n;j++)
        {
            if(array[j] < array[k]) k = j;
        }
        if(k != i) swap(array[i], array[k]);
    }
    for(int i = 0;i < n;i++)
    {
        cout << array[i] << " ";
    }
    //test
}
