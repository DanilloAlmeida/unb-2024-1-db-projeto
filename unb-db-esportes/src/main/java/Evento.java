public class Evento {
    private String nomeEvento;
    private String dataEvento;

    public Evento (String nome, String dataEvento){
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

    public String getDataEvento() {
        return dataEvento;
    }
}
