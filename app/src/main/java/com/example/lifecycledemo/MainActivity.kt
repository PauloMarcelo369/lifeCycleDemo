package com.example.lifecycledemo

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lifecycledemo.ui.theme.LifeCycleDemoTheme

/*
*Pelo que entendi isso funciona da seguinte forma: MainActivity herda de
ConponentActivity que já dá as implementações base do ciclo de vida da aplicação,
quando eu quero adicionar novos comportamentos para esses métodos de ciclo de vida, eu mudo
(Override) o comportamento desses métodos para a classe base que estou herdando
* */
class MainActivity : ComponentActivity() {
    //
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //mensagem de log e toast de oncreate
        Log.d("LifeCycleDemo", "oncreate foi chamado")
        Toast.makeText(this, "oncreate chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        //mensagem de log e Toast para onStart
        Log.d("LifeCycleDemo", "onStart chamado")
        Toast.makeText(this, "onStart chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()

        //mensagem de log e Toast para onResume
        Log.d("LifeCycleDemo", "onResume chamado")
        Toast.makeText(this, "onResume chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        //mensagem de Log e Toast para onPause
        Log.d("LifeCycleDemo", "onPause chamado")
        Toast.makeText(this, "onPause chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycleDemo", "onStop chamado")
        Toast.makeText(this, "onStop chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycleDemo", "onDestroy chamado")
        Toast.makeText(this, "onDestroy chamado", Toast.LENGTH_SHORT).show()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val limit : Int =  10
    Text(
        text= "Hello cadeira de $limit!",
        modifier = modifier

    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LifeCycleDemoTheme {
        Greeting("Android")
    }
}