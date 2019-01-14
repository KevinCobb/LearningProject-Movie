
class Movie {
	private String name;

	public Movie(String name) {
		this.name = name;

	}

	public String plot() {
		return "no plot here";

	}

	public String getName() {
		return name;
	}
	
}

class Jaws extends Movie {
	public Jaws() {
		super("Jaws");
	}

	public String plot() {
		return "A shark eats lots of people";
	}
}

	class IndependenceDay extends Movie {

		public IndependenceDay() {
			super("Indendepence Day");

		}

		@Override
		public String plot() {
			return "aliens attempt to take over earth";
		}
	}

	class MazeRunner extends Movie {

		public MazeRunner() {
			super("MazeRunner");
		}

		@Override
		public String plot() {
			return "Kids try to escape maze";
		}
	}

		class StarWars extends Movie {

			public StarWars() {
				super("Star Wars");

			}

			@Override
			public String plot() {
				return "Imperial forces try to take over universe";
			}
		}

			class Forgetable extends Movie {

				public Forgetable() {
					super("Forgetable");

				}
			}

public class Main {

	public static void main(String[] args) {
		
		for(int i=1; i<11; i++) {
			Movie movie = randomMovie();
			System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "plot: " + movie.plot() + "\n" );
		}

	}
	
	public static  Movie randomMovie() {
		int randomNumber = (int) (Math.random() *5) + 1;
		System.out.println("random number generated was " + randomNumber);
		switch (randomNumber) {
			case 1:
				return new Jaws();
				
			case 2:
				return new IndependenceDay();
				
			case 3: 
				return new MazeRunner();
				
			case 4:
				return new StarWars();
				
			case 5:	
				return new Forgetable();
				
		}
		return null;
		
	}

}
