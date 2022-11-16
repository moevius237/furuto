public class Main {
    public static void main(String[] args) {
        System.out.println("Estudiante: "  + args[0] + " "+  args[1] + " Tiene matriculados " + args[2] + " y estudia "+ args[3] + " horas semanales");
        System.out.println(veredicto("6","0"));
        //Hecho por pablo Lopez Trives
    }
    private static String veredicto (String valor1, String valor2) {
        if (valor1.equals(valor2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
    }
}