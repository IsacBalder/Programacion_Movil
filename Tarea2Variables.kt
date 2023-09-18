//Para un número decimal, ¿Qué tipo de dato se asigna por defecto? Imprimirlo 
var PI=3.1416
fun main() {
    var decimal=10.17
    //println("El tipo de dato que se asigna por defecto a un decimal es: ${decimal::class.simpleName}")
    //la respuesta es: Double
    
    //Ahora volveremos float la variable que pusimos hace un momento
    
    //println("Ahora pasaremos de doble a float la variable decimal, quedando asi con el tipo de dato: ${decimal.toFloat()::class.simpleName}")
    
   // como podemos ver el numero double se cambio a float sin tener que declararla nuevamente
   println("Declarar una variable const val con el valor de PI y multiplicarla por 2 veces nuestra variable decimal para sacar el perímetro de un círculo.")
   val perimetro=2*PI*decimal
    println("El perimetro del circulo es: $perimetro")
    //como podemos ver se obtuvo el valor del perimetro del ciculo obtenido se debe a el valor decimal anteriormente declarado
    
    
}