LISTA ENLAZADA ORDENADA

Una lista con esta característica se llama lista ordenada.
En una lista ordenada, los elementos están ordenados por valor de la clave.
Se limita al elemento más pequeño (o más grande) de la lista, que está al principio de la misma, aunque a veces también se utilizan los métodos encontrar() y borrar(), que buscan en la lista, Sin embargo, para ciertas aplicaciones es útil mantener los datos en orden
dentro de la lista. Una lista con esta característica se llama lista ordenada.
En una lista ordenada, los elementos están ordenados por valor de la clave. El borrado suele estar al elemento más pequeño (o más grande) de la lista, que está al principio de la misma, aunque a veces también se utilizan los métodos find() y delete(), que buscan en la lista o enlaces especificados en general, se puede utilizar una lista ordenada en la mayoría de las situaciones en las que se utiliza una lista ordenada. 
Las ventajas de una lista ordenada sobre un vector ordenado son la velocidad de inserción (porque los elementos no necesitan ser movidos) y el hecho de que una lista puede expandirse hasta llenarse la memoria disponible, mientras que un vector está limitado a un tamaño fijo. Sin embargo, una lista ordenada es algo más difícil de implementar que un vector ordenado. Una lista ordenada también puede implementar una cola prioritaria, con montículo(heap).
Cuando el algoritmo encuentra dónde colocarlo, el elemento puede insertarse de la forma habitual cambiando el puntero siguiente en el nuevo enlace para que apunte al siguiente enlace y cambiando siguiente en el enlace anterior para que apunte al nuevo enlace. Sin embargo, hay que tener en cuenta algunos casos especiales:
 El enlace puede tener que insertarse al principio de la lista, o puede
o al final de la lista. 

