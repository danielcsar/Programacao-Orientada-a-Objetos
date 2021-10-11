package aulas10;

import java.util.HashMap;
import java.util.Map;

public class TestaVeiculo {

	public static void main(String[] args) {
		Map<String, String> carros = new HashMap<String, String>();
		
		carros.put("Jaguar", "XJ");
		carros.put("Mercedes", "AMG");
		carros.put("BMW", "X6");
		
		for(String c : carros.keySet()) {
			
		}		
		
		for (Map.Entry<String, String> c : carros.entrySet())
			System.out.println(c);
	}

}
