package pesquisaeleitoral;

import java.util.ArrayList;
import java.util.List;
import pesquisaeleitoral.Questionario;

public class Repositorio {
    private int numQuestionarios = 0;
    List<Questionario> questionarios;

    public Repositorio() {
    this.questionarios = new ArrayList<Questionario>();
    }

    public void printQuestionarios() {
        for(int i = 0; i < questionarios.length; i++) {
            this.questionarios[i].toString();
        }
    }

    public void addQuestionario(Questionario q) {

    }
}
