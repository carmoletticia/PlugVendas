
package Model;


public class Telefone {
    
    private int id;
    private int idCliente;
    private String ddd;
    private String numero;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public int getIdCliente() {return idCliente;}
    public void setIdCliente(int idCliente) {this.idCliente = idCliente;}

    public String getDdd() { return ddd; }
    public void setDdd(String ddd) { this.ddd = ddd; }
    
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    
}
