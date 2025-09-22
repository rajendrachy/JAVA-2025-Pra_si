package COLLECTION;

import java.util.*;

// public class qn1{

//     // Function to reverse using stack
//     public static void reverseWithStack(ArrayList<Integer> list) {
//         Stack<Integer> stack = new Stack<>();

//         // Push all elements into stack
//         for (int num : list) {
//             stack.push(num);
//         }

//         // Pop elements back into ArrayList
//         for (int i = 0; i < list.size(); i++) {
//             list.set(i, stack.pop());
//         }
//     }


//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

//         System.out.println("Original: " + list);
//         reverseWithStack(list);
//         System.out.println("Reversed (using stack): " + list);
//     }
// }









// ------------With stack---------------------
// public class qn1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         ArrayList<Integer> list = new ArrayList<>();
//         System.out.println("Enter the number of element: ");
//         int n = sc.nextInt();


//         System.out.println("Enter a arrayList: ");
//         for(int i=0; i<n; i++){
//             int num = sc.nextInt();
//             list.add(num);
//         }


//         System.out.println("Before " + list);

//         Stack<Integer> st = new Stack<>();
//         for(int i=0; i<list.size(); i++) {
//             st.push(list.get(i));
            
//         }
        

//         for(int i=0; i<list.size(); i++){
//             list.set(i, st.pop());
//         }


//         System.out.println("After " + list);


//     }
// }











//-------------Withthout stack--------------
class qn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter n : ");
        int n = sc.nextInt();


        System.out.println("Enter list: ");
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        System.out.println("Before: " + list);



        for(int i=0, j=list.size()-1; i>j; i++, j--) {
            int tem = list.get(i);
            list.set(i, list.get(j));
            list.set(j, tem);
        }

        System.out.println("After: " + list);

    }
}





 