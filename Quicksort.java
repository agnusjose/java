import java.util.Scanner;
public class Quicksort {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int limit, i;
    System.out.println("Enter the limit: ");
    limit=sc.nextInt();
    int [] a=new int[limit];
    System.out.println("Enter the numbers to be sorted:\n");
    for (i = 0; i < limit; i++) {
      a[i]=sc.nextInt();
    }
    Sort sr=new Sort();
    sr.quickSort(a, 0, limit - 1);
    System.out.println("Sorted array: ");
    for (i = 0; i < limit; i++) {
    System.out.println(a[i]);
    }
}
}

class Sort{
void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

int partition(int arr[], int low, int high) {
    int pivot = arr[low];  
    int i = low;

    for (int j = low + 1; j <= high; j++) {
        if (arr[j] < pivot) {
            i++;
            swap(arr, i, j);
        }
    }
    swap(arr, low, i);  
        return i;
}

void quickSort(int arr[], int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);

        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}
}

    
