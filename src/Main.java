//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produtos produtos = new Produtos();

        //Aqui inclui os Settlers cadastrados na classe Produtos

        produtos.setProduto("Bicicleta");
        produtos.setValor(1199.99f);
        produtos.setCodigo(15);

        //Aqui faco o println dos dados utilizando Gettlers

        System.out.println(produtos.getProduto());
        System.out.println(produtos.getValor());
        System.out.println(produtos.getCodigo());
        System.out.println(produtos.getCadastro());



    }
}