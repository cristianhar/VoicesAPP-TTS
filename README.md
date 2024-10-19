# VoicesAPP - Text to Speech (TTS) Application

VoicesAPP es una aplicación de Android que utiliza el servicio **Text to Speech (TTS)** para convertir texto a voz en tiempo real. Es una implementación simple que permite al usuario escribir un mensaje y escuchar cómo el teléfono lo lee en voz alta.

## Características

- **Entrada de texto personalizada**: El usuario puede escribir cualquier mensaje en el campo de texto.
- **Conversión de texto a voz (TTS)**: El mensaje se convierte en voz mediante el motor TTS de Android.
- **Manejo de errores**: El sistema indica si hubo problemas al inicializar el TTS.
- **Compatibilidad con el idioma español**: El motor TTS está configurado para el idioma español.

## Tecnologías utilizadas

- **Kotlin**: Lenguaje de programación principal.
- **Android SDK**: Para el desarrollo de la aplicación móvil.
- **TextToSpeech API**: Proporciona la funcionalidad de conversión de texto a voz.

   ![VoicesAPP Preview](/preview/preview.png)

## Cómo ejecutar el proyecto

1. **Clonar el repositorio**:
    ```bash
    git clone https://github.com/cristianhar/VoicesAPP-TTS.git
    ```

2. **Abrir en Android Studio**:
   - Abre Android Studio y selecciona "Open an existing project".
   - Navega a la carpeta donde clonaste el repositorio y selecciónala.

3. **Ejecutar la aplicación**:
   - Conecta un dispositivo Android o inicia un emulador.
   - Presiona el botón "Run" o utiliza el atajo `Shift + F10` para ejecutar la aplicación.

## Dependencias

- Asegúrate de que tu `build.gradle` (nivel de aplicación) incluya las siguientes dependencias:

    ```gradle
    implementation 'com.android.support:appcompat-v7:28.0.0'
    ```

## Estructura del proyecto

```plaintext
├── MainActivity.kt                  # Lógica principal de la aplicación.
├── activity_main.xml                # Diseño de la UI en formato XML.
├── strings.xml                      # Cadena de textos utilizados en la UI.
├── colors.xml                       # Definición de colores utilizados en la aplicación.
├── dimens.xml                       # Tamaños y márgenes predefinidos para mantener la coherencia visual.
└── ic_launcher_foreground.xml        # Icono de la aplicación.
