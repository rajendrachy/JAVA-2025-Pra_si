package COLLECTION;

// import java.util.*;

// class qn2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         ArrayList<Integer> list = new ArrayList<>();
//         System.out.println("Enter n : ");
//         int n = sc.nextInt();


//         System.out.println("Enter list: ");
//         for(int i=0; i<n; i++) {
//             int num = sc.nextInt();
//             list.add(num);
//         }

//         System.out.println("Before: " + list);


// ArrayList<Integer> seen = new ArrayList<>();

//   for(int i=0; i<list.size(); i++) {
//       if(!seen.contains(list.get(i))) {
//           seen.add(list.get(i));
//       }
      
      
    
//   }
//     System.out.println("After : " + seen);
    
    
    

//     }
// }



 






// ---------with LinkedHashSet-------------------
import java.util.*;
class qn2 {
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



  LinkedHashSet<Integer> res = new LinkedHashSet<>(list);
  
    list.clear();
    
    list.addAll(res);
    
    System.out.println("After: " + list);

    }
}




 