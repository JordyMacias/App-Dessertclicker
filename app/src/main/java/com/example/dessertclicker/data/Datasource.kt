package com.example.dessertclicker.data

import com.example.dessertclicker.R
import com.example.dessertclicker.model.Dessert

object Datasource {
    val dessertList = listOf(
        Dessert(R.drawable.cupcake, 5, 0),
        Dessert(R.drawable.donut, 10, 5),
        Dessert(R.drawable.eclair, 15, 10),
        Dessert(R.drawable.froyo, 30, 20),
        Dessert(R.drawable.gingerbread, 50, 30),
        Dessert(R.drawable.honeycomb, 100, 40),
        Dessert(R.drawable.icecreamsandwich, 150, 50),
        Dessert(R.drawable.jellybean, 200, 60),
        Dessert(R.drawable.kitkat, 500, 70),
        Dessert(R.drawable.lollipop, 1000, 80),
        Dessert(R.drawable.marshmallow, 2000, 90),
        Dessert(R.drawable.nougat, 3000, 100),
        Dessert(R.drawable.oreo, 4000, 110)
    )
}