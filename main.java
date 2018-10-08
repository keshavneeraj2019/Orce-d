public class Main {

    public static void main(String[] args) {
	// write your code here
                int strength = (int) (Math.random() * 20) + 10;
                System.out.println("strength: " + strength);
                int max = 40 - strength;
                int range = max - 10;
                int agility = (int) (Math.random() * range) + 10;
                System.out.println("agility: " + agility);
                int intelligence = 50 - strength - agility;
                System.out.println("intelligence: " + intelligence);
                int damage = 5 * intelligence;
                int health = 1000;
                double mod;
                    mod = damage * (Math.random() * (1.5 - .5) + .5);
                    health -= mod;

                    mod = damage * (Math.random() * (1.5 - .5) + .5);
                    health -= mod;

                    mod = damage * (Math.random() * (1.5 - .5) + .5);
                    health -= mod;

                    mod = damage * (Math.random() * (1.5 - .5) + .5);
                    health -= mod;


                    mod = damage * (Math.random() * (1.5 - .5) + .5);
                    health -= mod;


                    mod = damage * (Math.random() * (1.5 - .5) + .5);
                    health -= mod;


                    mod = damage * (Math.random() * (1.5 - .5) + .5);
                    health -= mod;


                    mod = damage * (Math.random() * (1.5 - .5) + .5);
                    health -= mod;


                    mod = damage * (Math.random() * (1.5 - .5) + .5);
                    health -= mod;


                    mod = damage * (Math.random() * (1.5 - .5) + .5);
                    health -= mod;


                    if (health <= 0){
                        System.out.println("Success");
        }

                    if ((health >= 0)){
                        System.out.println("Failure");
                        //if intelligence 20, then success rate is 60%-70%
                    }
                }
            }
