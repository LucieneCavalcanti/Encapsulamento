public class App {
    public static void main(String[] args) throws Exception {
        Produto obj1 = new Produto();
        obj1.setId(1);
        obj1.setDescricao("Sabão em pó OMO");
        obj1.setEstoque(125633);
        
        System.out.println(obj1);
        Produto obj2 = new Produto();
        obj2.setDescricao("Bolo de chocolate");
        System.out.println(obj2);
        Produto obj3 = new Produto(10, 123456789, "Água com gás 500ml", 1000, 1, 3);
        System.out.println(obj3);
    }
}
