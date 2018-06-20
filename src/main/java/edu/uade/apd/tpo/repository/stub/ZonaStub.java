package edu.uade.apd.tpo.repository.stub;

public enum ZonaStub {

	CABA(3, "Caba"), NORTE(6, "Norte"), SUR(4, "Sur"), OESTE(5, "Oeste");

	private float precio;
	private String zonaStr;

	ZonaStub(float precio, String zonaStr) {
		this.zonaStr = zonaStr;
		this.precio = precio;
	}

	public float getPrecio() {
		return this.precio;
	}

	public String getZonaStr() {
		return zonaStr;
	}

	public static ZonaStub fromString(String zonaString) {
		for (ZonaStub z : ZonaStub.values()) {
			if (z.getZonaStr().equals(zonaString)) {
				return z;
			}
		}
		throw new IllegalArgumentException("Value '" + zonaString + "' not found");
	}

}
