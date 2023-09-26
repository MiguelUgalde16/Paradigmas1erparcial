public class Main {
    public static void main(String[] args) {
        try {
            EmpleadoVendedor empleadoVendedor = new EmpleadoVendedor("MUG123", "Ugalde", "Miguel", 6000, 0.08);
            EmpleadoPermanente empleadoPermanente = new EmpleadoPermanente("DEF456", "Lopez", "Maria", 1200, "12345");

            empleadoVendedor.mostrarInformacion();
            System.out.println("Ingresos: " + empleadoVendedor.calcularIngresos());
            System.out.println("Bonificación: " + empleadoVendedor.calcularBonificacion());
            System.out.println("Descuento: " + empleadoVendedor.calcularDescuento());
            System.out.println("Sueldo Neto: " + empleadoVendedor.calcularSueldoNeto());

            empleadoPermanente.mostrarInformacion();
            System.out.println("Ingresos: " + empleadoPermanente.calcularIngresos());
            System.out.println("Descuento: " + empleadoPermanente.calcularDescuento());
            System.out.println("Sueldo Neto: " + empleadoPermanente.calcularSueldoNeto());
        } catch (SalarioMenorAlMinimoException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
