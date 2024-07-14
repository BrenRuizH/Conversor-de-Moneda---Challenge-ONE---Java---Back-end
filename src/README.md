# CONVERSOR DE MONEDA

Este proyecto es una aplicación Java que consume una API de tasas de cambio para convertir cantidades entre diferentes monedas. Utiliza `HttpClient` para realizar solicitudes a la API, `Gson` para analizar la respuesta JSON, y proporciona una interfaz de consola para interactuar con el usuario.

## Requisitos

- Java Development Kit (JDK) 11 o superior
- IntelliJ IDEA (o cualquier otro IDE compatible con Java)
- Conexión a Internet

## Configuración del Proyecto

### 1. Clonar el Repositorio

```bash
git clone https://github.com/BrenRuizH/Conversor-de-Moneda---Challenge-ONE---Java---Back-end.git
```

### 2. Configurar el Proyecto en IntelliJ IDEA

1. Abre IntelliJ IDEA.
2. Selecciona `File > Open` y navega hasta la carpeta del proyecto clonada.
3. Configura el JDK:
    - Ve a `File > Project Structure`.
    - En `Project SDK`, selecciona el JDK 11 o superior.

### 3. Añadir la Biblioteca Gson

1. Descarga el JAR de Gson desde el [sitio oficial de Maven](https://mvnrepository.com/artifact/com.google.code.gson/gson).
2. Añade el JAR al proyecto:
    - Haz clic derecho en tu proyecto en el panel de navegación y selecciona `Open Module Settings`.
    - Ve a `Libraries`.
    - Haz clic en el icono `+` y selecciona `Java`.
    - Navega hasta donde descargaste el JAR de Gson y selecciónalo.
    - Haz clic en `OK`.

## Ejecución del Proyecto

1. Abre la clase `Main`.
2. Ejecuta la clase `Main` desde IntelliJ IDEA.

### Interacción con la Aplicación

La aplicación pedirá al usuario ingresar:

- El código de la moneda de origen.
- El código de la moneda de destino.
- La cantidad a convertir.

La aplicación mostrará la cantidad convertida según la tasa de cambio actual.

## Estructura del Proyecto

```plaintext
src/
├── ApiConsumer.java
├── Currency.java
├── CurrencyConverter.java
├── CurrencyFilter.java
├── JsonParser.java
├── Main.java
├── ResultDisplay.java
```

### Explicación de las Clases

- **ApiConsumer**: Realiza la solicitud HTTP a la API y devuelve la respuesta como una cadena.
- **JsonParser**: Analiza la respuesta JSON utilizando Gson.
- **Currency**: Representa la estructura de los datos JSON de la respuesta.
- **CurrencyFilter**: Filtra las tasas de conversión para incluir solo las monedas especificadas.
- **ResultDisplay**: Muestra las tasas de conversión filtradas en la consola.
- **CurrencyConverter**: Realiza la conversión de la cantidad utilizando la tasa de conversión.
- **Main**: Integra todo el flujo, interactuando con el usuario y mostrando el resultado de la conversión.

## API Utilizada

Esta aplicación utiliza la [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener las tasas de cambio actuales. Necesitarás una clave de API para utilizar este servicio. Puedes registrarte y obtener tu clave de API en el sitio web de ExchangeRate-API.

## Personalización

Puedes personalizar los códigos de moneda filtrados modificando la siguiente línea en la clase `Main`:

```java
String[] selectedCurrencies = {"ARS", "BOB", "BRL", "CLP", "COP", "USD"};
```

## Contribuciones

Las contribuciones son bienvenidas. Por favor, abre un issue o un pull request para discutir cualquier cambio.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.
```

Este archivo README.md proporciona una guía completa para configurar, ejecutar y entender el proyecto. Asegúrate de ajustar cualquier enlace o información específica según tu configuración y necesidades.