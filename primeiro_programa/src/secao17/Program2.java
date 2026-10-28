package secao17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;


public class Program2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Map<String, Integer> elec = new LinkedHashMap<>();
			
			String line = br.readLine();
			while(line != null) {
				
				String[] fields = line.split(",");
				String userName = fields[0];
				Integer numberVotes = Integer.parseInt(fields[1]);
				
				if(elec.containsKey(userName)) {
					int pastVotes = elec.get(userName);
					int sum = pastVotes + numberVotes;
					
					elec.put(userName, sum);
				}
				else {
					elec.put(userName, numberVotes);
				}
				
				line = br.readLine();
			}
			for(String key : elec.keySet()) {
				
				System.out.println(key + ": " + elec.get(key));
			}
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
}
