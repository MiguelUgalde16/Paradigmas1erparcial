class EmpleadoPermanente extends Empleado {
    private double sueldoBase;
    private String numSeguroSocial;
    private static final double SALARIO_MINIMO = 150.0;

    public EmpleadoPermanente(String rfc, String apellidos, String nombres, double sueldoBase, String numSeguroSocial) throws SalarioMenorAlMinimoException {
        super(rfc, apellidos, nombres);

        if (sueldoBase < SALARIO_MINIMO) {
            throw new SalarioMenorAlMinimoException("El sueldo base es menor al mínimo permitido.");
        }

        this.sueldoBase = sueldoBase;
        this.numSeguroSocial = numSeguroSocial;
    }

    @Override
    public double calcularIngresos() {
        return sueldoBase;
    }

    public double calcularDescuento() {
        return 0.11 * sueldoBase;
    }

    @Override
    public double calcularSueldoNeto() {
        return calcularIngresos() - calcularDescuento();
    }

    public String getNumSeguroSocial() {
        return numSeguroSocial;
    }
}

class SalarioMenorAlMinimoException extends Exception {
    public SalarioMenorAlMinimoException(String message) {
        super(message);
    }
}
