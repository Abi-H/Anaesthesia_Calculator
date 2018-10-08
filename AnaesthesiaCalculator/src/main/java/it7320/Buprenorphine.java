package it7320;

public class Buprenorphine extends Anaesthesia implements ICalculate {
	
	public Buprenorphine(Patient patient, Needle needle) {
		super(patient, needle);
		setDosageRatePerKg(20);;
		setMgPerMl(0.3);
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
