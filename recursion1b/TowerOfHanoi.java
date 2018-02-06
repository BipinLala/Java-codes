package recursion1b;

public class TowerOfHanoi 
{
	
	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination)
	{
		if(disks == 0)
		{
			return;
		}
		
		towerOfHanoi(disks-1, source, destination, auxiliary);
		System.out.println("moving " + disks + " from " + source + " to " + destination);
		
		towerOfHanoi(disks-1, auxiliary, source, destination);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		towerOfHanoi(3, 'a', 'b', 'c');

	}

}
