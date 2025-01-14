package poo;

public class Veiculo {
    //Atributos
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double preço;
    private boolean ligado;
    
    // Construtor
    public Veiculo (String marca, String modelo, int ano, String cor, double preço) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preço = preço;
    }
    
    // Método para exibir informações sobre veículo
    public void exibirInformacoes() {
        System.out.println("\n===============");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Preço: R$" + preço);
        System.out.println("Ligado: " + ligado);
        System.out.println("===============\n");    
    }
    
    // Método para ligar o veículo (apenas um exemplo, pode ser personalizado)
    public void ligar () {
        this.ligado = true;
        System.out.println("O veículo está ligado.");
    }
    
    // Método para desligar o veículo (apenas um exemplo, pode ser personalizado)
    public void desligar () {
        this.ligado = false;
        System.out.println("O veículo está desligado.");
    }
    
    public static void main (String[] args) {
        // Exemplo de uso de classe Veículo
        Veiculo meuCarro = new Veiculo("Toyota", "Corolla", 2022, "Prata", 75000.00);
        meuCarro.exibirInformacoes();
        meuCarro.ligar();
        meuCarro.exibirInformacoes();
        meuCarro.desligar();
        meuCarro.exibirInformacoes();
    }
}
