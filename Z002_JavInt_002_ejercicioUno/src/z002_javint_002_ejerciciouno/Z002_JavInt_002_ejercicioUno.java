// Crear un proyecto de Java y definir al menos 6 variables en tu IDE de distintos tipos de datos.

package z002_javint_002_ejerciciouno;

public class Z002_JavInt_002_ejercicioUno {

    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("BYTE   BYTE   BYTE");
        byte numeroByte = 100000;
        System.out.println("Min_Value: " + Byte.MIN_VALUE);
        System.out.println("Max_Value: " + Byte.MAX_VALUE);
        System.out.println("Bytes: " + Byte.BYTES);
        System.out.println("Size: " + Byte.SIZE);
        System.out.println("Type: " + Byte.TYPE);
        
        byte numeroByte2 = (byte)129;
        System.out.println("numeroByte2: " + numeroByte2);
        
        System.out.println("---------------------");
        System.out.println("SHORT   SHORT   SHORT");
        short numeroShort = 10;
        System.out.println("Min_Value: " + Short.MIN_VALUE);
        System.out.println("Max_Value: " + Short.MAX_VALUE);
        System.out.println("Bytes: " + Short.BYTES);
        System.out.println("Size: " + Short.SIZE);
        System.out.println("Type: " + Short.TYPE);
        
        System.out.println("---------------------");
        System.out.println("INT   INT   INT");
        int numeroInt = 10;
        System.out.println("Min_Value: " + Integer.MIN_VALUE);
        System.out.println("Max_Value: " + Integer.MAX_VALUE);
        System.out.println("Bytes: " + Integer.BYTES);
        System.out.println("Size: " + Integer.SIZE);
        System.out.println("Type: " + Integer.TYPE);
        
        System.out.println("---------------------");
        System.out.println("LONG   LONG   LONG");
        long numeroLong = 10;
        System.out.println("Min_Value: " + Long.MIN_VALUE);
        System.out.println("Max_Value: " + Long.MAX_VALUE);
        System.out.println("Bytes: " + Long.BYTES);
        System.out.println("Size: " + Long.SIZE);
        System.out.println("Type: " + Long.TYPE);
        
        System.out.println("---------------------");
        System.out.println("Float   Float   Float");
        float numeroFloat = 10.0F;
        System.out.println("Min_Value: " + Float.MIN_VALUE);
        System.out.println("Max_Value: " + Float.MAX_VALUE);
        System.out.println("Bytes: " + Float.BYTES);
        System.out.println("Size: " + Float.SIZE);
        System.out.println("Type: " + Float.TYPE);
        
        System.out.println("---------------------");
        System.out.println("Double   Double   Double");
        double numeroDouble = 10.0D;
        System.out.println("Min_Value: " + Double.MIN_VALUE);
        System.out.println("Max_Value: " + Double.MAX_VALUE);
        System.out.println("Bytes: " + Double.BYTES);
        System.out.println("Size: " + Double.SIZE);
        System.out.println("Type: " + Double.TYPE);
    }    
}