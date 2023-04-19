package desafioDioPoo.desafio.dominio;

public class Curso extends conteudo {
   
    private int cargaHoraria;

    @Override
public double calcularXP() {
    
    return XP_PADRAO * cargaHoraria;    
}

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
@Override
public String toString() {
    // TODO Auto-generated method stub
    return "curos{" + 
            "titulo=" + getTitulo() + 
            ", descricao=" + getDescricao() + 
            ", carga horaria=" + cargaHoraria + "}";
 }


}
