public class Carga extends Veiculo{
    private int tara;
    private int cargaMax;


    public void setTara(int tara) {
        this.tara = tara;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    class carregamento extends Veiculo.calcVel{
        public float velMax(){
            return 0;
        }
        public int cargaMax(){
            return getCargaMax();
        }
        public int tara (){
            return getTara();
        }
    }
    public void exibeCarga(){
        System.out.println("Taras: "+ getTara());
        System.out.println("Carga máxima: "+getCargaMax());
        System.out.println("-------------------");
    }
}
