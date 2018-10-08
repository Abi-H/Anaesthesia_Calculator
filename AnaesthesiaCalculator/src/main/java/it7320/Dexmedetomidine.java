package it7320;

public class Dexmedetomidine extends Anaesthesia implements ICalculate {

	public Dexmedetomidine(Patient patient, Needle needle) {
		super(patient, needle);
		setDosageRatePerKg(2);;
		setMgPerMl(0.1);
		setDose(calculateDose());	
		setConcentration(calculateConcentration());
		getNeedle().setSize(getDose());
	}

	public double calculateDose() {
		return (getDosageRatePerKg() * getPatient().getWeight()) / 1000; // Convert from micrograms
	}

	public double calculateConcentration() {
		return getDose() / getMgPerMl();
	}
	
	public double getNeedleSize() {
		return getNeedle().getSize();
	}
}
