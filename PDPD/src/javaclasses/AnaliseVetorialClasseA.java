package javaclasses;

/*
 * @author dimitri
 */
public class AnaliseVetorialClasseA {

    //TODOS OS VETORES TEM 2 POSIÇÕES
    //A POSIÇÃO 0 É A MAGNITUDE DO SINAL
    //A POSIÇÃO 1 É O ANGULO EM RADIANOS
    public float[] reatanciaCapacitiva(float c, float f) {
        float xc[] = new float[2];
        xc[0] = (float) (1 / (2 * Math.PI * f * c));
        xc[1] = (float) (-Math.PI / 2);
        return xc;
    }

    public float[] impedanciaSerie(float[] r1, float[] r2) {
        //recebo os dois elementos resistivos na forma polar
        //é necessário achar a forma retangular, somar x com x e y com y para depois passar pra polar de novo
        r1 = formaRetangular(r1);
        r2 = formaRetangular(r2);
        
        //r1 vai ser a impedancia
        r1[0] = r1[0] + r2[0];
        r1[1] = r1[1] + r2[1];
        
        r1 = formaPolar(r1);
        
        return r1;
    }
    
    public float[] impedanciaParalelo(float[] r1, float[] r2){
        //multiplicação pela soma
        float numerador[] = new float[2];
        float denominador[] = new float[2];
        float resultado[] = new float[2];
        
        //no numerador é uma multiplicação
        numerador = this.multiplicar(r1, r2);
        
        //no denominador é uma soma, ou seja, uma impedancia seŕie
        denominador = impedanciaSerie(r1, r2);
        
        //resultado é uma divisão, portanto, dividir as magnitudes e subtrair os angulos
        resultado = this.dividir(numerador, denominador);
        
        return resultado;
    }

    public float[] formaRetangular(float[] a) {
        float eixox = (float) (a[0] * Math.cos(a[1]));
        float eixoy = (float) (a[0] * Math.sin(a[1]));

        float retangular[] = new float[2];
        retangular[0] = eixox;
        retangular[1] = eixoy;

        return retangular;
    }
    
    public float[] formaPolar(float[] a){
        float magnitude = (float) (Math.sqrt(Math.pow(a[0], 2) + Math.pow(a[1], 2)));
        float angulo = (float)(Math.atan(a[1]/a[0]));
        
        float polar[] = new float[2];
        polar[0] = magnitude;
        polar[1] = angulo;
        
        return polar;
    }
    
    public float[] multiplicar(float[] a, float[] b){
        float resultado[] = new float[2];
        resultado[0] = a[0] * b[0];
        resultado[1] = a[1] + b[1];
        return resultado;
    }
    
    public float[] dividir(float[] a, float[] b){
        float resultado[] = new float[2];
        resultado[0] = a[0] / b[0];
        resultado[1] = a[1] - b[1];
        return resultado;
    }
}
