import java.util.Date;

public class Evento {
    private String nomeEvento;
    private Date dataEvento;

    public Evento (String nome, Date dataEvento){
        this.nomeEvento = nome;
        this.dataEvento = dataEvento;
    }

    @Override
    public String toString(){
        return "Evento{nome: " + nomeEvento + "\t , data: " + dataEvento + "}";
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public Date getDataEvento() {
        return dataEvento;
    }
}
