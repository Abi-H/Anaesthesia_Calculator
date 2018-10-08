package it7320;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AnaesthesiaTest {

	Anaesthesia anaesthesia;
	Acepromazine acepromazine;
	Buprenorphine buprenorphine;
	Alfaxalone alfaxalone;
	Meloxicam meloxicam;
	Dexmedetomidine dexmedetomidine;
	Methadone methadone;
	Propofol propofol;
	Ketamine ketamine;
	Patient patient;
	double weight;
	double propofolDosage, propofolConcentration, acepromazineDosage, acepromazineConcentration;
	double alfalaxoneDosage, alfalaxoneConcentration, buprenorphineDosage, buprenorphineConcentration;
	double meloxicamDosage, meloxicamConcentration, dexmedetomidineDosage, dexmedetomidineConcentration;
	double methadoneDosage, methadoneConcentration, ketamineDosage, ketamineConcentration;

	@Before
	public void setUp() throws Exception {
		weight = 50;

		propofol = new Propofol(new Patient(weight), new Needle());
		propofolDosage = 200;
		propofolConcentration = 20;

		acepromazine = new Acepromazine(new Patient(weight), new Needle());
		acepromazineDosage = 2.0;
		acepromazineConcentration = 1;

		alfaxalone = new Alfaxalone(new Patient(weight), new Needle());
		alfalaxoneDosage = 100;
		alfalaxoneConcentration = 10;

		buprenorphine = new Buprenorphine(new Patient(weight), new Needle());
		buprenorphineDosage = 1.0;
		buprenorphineConcentration = 3.3;

		meloxicam = new Meloxicam(new Patient(weight), new Needle());
		meloxicamDosage = 10;
		meloxicamConcentration = 2;

		dexmedetomidine = new Dexmedetomidine(new Patient(weight), new Needle());
		dexmedetomidineDosage = 0.1;
		dexmedetomidineConcentration = 1.0;

		methadone = new Methadone(new Patient(weight), new Needle());
		methadoneDosage = 5.0;
		methadoneConcentration = 0.5;

		ketamine = new Ketamine(new Patient(weight), new Needle());
		ketamineDosage = 250;
		ketamineConcentration = 2.5;
	}

	@After
	public void tearDown() throws Exception {
		anaesthesia = null;
		buprenorphine = null;
		alfaxalone = null;
		meloxicam = null;
		dexmedetomidine = null;
		methadone = null;
		propofol = null;
		ketamine = null;
	}

	@Test
	public void testPropofolDose() {
		assertEquals(propofol.getDose(), propofolDosage, 0);
	}

	@Test
	public void testPropofolConcentration() {
		assertEquals(propofol.getConcentration(), propofolConcentration, 0);
	}

	@Test
	public void testAcepromazineDose() {
		assertEquals(acepromazine.getDose(), acepromazineDosage, 0);
	}

	@Test
	public void testAcepromazineConcentration() {
		assertEquals(acepromazine.getConcentration(), acepromazineConcentration, 0);
	}

	@Test
	public void testAlfalaxoneDose() {
		assertEquals(alfaxalone.getDose(), alfalaxoneDosage, 0);
	}

	@Test
	public void testAlfalaxoneConcentration() {
		assertEquals(alfaxalone.getConcentration(), alfalaxoneConcentration, 0);
	}

	@Test
	public void testBuprenorphineDose() {
		assertEquals(buprenorphine.getDose(), buprenorphineDosage, 0);
	}

	@Test
	public void testBuprenorphineConcentration() {
		assertEquals(buprenorphine.getConcentration(), buprenorphineConcentration, 0.1);
	}

	@Test
	public void testMeloxicamDose() {
		assertEquals(meloxicam.getDose(), meloxicamDosage, 0);
	}

	@Test
	public void testMeloxicamConcentration() {
		assertEquals(meloxicam.getConcentration(), meloxicamConcentration, 0);
	}

	@Test
	public void testDexmedetomidineDose() {
		assertEquals(dexmedetomidine.getDose(), dexmedetomidineDosage, 0);
	}

	@Test
	public void testDexmedetomidineConcentration() {
		assertEquals(dexmedetomidine.getConcentration(), dexmedetomidineConcentration, 0);
	}

	@Test
	public void testMethadoneDosage() {
		assertEquals(methadone.getDose(), methadoneDosage, 0);
	}

	@Test
	public void testMethadoneConcentration() {
		assertEquals(methadone.getConcentration(), methadoneConcentration, 0);
	}
	
	@Test
	public void testKetamineDosage() {
		assertEquals(ketamine.getDose(), ketamineDosage, 0);
	}
	
	@Test
	public void testKetamineConcentration() {
		assertEquals(ketamine.getConcentration(), ketamineConcentration, 0);
	}
}














