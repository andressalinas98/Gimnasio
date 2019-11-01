/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author eandr
 */
public class Rutina extends Ejercicios {
    private int Aleatorio;
    private String TipoRutina;
    private String Ejercicio1;
    private String Ejercicio2;
    private String Ejercicio3;
    private String Ejercicio4;
    private String Ejercicio5;
    private String Ejercicio6;
    private String Ejercicio7;
    private String Ejercicio8;
    private String Ejercicio9;
    private String Peso1;
    private String Peso2;
    private String Peso3;
    private String Repeticiones1;
    private String Repeticiones2;
    private String Repeticiones3;
    
    Repeticiones CantidadR = new Repeticiones();
    Peso CantidadP = new Peso();
    
    public int CrearAleatorio(){
        Aleatorio = (int) ((Math.random() * 4) );
        return Aleatorio;
    }
    public void RutinaDias(String var){
        switch(var){
            case "Ganar":
                CrearAleatorio();
                Ejercicio1=Calentamiento[Aleatorio];
                CrearAleatorio();
                Ejercicio2=Biceps[Aleatorio];
                CrearAleatorio();
                Ejercicio3=Triceps[Aleatorio];
                CrearAleatorio();
                Ejercicio4=Pecho[Aleatorio];
                CrearAleatorio();
                Ejercicio5=Abdominales[Aleatorio];
                CrearAleatorio();
                Ejercicio6=Piernas[Aleatorio];
                CrearAleatorio();
                Ejercicio7=Gluteos[Aleatorio];
                CrearAleatorio();
                Ejercicio8=Espalda[Aleatorio];
                CrearAleatorio();
                Ejercicio9=Hombros[Aleatorio];
                CrearAleatorio();
                Peso1=CantidadP.PesoSubir[Aleatorio];
                CrearAleatorio();
                Peso2=CantidadP.PesoSubir[Aleatorio];
                CrearAleatorio();
                Peso3=CantidadP.PesoSubir[Aleatorio];
                CrearAleatorio();
                Repeticiones1=CantidadR.RepeticionesSubir[Aleatorio];
                CrearAleatorio();
                Repeticiones2=CantidadR.RepeticionesSubir[Aleatorio];
                CrearAleatorio();
                Repeticiones3=CantidadR.RepeticionesSubir[Aleatorio];
                break;
            case "Perder":
                CrearAleatorio();
                Ejercicio1=Calentamiento[Aleatorio];
                CrearAleatorio();
                Ejercicio2=Biceps[Aleatorio];
                CrearAleatorio();
                Ejercicio3=Triceps[Aleatorio];
                CrearAleatorio();
                Ejercicio4=Pecho[Aleatorio];
                CrearAleatorio();
                Ejercicio5=Abdominales[Aleatorio];
                CrearAleatorio();
                Ejercicio6=Piernas[Aleatorio];
                CrearAleatorio();
                Ejercicio7=Gluteos[Aleatorio];
                CrearAleatorio();
                Ejercicio8=Espalda[Aleatorio];
                CrearAleatorio();
                Ejercicio9=Hombros[Aleatorio];
                CrearAleatorio();
                Peso1=CantidadP.PesoBajar[Aleatorio];
                CrearAleatorio();
                Peso2=CantidadP.PesoBajar[Aleatorio];
                CrearAleatorio();
                Peso3=CantidadP.PesoBajar[Aleatorio];
                CrearAleatorio();
                Repeticiones1=CantidadR.RepeticionesBajar[Aleatorio];
                CrearAleatorio();
                Repeticiones2=CantidadR.RepeticionesBajar[Aleatorio];
                CrearAleatorio();
                Repeticiones3=CantidadR.RepeticionesBajar[Aleatorio];
                break;
        }
        }        

    public String getTipoRutina() {
        return TipoRutina;
    }

    public void setTipoRutina(String TipoRutina) {
        this.TipoRutina = TipoRutina;
    }

    public String getEjercicio1() {
        return Ejercicio1;
    }

    public void setEjercicio1(String Ejercicio1) {
        this.Ejercicio1 = Ejercicio1;
    }

    public String getEjercicio2() {
        return Ejercicio2;
    }

    public void setEjercicio2(String Ejercicio2) {
        this.Ejercicio2 = Ejercicio2;
    }

    public String getEjercicio3() {
        return Ejercicio3;
    }

    public void setEjercicio3(String Ejercicio3) {
        this.Ejercicio3 = Ejercicio3;
    }

    public String getEjercicio4() {
        return Ejercicio4;
    }

    public void setEjercicio4(String Ejercicio4) {
        this.Ejercicio4 = Ejercicio4;
    }

    public String getEjercicio5() {
        return Ejercicio5;
    }

    public void setEjercicio5(String Ejercicio5) {
        this.Ejercicio5 = Ejercicio5;
    }

    public String getEjercicio6() {
        return Ejercicio6;
    }

    public void setEjercicio6(String Ejercicio6) {
        this.Ejercicio6 = Ejercicio6;
    }

    public String getEjercicio7() {
        return Ejercicio7;
    }

    public void setEjercicio7(String Ejercicio7) {
        this.Ejercicio7 = Ejercicio7;
    }

    public String getEjercicio8() {
        return Ejercicio8;
    }

    public void setEjercicio8(String Ejercicio8) {
        this.Ejercicio8 = Ejercicio8;
    }

    public String getEjercicio9() {
        return Ejercicio9;
    }

    public void setEjercicio9(String Ejercicio9) {
        this.Ejercicio9 = Ejercicio9;
    }

    public String getPeso1() {
        return Peso1;
    }

    public void setPeso1(String Peso1) {
        this.Peso1 = Peso1;
    }

    public String getPeso2() {
        return Peso2;
    }

    public void setPeso2(String Peso2) {
        this.Peso2 = Peso2;
    }

    public String getPeso3() {
        return Peso3;
    }

    public void setPeso3(String Peso3) {
        this.Peso3 = Peso3;
    }

    public String getRepeticiones1() {
        return Repeticiones1;
    }

    public void setRepeticiones1(String Repeticiones1) {
        this.Repeticiones1 = Repeticiones1;
    }

    public String getRepeticiones2() {
        return Repeticiones2;
    }

    public void setRepeticiones2(String Repeticiones2) {
        this.Repeticiones2 = Repeticiones2;
    }

    public String getRepeticiones3() {
        return Repeticiones3;
    }

    public void setRepeticiones3(String Repeticiones3) {
        this.Repeticiones3 = Repeticiones3;
    }

    public Repeticiones getCantidadR() {
        return CantidadR;
    }

    public void setCantidadR(Repeticiones CantidadR) {
        this.CantidadR = CantidadR;
    }

    public Peso getCantidadP() {
        return CantidadP;
    }

    public void setCantidadP(Peso CantidadP) {
        this.CantidadP = CantidadP;
    }
    
  
  
    
}
