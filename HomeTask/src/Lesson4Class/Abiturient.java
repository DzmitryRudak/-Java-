/* class Abiturient
 * 0 - id,
 * 1- Surname,
 * 2 - Name,
 * 3 - Patronymic,
 * 4 - Adress,
 * 5 - Phone,
 * 6 - Marks.
 */

package Lesson4Class;

import java.util.Arrays;

public class Abiturient {
	public static final int minPositiveScore = 15;
	public static final int minScore = 0;
	public static final int maxScore = 100;
	
	private int idNumber; // id
	private String Surname; // Фамилия
	private String Name; // Имя
	private String Patronymic; // Отчество
	private String Adress; // Адрес
	private int Phone; // Телефон
	private int[] Scores; // Оценка
	private int totalScores;
	
	public Abiturient(int i, String string, String string2, String string3, String string4, String string5, int j, int k, int l, int m) {
}
		
	public Abiturient(int idNumber, String Surname, String Name, String Patronymic, String Adress, int Phone, int... Scores) {
		this.idNumber = idNumber;
		this.Surname = Surname;
		this.Name = Name;
		this.Patronymic = Patronymic;
		this.Adress = Adress;
		this.Phone = Phone;
		setScores1(Scores);
	}
		
		// getters		
	public int getIdNumber() {
		return idNumber;
	}
	
	public String getSurname() {
		return Surname;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getPatronymic() {
		return Patronymic;
	}
	
	public String getAdress () {
		return Adress;
	}
	
	public int getPhone() {
		return Phone;
	}
	
	public int[] getScores() {
		return Scores;
	}
	public int getTotalScores() {
		return totalScores;
	}
	// setters
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	public void setSurname(String Surname) {
		this.Surname = Surname;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setPatronymic(String Patronymic) {
		this.Patronymic = Patronymic;
	}
	
	public void setAdress(String Adress) {
		this.Adress = Adress;
	}
	
	public void setPhone(int Phone) {
		this.Phone = Phone; 
	}
	
	public final void setScores1(int... scores) {
		scoreValidation(scores);
		setScores1(scores);
		this.Scores = Scores;
	}

	private void scoreValidation(int[] scores) {
		for (int current : scores) {
			if ((minScore>current) || (maxScore<current)) {
				 throw new IllegalArgumentException("Illegal score " + current);
			}
		}
	}
	private void totalScores(int... scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        totalScores = total;
    }
 
    @Override
    public String toString() {
        final String delimeter = ",";
        return idNumber + delimeter + Surname + delimeter + Name + delimeter + Patronymic 
            + delimeter + Adress + delimeter + Phone + delimeter + Arrays.toString(Scores);
    }

}
