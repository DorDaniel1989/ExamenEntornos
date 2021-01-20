
import core.Calculadora;


 public class app {
    public static void main(String[] args){
       

        Calculadora cal = new Calculadora();  
       
         int array []= {1,2,3};
         int array1 []= {6,10,30,2,19};
         int array2 []= {4,6,8,11};

        System.out.println("1- " + cal.multiplos(5));
        System.out.println("2- " + cal.multiplos(9));
        System.out.println("3- " + cal.multiplos(15));

        System.out.println("4- " + cal.Metodo2(array));
        System.out.println("4- " + cal.Metodo2(array1));
        System.out.println("4- " + cal.Metodo2(array2));
       
    }
 
}
