package com.example.seribelajarandroid4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.seribelajarandroid4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnJumlahkan.setOnClickListener {
            var angkaSatu =  binding.edAngkaSatu.text.toString().toInt()
            var angkaDua =  binding.edAngkaDua.text.toString().toInt()

            val totalJumlah = angkaSatu + angkaDua

            binding.tvHasil.text = "Hasil Penjumlahannya $totalJumlah"
        }
    }
}