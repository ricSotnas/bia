/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ricardo
 */
public class ModeloProfissional {
    
    //private int idProfissional;
    private String CRM;
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String bairro;
    private String cidade;
    private String cep;
    private String tel_fixo;
    private int cargo;
    private java.sql.Timestamp dt_cadastro;
    private String tel_celular;
    private String orgao_exp;
    private String uf;
    private int sexo;

    /**
     * @return the idProfissional
     */
   /* public int getIdProfissional() {
        return idProfissional;
    }

    /**
     * @param idProfissional the idProfissional to set
     */
   /* public void setIdProfissional(int idProfissional) {
        this.idProfissional = idProfissional;
    }
*/
    /**
     * @return the CRM
     */
    public String getCRM() {
        return CRM;
    }

    /**
     * @param CRM the CRM to set
     */
    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the tel_fixo
     */
    public String getTel_fixo() {
        return tel_fixo;
    }

    /**
     * @param tel_fixo the tel_fixo to set
     */
    public void setTel_fixo(String tel_fixo) {
        this.tel_fixo = tel_fixo;
    }

    /**
     * @return the cargo
     */
    public int getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the dt_cadastro
     */
    public java.sql.Timestamp getDt_cadastro() {
        return dt_cadastro;
    }

    /**
     * @param dt_cadastro the dt_cadastro to set
     */
    public void setDt_cadastro(java.sql.Timestamp dt_cadastro) {
        this.dt_cadastro = dt_cadastro;
    }

    /**
     * @return the tel_celular
     */
    public String getTel_celular() {
        return tel_celular;
    }

    /**
     * @param tel_celular the tel_celular to set
     */
    public void setTel_celular(String tel_celular) {
        this.tel_celular = tel_celular;
    }

    /**
     * @return the orgao_exp
     */
    public String getOrgao_exp() {
        return orgao_exp;
    }

    /**
     * @param orgao_exp the orgao_exp to set
     */
    public void setOrgao_exp(String orgao_exp) {
        this.orgao_exp = orgao_exp;
    }

    /**
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * @return the sexo
     */
    public int getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
      
}
