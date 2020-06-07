package www.student.com.hn.models


import www.student.com.hn.controllers.MainActivity
import android.app.AlertDialog


class CalculatorModel {
    //contantes de operaciones
    val none = 0;
    val suma = 1;
    val resta = 2;
    val multi = 3;
    val divi = 4;

    //estado del la calculadora
    var display: Double = 0.0;
    var operando1: Double = 0.0;
    var operando2: Double = 0.0;
    var operacion: Int = 0;
    var willClear = false;
    var message:String = "match ERROR";
    var caracter:Char = ' ';


    //metodos para manipular el estado

    fun delPressed(){
        display = 0.0;
        operando1 = 0.0;
        operando2 = 0.0;
        operacion = 0;
        willClear = false;
    }
    fun ceroPressed(){

        val local: Double = 0.0;
        if(operacion == none && willClear == true){
            willClear = false;
            display = 0.0;
            display = digitize(display, local);

        }
        else if(operacion == none){
            display = digitize(display, local);
        }
        if(operacion == suma || operacion == resta || operacion == multi || operacion == divi){
            if(willClear == true){
                willClear = false;
                operando1 = display;
                display = local;
            }
            else{
                display = digitize(display, local)
            }
        }
    }
    fun onePressed(){
        var local: Double = 1.0;

        if(operacion == none && willClear == true){
            willClear = false;
            display = 0.0;
            display = digitize(display, local);

        }
        else if(operacion == none){
            display = digitize(display, local);
        }

        if(operacion == suma || operacion == resta || operacion == multi || operacion == divi){
            if(willClear == true){
                willClear = false;
                operando1 = display;
                display = local;
            }
            else{
                display = digitize(display, local)
            }
        }

    }
    fun twoPressed(){
        val local: Double = 2.0;
        if(operacion == none && willClear == true){
            willClear = false;
            display = 0.0;
            display = digitize(display, local);

        }
        else if(operacion == none){
            display = digitize(display, local);
        }
        if(operacion == suma || operacion == resta || operacion == multi || operacion == divi){
            if(willClear == true){
                willClear = false;
                operando1 = display;
                display = local;
            }
            else{
                display = digitize(display, local)
            }
        }

    }
    fun threePressed(){
        val local: Double = 3.0;
        if(operacion == none && willClear == true){
            willClear = false;
            display = 0.0;
            display = digitize(display, local);

        }
        else if(operacion == none){
            display = digitize(display, local);
        }
        if(operacion == suma || operacion == resta || operacion == multi || operacion == divi){
            if(willClear == true){
                willClear = false;
                operando1 = display;
                display = local;
            }
            else{
                display = digitize(display, local)
            }
        }

    }
    fun fourPressed(){
        val local: Double = 4.0;
        if(operacion == none && willClear == true){
            willClear = false;
            display = 0.0;
            display = digitize(display, local);

        }
        else if(operacion == none){
            display = digitize(display, local);
        }
        if(operacion == suma || operacion == resta || operacion == multi || operacion == divi){
            if(willClear == true){
                willClear = false;
                operando1 = display;
                display = local;
            }
            else{
                display = digitize(display, local)
            }
        }
    }
    fun fivePressed(){
        val local: Double = 5.0;
        if(operacion == none && willClear == true){
            willClear = false;
            display = 0.0;
            display = digitize(display, local);

        }
        else if(operacion == none){
            display = digitize(display, local);
        }
        if(operacion == suma || operacion == resta || operacion == multi || operacion == divi){
            if(willClear == true){
                willClear = false;
                operando1 = display;
                display = local;
            }
            else{
                display = digitize(display, local)
            }
        }
    }
    fun sixPressed(){
        val local: Double = 6.0;
        if(operacion == none && willClear == true){
            willClear = false;
            display = 0.0;
            display = digitize(display, local);
        }
        else if(operacion == none){
            display = digitize(display, local);
        }
        if(operacion == suma || operacion == resta || operacion == multi || operacion == divi){
            if(willClear == true){
                willClear = false;
                operando1 = display;
                display = local;
            }
            else{
                display = digitize(display, local)
            }
        }
    }
    fun sevenPressed(){
        val local: Double = 7.0;
        if(operacion == none && willClear == true){
            willClear = false;
            display = 0.0;
            display = digitize(display, local);
        }
        else if(operacion == none){
            display = digitize(display, local);
        }
        if(operacion == suma || operacion == resta || operacion == multi || operacion == divi){
            if(willClear == true){
                willClear = false;
                operando1 = display;
                display = local;
            }
            else{
                display = digitize(display, local)
            }
        }
    }
    fun eightPressed(){
        val local: Double = 8.0;
        if(operacion == none && willClear == true){
            willClear = false;
            display = 0.0;
            display = digitize(display, local);
        }
        else if(operacion == none){
            display = digitize(display, local);
        }
        if(operacion == suma || operacion == resta || operacion == multi || operacion == divi){
            if(willClear == true){
                willClear = false;
                operando1 = display;
                display = local;
            }
            else{
                display = digitize(display, local)
            }
        }
    }
    fun ninePressed(){
        val local: Double = 9.0;
        if(operacion == none && willClear == true){
            willClear = false;
            display = 0.0;
            display = digitize(display, local);
        }
        else if(operacion == none){
            display = digitize(display, local);
        }
        if(operacion == suma || operacion == resta || operacion == multi || operacion == divi){
            if(willClear == true){
                willClear = false;
                operando1 = display;
                display = local;
            }
            else{
                display = digitize(display, local)
            }
        }
    }

    fun sumPressed(){
        operacion = suma;
        willClear = true;
    }
    fun resPressed(){
        caracter = '-';
        operacion = resta;
        willClear = true;
    }
    fun multiPressed(){
        operacion = multi;
        willClear = true;
    }
    fun diviPressed(){
        operacion = divi;
        willClear = true;
    }
    var a:Double = 50.0;
    fun equalsPressed(){

        operando2 = display;
        when(operacion){
            suma -> {
                operando1 = operando1 + operando2;
                display = operando1;

            }
            resta -> {
                operando1 = operando1 - operando2;
                display = operando1;

            }
            multi ->{
                operando1 = operando1 * operando2;
                display = operando1;
            }
            divi ->{
                    a = operando2;
                    operando1 = operando1/operando2;
                    display = operando1;

                }
            }

        willClear = true;
        operacion = none;
    }


    //metodos ayudantes
    fun digitize (numeroActual : Double,digito : Double) : Double{

        return numeroActual *10 + digito;
    }

}