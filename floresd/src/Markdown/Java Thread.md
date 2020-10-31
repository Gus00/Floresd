# ¿QUE ES JAVA THREAD SCHEDULER?
Java tiene un Scheduler, una lista de procesos, que monitoriza todos los hilos que se están ejecutando en todos los programas y decide cuales deben ejecutarse y cuales deben encontrarse preparados para su ejecución.  
Hay dos características de los hilos que el scheduler identifica en este proceso de decisión. Una, la más importante, es la prioridad del hilo de ejecución; la otra, es el indicador de demonio.   

El scheduler puede seguir dos patrones, preemptivo y no-preemptivo. Los schedulers preemtivos proporcionan un segmento de tiempo a  
todos los hilos que están corriendo en el sistema.El scheduler decide cual será el siguiente hilo a ejecutarse y llama al método resume()   
para darle vida durante un período fijo de tiempo.Cuando el hilo ha estado en ejecución ese período de tiempo, se llama a suspend() y el siguiente hilo   
de ejecución en la lista de procesos será relanzado (resume()).  Los schedulers no-preemtivos deciden que hilo debe correr y lo ejecutan hasta que concluye.


# Hilos Demonio
Los hilos de ejecución demonio también se llaman servicios, porque se ejecutan, normalmente, con prioridad baja y proporcionan un servicio básico  
 a un programa o programas cuando la actividad de la máquina es reducida. Los hilos demonio son útiles cuando un hilo debe ejecutarse en segundo  
 plano durante largos períodos de tiempo.

 # Diferencia entre hilos y fork()

fork() en Unix crea un proceso hijo que tiene su propia copia de datos y código del padre. Esto funciona correctamente si no hay   
problemas de cantidad de memoria de la máquina y se dispone de una CPU poderosa, y siempre que se mantenga el número de   
procesos hijos dentro de un límite manejable, porque se hace un uso intensivo de los recursos del sistema.   

Un hilo puede interrumpir a otro en cualquier momento, de ahí lo de pre-emptive. Fácilmente puede el lector imaginarse lo que pasaría si un hilo de ejecución está escribiendo  
 en un array, mientras otro hilo lo interrumpe y comienza a escribir en el mismo array. Los lenguajes como C y C++ necesitan de las funciones lock() y unlock() para antes y  
  después de leer o escribir datos. Java también funciona de este modo, pero oculta el bloqueo de datos bajo la sentencia synchronized: