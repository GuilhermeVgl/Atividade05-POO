package domain;

public abstract class Veiculo {
    protected int codigo;
    protected String nome;
    protected String modelo;
    protected String cor;
    protected String placa;
    protected int anoModelo;
    protected int anoFabricacao;
    protected Double pesoLiquido;
    protected Double pesoTotal;
    protected int assentos;
    protected int rodas;
    protected String fabricante;
    protected Double potencia;
    protected String tipoCombustivel;
    protected String estadoUF;
    protected String cidadeUF;
    protected String tipoVeiculo;
    protected int qtdeMotores;
    protected int qtdeOcupantes;

    

    public Veiculo(
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
        int qtdeOcupantes
        ) 
    {
        this.codigo = codigo;
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
        this.assentos = assentos;
        this.rodas = rodas;
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.estadoUF = estadoUF;
        this.cidadeUF = cidadeUF;
        this.tipoVeiculo = tipoVeiculo;
        this.qtdeMotores = qtdeMotores;
        this.qtdeOcupantes = qtdeOcupantes;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public Double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(Double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public Double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(Double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public Double getPotencia() {
        return potencia;
    }
    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public String getEstadoUF() {
        return estadoUF;
    }
    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }
    public String getCidadeUF() {
        return cidadeUF;
    }
    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    public int getQtdeMotores() {
        return qtdeMotores;
    }
    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }
}
