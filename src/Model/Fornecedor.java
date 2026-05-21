
package Model;

public class Fornecedor {
    
    private int id;
    private String nomeEmpresa;
    private String cnpj;
    private String contato;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNomeEmpresa() { return nomeEmpresa; }
    public void setNomeEmpresa(String nomeEmpresa) { this.nomeEmpresa = nomeEmpresa; }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getContato() { return contato; }
    public void setContato(String contato) { this.contato = contato; }
}
