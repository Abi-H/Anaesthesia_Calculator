package it7320;

public class Methadone extends Anaesthesia implements ICalculate {

	public Methadone(Patient patient, Needle needle) {
		super(patient, needle);
		setDosageRatePerKg(0.1);;
		setMgPerMl(10);
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
