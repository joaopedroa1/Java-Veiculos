
public class Veiculo {
    private String placa= " ";
    private String marca = " ";
    private String modelo = " ";
    private String cor = " ";
    private float velMax = 0;
    private int qtdRodas = 0;

    Motor motor = new Motor();
    private int potencia = motor.getPotencia();
    private int pistoes = motor.getQtdPist();

    //Getters

    public int getPotencia() {
        return potencia;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public float getVelMax() {
        return velMax;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    //Setters

    public void setPistoes(int pistoes) {
        this.pistoes = pistoes;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setVelMax(float velMax) {
        this.velMax = velMax;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    abstract static class calcVel{
       abstract float velMax();
       public int qtDpassageiros(){
           return 0;
        }
        public int cargaMax(){
           return 0;
        }
        public int tara(){
           return 0;
        }
    }

    public void exibeCarroPasseio(){
        System.out.println("-------------------");
        System.out.println("Cor do carro: " + cor);
        System.out.println("Placa do carro: " + placa);
        System.out.println("Número de rodas: "+ qtdRodas);
        System.out.println("Velocidade máxima: " + velMax + " Km/h");
        System.out.println("Marca do carro: " + marca);
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Número de pistões: " + pistoes);
        System.out.println("Potência: "+ potencia + " cavalos");
    }
    public void exibeCarroCarga(){
        System.out.println("-------------------");
        System.out.println("Cor do carro: " + cor);
        System.out.println("Placa do carro: " + placa);
        System.out.println("Número de rodas: "+ qtdRodas);
        System.out.println("Velocidade máxima: " + velMax + " Km/h");
        System.out.println("Marca do carro: " + marca);
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Número de pistões: " + pistoes);
        System.out.println("Potência: "+ potencia + " cavalos");
    }
}


