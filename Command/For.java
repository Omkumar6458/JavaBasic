package Command;

public class For {
  public static void main(String[] arg)
  {
//--------------------------------------------------------------
    /* // no error just print : hello and 3 time kya..

    int i=0;
    for( System.out.println("hello"); i<3;i++)
    {
      System.out.println("kya..");
    }    */
//--------------------------------------------------------------



// no error print hello 1 time and hii 3 times
/* 
 int i=0;
 for(System.out.println("hello"); i<3; System.out.println("hii"))
 {
  i++;
 }*/
//---------------------------------------------------------------

/* 
  for(; ;)   // infine loop 
  {
    System.out.println("yes!");
  }
*/
//---------------------------------------------------------------------------------------------------------

/* 
    int x =10;
    L1:
    {
      System.out.println("hello");
      if (x==10)
          break L1;
      
        System.out.println("hii");
    }
    System.out.println("welcome !");
  
*/
//----------------------------------------------------------------------------------------------------------------------
    /*
    int y=1;
      System.out.println("hello");
      while(true)
      {
      if (y ==1)
         break;
        System.out.println("hii");
      }
    System.out.println("welcome !");
  }  */
  //------------------------------------------------------------------------------------------------------------------------



//-----------------------------------------------------------------------------------------------------------------------------------------

// it execute normally as hii and wecome are outside the while loop
/* 
   int y=1;
      System.out.println("hello");
     while(true)
      if(y ==1)
      break;  // if we remove break then it goea to infinite loop and ("welcome not get reach ")
        System.out.println("hii");
      
    System.out.println("welcome !");  */
//------------------------------------------------------------------------------------------------------------------------------------------




// without loop apply break cause error
/* 
int x=10;
if(x==10)
 break;
 System.out.println("hello");   */

 //-----------------------------------------------------------------------------------

/* 
  int x=10;
  if(x==10);
    continue;
    System.out.println("okey");
*/








}



  



}
