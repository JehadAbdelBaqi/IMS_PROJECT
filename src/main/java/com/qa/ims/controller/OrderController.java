package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {

	public static final Logger LOGGER = LogManager.getLogger();

	private OrderDAO orderDAO;
	private Utils utils;

	public OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
	}

	@Override
	public List<Order> readAll() {

		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order);
		}
		return orders;
	}

	@Override
	public Order create() {
		LOGGER.info("Please enter the customer ID");
		Long customerId = utils.getLong();
		Order order = orderDAO.create(new Order(customerId));
		LOGGER.info("Order created");
		return order;
	}

	@Override
	public Order update() {
		boolean bool = true;
		Order newOrder = null;
		while (bool) {
			LOGGER.info("Would you like to add or remove an item in your order? 'Break' to exit.");
			String answer = utils.getString();
			if (answer.toLowerCase().equals("add")) {
				LOGGER.info("Which order would you like to add to?");
				Long orderId = utils.getLong();
				LOGGER.info("Which item would you like to add to this order?");
				Long itemId = utils.getLong();
				orderDAO.insertItem(orderId, itemId);
				LOGGER.info("Would you like to make another change?");
				String answerOne = utils.getString();
				if (answerOne.toLowerCase().equals("yes")) {
					bool = true;
				} else {
					bool = false;
				}
			} else if (answer.toLowerCase().equals("remove")) {
				LOGGER.info("Which order would you like to remove from?");
				Long orderId = utils.getLong();
				LOGGER.info("Which item would you like to remove from this order?");
				Long itemId = utils.getLong();
				orderDAO.removeItem(orderId, itemId);
				LOGGER.info("Would you like to make another change?");
				String answerOne = utils.getString();
				if (answerOne.toLowerCase().equals("yes")) {
					bool = true;;
				} else {
					bool = false;
				}
			} else if (answer.toLowerCase().equals("break")) {
				bool = false;
			}
		}
		return newOrder;
	}

//			} else if (answer.toLowerCase().equals("remove")) {
//				LOGGER.info("Which order would you like to remove from?");
//				Long orderId = utils.getLong();
//				LOGGER.info("Which item would you like to remove from this order?");
//				Long itemId = utils.getLong();
//				orderDAO.removeItem(orderId, itemId);
//				LOGGER.info("Would you like to add another item?");
//				String answerOne = utils.getString();
//				if (answerOne.toLowerCase().equals("no")) {
//					break;
//				} else {
//					continue;	
//				}
//		} else if (answer.toLowerCase().equals("break")) {
//			return null;
//		}
//		return null;
//	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}
}
