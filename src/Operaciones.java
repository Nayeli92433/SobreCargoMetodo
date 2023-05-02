public class Operaciones {
    OperacionesMatematicas operacionesMatematicas= new OperacionesMatematicas();
    public void operacionesInt(int a, int b){
        System.out.println("La suma es : "+ operacionesMatematicas.sumar(a,b));
        System.out.println("La resta es : "+ operacionesMatematicas.resta(a,b));
        System.out.println("La multiplicacion es : "+ operacionesMatematicas.multiplicacion(a,b));
        System.out.println("La division es : "+ operacionesMatematicas.division(a,b));
        System.out.println("_________________________________________________________________");
    }
    public void operacionesDouble(double c, double d){
        System.out.println("La suma es : "+ operacionesMatematicas.sumar(c,d));
        System.out.println("La resta es : "+ operacionesMatematicas.resta(c,d));
        System.out.println("La multiplicacion es : "+ operacionesMatematicas.multiplicacion(c,d));
        System.out.println("La division es : "+ operacionesMatematicas.division(c,d));
        System.out.println("_________________________________________________________________");
    }
    public void operacionesFloat(float e, float f){
        System.out.println("La suma es : "+ operacionesMatematicas.sumar(e,f));
        System.out.println("La resta es : "+ operacionesMatematicas.resta(e,f));
        System.out.println("La multiplicacion es : "+ operacionesMatematicas.multiplicacion(e,f));
        System.out.println("La division es : "+ operacionesMatematicas.division(e,f));
        System.out.println("_________________________________________________________________");
    }
    public void operacionesChar(char g, char h){
        System.out.println("La suma es : "+ operacionesMatematicas.sumar(g,h));
        System.out.println("La resta es : "+ operacionesMatematicas.resta(g,h));
        System.out.println("La multiplicacion es : "+ operacionesMatematicas.multiplicacion(g,h));
        System.out.println("La division es : "+ operacionesMatematicas.division(g,h));
        System.out.println("_________________________________________________________________");
    }

}
