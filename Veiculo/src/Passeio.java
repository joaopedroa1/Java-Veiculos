public class Passeio extends Veiculo{
    Veiculo ajuda = new Veiculo();
    private float velocMax = ajuda.getVelMax();
    private int qtdPassageiros;

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public float getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(float velMax) {
        this.velocMax = velMax;
    }

    public void exibePassageiros(){
        System.out.println("Número de passageiros: " + qtdPassageiros);
        System.out.println("-------------------");
    }

    class Passear extends Veiculo.calcVel{
        public float velMax(){
            return getVelMax();
        }
        public int qtDpassageiros(){
            return getQtdPassageiros();
        }
    }
}
