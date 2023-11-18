import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner intr =new Scanner(System.in);
       boolean salir=false;

       while (!salir){

        System.out.println("Ingresa un número y elige una de las opciones");

        int dato= intr.nextInt();


        System.out.println("1.Decimal a binario:");
        System.out.println("2.Decimal a Hexadecimal:");
        System.out.println("3.Decimal a Octal:");
        System.out.println("4.Decimal a ASCII:");
        System.out.println("5.Binario a Decimal:");
        System.out.println("6.Hexadecimal a Decimal");
        System.out.println("7.Octal a Decimal:");
        System.out.println("8.ACII a Decimal:");
        System.out.println("9.salir");

        System.out.println("Selecciona una opción: ");
        int opcion= intr.nextInt();


    switch (opcion){
        case 1:
        System.out.println("Binario: "+Integer.toBinaryString(dato));
        break;
        case 2:
        System.out.println("Hexadecimal: "+Integer.toHexString(dato));
        break;
        case 3:
        System.out.println("Octal: "+Integer.toOctalString(dato));
        break;
        case 4: //Coge el decimal y lo convierte en el caracter ASCII.
        System.out.println("ASCII: "+(char)dato);
        break;

        case 5:
        System.out.println("Escriba el número en binario: ");
        String binario= intr.next();
        try {
            int deciaml=Integer.parseInt(binario,2);
            System.out.println("Decimal: "+deciaml);
        }catch (NumberFormatException e){
            System.out.println("Error: Ingresa un numeor binario valido");
        }
        break;
        case 6:
        System.out.println("Ingresa numero Hexadecimal");
        String hexadecimal= intr.next();
        try {
            int decimal=Integer.parseInt(hexadecimal,16);
            System.out.println("Decimal: "+decimal);
        }catch (NumberFormatException e){
            System.out.println("Error: ingresa el numero correctamente");
        }
        break;
        case 7:
        System.out.println("Ingresa un número octal: ");
        String octal= intr.next();
        try{
            int decimal=Integer.parseInt(octal,8);
            System.out.println("Decimal: "+decimal);
        }catch (NumberFormatException e){
            System.out.println("Error: ingresa correctamente.");
        }
        break;
        case 8: //Ingresa el caracter ASCII, luego usa el método charAt(0), para obetener 1 carc entrada y lo convierte en valor decimal.
            System.out.println("Ingrese ASCII: ");
            char ascii = intr.next().charAt(0);
            System.out.println("Decimal: " + (int) ascii);
            break;
        case 9:
            salir=true;
            break;
        default:
            System.out.println("Opción no valida, ingrese la opción correcta");
         }
       }
       intr.close();





























    }
}