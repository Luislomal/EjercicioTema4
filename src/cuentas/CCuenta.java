package cuentas;
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    public double estado()
    {
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * @return el nombre
	 */
	protected String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el cuenta
	 */
	protected String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta el cuenta a establecer
	 */
	protected void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return el saldo
	 */
	protected double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo el saldo a establecer
	 */
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return el tipoInteres
	 */
	protected double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * @param tipoInteres el tipoInteres a establecer
	 */
	protected void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
