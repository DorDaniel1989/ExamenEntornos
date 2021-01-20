
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import core.Calculadora;

class ComprobarMultiplos {
    @Test
    @DisplayName("comprobar multiplos 5 y 3")
    void multiplo5y3() {
        Calculadora cal = new Calculadora();
        String resultado = cal.multiplos(15);    
        assertEquals("Facebook", resultado);
        
        
     }   
     @Test
     @DisplayName("comprobar multiplos 5")
     void multiplo5() {
         Calculadora cal = new Calculadora();
         String resultado = cal.multiplos(25);    
         assertEquals("Book", resultado);
      }   
      @Test
     @DisplayName("comprobar multiplos  3")
     void multiplo3() {
         Calculadora cal = new Calculadora();
         String resultado = cal.multiplos(9);    
         assertEquals("Face", resultado);
      }   
     @Test
     @DisplayName("comprobar multiplos de nada")
     void multiploDeNada() {
         Calculadora cal = new Calculadora();
         String resultado = cal.multiplos(7);    
         assertEquals("7", resultado);
      }   

      @Test
     @DisplayName("comprobar primer array")
     void String1() {
        int array []= {1,2,3};
         Calculadora cal = new Calculadora();
         String resultado = cal.Metodo2(array);    
         assertEquals("1 2 Facebook", resultado);
      }   

      @Test
      @DisplayName("comprobar segundo array")
      void String2() {
        int array1 []= {6,10,30,2,19};
          Calculadora cal = new Calculadora();
          String resultado = cal.Metodo2(array1);    
          assertEquals("Face Book Facebook 2 19", resultado);
       }  

       @Test
       @DisplayName("comprobar tercer array")
       void String3() {
           int array2 []= {4,6,8,11};
           Calculadora cal = new Calculadora();
           String resultado = cal.Metodo2(array2);    
           assertEquals("4 6 8 11", resultado);
        }  
         
         
         
         
   
 }
    

    


    
    
