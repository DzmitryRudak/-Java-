package ModelCashbox;

import java.util.PriorityQueue;

public class MainQueue {

	public static void main(String[] args) {
		ShopBuyer ����������1 = new ShopBuyer(1,"����������1", "�����, ���, �������");
		ShopBuyer ����������2 = new ShopBuyer(2, "����������2", "����, ������, �����");
		ShopBuyer ����������3 = new ShopBuyer(3, "����������3", "�����, �������, �����");
		ShopBuyer ����������4 = new ShopBuyer(4, "����������4", "������, ������, ��������");
		ShopBuyer ����������5 = new ShopBuyer(5, "����������5", "����, ������, �����");

		PriorityQueue<ShopBuyer> pQueue = new PriorityQueue<ShopBuyer>();
			
			pQueue.add(����������1);
			pQueue.add(����������2);
			pQueue.add(����������3);
			pQueue.add(����������4);
			pQueue.add(����������5);
			
			int count = 1;
			
			while (!pQueue.isEmpty()) {				
				System.out.println("����� " + count + "-->" + pQueue.remove() + "\n");				
				count ++;				
			}
			System.out.println();
	}

}
