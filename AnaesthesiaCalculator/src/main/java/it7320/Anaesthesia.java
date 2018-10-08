package it7320;

public class Anaesthesia {

	Patient patient;
	Needle needle;
	double dosageRatePerKg;
	double concentration;
	double dose;
	double mgPerMl;

	public Anaesthesia(Patient patient, Needle needle) {
		this.patient = patient;
		this.needle = needle;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Needle getNeedle() {
		return needle;
	}

	public void setNeedle(Needle needle) {
		this.needle = needle;
	}

	public double getDosageRatePerKg() {
		return dosageRatePerKg;
	}

	public void setDosageRatePerKg(double dosageRatePerKg) {
		this.dosageRatePerKg = dosageRatePerKg;
	}

	public double getConcentration() {
		return concentration;
	}

	public void setConcentration(double concentration) {
		this.concentration = concentration;
	}
	
	public double getMgPerMl() {
		return mgPerMl;
	}

	public void setMgPerMl(double mgPerMl) {
		this.mgPerMl = mgPerMl;
	}

	public double getDose() {
		return dose;
	}

	public void setDose(double dose) {
		this.dose = dose;
	}
}
