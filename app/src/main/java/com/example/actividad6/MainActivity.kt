package com.example.actividad6

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnGenerate: Button
    private lateinit var tvVector: TextView
    private lateinit var tvMin: TextView
    private lateinit var tvMax: TextView
    private lateinit var tvPromedio: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGenerate = findViewById(R.id.btnGenerate)
        tvVector = findViewById(R.id.tvVector)
        tvMin = findViewById(R.id.tvMin)
        tvMax = findViewById(R.id.tvMax)
        tvPromedio = findViewById(R.id.tvPromedio)

        btnGenerate.setOnClickListener(View.OnClickListener {
            // Generar un vector con 10 números aleatorios entre 1 y 100
            val vector = IntArray(10) { (1..100).random() }

            // Mostrar el vector en pantalla
            tvVector.text = "Vector: ${vector.joinToString(", ")}"

            // Calcular el número mínimo, máximo y el promedio
            val min = vector.minOrNull()
            val max = vector.maxOrNull()
            val promedio = vector.average()

            // Mostrar los resultados
            tvMin.text = "Mínimo: $min"
            tvMax.text = "Máximo: $max"
            tvPromedio.text = "Promedio: $promedio"
        })
    }
}


