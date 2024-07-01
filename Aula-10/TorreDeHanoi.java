public class TorreDeHanoi {

    private  long contadorMovimentos = 0;

    public long getContadorMovimentos() {
        return contadorMovimentos;
    }
    
    public void moverDiscos(int disco, int pinoOrigem, int pinoDestino, int pinoAuxiliar) {
        if (disco == 1) {
            
            contadorMovimentos++;
            return;
        }

        moverDiscos(disco - 1, pinoOrigem, pinoAuxiliar, pinoDestino);//recursão para mover os discos menores que o disco atual 
                                                                      //Usando o pino final como auxiliar 
        contadorMovimentos++;
        moverDiscos(disco - 1, pinoAuxiliar, pinoDestino, pinoOrigem);//recussão para mover novamentes os discos do auxiliar para o final
    }

    
}
