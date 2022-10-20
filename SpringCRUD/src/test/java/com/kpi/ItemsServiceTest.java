package com.kpi;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kpi.Services.ItemsService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemsServiceTest {

	@Autowired
	ItemsService itemsService;
	
	@Test
	public void whenApplicationStarts_thenHibernateCreatesInitalRecords() {
		
		List<Items> itemsServicesList = itemsService.list();
		
		Assert.assertEquals(itemsServicesList.size(), 10);
	}
	
}
