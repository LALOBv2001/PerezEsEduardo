## 19100236 Pérez Escobar Eduardo  
   :sagittarius:   :hearts:     :aquarius:

 ### Java Collection Framework 
*Es como se conoce a la librería de clases contenedoras de Java que podemos encontrar en el paquete estándar java.util. Estas clases sirven para almacenar colecciones de objetos, como listas, conjuntos, mapas.*

### Colecciones  
1. Listas  
   Llamamos lista a cualquier colección de objetos ordenados por posición, como en un array. En una lista podemos añadir elementos, acceder a ellos por su posición en la lista, eliminar elementos de la lista y otras operaciones, como vaciar la lista, copiarla, etc. En una lista puede haber objetos repetidos, es decir, objetos que son iguales según el método equals() de su clase. 

2. Lista de arreglo  
 La clase ArrayList implementa la interfaz List. Utiliza una matriz dinámica para almacenar el elemento duplicado de diferentes tipos de datos. La clase ArrayList mantiene el orden de inserción y no está sincronizada.  

   ¿Cómo crear una lista de arreglo?


   ```C# 
   List<int> lista_de_enteros = new ArrayList<int>();
   ```  
3.  Lista Enlazada  
  LinkedList implementa la interfaz Collection. Utiliza una lista doblemente enlazada internamente para almacenar los elementos. Puede almacenar los elementos duplicados. Mantiene el orden de inserción y no está sincronizado. En LinkedList, la manipulación es rápida porque no se requieren cambios.
  ``` java
  LinkedList <String> al = new  LinkedList <String> ();  
   al.add ( "Ravi" ); 
   ```  
 4.  Vector   
  Vector utiliza una matriz dinámica para almacenar los elementos de datos. Es similar a ArrayList. Sin embargo, está sincronizado y contiene muchos métodos que no forman parte del marco de la colección.

   Mostramos un ejemplo

   ``` java
   Vector <String> v = new  Vector <String> () ;  
   v.add ( "Ayush" );  
   v.add ( "Amit" ); 
   ```  

5. Pila   
   *La pila es la subclase de Vector. Implementa la estructura de datos de último en entrar, primero en salir, es decir, Stack. La pila contiene todos los métodos de la clase Vector y también proporciona sus métodos como boolean push (), boolean peek (), boolean push (objeto o), que define sus propiedades.*
   
     Mostramos un ejemplo 
   ``` Java
   Apilar <String> stack =  new  Stack <String> ();  
   stack.push ( "Ayush" );  
   stack.push ( "Garvit" );  
   stack.push ( "Amit" );  
   ```  
6. Interfaz de cola  
*La interfaz de cola mantiene el orden de primero en entrar, primero en salir. Se puede definir como una lista ordenada que se utiliza para contener los elementos que están a punto de ser procesados. Hay varias clases como PriorityQueue, Deque y ArrayDeque que implementan la interfaz Queue.*

   *Se puede crear una instancia de la interfaz de cola como:*
    ``` Java
    Cola <String> q1 =  new  PriorityQueue ();  
    Cola <String> q2 =  new  ArrayDeque (); 
   ```  
     
7. PriorityQueue  
   *La clase PriorityQueue implementa la interfaz Queue. Contiene los elementos u objetos que serán procesados ​​por sus prioridades. PriorityQueue no permite que se almacenen valores nulos en la cola.*
 
    *Considere el siguiente ejemplo.*  

   ``` Java
    PriorityQueue <String> cola = new  PriorityQueue <String> ();  
    queue.add ( "Amit Sharma" );  
    queue.add ( "Vijay Raj" );  
    queue.add ( "JaiShankar" );  
   ```  
8.  HashSet  
*La clase HashSet implementa la interfaz de conjunto. Representa la colección que usa una tabla hash para el almacenamiento. El hash se usa para almacenar los elementos en el HashSet. Contiene elementos únicos. *

    Considere el siguiente ejemplo.

      ``` Java
     HashSet <String> set = new  HashSet <String> ();  
     set.add ( "Ravi" );  
     set.add ( "Vijay" );  
     set.add ( "Ravi" );  
     set.add ( "Ajay" );  
     // Elementos transversales  
     Iterador <String> itr = set.iterator ();  
     while (itr.hasNext ()) {  
     System.out.println (itr.next ());  
     }  
    ```  
9. LinkedHashSet    
*La clase LinkedHashSet representa la implementación LinkedList de Set Interface. Extiende la clase HashSet e implementa la interfaz Set. Al igual que HashSet, también contiene elementos únicos. Mantiene el orden de inserción y permite elementos nulos.*

     *Considere el siguiente ejemplo.*
    ``` Java
    LinkedHashSet <String> set = new  LinkedHashSet <String> ();  
    set.add ( "Ravi" );  
    set.add ( "Vijay" );  
    set.add ( "Ravi" );  
    set.add ( "Ajay" );  
    Iterador <String> itr = set.iterator ();  
    while (itr.hasNext ()) {  
    System.out.println (itr.next ());  
    }  
    ```  

10. TreeSet  
  La clase Java TreeSet implementa la interfaz Set que usa un árbol para el almacenamiento. Al igual que HashSet, TreeSet también contiene elementos únicos. Sin embargo, el tiempo de acceso y recuperación de TreeSet es bastante rápido. Los elementos en TreeSet almacenados en orden ascendente. *

  *Considere el siguiente ejemplo:*
   ``` Java
   public static void  main (String args []) {    
    // Creando y agregando elementos  
   TreeSet <String> set = new  TreeSet  <String> ();  
   set.add ( "Ravi" );  
   set.add ( "Vijay" );  
   set.add ( "Ravi" );  
   set.add ( "Ajay" );  
   // elementos que atraviesan  
   Iterador <String> itr = set.iterator ();  
   while (itr.hasNext ()) {  
   System.out.println (itr.next ());  
   }  
   ```  
[Referencia de la informacion](https://www.javatpoint.com/collections-in-java)








  



    

