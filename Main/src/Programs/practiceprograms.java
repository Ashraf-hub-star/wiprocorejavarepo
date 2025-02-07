// 1. Reverse a String
package Programs;
public class practiceprograms {
    public static void main(String[] args) {
        String str = "Hello World";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String: " + reversed);
    }
}

//// 2. Find the Largest Element in an Array
//public class LargestElement {
//    public static void main(String[] args) {
//        int[] arr = {4, 12, 7, 9, 3};
//        int max = arr[0];
//        for (int num : arr) {
//            if (num > max) max = num;
//        }
//        System.out.println("Largest Element: " + max);
//    }
//}
//
//// 3. Check for Palindrome
//public class PalindromeCheck {
//    public static void main(String[] args) {
//        String str = "radar";
//        String reversed = new StringBuilder(str).reverse().toString();
//        System.out.println(str.equals(reversed) ? "Palindrome" : "Not Palindrome");
//    }
//}
//
//// 4. Factorial Calculation
//public class Factorial {
//    public static int factorial(int n) {
//        return (n == 0) ? 1 : n * factorial(n - 1);
//    }
//    public static void main(String[] args) {
//        System.out.println("Factorial: " + factorial(5));
//    }
//}
//
//// 5. Fibonacci Series
//public class Fibonacci {
//    public static void main(String[] args) {
//        int n = 10, a = 0, b = 1;
//        System.out.print("Fibonacci Series: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(a + " ");
//            int sum = a + b;
//            a = b;
//            b = sum;
//        }
//    }
//}
//
//// 6. Check for Prime Number
//public class PrimeCheck {
//    public static void main(String[] args) {
//        int num = 29;
//        boolean isPrime = true;
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        System.out.println(num + (isPrime ? " is Prime" : " is Not Prime"));
//    }
//}
//
//// 7. String Anagrams
//import java.util.Arrays;
//
//public class AnagramCheck {
//    public static void main(String[] args) {
//        String str1 = "listen", str2 = "silent";
//        char[] arr1 = str1.toCharArray(), arr2 = str2.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        System.out.println(Arrays.equals(arr1, arr2) ? "Anagrams" : "Not Anagrams");
//    }
//}
//
//// 8. Bubble Sort
//public class BubbleSort {
//    public static void main(String[] args) {
//        int[] arr = {5, 1, 4, 2, 8};
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println("Sorted Array: " + Arrays.toString(arr));
//    }
//}
//
//// 9. Binary Search
//public class BinarySearch {
//    public static int binarySearch(int[] arr, int key) {
//        int left = 0, right = arr.length - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (arr[mid] == key) return mid;
//            if (arr[mid] < key) left = mid + 1;
//            else right = mid - 1;
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int[] arr = {1, 3, 5, 7, 9};
//        System.out.println("Element found at index: " + binarySearch(arr, 7));
//    }
//}
//
//// 10. Duplicate Elements in an Array
//import java.util.HashSet;
//
//public class DuplicateElements {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 2, 3};
//        HashSet<Integer> set = new HashSet<>();
//        for (int num : arr) {
//            if (!set.add(num)) {
//                System.out.println("Duplicate: " + num);
//            }
//        }
//    }
//}
//
//// 11. Linked List Reversal
//class Node {
//    int data;
//    Node next;
//    Node(int data) { this.data = data; this.next = null; }
//}
//
//public class LinkedListReversal {
//    public static Node reverse(Node head) {
//        Node prev = null, current = head, next;
//        while (current != null) {
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
//        return prev;
//    }
//    public static void main(String[] args) {
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head = reverse(head);
//        while (head != null) {
//            System.out.print(head.data + " ");
//            head = head.next;
//        }
//    }
//}
//
//// 12. Matrix Operations
//public class MatrixOperations {
//    public static void main(String[] args) {
//        int[][] A = {{1, 2}, {3, 4}};
//        int[][] B = {{5, 6}, {7, 8}};
//        int[][] sum = new int[2][2];
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                sum[i][j] = A[i][j] + B[i][j];
//            }
//        }
//        System.out.println("Matrix Addition:");
//        for (int[] row : sum) {
//            for (int elem : row) System.out.print(elem + " ");
//            System.out.println();
//        }
//    }
//}
//
//// 13. Implement a Stack
//import java.util.Stack;
//
//public class StackExample {
//    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        System.out.println("Popped: " + stack.pop());
//        System.out.println("Top Element: " + stack.peek());
//    }
//}
//
//// 14. Implement a Queue
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class QueueExample {
//    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(10);
//        queue.add(20);
//        System.out.println("Dequeued: " + queue.poll());
//        System.out.println("Front Element: " + queue.peek());
//    }
//}
//
//// 15. Inheritance and Polymorphism
//class Animal {
//    void sound() {
//        System.out.println("Animal makes a sound");
//    }
//}
//
//class Dog extends Animal {
//    void sound() {
//        System.out.println("Dog barks");
//    }
//}
//
//public class InheritancePolymorphism {
//    public static void main(String[] args) {
//        Animal obj = new Dog();
//        obj.sound(); // Polymorphism
//    }
//}
//
//// 16. Exception Handling
//public class ExceptionHandling {
//    public static void main(String[] args) {
//        try {
//            int result = 10 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println("Cannot divide by zero: " + e);
//        } finally {
//            System.out.println("Finally block executed");
//        }
//    }
//}
//
//// 17. File I/O
//import java.io.*;
//
//public class FileIO {
//    public static void main(String[] args) {
//        try {
//            FileWriter writer = new FileWriter("output.txt");
//            writer.write("Hello, File I/O in Java!");
//            writer.close();
//
//            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//// 18. Multithreading
//class MyThread extends Thread {
//    public void run() {
//        System.out.println("Thread is running");
//    }
//}
//
//public class MultithreadingExample {
//    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        t1.start();
//    }
//}
//
//// 19. Lambda Expressions
//import java.util.Arrays;
//import java.util.List;
//
//public class LambdaExample {
//    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        list.forEach(n -> System.out.println(n));
//    }
//}
//
//// 20. Recursive Algorithms
//public class RecursiveExample {
//    public static int fibonacci(int n) {
//        if (n <= 1) return n;
//        return fibonacci(n - 1) + fibonacci(n - 2);
//    }
//
//    public static void main(String[] args) {
//        int n = 10;
//        for (int i = 0; i < n; i++) {
//            System.out.print(fibonacci(i) + " ");
//        }
//    }
//}
