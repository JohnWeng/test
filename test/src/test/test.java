package test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("haha");
	}

}

select * from breeder_results WHERE (raceType LIKE 'AOC%' or raceType LIKE 'OCH%' or raceType LIKE 'OCL%' or raceType LIKE 'SOC%')
AND  trackCountryCode IN ('USA','CAN')  
AND dateOfRace >= '2013-07-18' AND dateOfRace <= '2015-01-10'
and finishPositionOfHorse = 1 order by dateOfRace DESC, 
trackCode ASC,raceNumber ASC

