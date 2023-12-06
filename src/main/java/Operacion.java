/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author el-n0
 */
public class Operacion {
    
    public double calcularFactorial(int numero){
        double factorial = 0;
        for(int i=0;i <=numero; i++ ){
            factorial += factorial * i;
        }
        return factorial;
    }
    public int restar(int minuendo, int sustraendo) throws Exception{
        try{
            if(minuendo < sustraendo){
                throw new Exception("no se pudo realizar la operación porque el resultado es negativo.");
            }
            int resta = minuendo - sustraendo;
            validarResultado(resta);
            return resta;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public int multiplicar(int multiplicando, int multiplicado ) throws Exception{
        try{
            int producto = multiplicando * multiplicado;
            validarResultado(producto);
            return producto;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public double dividir(int dividendo, int divisor)throws Exception{
        try{
            int cociente = dividendo / divisor;
            validarResultado(cociente);
            return cociente;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    
    
    protected <T extends Number> void validarResultado(T valor) throws Exception{
        if(valor.doubleValue() > 0 && valor.doubleValue() < 1){
            throw new Exception("no se pudo realizar la operación porque el resultado es menor a 1.");
        }else if(valor.doubleValue() < 0){
            throw new Exception("no se pudo realizar la operación porque el resultado supera el tamaño permitido.");
        }else if(valor.doubleValue()==0){
            throw new Exception("no se pudo realizar la operación porque el resultado es igual a 0.");
        }
    }
    
}
