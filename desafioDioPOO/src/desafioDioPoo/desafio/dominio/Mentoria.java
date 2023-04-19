package desafioDioPoo.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends conteudo {
   
    private LocalDate data;
    
    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
     // TODO Auto-generated method stub
       return "mentoria{" + 
                    "titulo=" + getTitulo() + 
                    ", descricao=" + getDescricao() + 
                    ", data=" + data + "}";
    }

    

}
