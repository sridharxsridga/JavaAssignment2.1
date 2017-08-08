/*
*Program to print the “X” pattern:
*
 */
 
package nestedLoops;
 
public class PatternX {
/*
* This method is implemented to  print diagonal with formula row==col and opposite diagonal with formula (row+col)==(row+1)
* While row value indicates rows of the matrix and col indicates the columns of the matrix
*
* */
       public static void main(String[] args) {
              for(int  row =1;row<=5;row++){
                     for(int col =1;col <= 5;col++ ){
                           if(row==col || ((row+col) == (5+1))){
                                  System.out.print("*");
                           }else{
                                  System.out.print(" ");
                           }
                          
                          
                     }
                     System.out.println();
                    
              }
       }
 
}
 