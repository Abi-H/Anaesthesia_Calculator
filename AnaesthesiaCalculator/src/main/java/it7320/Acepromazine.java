package it7320;

public class Acepromazine extends Anaesthesia implements ICalculate {
	
	public Acepromazine(Patient patient, Needle needle) {
		super(patient, needle);
		setDosageRatePerKg(0.04);
		setMgPerMl(2);
		setDose(calculateDose());
		setConcentration(calculateConcentration());
	}

	public double calculateDose() {
		return getDosageRatePerKg() * getPatient().getWeight();
				
	}

	public double calculateConcentration() {
		return getDose() / getMgPerMl();
	}
	
	public double getNeedleSize() {
		return getNeedle().getSize();
	}
}















