package www.student.com.hn.controllers

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import www.student.com.hn.R
import www.student.com.hn.models.CalculatorModel
import java.util.*
import kotlin.concurrent.schedule
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {

    val model: CalculatorModel = CalculatorModel();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun delButtonPressed(view : View){
        model.delPressed();
        mitexto.setText(model.display.toString());
    }
    fun ceroPressed(view : View){
        model.ceroPressed();
        mitexto.setText(model.display.toString());
    }
    fun onePressed(view : View){
        model.onePressed();
        mitexto.setText(model.display.toString());
    }
    fun twoPressed(view : View){
        model.twoPressed();
        mitexto.setText(model.display.toString());
    }
    fun threePressed(view : View){
        model.threePressed();
        mitexto.setText(model.display.toString());
    }
    fun fourPressed(view : View){
        model.fourPressed();
        mitexto.setText(model.display.toString());
    }
    fun fivePressed(view : View){
        model.fivePressed();
        mitexto.setText(model.display.toString());
    }
    fun sixPressed(view : View){
        model.sixPressed();
        mitexto.setText(model.display.toString());
    }
    fun sevenPressed(view : View){
        model.sevenPressed();
        mitexto.setText(model.display.toString());
    }
    fun eightPressed(view : View){
        model.eightPressed();
        mitexto.setText(model.display.toString());
    }
    fun ninePressed(view : View){
        model.ninePressed();
        mitexto.setText(model.display.toString());
    }
    fun sumPressed(view : View){
        model.sumPressed();
        mitexto.text = model.display.toString();
    }
    fun resPressed(view : View){
        model.resPressed();
        mitexto.text = model.caracter.toString();
    }
    fun multiPressed(view : View){
        model.multiPressed();
        mitexto.text = model.display.toString();
    }
    fun diviPressed(view : View){
        model.diviPressed();
        mitexto.text = model.display.toString();
    }
    fun equalsPressed(view : View){
        model.equalsPressed();
        if(model.display.toString().equals("Infinity")){
           
            mitexto.text = model.message;
        }else{
            mitexto.text = model.display.toString();
        }


    }
}


