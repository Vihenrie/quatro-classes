public class loja {
    public static void main(String[] args) {
        classes venda1 = new classes();
            venda1.primeironomecli = "vincius";
            venda1.nomemeiocli = "Henrique Santos";
            venda1.ultimonomecli = "Pinto";
            venda1.telefone = "(14) 98811-1265";

            venda1.nomeproduto = "Teclado";
            venda1.tipoproduto = "Perifericos computacionais";
            venda1.marcaproduto = "Redragon";
            venda1.precoproduto = "320,00";

            venda1.nomevendedor = "Abner";
            venda1.numvendedor = "5";

                System.out.println("==========================================================================================");
            System.out.println("Quem comprou: "+venda1.getnomecompleto());
                System.out.println("==========================================================================================");
            System.out.println("O que comprou: "+venda1.getprodutocompleto());
                System.out.println("==========================================================================================");
            System.out.println("Quem vendeu: "+venda1.getvendedorcompleto());
                System.out.println("==========================================================================================");

    }
}
