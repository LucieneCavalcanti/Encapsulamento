public class Perecivel extends Produto{
    private String dataValidade;
    private String armazenamento;
    
    public String toString(){
        /*return "Id:"+getId()+"\nDescrição:"+getDescricao() + "\nCódigo de barras:"+getCodigoBarras() + "\nEstoque:"+getEstoque()
        +"\nData Validade:"+dataValidade + "\nArmazenamento:"+armazenamento;
        */
        return super.toString() +"\nData Validade:"+dataValidade + "\nArmazenamento:"+armazenamento;
    }
    public Perecivel() {
        super();
        dataValidade = new String();
        armazenamento = new String();
    }
    
    public Perecivel(int id, long codigoBarras, String descricao, float estoque, float precoCusto, float precoVenda, String dataValidade, String armazenamento) {
        super(id, codigoBarras, descricao, estoque, precoCusto, precoVenda);
        this.dataValidade = dataValidade;
        this.armazenamento = armazenamento;
    }

    public String getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    public String getArmazenamento() {
        return armazenamento;
    }
    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }
    
}
