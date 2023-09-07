#include <iostream>
using namespace std;

int partition (int arr[], int low, int high)
{
    int pivot = arr[high];
    int left = low;
    int right = high - 1;
    while(true){
        while(left <= right && arr[left] < pivot) left++;
        while(right >= left && arr[right] > pivot) right--;
        if (left >= right) break;
        swap(arr[left], arr[right]);
        left++;
        right--;
    }
    swap(arr[left], arr[high]);
    return left;
}

void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {
        int pi = partition(arr, low, high);

        // Gọi đệ quy sắp xếp 2 mảng con trái và phải
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

int main() {
    int n;
    cin >> n;
    int arr[n];
    for(int i = 0;i < n;i++) {
        cin >> arr[i];
    }
    quickSort(arr, 0, n - 1);
    for(int i = 0;i < n;i++) {
        cout << arr[i] << " ";
    }
}
