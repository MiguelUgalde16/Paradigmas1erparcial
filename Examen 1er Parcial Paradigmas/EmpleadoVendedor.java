class EmpleadoVendedor extends Empleado {
    private double montoVendido;
    private double tasaComision;

    public EmpleadoVendedor(String rfc, String apellidos, String nombres, double montovendido, double tasacomision) {
        super(rfc, apellidos, nombres);
        this.montoVendido = montovendido;
        this.tasaComision = tasacomision;
    }

    @Override
    public double calcularIngresos() {
        return montoVendido * tasaComision;
    }

    public double calcularBonificacion() {
        double ingresos = calcularIngresos();
        if (montoVendido < 1000) {
            return 0;
        } else if (montoVendido <= 5000) {
            return 0.05 * ingresos;
        } else {
            return 0.10 * ingresos;
        }
    }

    public double calcularDescuento() {
        double ingresos = calcularIngresos();
        if (ingresos < 1000) {
            return 0.11 * ingresos;
        } else {
            return 0.15 * ingresos;
        }
    }

    @Override
    public double calcularSueldoNeto() {
        return calcularIngresos() + calcularBonificacion() - calcularDescuento();
    }
}