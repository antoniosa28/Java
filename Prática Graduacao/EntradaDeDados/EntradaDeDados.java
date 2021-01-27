package EntradaDeDados;
import java.util.*;
public  class EntradaDeDados
{   
    double d;
    int i;
    public static int lerInteiro(int i){
        while (true){
            try {
                Scanner s= new Scanner(System.in);
                i = s.nextInt();
                System.out.println("OK!");
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Erro: "+e.toString());
                System.out.println("Digite novamente.");
            }
            
        }
        return i;
    }
    public static double lerDouble(double d){
        while (true){
            try {
                Scanner s= new Scanner(System.in);
                d = s.nextInt();
                System.out.println("OK!");
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Erro: "+e.toString());
                System.out.println("Digite novamente.");
            }
            
        }
        return d;
    }
   
}