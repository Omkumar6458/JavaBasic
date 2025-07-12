package Data_type;

public class Ex5 {
  public static void main(String[] arg)
  {
    int a=10;
    int b =100;
    if(a > b) // no required to if else statements needs

   

    System.out.println("false");
    System.out.println("true");
    System.out.println("ojjkx");

    int p =9;
    int x =0;
  //  if(x)  // it must be boolean // not valid 
    {
   //   System.out.println("cause incompatible error");
    }
  //  else{
      System.out.println("here cause compile time error ");
   // }

/* 
    if(x==0)  // here this is correct as it 
    System.out.println("yes!");  */


/* 
   if(true)  // this will cause error 
   {
     int x =10;  // not a statement 
   }
    
*/
  switch(6)
  {
    case 5:
      System.out.println("1");
      break;
    case 2: 
    System.out.println("2");
    case 3:
    System.out.println("3");
    case 4:
    System.out.println("4");
    case 0:
    System.out.println("5");
    default :
    System.out.println("no occur !  ");
  }


  // duplicate case is not allowed 
  // let:  byte b =10; ----> then case must be between 128 to -127
  //   if <<<    case: 1000 then cause error 



  }
  
}
