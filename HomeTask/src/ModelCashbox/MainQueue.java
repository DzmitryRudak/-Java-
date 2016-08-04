package ModelCashbox;

import java.util.PriorityQueue;

public class MainQueue {

	public static void main(String[] args) {
		ShopBuyer Покупатель1 = new ShopBuyer(1,"Покупатель1", "Банан, сок, сметана");
		ShopBuyer Покупатель2 = new ShopBuyer(2, "Покупатель2", "Хлеб, молоко, кефир");
		ShopBuyer Покупатель3 = new ShopBuyer(3, "Покупатель3", "Масло, сосиски, батон");
		ShopBuyer Покупатель4 = new ShopBuyer(4, "Покупатель4", "Творог, молоко, пельмени");
		ShopBuyer Покупатель5 = new ShopBuyer(5, "Покупатель5", "Хлеб, молоко, батон");

		PriorityQueue<ShopBuyer> pQueue = new PriorityQueue<ShopBuyer>();
			
			pQueue.add(Покупатель1);
			pQueue.add(Покупатель2);
			pQueue.add(Покупатель3);
			pQueue.add(Покупатель4);
			pQueue.add(Покупатель5);
			
			int count = 1;
			
			while (!pQueue.isEmpty()) {				
				System.out.println("Касса№ " + count + "-->" + pQueue.remove() + "\n");				
				count ++;				
			}
			System.out.println();
	}

}
