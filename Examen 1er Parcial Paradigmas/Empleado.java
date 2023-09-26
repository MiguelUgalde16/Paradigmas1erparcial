class Empleado {
    private String rfc;
    private String apellidos;
    private String nombres;

    public Empleado(String rfc, String apellidos, String nombres) {
        this.rfc = rfc;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    public void mostrarInformacion() {
        System.out.println("RFC: " + rfc);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Nombres: " + nombres);
    }

    // Métodos abstractos que deben ser implementados en las clases hijas
    public double calcularIngresos() {
        return 0;
    }
    public double calcularBonificacion() {
        return 0;
    }
    public double calcularDescuento() {
        return 0;
    }
    public double calcularSueldoNeto() {
        return 0;
    }
}

