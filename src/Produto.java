public class Produto{
    private int id;
    private long codigoBarras;
    private String descricao;
    private float estoque;
    private float precoCusto;
    private float precoVenda;
    //construtor sem parâmetros / nulo
    public Produto() {
        id=0;
        descricao=new String();
        codigoBarras=0;
        estoque=0;
        precoCusto=0;
        precoVenda=0;
    }
    //construtor com parâmetros
    public Produto(int id, long codigoBarras, String descricao, float estoque, float precoCusto, float precoVenda) {
        this.id = id;
        this.codigoBarras = codigoBarras;
        this.descricao = descricao;
        this.estoque = estoque;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public int getId() { 
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public long getCodigoBarras() {
        return codigoBarras;
    }
    public void setCodigoBarras(long codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public float getEstoque() {
        return estoque;
    }
    public void setEstoque(float estoque) {
        this.estoque = estoque;
    }
    public float getPrecoCusto() {
        return precoCusto;
    }
    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }
    public float getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }
    //sobrescrita
    public String toString(){
        return "Id:"+id+"\nDescrição:"+descricao + "\nCódigo de barras:"+codigoBarras + "\nEstoque:"+estoque;
    }
    
}