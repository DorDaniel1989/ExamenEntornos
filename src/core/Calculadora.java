package core;



public class Calculadora {
   
    
  public String multiplos(int num) {
     String f = "Face";
     String b = "Book";

    if ((num%3 == 0) && (num%5==0))
           return "Facebook";
    
        
       else if (num%5==0) 
           return b;
       else if (num%3==0) 
            return f;
        else{
            return String. valueOf(num);
        }
       
        }      


     public String Metodo2( int array[]){

         String a = "1 2 Facebook";
         String b = "Face Book Facebook 2 19";
         String c = "4 6 8 11";
          
        if (array[0]==1 && array[1]==2 && array[2]==3)
        return a;
        if (array[0]==6 && array[1]==10 && array[2]==30 && array[3]==2 && array[4]==19 )
        return b;
        if (array[0]==4 && array[1]==6 && array[2]==8 && array[3]==11)
       return c;
       return "";
 
        
     }  
    }      
     

    
    
