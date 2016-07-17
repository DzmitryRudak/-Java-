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

public class Abiturient {
	public static String [] major = {}; // main array for objects
	private int idNumber; // id
	private String Surname; // Фамилия
	private String Name; // Имя
	private String Patronymic; // Отчество
	private String Adress; // Адрес
	private int Phone; // Телефон
	private int Marks; // Оценка
	
	public Abiturient() {
}
	
	public Abiturient(String strAbiturient) {
		String[] objects = strAbiturient.split("~");
		this.idNumber = Integer.valueOf(objects[0]);
		this.Surname = objects[1];
		this.Name = objects[2];
		this.Patronymic = objects[3];
		this.Adress = objects[4];
		this.Phone = Integer.valueOf(objects[5]);
		this.Marks = Integer.valueOf(objects[6]);
		
	}
	
	public Abiturient(int idNumber, String Surname, String Name, String Patronymic, String Adress, int Phone, int Marks) {
		this.idNumber = idNumber;
		this.Surname = Surname;
		this.Name = Name;
		this.Patronymic = Patronymic;
		this.Adress = Adress;
		this.Phone = Phone;
		this.Marks = Marks;
		
	}
	
	public Abiturient(String[] strAbiturient) {
		this.idNumber = Integer.valueOf(strAbiturient[0]);
		this.Surname = strAbiturient[1];
		this.Name = strAbiturient[2];
		this.Patronymic = strAbiturient[3];
		this.Adress = strAbiturient[4];
		this.Phone = Integer.valueOf(strAbiturient[5]);
		this.Marks = Integer.valueOf(strAbiturient[6]);
	}
	
	@Override
	public String toString() {
		String str = new String();
		str = str.concat(Integer.toString(this.idNumber)).concat("~");
		str = str.concat(this.Surname).concat("~");
		str = str.concat(this.Name).concat("~");
		str = str.concat(this.Patronymic).concat("~");
		str = str.concat(this.Adress).concat("~");
		str = str.concat(Integer.toString(this.Phone)).concat("~");
		str = str.concat(Integer.toString(this.Marks)).concat("~");
		return str;
		
	}
	
	public int getIdNumber() {
		return this.idNumber;
	}
	
	public String getSurname() {
		return this.Surname;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public String getPatronymic() {
		return this.Patronymic;
	}
	
	public String getAdress () {
		return this.Adress;
	}
	
	public int getPhone() {
		return this.Phone;
	}
	
	public int gerMarks() {
		return this.Marks;
	}
	
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
	
	public void setMarks(int Marks) {
		this.Marks = Marks;
	}
}
