package domain;

public class Caminhao extends Veiculo {

    private String chassi;
    private int eixos;
    private int portas;
    private String codigoRenavam;
    private String nomeProprietario;

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public Caminhao(
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
        String chassi,
        int eixos,
        int portas,
        String codigoRenavam,
        String nomeProprietario
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
        this.chassi = chassi;
        this.eixos = eixos;
        this.portas = portas;
        this.codigoRenavam = codigoRenavam;
        this.nomeProprietario = nomeProprietario;
        //TODO Auto-generated constructor stub
    }
}
