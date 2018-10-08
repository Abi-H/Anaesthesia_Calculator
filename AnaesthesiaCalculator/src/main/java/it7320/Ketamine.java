package it7320;

public class Ketamine extends Anaesthesia implements ICalculate {

	public Ketamine(Patient patient, Needle needle) {
		super(patient, needle);
		setDosageRatePerKg(5);;
		setMgPerMl(100);
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
