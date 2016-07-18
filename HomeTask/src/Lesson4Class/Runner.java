package Lesson4Class;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		Abiturient[] abiturients = new Abiturient[] {
	            new Abiturient(1, "Гризон", "Ольга", "Викторовна", "Минск, ул. Ленина, д.36",
	                "+375(44)745-45-54", 36, 25, 46, 36),
	            new Abiturient(2, "Залесский", "Антон", "Владимирович", "Минск, ул. Семеняко, д.10",
	                "+375(44)745-45-54", 36, 47, 46, 72),
	            new Abiturient(3, "Пузанов", "Денис", "Павлович", "Минск, ул. Лермонтова, д.12",
	                "+375(44)745-45-54", 36, 18, 46, 14),
	            new Abiturient(4, "Медведева", "Ольга", "Петровна", "Минск, ул. Морская, д.14, кв.1",
	                "+375(44)745-45-54", 36, 47, 46, 72),
	            new Abiturient(5, "Рудов", "Артём", "Петрович", "Минск, ул. Ленина, д.6, кв.140",
	                "+375(44)745-45-54", 36, 47, 46, 70),
	            new Abiturient(6, "Арабич", "Вячеслав", "Васильевич", "Минск, ул. Владимирова, д.3",
	                "+375(44)745-45-54", 36, 47, 46, 70),
	            new Abiturient(7, "Лопатин", "Евгений", "Александрович", "Минск, ул. Слободская, д.1",
	                "+375(44)745-45-54", 36, 25, 46, 36),
	            new Abiturient(8, "Гинзбург", "Аркадий", "Генадьевич", "Минск, ул. Трофимова, д.50",
	                "+375(44)745-45-54", 36, 25, 46, 36)
	        };
	        
	        // task 1
	        System.out.printf("[Абитуриенты, с неудовлетворительными оценками (меньше %d)]:\n",
	                Abiturient.minPositiveScore);
	        Abiturient[] badScores = badScores(abiturients);
	        Arrays.stream(badScores).forEach(System.out::println);
	        
	        // task 2
	        int threshold = 140;
	        System.out.printf("\n[Абитуриенты, с суммой баллов (выше %d)]:\n", threshold);
	        Arrays.stream(abiturients).filter(a -> a.getTotalScores() > threshold)
	                .forEach(System.out::println);
	        
	        // task 3
	        int seats = 5;
	        Abiturient[] incoming = incoming(abiturients, seats);
	        
	         // Если число абитуриентов меньше числа мест.
	        if (incoming.length <= seats) {
	            System.out.println("\nПолу-проходных аббитуриентов нет.\nПроходные:\n");
	            Arrays.stream(incoming).forEach(System.out::println);
	            
	        } else {
	            // Полупроходной балл
	            int semiPassingScore = incoming[incoming.length-1].getTotalScores();
	            System.out.println("\nПолу-проходные аббитуриенты:\n");
	            // Перебор отсортированного массива с конца
	            for (int i=incoming.length-1; incoming[i].getTotalScores() == semiPassingScore; i--) {
	                System.out.println(incoming[i]);
	            }
	            System.out.println("\nПроходные аббитуриенты:\n");
	            for (int i = 0; incoming[i].getTotalScores() != semiPassingScore; i++) {
	                System.out.println(incoming[i]);
	            }
	        }
	    }
	 
	    private static Abiturient[] badScores(Abiturient[] abiturients) {
	        if ((abiturients == null) || (abiturients.length == 0)) {
	            return null;
	        }
	        Abiturient[] result = new Abiturient[0];
	        for (Abiturient abiturient : abiturients) {
	            boolean isBad = false;
	            int[] scores = abiturient.getScores();
	            for (int score : scores) {
	                if (Abiturient.minPositiveScore > score) {
	                    isBad = true;
	                    break;
	                }
	            }
	            if (isBad) {
	                Abiturient[] buffer = new Abiturient[result.length + 1];
	                System.arraycopy(result, 0, buffer, 0, result.length);
	                buffer[buffer.length-1] = abiturient;
	                result = buffer;
	            }
	        }
	        return (result.length != 0) ? result : null;
	    }
	    
	    private static Abiturient[] incoming(Abiturient[] abiturients, int count) {
	        if ((abiturients == null) || (abiturients.length == 0)) {
	            return null;
	        }
	        if (abiturients.length <= count) {
	            return abiturients;
	        } else {
	            Arrays.sort(abiturients, (Abiturient left, Abiturient right) -> 
	                    right.getTotalScores() - left.getTotalScores());
	            Abiturient[] result = new Abiturient[count];
	            System.arraycopy(abiturients, 0, result, 0, result.length);
	            if (abiturients[count - 1].getTotalScores() == abiturients[count].getTotalScores()) {
	                int semiPassingScore = abiturients[count - 1].getTotalScores();
	                for (int i = count; i < abiturients.length; i++) {
	                    if (abiturients[i].getTotalScores() == semiPassingScore) {
	                        Abiturient[] buffer = new Abiturient[result.length + 1];
	                        System.arraycopy(result, 0, buffer, 0, result.length);
	                        buffer[buffer.length-1] = abiturients[i];
	                        result = buffer;
	                    } else {
	                        break;
	                    }
	                }
	            }
	            return result;
	        }
	    }
	}


