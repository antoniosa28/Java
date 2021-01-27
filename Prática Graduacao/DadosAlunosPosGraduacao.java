import java.util.*;
import Persistencia.*;
import EntradaDeDados.*;
public class DadosAlunosPosGraduacao extends AlunoPosGraduacao
{
    private static ArrayList<AlunoPosGraduacao> alunos = new ArrayList<AlunoPosGraduacao>();
    
        public void cadastrar(AlunoPosGraduacao a){
            this.alunos.add(a);
            System.out.println("Total de Alunos PosGrad. inseridos...: ");
            System.out.println(this.alunos.size());
            boolean r = Persist.gravar(alunos, "alunosPG.dat");
        }
        
        public void listar(){
                        for (AlunoPosGraduacao objeto: this.alunos) {
                                   objeto.mostrarDados();  
                                 //todo mostrarDados() ja¡ implementado na pratica anterior
                                }
                            }
                            
        public AlunoPosGraduacao buscar(String matricula)  {
            AlunoPosGraduacao a = null;
                  for ( AlunoPosGraduacao objeto: this.alunos)  {                        
                      if (objeto.getMatricula().equals(matricula))  {
                       a = objeto;
                       break;   
                                     }
                               }
            return a;                        
                          }
        public boolean excluir(String matricula){
            AlunoPosGraduacao a = this.buscar(matricula);
                if (a != null)  {
                this.alunos.remove(a);
                return true;
              }
                else {
                    return false;
                       }
                   }
                   static{
        alunos = (ArrayList<AlunoPosGraduacao>)Persist.recuperar("alunosPG.dat"); 
        if (alunos == null)
            alunos = new ArrayList<AlunoPosGraduacao>();
    }    
}