public class classes {
    String primeironomecli;
    String nomemeiocli;
    String ultimonomecli;
    String telefone;

    public String getnomecompleto() {
        String nomecompleto = primeironomecli+" "+nomemeiocli+" "+ultimonomecli+" - "+telefone;
        return nomecompleto;
    }

    String nomeproduto;
    String tipoproduto;
    String marcaproduto;
    String precoproduto;

    public String getprodutocompleto() {
        String produtocompleto = nomeproduto+" "+tipoproduto+" - "+marcaproduto+" - R$"+precoproduto;
        return produtocompleto;
    }

    String nomevendedor;
    String numvendedor;

    public String getvendedorcompleto() {
        String vendedorcompleto = nomevendedor+" - ID:"+numvendedor;
        return vendedorcompleto;
    }
}
