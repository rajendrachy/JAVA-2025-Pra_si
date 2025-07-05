//package PART1.LAC5.2DARRAY;

public class arr {
  public static void main(String[] args) {
       
//  int [][] arr = {{}, {}};
//  System.out.println(arr.length); // output -> 2
//  System.out.println(arr[0].length); //// output -> 0


 int [][] arr = {{1, 2, 3}, {4, 5, 6}};


//or,
// int [][] arr = new int[2][3];


int i=0;
while(i < arr.length) {
  int j = 0;
  while(j < arr[i].length) {
    System.out.print(arr[i][j] + " ");
    j++;
  }
  System.out.println();
  i++;
}
  }
}




