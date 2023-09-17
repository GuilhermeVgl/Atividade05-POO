package domain;

public class Aviao extends Veiculo {

    private int portas;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public Aviao(
        int codigo, 
        String nome, 
        String modelo, 
        String cor, 
        String placa, 
        int anoModelo, 
        int anoFabricacao,
        Double pesoLiquido, 
        Double pesoTotal, 
        int assentos, 
        int rodas, 
        String fabricante, 
        Double potencia,
        String tipoCombustivel, 
        String estadoUF, 
        String cidadeUF, 
        String tipoVeiculo, 
        int qtdeMotores,
        int qtdeOcupantes,
        int portas
        ) 
    {
        super(
        codigo, 
        nome, 
        modelo, 
        cor,
        placa, 
        anoModelo, 
        anoFabricacao, 
        pesoLiquido, 
        pesoTotal, 
        assentos, 
        rodas, 
        fabricante,
        potencia, 
        tipoCombustivel, 
        estadoUF, 
        cidadeUF, 
        tipoVeiculo, 
        qtdeMotores, 
        qtdeOcupantes);
        this.portas = portas;
        //TODO Auto-generated constructor stub
    }
    
}
