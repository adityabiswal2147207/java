//creating a class pascals
public class pascals {
    static int factorial(int n) {
        //declaring the int datatype variable:->
       int f;
 
       for(f = 1; n > 1; n--){
          f *= n;
       }
       return f;
    }
    static int adi(int n,int r) {
       return factorial(n) / ( factorial(n-r) * factorial(r) );
    }

    //creating a static void main function
    public static void main(String args[]){
       System.out.println("The pascals triangle is below:--->");
       int n, i, j;
       n = 5;
 
       for(i = 0; i <= n; i++) {
          for(j = 0; j <= n-i; j++){
             System.out.print(" ");
          }
          for(j = 0; j <= i; j++){
             System.out.print(" "+adi(i, j));
          }
          System.out.println();
       }
    }
 }