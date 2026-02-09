# IntroProg – Taller de Fortalecimiento (Java)

Enfoque: **estructuras selectivas**, **estructuras repetitivas**, **arreglos uni/bidimensionales** y **modularización (métodos)** en Java.

---

## Objetivo del taller
Fortalecer y nivelar competencias de programación mediante el análisis, diseño, implementación y depuración de programas en Java que integren estructuras de control, arreglos y modularización, aplicando buenas prácticas de codificación y uso del IDE.

---

## Requisitos
- JDK 8+
- IDE: NetBeans / IntelliJ / Eclipse
- Consola (Terminal) opcional
- Recomendado: activar *Auto-format* y usar nombres descriptivos

---

## Reglas generales (aplican a todos los ejercicios)
1. **Entrada por teclado** cuando aplique (Scanner).
2. **Validar** entradas básicas (rango, no negativos, etc.).
3. **No imprimir** resultados desde métodos auxiliares, salvo que el enunciado lo pida _(en modularización)._
4. Aplicar **nombres claros**, **comentarios breves** y **formato consistente**.
5. Entregar código que **compile y ejecute** sin errores.

---

## Estructura del repositorio

```text
IntroProg-Taller-Fortalecimiento-Java/
├── README.md
├── 01_Estructuras_Selectivas/
│   ├── IfSimple.java
│   ├── IfDoble.java
│   ├── IfAnidado.java
│   ├── SwitchCase.java
├── 02_Estructuras_Repetitivas/
│   ├── WhileBasico.java
│   ├── DoWhileBasico.java
│   ├── ForBasico.java
│   ├── ComparacionCiclos.java
├── 03_Arreglos_Unidimensionales/
│   ├── ArregloCarga.java
│   ├── ArregloRecorrido.java
│   ├── ArregloProcesamiento.java
├── 04_Arreglos_Bidimensionales/
│   ├── MatrizCarga.java
│   ├── MatrizRecorrido.java
│   ├── MatrizProcesamiento.java
├── 05_Modularizacion/
│   ├── MetodosSinRetorno.java
│   ├── MetodosConRetorno.java
│   ├── PasoParametros.java
└── 06_Caso_Integrador/
    └── SistemaBasico.java
```

---

# Enunciados de ejercicios

## 01_Estructuras_Selectivas

### 1) `IfSimple.java` – Control de acceso por edad
**Problema:** Solicite al usuario su edad (entero).  
Si la edad es **mayor o igual a 18**, muestre: `Acceso permitido`.  
Si no, no muestre nada adicional.

**Requisitos:**
- Validar que la edad sea **>= 0**. Si no lo es, mostrar `Edad inválida`.
- Usar **if simple** (sin else para el caso “menor a 18”).

**Ejemplo (entrada → salida):**
- `18` → `Acceso permitido`
- `-2` → `Edad inválida`

---

### 2) `IfDoble.java` – Aprobado / Reprobado
**Problema:** Ingrese una nota final (0–100).  
Si la nota es **>= 70**, muestre `Aprobado`; caso contrario, `Reprobado`.

**Requisitos:**
- Validar rango 0–100. Si no cumple, mostrar `Nota inválida` y terminar.
- Usar **if doble (if/else)**.

**Ejemplo:**
- `85` → `Aprobado`
- `60` → `Reprobado`
- `120` → `Nota inválida`

---

### 3) `IfAnidado.java` – Clasificación por rango (3 niveles)
**Problema:** Ingrese un puntaje (0–100) y clasifique:
- 90–100: `Excelente`
- 70–89: `Bueno`
- 0–69: `En proceso`

**Requisitos:**
- Validar rango 0–100.
- Usar **if anidado** (mínimo 2 niveles).
- No usar switch.

**Ejemplo:**
- `95` → `Excelente`
- `75` → `Bueno`
- `40` → `En proceso`

---

### 4) `SwitchCase.java` – Menú de opciones (operación con 2 números)
**Problema:** Construya un menú:
1. Sumar  
2. Restar  
3. Multiplicar  
4. Dividir  

Solicite al usuario una opción (1–4) y dos números (double). Ejecute la operación y muestre el resultado.

**Requisitos:**
- Usar **switch-case**.
- En división, si el segundo número es 0, mostrar `No se puede dividir para cero`.
- Si opción inválida, mostrar `Opción inválida`.

**Ejemplo:**
- Opción `1`, números `5` y `3` → `Resultado: 8`

---

## 02_Estructuras_Repetitivas

### 5) `WhileBasico.java` – Validación de contraseña
**Problema:** Defina una contraseña correcta (por ejemplo: `"utpl"`).  
Pida al usuario ingresar una contraseña **hasta que** sea correcta.

**Requisitos:**
- Usar **while**.
- Contar intentos y al final mostrar: `Acceso concedido en X intento(s)`.

**Ejemplo:**
- Entradas: `abc`, `123`, `utpl` → `Acceso concedido en 3 intento(s)`

---

### 6) `DoWhileBasico.java` – Menú que se repite
**Problema:** Mostrar un menú:
1. Saludar  
2. Mostrar fecha (solo texto: `Funcionalidad no implementada`)  
0. Salir  

El menú debe repetirse hasta que el usuario elija 0.

**Requisitos:**
- Usar **do-while**.
- Si opción inválida, mostrar `Opción inválida`.

---

### 7) `ForBasico.java` – Tabla de multiplicar
**Problema:** Solicite un número entero `n` y muestre su tabla del 1 al 12.

