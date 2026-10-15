# Dessert Clicker

App de Android hecha con **Jetpack Compose** y **Kotlin**. Al tocar el postre se suman ingresos y, conforme se venden más, el postre cambia por uno nuevo.

Este proyecto es la práctica **"Add a ViewModel to Dessert Clicker"** del curso Android Basics with Compose, donde el estado y la lógica se mueven de `MainActivity` a un `ViewModel`.

## Características

- Contador de postres vendidos e ingresos totales
- El postre cambia según la cantidad vendida
- Botón para compartir los resultados
- El estado se conserva al rotar la pantalla gracias al ViewModel

## Tecnologías

- Kotlin
- Jetpack Compose (Material 2)
- ViewModel + StateFlow
- Arquitectura con `UiState`

## Estructura del proyecto

```
com.example.dessertclicker/
├── MainActivity.kt
├── data/
│   ├── Datasource.kt
│   └── DessertUiState.kt
├── model/
│   └── Dessert.kt
└── ui/
    ├── DessertViewModel.kt
    └── theme/Theme.kt
```

## Cómo ejecutarlo

1. Clona el repositorio:
```bash
   git clone https://github.com/JordyMacias/App-Dessertclicker
```
2. Ábrelo con Android Studio.
3. Espera a que termine el Gradle Sync.
4. Ejecuta la app en un emulador o dispositivo físico.

## Créditos

Basado en el codelab oficial de Google:
[Practice: Add a ViewModel to Dessert Clicker](https://developer.android.com/codelabs/basic-android-kotlin-compose-practice-viewmodel)

Código base y recursos gráficos: [google-developer-training](https://github.com/google-developer-training/basic-android-kotlin-compose-training-dessert-clicker), licencia Apache 2.0.
