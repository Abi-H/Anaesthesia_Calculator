package it7320;

public class Alfaxalone extends Anaesthesia implements ICalculate{
		
	public Alfaxalone(Patient patient, Needle needle) {
		super(patient, needle);

		setDosageRatePerKg(2);
		setMgPerMl(10);
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
