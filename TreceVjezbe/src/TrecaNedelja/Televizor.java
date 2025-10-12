package TrecaNedelja;

public class Televizor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Atributi
		private int brojKanala;
		private String nazivKanala;
		private int jacinaTona;
		
		//Konstruktor
		public Televizor(int brojKanala, String nazivKanala, int jacinaTona) {
			
			if (brojKanala >= 1) this.brojKanala = brojKanala;
			else this.brojKanala = 1;
			this.nazivKanala = nazivKanala;
			if (jacinaTona >=0 && jacinaTona <= 10) {
				this.jacinaTona = jacinaTona;}
			else this.jacinaTona = 5; // podrazumijeva vrijednost
			
			// Getteri
			public int getBrojKanala() { return brojKanala; }
			public String getNazivKanala() { return nazivKanala; }
			public int getjacinaTona() { return jacinaTona; }
			
			// Setteri
			public void setBrojKanala(int brojKanala) {
				if (brojKanala >=1) this.brojKanala = brojKanala;
				else System.out.println("Broj kanala mora bit >= 1")  }
			
			 public void setNazivKanala(String nazivKanala) {
			        this.nazivKanala = nazivKanala; }
			 
			 public void setJacinaTona(int jacinaTona) {
			        if (jacinaTona >= 0 && jacinaTona <= 10) {
			            this.jacinaTona = jacinaTona;
			        } else {
			            System.out.println("Jacina tona mora biti između 0 i 10.");
			        }
			    }
			 // Metod za ispis
			    public void ispisi() {
			        System.out.println("Broj kanala: " + brojKanala);
			        System.out.println("Naziv kanala: " + nazivKanala);
			        System.out.println("Jacina tona: " + jacinaTona);
			    }
			}
				
			}
		}

	}

}
