package com.sathya.hibernate.test;
import com.sathya.hibernate.dao.PaymentDAO;
import com.sathya.hibernate.dao.PaymentDAOFactory;
import com.sathya.hibernate.model.Cheque;
import com.sathya.hibernate.model.CreditCard;

public class Main {

	public static void main(String[] args) {
		
		PaymentDAO dao = PaymentDAOFactory.getInstance();
		
		// call saveCard()
		CreditCard card = new CreditCard();
		card.setPaymentId(22022);
		card.setAmount(6000);
		card.setPaymentDate(new java.util.Date());
		card.setCardNumber(322009);
		card.setCardType("VISA");
		
		dao.saveCard(card);
		
		System.out.println("=============================");
		
		//call saveCheque()
		Cheque cheque = new Cheque();
		cheque.setPaymentId(33011);
		cheque.setAmount(4000);
		cheque.setPaymentDate(new java.util.Date());
		cheque.setChequeNumber(56001);
		cheque.setChequeType("BEARER");
		
		dao.saveCheque(cheque);

	}

}
