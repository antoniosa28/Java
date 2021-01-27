import java.util.*;
import Persistencia.*;
import EntradaDeDados.*;
public class DadosAlunosGraduacao extends AlunoGraduacao
{
    private static ArrayList<AlunoGraduacao> alunos = new ArrayList<AlunoGraduacao>();
    
        public static void cadastrar(AlunoGraduacao a){
            alunos.add(a);
            System.out.println("Total de Alunos Grad. inseridos...: ");
            System.out.println(alunos.size());
            boolean r = Persist.gravar(alunos, "alunosG.dat");
        }
        
        public static void listar(){
                        for (AlunoGraduacao a: alunos) {
                                   a.mostrarDados();  
                                 //todo mostrarDados() ja¡ implementado na pratica anterior
                                }
                            }
                            
        public static AlunoGraduacao buscar(String matricula)  {
            AlunoGraduacao a = null;
                  for ( AlunoGraduacao objeto: alunos)  {                        
                      if (objeto.getMatricula().equals(matricula))  {
                       a = objeto;
                       break;   
                                     }
                               }
            return a;                        
                          }
        public static boolean excluir(String matricula){
            AlunoGraduacao a = buscar(matricula);
                if (a != null)  {
                alunos.remove(a);
                return true;
              }
                else {
                    return false;
                       }
                   }
        
        static{
            alunos = (ArrayList<AlunoGraduacao>)Persist.recuperar("alunosG.dat"); 
            if (alunos == null)
            alunos = new ArrayList<AlunoGraduacao>();
        }    
}