**Requisitos:**
- Usar **for**.
- Validar que `n` sea positivo.

**Salida esperada (formato sugerido):**
`n x i = resultado`

---

### 8) `ComparacionCiclos.java` – Suma de 1..N con 3 ciclos
**Problema:** Ingrese un entero `N` (>=1). Calcule la suma 1+2+...+N usando:
- while
- do-while
- for

Muestre los tres resultados y verifique que coinciden.

**Requisitos:**
- Validación de N (>=1).
- Mostrar:
  - `Suma con while: ...`
  - `Suma con do-while: ...`
  - `Suma con for: ...`
- Si no coinciden (no debería ocurrir), mostrar `Revisar implementación`.

---

## 03_Arreglos_Unidimensionales

### 9) `ArregloCarga.java` – Cargar N valores
**Problema:** Solicite `N` (1..50). Cree un arreglo de `N` enteros y cargue valores por teclado.

**Requisitos:**
- Validar N en rango.
- Al finalizar, mostrar `Carga completada`.

---

### 10) `ArregloRecorrido.java` – Mostrar y contar
**Problema:** Con un arreglo de `N` enteros (cargado por teclado):
- Mostrar todos los valores
- Contar cuántos son **pares** y cuántos **impares**

**Requisitos:**
- Mostrar al final: `Pares: X`, `Impares: Y`.

---

### 11) `ArregloProcesamiento.java` – Estadísticas básicas
**Problema:** Con un arreglo de `N` enteros (cargado por teclado), calcular:
- Mayor
- Menor
- Promedio (double)

**Requisitos:**
- Validar N (1..50).
- Mostrar resultados con 2 decimales en el promedio.

---

## 04_Arreglos_Bidimensionales

### 12) `MatrizCarga.java` – Crear y llenar una matriz
**Problema:** Solicite filas `f` (1..10) y columnas `c` (1..10). Cree una matriz `f x c` de enteros y llénela por teclado.

**Requisitos:**
- Validar rangos.
- Al finalizar, mostrar `Matriz cargada`.

---

### 13) `MatrizRecorrido.java` – Mostrar matriz y suma por fila
**Problema:** Con una matriz `f x c` (cargada por teclado):
- Mostrar la matriz en formato de tabla
- Calcular la suma de cada fila y mostrarla

**Requisitos:**
- Formato sugerido:
  - `Fila 1 -> suma = ...`
  - `Fila 2 -> suma = ...`

---

### 14) `MatrizProcesamiento.java` – Suma total y diagonal (si aplica)
**Problema:** Con una matriz `f x c`:
- Calcular suma total de elementos
- Si la matriz es cuadrada (f==c), calcular suma de la diagonal principal

**Requisitos:**
- Si no es cuadrada, mostrar `Diagonal no aplica`.

---

## 05_Modularizacion

### 15) `MetodosSinRetorno.java` – Menú modular (void)
**Problema:** Implementar un menú con opciones que llamen a métodos **void**:
1. Mostrar saludo
2. Mostrar tabla de un número (1..12)
0. Salir

**Requisitos:**
- Crear métodos:
  - `mostrarSaludo()`
  - `mostrarTabla(int n)`
- `main` controla el menú y llama a métodos.

---

### 16) `MetodosConRetorno.java` – Cálculos con retorno
**Problema:** Solicite 2 números y calcule:
- suma
- resta
- producto
- mayor (retornar el mayor)

**Requisitos:**
- Implementar métodos con retorno:
  - `sumar(double a, double b)`
  - `restar(double a, double b)`
  - `multiplicar(double a, double b)`
  - `mayor(double a, double b)`

---

### 17) `PasoParametros.java` – Validación y reutilización
**Problema:** Solicite una nota (0–100). Use métodos para:
- Leer y validar la nota
- Determinar estado: `Aprobado` (>=70) o `Reprobado`

**Requisitos:**
- Métodos sugeridos:
  - `leerNotaValida(Scanner sc)` → retorna int válido
  - `obtenerEstado(int nota)` → retorna String
- `main` solo orquesta y muestra.

---

## 06_Caso_Integrador

### 18) `SistemaBasico.java` – Registro de notas (integrador)
**Problema:** Desarrollar un sistema en consola que permita:
1. Registrar N estudiantes (1..30): nombre y nota (0..100)
2. Mostrar listado (nombre – nota)
3. Calcular y mostrar:
   - Promedio del curso
   - Mayor nota y estudiante
   - Menor nota y estudiante
4. Permitir buscar por nombre (coincidencia exacta) y mostrar su nota

**Requisitos:**
- Usar:
  - arreglos (nombre[], nota[])
  - ciclos (for/while)
  - métodos (modularización obligatoria)
- Menú principal repetitivo hasta opción `0. Salir`
- Validaciones básicas (N, notas, opción de menú)
- Buenas prácticas: nombres claros, comentarios breves.

**Sugerencia de métodos (mínimos):**
- `leerEnteroEnRango(...)`
- `leerNotaValida(...)`
- `registrarEstudiantes(...)`
- `mostrarListado(...)`
- `calcularPromedio(...)`
- `buscarPorNombre(...)`

---

## Checklist de entrega (rápido)
- [ ] Compila sin errores
- [ ] Valida entradas
- [ ] Usa la estructura solicitada de carpetas/archivos
- [ ] Aplica formato y nombres claros
- [ ] Pruebas mínimas: 2 casos por ejercicio

---

## Licencia
Uso académico interno – Carrera de Computación, UTPL.
