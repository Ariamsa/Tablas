package gomez.godina.tablas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var resultado=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        multiplicar()


        btnVerificar.setOnClickListener(){
          if (etRespuesta.text.isNotEmpty()){
              verificarRespuesta()
          }else{
              m("Escribe una respuesta")
          }
        }
    }
    fun verificarRespuesta(){
        if (etRespuesta.text.toString().toInt()== resultado){
            m("Correcto!!")
        }else{
            m("Incorrecto!!")
        }
        multiplicar()
    }
    fun m(mensaje:String){
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show()
    }
    fun multiplicar(){
        etRespuesta.text.clear()
        val num1 = Random.nextInt(0,11)//Generar numero
        val num2 = Random.nextInt(0,11)//
        /*Asignar el texto de la operacion a mi
        TextView ( se llame como se llame)*/
        tvOperacion.text = "$num1 x $num2 = ?"

         resultado = num1*num2

    }
}
