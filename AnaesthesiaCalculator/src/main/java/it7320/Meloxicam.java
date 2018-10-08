package it7320;

public class Meloxicam extends Anaesthesia implements ICalculate {

	public Meloxicam(Patient patient, Needle needle) {
		super(patient, needle);
		setDosageRatePerKg(0.2);
		setMgPerMl(5);
		setDose(calculateDose());	
		setConcentration(calculateConcentration());
		getNeedle().setSize(getDose());
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
