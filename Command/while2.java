package Command;

public class while2 {
  public static void main(String[] args) {


//-----------------------------------------------------------------------------------------------
    /* 
    while(true) // here when true then : line 2 is not work & when false line 1 is unreachable 
    {
      System.out.println("hello");.......... line 1
    }
    System.out.println("hii");.............. line 2
  */
//------------------------------------------------------------------------------------------------
  
   //--------------------------------CASE 1-------------------------------------------------------------
    /*  int a=10, b=20;  // Here compliler assume that may be a will update later somhow 
     while(a<b)
     {
      System.out.println("hello");  // cause infinite loop (not error)
     }
  System.out.println("jii"); */
//--------------------------------------------------------------------------------------------------
 

//-------------------------------------CASE 2-------------------------------------------------------
/*  final int a = 10, b=20; // here due to final it comform a will not change ,hence "hii" is unreachable  and throw an error 
  while(a<b)
  {
    System.out.println("hello");
  }
  System.out.println("hii");*/  // this will unreachable when applyed final variables 
//--------------------------------------------------------------------------------------------------



  }
}
