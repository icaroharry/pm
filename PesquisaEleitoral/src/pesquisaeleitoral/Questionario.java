package pesquisaeleitoral;

public class Questionario {
    private int id;
    private String nomeCandidato;
    private char sexoEleitor;
    private int escolaridadeEleitor;
    private int faixaDeIdadeEleitor;
    private int faixaSalarialEleitor;

    public int getEscolaridadeEleitor() {
        return escolaridadeEleitor;
    }

    public void setEscolaridadeEleitor(int escolaridadeEleitor) {
        this.escolaridadeEleitor = escolaridadeEleitor;
    }

    public int getFaixaDeIdadeEleitor() {
        return faixaDeIdadeEleitor;
    }

    public void setFaixaDeIdadeEleitor(int faixaDeIdadeEleitor) {
        this.faixaDeIdadeEleitor = faixaDeIdadeEleitor;
    }

    public int getFaixaSalarialEleitor() {
        return faixaSalarialEleitor;
    }

    public void setFaixaSalarialEleitor(int faixaSalarialEleitor) {
        this.faixaSalarialEleitor = faixaSalarialEleitor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public char getSexoEleitor() {
        return sexoEleitor;
    }

    public void setSexoEleitor(char sexoEleitor) {
        this.sexoEleitor = sexoEleitor;
    }

    @Override
    public String toString() {
        return "Questionario{" + "id=" + id + "nomeCandidato=" + nomeCandidato + "sexoEleitor=" + sexoEleitor + "escolaridadeEleitor=" + escolaridadeEleitor + "faixaDeIdadeEleitor=" + faixaDeIdadeEleitor + "faixaSalarialEleitor=" + faixaSalarialEleitor + '}';
    }
}
