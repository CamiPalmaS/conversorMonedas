# Conversor de Monedas (Java)

Este es un programa de consola desarrollado en Java que permite convertir montos entre distintas monedas usando la API de [ExchangeRate API](https://www.exchangerate-api.com/). El programa es simple e interactivo: muestra un menú al usuario y realiza conversiones según la opción elegida.

---

## 💡 Funcionalidad

Al ejecutar el programa, podrás:

- Seleccionar un tipo de conversión entre pares de monedas (por ejemplo, Dólar a Peso Chileno).
- Ingresar el monto a convertir.
- Recibir en pantalla el resultado de la conversión utilizando los datos actualizados desde la API.

---
## 🔑 Cómo obtener una API Key

Este programa requiere una API key válida de [ExchangeRate API](https://www.exchangerate-api.com/). Sigue estos pasos:

1. Visita [https://www.exchangerate-api.com](https://www.exchangerate-api.com).
2. Registra tu correo electrónico para obtener una API key gratuita.
3. Una vez recibida, crea un archivo llamado `config.properties` en la **raíz del proyecto**.

El contenido de ese archivo debe ser:
```properties
API_KEY=tu_api_key_aqui
```
Reemplaza tu_api_key_aqui por la clave entregada por el sitio.
