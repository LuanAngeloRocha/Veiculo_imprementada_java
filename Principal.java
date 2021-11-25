public class Principal{
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setMarca("Volkswagem");
        carro.setModelo("golf");
        carro.setAno(2002);
        carro.setPlaca("253E541");
        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());
        System.out.println(carro.getPlaca());
    }
}