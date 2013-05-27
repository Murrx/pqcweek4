package total;

import java.util.ArrayList;
import java.util.Calendar;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class UnitTests{

	static BenzinePomp benzinePomp;
	static Betaling betaling;
	static Brandstof brandstof;
	@Before
	public static void setupBeforeClass(){
		ArrayList<Brandstof> brandstofList = new ArrayList<Brandstof>();
		brandstof = new Brandstof(1,"Euro 95", 1.778);
		brandstofList.add(brandstof);

		BenzinePomp benzinePomp = BenzinePomp.getBenzinePomp();
		benzinePomp.setBrandstofen(brandstofList);
		
		betaling = new Betaling(1, "Verkoop aan Scooter");
		betaling.addBetalingsRegel(brandstof, 6);

		benzinePomp.addBetaling(betaling);
	}
	
	@Test
	public void addBetalingsRegelGoed(){
		int betalingSizeOld = betaling.getAantalRegelsInBetaling();
		betaling.addBetalingsRegel(brandstof, 2);
		int betalingSizeNew = betaling.getAantalRegelsInBetaling();
		
		assertTrue(betalingSizeNew > betalingSizeOld);
	}
	
}