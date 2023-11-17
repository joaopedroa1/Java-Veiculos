import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Passeio veiculoPasseio1 = new Passeio();
        Carga veiculoCarga1 = new Carga();
        veiculoPasseio1.setMarca("Nissan");
        veiculoPasseio1.setCor("Azul Escuro");
        veiculoPasseio1.setQtdRodas(4);
        veiculoPasseio1.setModelo("March");
        veiculoPasseio1.setPlaca("ABC 1234");
        veiculoPasseio1.setVelMax(200);
        veiculoPasseio1.setQtdPassageiros(5);
        veiculoPasseio1.setPotencia(70);
        veiculoPasseio1.setPistoes(3);
        veiculoPasseio1.exibeCarroPasseio();
        veiculoPasseio1.exibePassageiros();
        veiculoCarga1.setMarca("Fiat");
        veiculoCarga1.setCor("Preto");
        veiculoCarga1.setQtdRodas(4);
        veiculoCarga1.setModelo("Strada");
        veiculoCarga1.setPlaca("ABC 123");
        veiculoCarga1.setVelMax(260);
        veiculoCarga1.setCargaMax(760);
        veiculoCarga1.setTara(1084);
        veiculoCarga1.setPotencia(188);
        veiculoCarga1.setPistoes(7);
        veiculoCarga1.exibeCarroCarga();
        veiculoCarga1.exibeCarga();
    }
}