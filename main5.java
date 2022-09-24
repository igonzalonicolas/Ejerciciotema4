public class main5 {
    public static void main(String args[]) {
        var estacion = "Invierno";

        switch(estacion){
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es ninguna estación");
            break;
        }
    }
}