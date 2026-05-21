
package Model;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private Endereco endereco;
    private Telefone telefone;

    public Cliente() {}

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
       public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    
    public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }

    public Telefone getTelefone() { return telefone; }
    public void setTelefone(Telefone telefone) { this.telefone = telefone; }
    
}
