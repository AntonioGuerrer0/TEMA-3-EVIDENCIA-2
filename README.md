Por José Antonio Guerrero Lazcano
Introducción

Las estructuras de datos son esenciales en la informática para organizar y manipular información eficientemente. Entre las más comunes se encuentran las pilas, listas y colas. Las pilas son estructuras lineales que siguen el principio LIFO (Last In, First Out), donde el último elemento insertado es el primero en salir. Esto las hace ideales para tareas como la reversión de cadenas o la implementación de sistemas de historial en aplicaciones.

Las listas, por otro lado, son estructuras de datos que pueden ser tanto lineales como no lineales y permiten el almacenamiento secuencial de elementos. Las listas enlazadas, por ejemplo, conectan nodos que contienen datos y una referencia al siguiente nodo. Esto las hace flexibles para la inserción y eliminación de elementos en cualquier punto, aunque el acceso secuencial es más eficiente que el acceso aleatorio.

Por último, las colas son estructuras de datos similares a las pilas pero siguen el principio FIFO (First In, First Out), donde el primer elemento en ser insertado es el primero en ser eliminado. Este comportamiento las hace útiles en situaciones como la gestión de procesos en sistemas operativos o la implementación de buffers en la comunicación de datos.

Investigación:

Pilas

Una pila es un contenedor de nodos con dos operaciones básicas: push (apilar) y pop (desapilar). "Push" añade un nodo a la parte superior de la pila, y "pop" devuelve y elimina el nodo superior. Una metáfora común es una pila de platos en una cafetería: solo el plato superior es accesible, y al añadir nuevos platos, estos se colocan en la parte superior de la pila.

Operaciones:

Crear (constructor): Crea una pila vacía.
Tamaño (size): Devuelve el número de elementos en la pila.
Apilar (push): Añade un elemento a la pila.
Desapilar (pop): Lee y retira el elemento superior de la pila.
Leer último (top o peek): Lee el elemento superior sin retirarlo.
Vacía (empty): Devuelve verdadero si la pila está vacía y falso si contiene elementos.

Codigo:
    
    package Pilas;
    
    import java.util.Scanner;
    import java.util.Stack;
    
    
    public class EJERCICIO3 {
    
       public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un número decimal: ");
            int numero = scanner.nextInt();
    
            Stack<Integer> pila = new Stack<>();
            while (numero > 0) {
                pila.push(numero % 2);
                numero /= 2;
            }
    
            System.out.print("Numero en binario: ");
            while (!pila.isEmpty()) {
                System.out.print(pila.pop());
            }
        }
    }
Ejecucion:


![Captura de pantalla 2024-06-04 150838](https://github.com/AntonioGuerrer0/TEMA-3-EVIDENCIA-2/assets/161759650/ee4f76ed-64cd-4d39-9d02-8510d28cc9f1)

Listas

Una lista es un tipo de dato abstracto que representa una secuencia ordenada de valores, donde el mismo valor puede ocurrir más de una vez. Las listas son un ejemplo básico de contenedores que pueden contener otros valores, y cada ocurrencia de un valor repetido se considera un elemento distinto.

Operaciones:

Constructor: Crea una lista vacía.
Probar si está vacía: Determina si una lista está vacía.
Agregar al inicio: Añade una entidad al inicio de la lista.
Agregar al final: Añade una entidad al final de la lista.
Determinar el primer elemento (cabeza): Obtiene el primer elemento de la lista.
Referirse a la cola de la lista: Obtiene la lista que consiste en todos los elementos excepto el primero.

Codigo:

    package Listas;
    
    import java.util.ArrayList;
    import java.util.List;
    
    
    public class EJERCICIO3 {
    
         public static void main(String[] args) {
            List<Double> lista = new ArrayList<>();
    
            agregarElemento(lista, 3.19);
            agregarElemento(lista, 2.81);
            agregarElemento(lista, 1.71);
    
            buscarElemento(lista, 1.71);
            buscarElemento(lista, 1.62);
        }
    
        public static void agregarElemento(List<Double> lista, double elemento) {
            lista.add(elemento);
            System.out.println("Elemento " + elemento + " agregado a la lista.");
        }
    
        public static void buscarElemento(List<Double> lista, double elemento) {
            if (lista.contains(elemento)) {
                System.out.println("Elemento " + elemento + " encontrado en la lista.");
            } else {
                System.out.println("Elemento " + elemento + " no se encuentra en la lista.");
            }
        }
    }

Ejecucion:


![Captura de pantalla 2024-06-04 151017](https://github.com/AntonioGuerrer0/TEMA-3-EVIDENCIA-2/assets/161759650/6a7eb24e-b641-4155-966f-43e6822d245a)

Colas

Una cola es un tipo de dato abstracto caracterizado por ser una secuencia de elementos donde la inserción se realiza por un extremo y la extracción por el otro, siguiendo el principio FIFO (First In, First Out). Las colas se utilizan en sistemas informáticos, transportes y operaciones de investigación para almacenar y procesar datos secuencialmente.

Operaciones:

Crear: Crea una cola vacía.
Encolar: Añade un elemento al final de la cola.
Desencolar: Elimina el primer elemento de la cola.
Frente (front): Devuelve el primer elemento de la cola.

Codigo:

      package Colas;
      
      import java.util.LinkedList;
      import java.util.Queue;
      
      
      public class EJERCICIO5 {
        public static void main(String[] args) {
              Queue<Character> cola = new LinkedList<>();
      
              // Función para agregar elementos a la cola
              agregarElemento(cola, 'X');
              agregarElemento(cola, 'G');
              agregarElemento(cola, 'L');
      
              // Función para buscar elementos en la cola
              buscarElemento(cola, 'L');
              buscarElemento(cola, 'D');
          }
      
          public static void agregarElemento(Queue<Character> cola, char elemento) {
              cola.add(elemento);
              System.out.println("Elemento '" + elemento + "' agregado a la cola.");
          }
      
          public static void buscarElemento(Queue<Character> cola, char elemento) {
              if (cola.contains(elemento)) {
                  System.out.println("Elemento '" + elemento + "' encontrado en la cola.");
              } else {
                  System.out.println("Elemento '" + elemento + "' no se encuentra en la cola.");
              }
          }
      }

Ejecucion:


![Captura de pantalla 2024-06-04 151113](https://github.com/AntonioGuerrer0/TEMA-3-EVIDENCIA-2/assets/161759650/929f5d44-7ac8-488c-9544-c01091dab867)

Conclusión

Además de su utilidad individual, estas estructuras de datos pueden combinarse y complementarse para resolver problemas más complejos. Por ejemplo, una lista doblemente enlazada puede usarse como base para implementar tanto pilas como colas, aprovechando el acceso rápido tanto al principio como al final de la lista. Esta capacidad de composición y abstracción es fundamental en el diseño de sistemas escalables y mantenibles, permitiendo a los desarrolladores crear soluciones adaptables a medida que los requisitos evolucionan.
