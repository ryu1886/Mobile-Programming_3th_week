

public class Pet extends Animal { 

		private String name;
		private int age; 
		private double weight; 

		
		public String toString() {
			return ("Name: " + name + " Age: " + age + " years"
					+ "\nWeight: " + weight + " pounds");
		}
		
		public Pet(String initialName, int initialAge, double initialWeight, String iniGender) {  //추가
			
			super(iniGender); 
			name = initialName;
			if ((initialAge < 0) || (initialWeight < 0)) {
				System.out.println("Error: Negative age or weight.");
				System.exit(0);
			} else {
				age = initialAge;
				weight = initialWeight;
			}
		}


		public Pet(String initialName) {
			name = initialName;
			age = 0;
			weight = 0;
		}
		
		public Pet( int initialAge) {
			name = "No name yet.";
			weight = 0;
			if (initialAge < 0) {
				System.out.println("Error: Negative age.");
				System.exit(0);
			} else
				age = initialAge;
			
		}
		public Pet() {
			name = "No name yet.";
			age = 0;
			weight = 0;
		}
		public void set(String newName, int newAge, double newWeight) {
			 // 구현 하시오.
			name = newName;
			if((newAge<0)||(newWeight<0)){
				
					System.out.println("Error: Negative weight.");
					System.exit(0);
			}
			else
			{
					age = newAge;
					weight = newWeight;
			}
		}
		
		public void setAge( int newAge) {
	         
			if(newAge<0){
				System.out.println("Error: Negative age.");
				System.exit(0);
			}
			else
				age = newAge;
		}
		
		public void setWeight( double newWeight) {
		   
			if(newWeight<0){
				System.out.println("Error: Negative weight.");
				System.exit(0);
			}
			else
				weight = newWeight;
	       }
		
		public String getName() {
	
			return name;
		}
		
		public int getAge() {
			
			return age;
		}
		
		public double getWeight() {

			return weight;
		}
}