package classes;

import static java.lang.Math.log;

public class AnaliseLinear {
    public float resistorSerie(float r1, float r2){
        return r1 + r2;        
    }
    
    public float resistorParalelo(float r1, float r2){
        return (r1*r2)/(r1+r2);
    }
    
    public float quedaTensao(float tensao, float r1, float req){
        return (tensao * (r1/req));
    }
    
    public float tensaoThevenin(float tensao, float r1, float r2){
        return (this.quedaTensao(tensao, r1, this.resistorSerie(r1, r2)));
    }
    
    public float resistenciaThevenin(float r1, float r2){
        return (this.resistorParalelo(r1, r2));
    }
    
    public float leiDeOhm(float v, float r, float i){
        //aqui verifica-se o que está faltando para se fazer a conta
        if(v == 0){
            return r * i;
        }
        else if(i == 0){
            return v/r;
        }
        else if(r == 0){
            return v/i;
        }
        else{
            return 0;
        }
    }
    
    public float calcularGanho(float vout, float vin){
        return (float)(20 * Math.log10(vout/vin));
    }
}
