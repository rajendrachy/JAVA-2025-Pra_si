package PART1.LAC5.CODE.ARRAY;

public class arr {
  public static void main(String[] args) {
    // int[] myArr = new int[5];

    // myArr[0] = 90;
    // myArr[1] = 93;

    // myArr[2] = 99;

    // myArr[3] = 91;

    // myArr[4] = 94;



    // or,
    int[] myArr = {90, 93, 99, 91, 94};


// System.out.println(myArr[0]);    
// System.out.println(myArr[1]);
// System.out.println(myArr[3]);
// // System.out.println(myArr[5]); // array index out of bound
System.out.println("The length  od array is : " +myArr.length); // find the length





//-----------Array traversal-----------------
int idx = 0;
while(idx < 5) { // myarr.length => find the length
System.out.println(myArr[idx]);
idx++;
}

  }
}
