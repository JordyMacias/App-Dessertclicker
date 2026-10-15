package com.example.dessertclicker.model

import androidx.annotation.DrawableRes

/**
 * Representa un postre.
 * @param imageId recurso drawable del postre
 * @param price precio de venta (se suma a los ingresos en cada clic)
 * @param startProductionAmount cantidad de postres vendidos a partir de la cual
 *        se empieza a mostrar este postre
 */
data class Dessert(
    @DrawableRes val imageId: Int,
    val price: Int,
    val startProductionAmount: Int
)