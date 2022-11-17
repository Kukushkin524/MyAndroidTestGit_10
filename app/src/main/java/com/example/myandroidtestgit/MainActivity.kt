package com.example.myandroidtestgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {  //Создание MainActivity
    override fun onCreate(savedInstanceState: Bundle?) {    //Метод onCreate
        super.onCreate(savedInstanceState)  //Вызов метода из родительского класса AppCompatActivity
        setContentView(R.layout.activity_main)  //todo Запуск макетного файла интерфейса при старте приложения
    }
}