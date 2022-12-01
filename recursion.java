package recursiongoodLuck;

public class RecursionGOODLUCK {

  public statix Summation(int n) {
    // Base Case
   if( n <= 0) {
     return 0;
   }
// Recursive Case : KEEP GOING
   else{
     // 3 + Summation(2)
     // 3 + 2 + Summation(1)
     // 3 + 2 + 1 + Summation(0)
     // 3 + 2 + 1 + 0 = 6

    n + Summation(n -1);
   }
  }
  public static void mai(String[] args){
    Summation(3); 
  }
}
